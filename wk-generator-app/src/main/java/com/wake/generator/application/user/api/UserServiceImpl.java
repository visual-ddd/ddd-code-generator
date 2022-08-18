package com.wake.generator.application.user.api;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.wake.generator.application.user.common.Constant;
import com.wake.generator.client.user.api.UserService;
import com.wake.generator.client.user.dto.UserDto;
import com.wake.generator.infra.manage.repository.mapper.UserMapper;
import com.wake.generator.infra.manage.repository.model.UserDO;
import com.wakedata.common.core.dto.ResultDTO;
import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public ResultDTO<Boolean> login(UserDto userDto, HttpSession session,
        HttpServletRequest request, HttpServletResponse response) {
        String userName = userDto.getUserName();
        String password = userDto.getPassword();
        // 最终返回的对象
        if (StringUtils.isEmpty(userName) || StringUtils.isEmpty(password)) {
            return ResultDTO.fail("请输入账号或密码");
        }
        LambdaQueryWrapper<UserDO> queryWrapper = new LambdaQueryWrapper<UserDO>()
            .eq(UserDO::getUserName, userName);

        UserDO userDO = userMapper.selectOne(queryWrapper);
        if (null == userDO) {
            return ResultDTO.fail("该账号不存在，请检查后重试");
        }
        // 验证密码是否正确
        //  String newPassword = PasswordUtils.getMd5(password, userName, dbUser.getSalt());
        if (!password.equals(userDO.getPassword())) {
            return ResultDTO.fail("手机号或密码错误，请检查后重试");
        }
        // 将登录用户信息保存到session中
        session.setAttribute(Constant.SYSTEM_USER_SESSION, userDO);
        // 保存cookie，实现自动登录
        Cookie cookie = new Cookie("cookie_username", userName);
        cookie.setMaxAge(30 * 24 * 60 * 60);
        cookie.setPath(request.getContextPath());
        cookie.setHttpOnly(true);
        cookie.setPath("/");
        response.addCookie(cookie);
        return ResultDTO.success(Boolean.TRUE);
    }


    @Override
    public ResultDTO<Boolean> logout(HttpSession session, HttpServletRequest request,
        HttpServletResponse response) {
        // 删除session里面的用户信息
        session.removeAttribute(Constant.SYSTEM_USER_SESSION);
        Cookie cookieUsername = new Cookie("cookie_username", null);
        cookieUsername.setMaxAge(0);
        cookieUsername.setPath(request.getContextPath());
        // 向客户端发送cookie
        response.addCookie(cookieUsername);
        return ResultDTO.success(Boolean.TRUE);
    }
}
