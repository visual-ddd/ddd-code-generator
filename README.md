#### 需求分析

- 一个项目下包含多张领域图谱
- 每个领域图谱中结构如下
    - 故事节点
        - 动作
            - 事件
            - 指令
            - 规则
    - 聚合
    - 值对象

- 能够进行图谱管理（存储、还原、修改、删除）
    -   [ ] 每个聚合都有唯一的颜色，通过颜色区分聚合对象
    -   [ ] 元素通过颜色绑定聚合
    -   [ ] 当聚合进行颜色修改、删除时，需要更新相应的元素
    -   [ ] 故事节点下的元素和故事节点用于相同生命周期
- 要求能够通过领域图谱的信息生成对应的领域层代码模板
    - 项目
    - 指令
        - Command.java.vm
        - CommandHandler.java.vm
    - 事件
        - Event.java.vm
    - 聚合
        - Aggregation.java.vm
        - AggregationFactory.java.vm
        - AggregationRepository.java.vm
        - IAggregation.java.vm
    - 值对象
        - ValueObject.java.vm

#### 功能实现

数据模型

<img src="https://img2022.cnblogs.com/blog/1994693/202207/1994693-20220726132100103-1295660491.svg" alt="DomainChartGenerateDto_structure" style="zoom:67%;" />


说明

- 领域图谱 -》 DomainChartGenerateDto
    - 故事节点 -》 StoryNode
        - 动作
            - 事件 -》 event
            - 指令 -》 cmd
            - 规则 -》 无（只用于展示，不需要生成）
    - 聚合 -》 aggregations
    - 值对象 -》 valueObjects

json数据结构及映射关系

接口文档
链接: https://www.apifox.cn/apidoc/shared-ddfabd53-ac7c-456e-9af0-a591a93e07ba  访问密码 : AiMnt9xo

