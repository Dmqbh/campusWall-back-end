package com.nf.campuswall.dao.impl;

import com.nf.campuswall.dao.UserDao;
import com.nf.campuswall.entity.UserEntity;
import com.nf.campuswall.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

public class UserDaoImpl implements UserDao {
    /**
     * 引用邮箱注册接口
     *
     * @param userEntity 邮箱，名称，密码
     * @return 返回成功句数（1）
     */
    @Override
    public int userEmailRegistrationByEmailPassword(UserEntity userEntity) {
        try (final SqlSession session = MybatisUtils.getSqlsession(true)) {
            final UserDao dao = session.getMapper(UserDao.class);
            return dao.userEmailRegistrationByEmailPassword(userEntity);
        }
    }

    /**
     * 引用手机注册接口
     *
     * @param userEntity 手机号，名称，密码
     * @return 返回成功句数（1）
     */
    @Override
    public int userPhoneRegistrationByNamePassword(UserEntity userEntity) {
        try (final SqlSession session = MybatisUtils.getSqlsession(true)) {
            final UserDao dao = session.getMapper(UserDao.class);
            return dao.userPhoneRegistrationByNamePassword(userEntity);
        }
    }

    /**
     * 引用编辑个人信息接口
     *
     * @param userEntity 名字，生日，地址，头像,性别
     */
    @Override
    public void editPersonalInformation(UserEntity userEntity) {
        try (final SqlSession session = MybatisUtils.getSqlsession(true)) {
            final UserDao dao = session.getMapper(UserDao.class);
            dao.editPersonalInformation(userEntity);
        }
    }

    /**
     * 引用登录接口
     *
     * @param userEntity 邮箱或手机号和密码
     * @return 邮箱，手机号，密码，名称
     */
    @Override
    public UserEntity loginByEmailOrPhoneAndPassword(UserEntity userEntity) {
        try (final SqlSession session = MybatisUtils.getSqlsession(true)) {
            final UserDao dao = session.getMapper(UserDao.class);
            return dao.loginByEmailOrPhoneAndPassword(userEntity);
        }
    }

    @Override
    public int changePassword(UserEntity userEntity) {
        try (final SqlSession session = MybatisUtils.getSqlsession(true)) {
            final UserDao dao = session.getMapper(UserDao.class);
            return dao.changePassword(userEntity);
        }
    }
}
