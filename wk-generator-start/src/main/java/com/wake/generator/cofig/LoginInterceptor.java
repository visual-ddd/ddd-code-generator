package com.wake.generator.cofig;

import com.alibaba.fastjson.JSON;
import com.wakedata.common.core.dto.ResultDTO;
import com.wakedata.common.core.resultcode.CommonResultCode;
import java.util.Optional;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

/**
 * 登录拦截器
 *
 * @author ZhuXueLiang
 * @version 1.0
 * @date 2022/8/15
 */
@Component
public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
        Object handler) throws Exception {
        // 获得cookie
        Cookie[] cookies = request.getCookies();
        String userName = null;
        cookies = Optional.ofNullable(cookies).orElse(new Cookie[]{});
        for (Cookie item : cookies) {
            if ("cookie_username".equals(item.getName())) {
                userName = item.getValue();
                break;
            }
        }
        // 如果cookie里面没有包含用户的一些登录信息，则重定向到登录界面
        if (StringUtils.isEmpty(userName)) {
            response.setCharacterEncoding("UTF-8");
            response.setContentType("application/json;charset=UTF-8");
            response.getWriter().print(JSON.toJSON(ResultDTO.fail(CommonResultCode.LOGIN_ERROR)));
            return false;
        }
        return true;
    }
}