1. 与输出路径的映射
   ![image](https://img2022.cnblogs.com/blog/1994693/202207/1994693-20220726145948061-1949655835.jpg)


2. 与前端的映射
   ![image](https://img2022.cnblogs.com/blog/1994693/202207/1994693-20220726150254933-1148833488.jpg)

#### 主要问题

**问题1：元素与模板映射关系**

方案：通过枚举类DomainShapeEnum记录元素和对应模板文件位置的映射关系

<img src="https://img2022.cnblogs.com/blog/1994693/202207/1994693-20220726131835497-101931167.png" alt="DomainChartGenerateDto_structure" style="zoom:67%;" />


**问题2：类的包路径和导入路径的解析**

方案：

1. 缓存所有生成的类对应的包路径，通过解析方法和属性的参数类型名映射对应类的包路径，其中基本类型使用配置文件加载

2. 使用IDEA自带的优化导入功能（采用）

**问题3：模板的输入文件夹和输出文件夹路径**

方案：通过全局变量TemplateConfig进行管理

<img src="https://img2022.cnblogs.com/blog/1994693/202207/1994693-20220726132138595-1310277239.png" alt="DomainChartGenerateDto_structure" style="zoom:67%;" />

**问题4：代码生成实现原理**

方案：采用Velocity模板引擎，基于velocity的模板语法编写好需要生成的模板，进行代码生成时，将封装的数据以map的形式保存到VelocityContext上下文中，将上下文和模板路径传递给velocity模板引擎，模板引擎将读取指定路径的模板文件，并从上下文中找到与之对应的value用来替换其中的变量。

<img src="https://img2022.cnblogs.com/blog/1994693/202207/1994693-20220726132152053-582330358.png" alt="DomainChartGenerateDto_structure" style="zoom:80%;" />

#### 使用说明

第一步，前端传递json对象请求接口http://localhost:8080/code/generate/generateCodeByChart

```json
{
    "name": "拼团领域图谱",
    "filed": "spellgroup",
    "author": "shimmer",
    "projectName": "wk-mtool",
    "group": "com.wakedata.wk.mtool",
    "dateTime": "2022/07/25",
    "storyNodes": [
        {
            "name": "设置平台拼团规则",
            "events": [
                {
                    "description": "规则已设置事件"
                }
            ],
            "cmdList": [
                {
                    "description": "规则设置指令"
                }
            ],
            "packageName": ""
        },
        {
            "name": "创建拼团活动",
            "events": [
                {
                    "name": "SpellGroupActivityCreateedEvent",
                    "color": "#e6ffcc",
                    "fieldList": [
                        {
                            "name": "activityNo",
                            "type": "Long",
                            "modifier": "private",
                            "description": "活动编码"
                        },
                        {
                            "name": "itemNo",
                            "type": "Long",
                            "modifier": "private",
                            "description": "商品编码"
                        },
                        {
                            "name": "activityStartTime",
                            "type": "LocalDateTime",
                            "modifier": "private",
                            "description": "活动开始时间"
                        },
                        {
                            "name": "activityEndTime",
                            "type": "LocalDateTime",
                            "modifier": "private",
                            "description": "活动结束时间"
                        }
                    ],
                    "description": "活动已创建"
                }
            ],
            "cmdList": [
                {
                    "name": "SpellGroupActivityCreateCmd",
                    "color": "#e6ffcc",
                    "fieldList": [
                        {
                            "name": "activityName",
                            "type": "String",
                            "modifier": "private",
                            "description": "活动名称"
                        },
                        {
                            "name": "itemNo",
                            "type": "Long",
                            "modifier": "private",
                            "description": "商品编码"
                        },
                        {
                            "name": "activityStartTime",
                            "type": "LocalDateTime",
                            "modifier": "private",
                            "description": "活动开始时间"
                        },
                        {
                            "name": "activityEndTime",
                            "type": "LocalDateTime",
                            "modifier": "private",
                            "description": "活动结束时间"
                        },
                        {
                            "name": "storeNo",
                            "type": "Long",
                            "modifier": "private",
                            "description": "店铺编号"
                        },
                        {
                            "name": "limitTimes",
                            "type": "Integer",
                            "modifier": "private",
                            "description": "开团最大限制次数"
                        },
                        {
                            "name": "limitItemCount",
                            "type": "Integer",
                            "modifier": "private",
                            "description": "单次购买商品数量限制"
                        },
                        {
                            "name": "duration",
                            "type": "Integer",
                            "modifier": "private",
                            "description": "拼团时长"
                        },
                        {
                            "name": "groupType",
                            "type": "Integer",
                            "modifier": "private",
                            "description": "拼团类型：1.普通拼团；2.老带新拼团"
                        },
                        {
                            "name": "enableRobot",
                            "type": "Integer",
                            "modifier": "private",
                            "description": "是否开启机器人拼团：0.不开启；1：开启"
                        }
                    ],
                    "description": "活动创建"
                }
            ],
            "packageName": "create"
        },
        {
            "name": "加入拼团活动",
            "events": [
                {
                    "name": "SpellGroupItemJoinedEvent",
                    "color": "#ffe6cc",
                    "fieldList": [],
                    "description": "商品加入活动事件"
                }
            ],
            "cmdList": [
                {
                    "name": "SpellGroupItemJoinCmd",
                    "color": "#ffe6cc",
                    "fieldList": [],
                    "methodList": [],
                    "description": "商品加入活动指令"
                }
            ],
            "packageName": "join"
        },
        {
            "name": "编辑拼团活动",
            "events": [
                {
                    "name": "SpellGroupActivityModifyedEvent",
                    "color": "#e6ffcc",
                    "fieldList": [
                        {
                            "name": "activityNo",
                            "type": "Long",
                            "modifier": "private",
                            "description": "活动编号"
                        },
                        {
                            "name": "itemNo",
                            "type": "Long",
                            "modifier": "private",
                            "description": "商品编码"
                        },
                        {
                            "name": "activityStartTime",
                            "type": "LocalDateTime",
                            "modifier": "private",
                            "description": "活动开始时间"
                        },
                        {
                            "name": "activityEndTime",
                            "type": "LocalDateTime",
                            "modifier": "private",
                            "description": "活动结束时间"
                        }
                    ],
                    "methodList": [],
                    "description": "活动已编辑事件"
                }
            ],
            "cmdList": [
                {
                    "name": "SpellGroupActivityModifyCmd",
                    "color": "#e6ffcc",
                    "fieldList": [
                        {
                            "name": "activityNo",
                            "type": "Long",
                            "modifier": "private",
                            "description": "活动编号"
                        }
                    ],
                    "description": "编辑活动指令"
                }
            ],
            "packageName": "modify"
        },
        {
            "name": "审核拼团活动",
            "events": [
                {
                    "description": "活动已审核"
                }
            ],
            "cmdList": [],
            "packageName": ""
        },
        {
            "name": "开始拼团活动",
            "events": [
                {
                    "name": "SpellGroupActivityStartedEvent",
                    "color": "#e6ffcc",
                    "fieldList": [
                        {
                            "name": "activityNo",
                            "type": "Long",
                            "modifier": "private",
                            "description": "活动编号"
                        },
                        {
                            "name": "activityFinishTime",
                            "type": "LocalDateTime",
                            "modifier": "private",
                            "description": "活动完成时间"
                        }
                    ],
                    "methodList": [],
                    "description": "活动已开始"
                }
            ],
            "cmdList": [
                {
                    "name": "SpellGroupActivityStartCmd",
                    "color": "#e6ffcc",
                    "fieldList": [
                        {
                            "name": "activityNo",
                            "type": "Long",
                            "modifier": "private",
                            "description": "活动编号"
                        }
                    ],
                    "methodList": [],
                    "description": "活动开始指令"
                }
            ],
            "packageName": "start"
        },
        {
            "name": "开启拼团",
            "events": [
                {
                    "name": "SpellGroupCreateedEvent",
                    "color": "#cce5ff",
                    "fieldList": [
                        {
                            "name": "activityNo",
                            "type": "Long",
                            "modifier": "private",
                            "description": "活动编号"
                        },
                        {
                            "name": "finishTime",
                            "type": "LocalDateTime",
                            "modifier": "private",
                            "description": "活动完成时间"
                        }
                    ],
                    "methodList": [],
                    "description": "开启拼团事件"
                }
            ],
            "cmdList": [
                {
                    "name": "SpellGroupCreateCmd",
                    "color": "#cce5ff",
                    "fieldList": [
                        {
                            "name": "uniqueAccountId",
                            "type": "String",
                            "modifier": "private",
                            "description": "团长账号"
                        },
                        {
                            "name": "activityNo",
                            "type": "Long",
                            "modifier": "private",
                            "description": "活动编码"
                        },
                        {
                            "name": "itemCount",
                            "type": "Integer",
                            "modifier": "private",
                            "description": "购买商品数量"
                        },
                        {
                            "name": "itemNo",
                            "type": "Long",
                            "modifier": "private",
                            "description": "购买商品编号"
                        },
                        {
                            "name": "itemBarcode",
                            "type": "String",
                            "modifier": "private",
                            "description": "购买商品条形码"
                        },
                        {
                            "name": "peopleCount",
                            "type": "Integer",
                            "modifier": "private",
                            "description": "成团人数"
                        },
                        {
                            "name": "orderNo",
                            "type": "Long",
                            "modifier": "private",
                            "description": "订单编号"
                        }
                    ],
                    "methodList": [],
                    "description": "开启拼团指令"
                }
            ],
            "packageName": "create"
        },
        {
            "name": "参与拼团活动",
            "events": [
                {
                    "name": "SpellGroupJoinedEvent",
                    "color": "#cce5ff",
                    "fieldList": [
                        {
                            "name": "activityNo",
                            "type": "Long",
                            "modifier": "private",
                            "description": "活动编号"
                        },
                        {
                            "name": "isSuccess",
                            "type": "Boolean",
                            "modifier": "private",
                            "description": "拼团是否成功"
                        }
                    ],
                    "methodList": [],
                    "description": "邀请好友已参团"
                }
            ],
            "cmdList": [
                {
                    "name": "SpellGroupJoinCmd",
                    "color": "#cce5ff",
                    "fieldList": [],
                    "methodList": [],
                    "description": "参与拼团活动指令"
                }
            ],
            "packageName": "join"
        },
        {
            "name": "拼团退款",
            "events": [
                {
                    "name": "SpellGroupRefundedEvent",
                    "color": "#cce5ff",
                    "fieldList": [
                        {
                            "name": "refundType",
                            "type": "Integer",
                            "modifier": "private",
                            "description": "退款操作： 1.发起退款；2.退款成功；3.取消退款"
                        },
                        {
                            "name": "activityNo",
                            "type": "Long",
                            "modifier": "private",
                            "description": "拼团活动编号"
                        },
                        {
                            "name": "uniqueAccountId",
                            "type": "String",
                            "modifier": "private",
                            "description": "会员账号"
                        },
                        {
                            "name": "isLeader",
                            "type": "Boolean",
                            "modifier": "private",
                            "description": "是否为团长"
                        }
                    ],
                    "methodList": [],
                    "description": "拼团已退款"
                }
            ],
            "cmdList": [
                {
                    "name": "SpellGroupRefundCmd",
                    "color": "#cce5ff",
                    "fieldList": [
                        {
                            "name": "refundType",
                            "type": "Integer",
                            "modifier": "private",
                            "description": "退款操作： 1.发起退款；2.退款成功；3.取消退款"
                        },
                        {
                            "name": "activityNo",
                            "type": "Long",
                            "modifier": "private",
                            "description": "拼团活动编号"
                        },
                        {
                            "name": "uniqueAccountId",
                            "type": "String",
                            "modifier": "private",
                            "description": "会员账号"
                        },
                        {
                            "name": "isLeader",
                            "type": "Boolean",
                            "modifier": "private",
                            "description": "是否为团长"
                        },
                        {
                            "name": "itemNo",
                            "type": "Long",
                            "modifier": "private",
                            "description": "退款的商品编码"
                        },
                        {
                            "name": "itemBarcode",
                            "type": "String",
                            "modifier": "private",
                            "description": "退款的商品条形码"
                        },
                        {
                            "name": "itemCount",
                            "type": "Integer",
                            "modifier": "private",
                            "description": "退款的商品数量"
                        }
                    ],
                    "methodList": [],
                    "description": "拼团退款指令"
                }
            ],
            "packageName": "refund"
        },
        {
            "name": "结束拼团",
            "events": [
                {
                    "name": "SpellGroupFinishedEvent",
                    "color": "#cce5ff",
                    "fieldList": [
                        {
                            "name": "activityNo",
                            "type": "Long",
                            "modifier": "private",
                            "description": "活动编码"
                        },
                        {
                            "name": "isSuccess",
                            "type": "Boolean",
                            "modifier": "private",
                            "description": "是否拼团成功"
                        }
                    ],
                    "methodList": [],
                    "description": "拼团已结束"
                }
            ],
            "cmdList": [
                {
                    "name": "SpellGroupFinishCmd",
                    "color": "#cce5ff",
                    "fieldList": [
                        {
                            "name": "activityNo",
                            "type": "Long",
                            "modifier": "private",
                            "description": "活动编号"
                        }
                    ],
                    "methodList": [],
                    "description": "拼团结束指令"
                }
            ],
            "packageName": "finish"
        },
        {
            "name": "结束拼团活动",
            "events": [
                {
                    "name": "SpellGroupActivityFinishedEvent",
                    "color": "#e6ffcc",
                    "fieldList": [
                        {
                            "name": "activityNo",
                            "type": "Long",
                            "modifier": "private",
                            "description": "活动编码"
                        }
                    ],
                    "methodList": [],
                    "description": "拼团活动已结束"
                }
            ],
            "cmdList": [
                {
                    "name": "SpellGroupActivityFinishCmd",
                    "color": "#e6ffcc",
                    "fieldList": [
                        {
                            "name": "activityNo",
                            "type": "Long",
                            "modifier": "private",
                            "description": "活动编号"
                        },
                        {
                            "name": "finishType",
                            "type": "Integer",
                            "modifier": "private",
                            "description": "结束类型"
                        }
                    ],
                    "methodList": [],
                    "description": "拼团活动结束指令"
                }
            ],
            "packageName": "finish"
        },
        {
            "name": "删除拼团活动",
            "events": [
                {
                    "name": "SpellGroupActivityRemoveedEvent",
                    "color": "#e6ffcc",
                    "fieldList": [
                        {
                            "name": "activityNo",
                            "type": "Long",
                            "modifier": "private",
                            "description": "活动编码"
                        }
                    ],
                    "methodList": [],
                    "description": "拼团活动已删除"
                }
            ],
            "cmdList": [
                {
                    "name": "SpellGroupActivityRemoveCmd",
                    "color": "#e6ffcc",
                    "fieldList": [
                        {
                            "name": "activityNo",
                            "type": "Long",
                            "modifier": "private",
                            "description": "活动编号"
                        }
                    ],
                    "methodList": [],
                    "description": "拼团活动删除指令"
                }
            ],
            "packageName": "remove"
        }
    ],
    "aggregations": [
        {
            "name": "SpellGroupActivity",
            "color": "#e6ffcc",
            "fieldList": [
                {
                    "name": "activityNo",
                    "type": "Long",
                    "modifier": "private",
                    "description": "活动编号"
                },
                {
                    "name": "activityName",
                    "type": "String",
                    "modifier": "private",
                    "description": "活动名称"
                },
                {
                    "name": "activityStartTime",
                    "type": "LocalDateTime",
                    "modifier": "private",
                    "description": "活动开始时间"
                },
                {
                    "name": "activityEndTime",
                    "type": "LocalDateTime",
                    "modifier": "private",
                    "description": "活动结束时间"
                },
                {
                    "name": "storeNo",
                    "type": "Long",
                    "modifier": "private",
                    "description": "店铺编号"
                },
                {
                    "name": "limitTimes",
                    "type": "Integer",
                    "modifier": "private",
                    "description": "开团最大限制次数"
                },
                {
                    "name": "limitItemCount",
                    "type": "Integer",
                    "modifier": "private",
                    "description": "单次购买商品数量限制"
                },
                {
                    "name": "duration",
                    "type": "Integer",
                    "modifier": "private",
                    "description": "拼团时长"
                },
                {
                    "name": "groupType",
                    "type": "Integer",
                    "modifier": "private",
                    "description": "拼团类型：1.普通拼团；2.老带新拼团"
                },
                {
                    "name": "enableRobot",
                    "type": "Integer",
                    "modifier": "private",
                    "description": "是否开启机器人拼团：0.不开启；1：开启"
                },
                {
                    "name": "activityStatus",
                    "type": "Integer",
                    "modifier": "private",
                    "description": "活动状态：-1.已删除；0.未开始；1.进行中；2.已结束"
                }
            ],
            "methodList": [
                {
                    "name": "isProceed",
                    "modifier": "public",
                    "returnType": "Boolean",
                    "description": "活动是否在进行中",
                    "attributeLabel": ""
                },
                {
                    "name": "modify",
                    "modifier": "public",
                    "returnType": "void",
                    "description": "修改拼团活动",
                    "attributeLabel": "SpellGroupActivityModifyCmd spellGroupActivityModifyCmd, SpellGroupItem spellGroupItem"
                },
                {
                    "name": "start",
                    "modifier": "public",
                    "returnType": "void",
                    "description": "开启拼团活动",
                    "attributeLabel": "SpellGroupActivityStartCmd spellGroupActivityStartCmd"
                },
                {
                    "name": "finish",
                    "modifier": "public",
                    "returnType": "void",
                    "description": "完成拼团活动",
                    "attributeLabel": "SpellGroupActivityFinishCmd spellGroupActivityFinishCmd"
                },
                {
                    "name": "remove",
                    "modifier": "public",
                    "returnType": "void",
                    "description": "删除拼团活动",
                    "attributeLabel": "SpellGroupActivityRemoveCmd spellGroupActivityRemoveCmd"
                },
                {
                    "name": "getLimitTimes",
                    "modifier": "public",
                    "returnType": "Integer",
                    "description": "获取拼团活动开团最大限制次数",
                    "attributeLabel": ""
                },
                {
                    "name": "checkBuyItemCountOrError",
                    "modifier": "public",
                    "returnType": "void",
                    "description": "验证购买商品数量是否超出活动限制",
                    "attributeLabel": "Integer itemCount"
                },
                {
                    "name": "getDuration",
                    "modifier": "public",
                    "returnType": "Integer",
                    "description": "获取单个拼团时长（单位：小时）",
                    "attributeLabel": ""
                },
                {
                    "name": "isAgedBandNew",
                    "modifier": "public",
                    "returnType": "Boolean",
                    "description": "是否为老带新拼团",
                    "attributeLabel": ""
                },
                {
                    "name": "isEnableRobot",
                    "modifier": "public",
                    "returnType": "Boolean",
                    "description": "是否开启机器人拼团",
                    "attributeLabel": ""
                },
                {
                    "name": "getActivityEndTime",
                    "modifier": "public",
                    "returnType": "LocalDateTime",
                    "description": "获取活动完成时间",
                    "attributeLabel": ""
                },
                {
                    "name": "getActivityStartTime",
                    "modifier": "public",
                    "returnType": "LocalDateTime",
                    "description": "获取活动开始时间",
                    "attributeLabel": ""
                }
            ],
            "description": "拼团活动聚合"
        },
        {
            "name": "SpellGroupItem",
            "color": "#ffe6cc",
            "fieldList": [
                {
                    "name": "itemNo",
                    "type": "Long",
                    "modifier": "private",
                    "description": "商品编号"
                },
                {
                    "name": "itemActivityList",
                    "type": "List<ItemActivity>",
                    "modifier": "private",
                    "description": "已加入的活动列表"
                }
            ],
            "methodList": [
                {
                    "name": "checkItemJoinActivityAndError",
                    "modifier": "public",
                    "returnType": "void",
                    "description": "检测商品是否可以加入活动",
                    "attributeLabel": "SpellGroupItemJoinCmd spellGroupItemJoinCmd"
                }
            ],
            "description": "商品加入拼团活动聚合"
        },
        {
            "name": "SpellGroup",
            "color": "#cce5ff",
            "fieldList": [
                {
                    "name": "uniqueAccountId",
                    "type": "String",
                    "modifier": "private",
                    "description": "团长账号"
                },
                {
                    "name": "activityNo",
                    "type": "Long",
                    "modifier": "private",
                    "description": "活动编码"
                },
                {
                    "name": "itemCount",
                    "type": "Integer",
                    "modifier": "private",
                    "description": "购买商品数量"
                },
                {
                    "name": "itemNo",
                    "type": "Long",
                    "modifier": "private",
                    "description": "购买商品编号"
                },
                {
                    "name": "itemBarcode",
                    "type": "String",
                    "modifier": "private",
                    "description": "购买商品条形码"
                },
                {
                    "name": "peopleCount",
                    "type": "Integer",
                    "modifier": "private",
                    "description": "成团人数"
                },
                {
                    "name": "orderNo",
                    "type": "Long",
                    "modifier": "private",
                    "description": "订单编号"
                },
                {
                    "name": "groupStatus",
                    "type": "Integer",
                    "modifier": "private",
                    "description": "拼团状态：1.拼团中；2.拼团成功；3.拼团失败；4.退款中"
                },
                {
                    "name": "startTime",
                    "type": "LocalDateTime",
                    "modifier": "private",
                    "description": "拼团开始时间"
                },
                {
                    "name": "finishTime",
                    "type": "LocalDateTime",
                    "modifier": "private",
                    "description": "拼团完成时间"
                },
                {
                    "name": "groupMemberList",
                    "type": "List<GroupMember>",
                    "modifier": "private",
                    "description": "拼团会员"
                }
            ],
            "methodList": [
                {
                    "name": "isFinish",
                    "modifier": "public",
                    "returnType": "Boolean",
                    "description": "拼团是否已结束",
                    "attributeLabel": ""
                },
                {
                    "name": "isSuccess",
                    "modifier": "public",
                    "returnType": "Boolean",
                    "description": "拼团是否成功",
                    "attributeLabel": ""
                },
                {
                    "name": "join",
                    "modifier": "public",
                    "returnType": "void",
                    "description": "参与拼团活动",
                    "attributeLabel": "SpellGroupJoinCmd spellGroupJoinCmd, SpellGroupActivity spellGroupActivity"
                },
                {
                    "name": "refund",
                    "modifier": "public",
                    "returnType": "void",
                    "description": "拼团退款",
                    "attributeLabel": "SpellGroupRefundCmd spellGroupRefundCmd"
                },
                {
                    "name": "finish",
                    "modifier": "public",
                    "returnType": "void",
                    "description": "拼团结束",
                    "attributeLabel": "SpellGroupFinishCmd spellGroupFinishCmd, SpellGroupActivity spellGroupActivity"
                },
                {
                    "name": "checkOrError",
                    "modifier": "public",
                    "returnType": "void",
                    "description": "检查是否允许参团",
                    "attributeLabel": "SpellGroupJoinCmd spellGroupJoinCmd, SpellGroupActivity spellGroupActivity"
                }
            ],
            "description": "拼团聚合"
        }
    ],
    "valueObjects": [
        {
            "name": "GroupMember",
            "color": "#cce5ff",
            "fieldList": [
                {
                    "name": "uniqueAccountId",
                    "type": "String",
                    "modifier": "private",
                    "description": "会员账号"
                },
                {
                    "name": "itemCount",
                    "type": "Integer",
                    "modifier": "private",
                    "description": "购买商品数量"
                }
            ],
            "methodList": [],
            "description": "拼团成员"
        },
        {
            "name": "ItemActivity",
            "color": "#ffe6cc",
            "fieldList": [
                {
                    "name": "activityNo",
                    "type": "Long",
                    "modifier": "private",
                    "description": "活动编码"
                },
                {
                    "name": "activityStartTime",
                    "type": "LocalDateTime",
                    "modifier": "private",
                    "description": "活动开始时间"
                },
                {
                    "name": "activityEndTime",
                    "type": "LocalDateTime",
                    "modifier": "private",
                    "description": "活动结束时间"
                }
            ],
            "methodList": [],
            "description": "活动"
        }
    ]
}
```

第二步，使用IDEA打开对应生成的项目，并等待项目加载完成

![image](https://img2022.cnblogs.com/blog/1994693/202207/1994693-20220726132228996-1008832281.png)

第三步，右键项目，通过IDEA自带的优化导入功能优化代码

![image](https://img2022.cnblogs.com/blog/1994693/202207/1994693-20220726132255244-1889400543.png)

第四步，正常配置数据库、端口等信息，启动项目

![image](https://img2022.cnblogs.com/blog/1994693/202207/1994693-20220726132309443-1593822570.png)

### 总结

本项目设计的代码生成器依赖于DDD领域建模，需要使用者具备基本的领域建模知识。实现原理也较为简单，采用的是Velocity模板引擎进行模板替换。
项目的主要工作：

- 设计领域图谱数据模型
- 实现数据模型与模板的映射规则
- 规范COLA框架的模板文件

目前支持的能力：

-   [X] 支持COLA项目结构
-   [X] 支持domain层代码
-   [X] 支持infrastructure层代码
-   [ ] 支持app层代码
-   [ ] 支持client层代码
-   [ ] 支持adpter层代码