package com.wake.generator.adapter.user;

import com.wake.generator.client.user.api.UserService;
import com.wake.generator.client.user.dto.UserDto;
import com.wakedata.common.core.dto.ResultDTO;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户管理
 *
 * @author ZhuXueLiang
 * @date 2022/7/28
 * @since 1.0
 */
@Slf4j
@RequestMapping("/user")
@RestController
public class UserController {

    @Resource
    private UserService userService;

    @PostMapping(value = "/login")
    public ResultDTO<Boolean> login(@RequestBody UserDto userDto, HttpSession session,
        HttpServletRequest request, HttpServletResponse response) {
        return userService.login(userDto, session, request, response);
    }

    /**
     * 退出登录
     */
    @GetMapping(value = "/logout")
    public ResultDTO<Boolean> logout(HttpSession session, HttpServletRequest request,
        HttpServletResponse response) {
        return userService.logout(session, request, response);
    }

}
