package com.lilin.utils;

import com.lilin.entity.LoginUser;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * Created by LiLin on 2022/9/10/10:42:35
 */
public class SecurityUtils {
    /*
    获取用户
     */
    public static LoginUser getLoginUser() {
        Authentication authentication = getAuthentication();
        if (authentication != null) {
            return (LoginUser)authentication.getPrincipal();
        } else {
            return null;
        }
    }

    /*
    获取 Authentication
     */
    public static Authentication getAuthentication() {
        return SecurityContextHolder.getContext().getAuthentication();
    }

    public static Boolean isAdmin() {
        Long id = getLoginUser() == null ? null : getLoginUser().getUser().getId();
        return id != null && 1L == id;
    }

    public static Long getUserId() {
        return getLoginUser() == null ? null : getLoginUser().getUser().getId();
    }
}