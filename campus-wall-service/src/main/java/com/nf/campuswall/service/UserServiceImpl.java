package com.nf.campuswall.service;

import com.nf.campuswall.dao.impl.UserDaoImpl;
import com.nf.campuswall.entity.UserEntity;

public class UserServiceImpl {
    /**
     * 实现邮箱注册接口
     * @param entity
     * @return
     */
    public int userEmailRegistrationByEmailPassword(UserEntity entity) {
        return new UserDaoImpl().userEmailRegistrationByEmailPassword(entity);
    }
}
