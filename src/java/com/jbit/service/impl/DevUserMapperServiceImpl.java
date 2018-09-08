package com.jbit.service.impl;

import com.jbit.dao.DevUserMapper;
import com.jbit.entity.DevUser;
import com.jbit.service.DevUserMapperService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2018/9/4.
 */
@Service("devUserMapperService")
public class DevUserMapperServiceImpl implements DevUserMapperService {
    @Resource
    private DevUserMapper devUserMapper;

    @Override
    public DevUser fingUser(String devcode, String devpassword) {
        return devUserMapper.fingUser(devcode,devpassword);
    }
}
