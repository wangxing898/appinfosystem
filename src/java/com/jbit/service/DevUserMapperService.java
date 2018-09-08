package com.jbit.service;

import com.jbit.entity.DevUser;

/**
 * Created by Administrator on 2018/9/4.
 */
public interface DevUserMapperService {
    DevUser fingUser(String devcode, String devpassword);
}
