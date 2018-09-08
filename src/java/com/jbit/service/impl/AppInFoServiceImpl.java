package com.jbit.service.impl;

import com.jbit.dao.AppInfoMapper;
import com.jbit.entity.AppInfo;
import com.jbit.service.AppInFoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("appInFoService")
public class AppInFoServiceImpl implements AppInFoService{
    @Resource
    private AppInfoMapper appInfoMapper;
    @Override
    public List<AppInfo> findAppInfo() {
        return appInfoMapper.findAppInfo();
    }
}
