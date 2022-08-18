package com.wake.generator.client.user.api;

import com.wake.generator.client.user.dto.UserDto;
import com.wakedata.common.core.dto.ResultDTO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 用户服务接口
 *
 * @author ZhuXueLiang
 * @date 2022/3/25 11:35
 * @since 1.0
 */
public interface UserService {

    /**
     * 登陆，成功返回用户信息
     *
     * @param userDto  用户信息
     * @param session  session
     * @param request  request
     * @param response response
     * @return 登录结果
     */
    ResultDTO<Boolean> login(UserDto userDto, HttpSession session,
        HttpServletRequest request, HttpServletResponse response);

    /**
     * 退出登陆
     *
     * @param session  session
     * @param request  request
     * @param response response
     * @return 退出登录结果
     */
    ResultDTO<Boolean> logout(HttpSession session, HttpServletRequest request,
        HttpServletResponse response);

}
