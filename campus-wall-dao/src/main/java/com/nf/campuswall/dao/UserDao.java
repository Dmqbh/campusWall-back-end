package com.nf.campuswall.dao;

import com.nf.campuswall.entity.UserEntity;
import org.apache.ibatis.annotations.Param;

public interface UserDao {
    /**
     * 邮箱注册接口
     *
     * @param userEntity 邮箱，名称，密码
     * @return 返回成功行数（1）
     */
    int userEmailRegistrationByEmailPassword(@Param("user") UserEntity userEntity);

    /**
     * 手机注册接口
     *
     * @param userEntity 手机号，名称，密码
     * @return 返回成功行数（1）
     */
    int userPhoneRegistrationByNamePassword(@Param("user") UserEntity userEntity);

    /**
     * 编辑个人身份信息接口
     *
     * @param userEntity 名字，生日，地址，头像,性别
     */
    void editPersonalInformation(@Param("user") UserEntity userEntity);

    /**
     * 登录接口
     *
     * @param userEntity 邮箱或手机号和密码
     * @return 邮箱，手机号，密码，名称
     */
    UserEntity loginByEmailOrPhoneAndPassword(@Param("user") UserEntity userEntity);

    /**
     * 改密码
     *
     * @param userEntity
     * @return
     */
    int changePassword(@Param("user") UserEntity userEntity);


}
