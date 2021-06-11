package com.nf.campuswall.dao.impl;

import com.nf.campuswall.entity.UserEntity;

import java.util.List;


public class UserDaoImplTest {

    @org.junit.Test
    public void userEmailRegistrationByEmailPassword() {
        UserEntity userEntity = new UserEntity();
        userEntity.setUserEmail("uuue");
        userEntity.setUserName("uuun");
        userEntity.setUserPassword("uuup");
        int i = new UserDaoImpl().userEmailRegistrationByEmailPassword(userEntity);
        System.out.println(i);
    }

    @org.junit.Test
    public void userPhoneRegistrationByNamePassword() {
        UserEntity userEntity = new UserEntity();
        userEntity.setUserPhone("13286756121");
        userEntity.setUserName("uuun");
        userEntity.setUserPassword("uuup");
        int i = new UserDaoImpl().userPhoneRegistrationByNamePassword(userEntity);
        System.out.println(i);
    }

    @org.junit.Test
    public void editPersonalInformation() {
        UserEntity userEntity = new UserEntity();
        userEntity.setUserName("jackjack");
        userEntity.setUserEmail("10001@qq.com");
        userEntity.setUserPassword("123456");
        new UserDaoImpl().editPersonalInformation(userEntity);
    }


    @org.junit.Test
    public void loginByEmailOrPhoneAndPassword() {
        UserEntity userEntity = new UserEntity();
//        userEntity.setUserPhone("10001");
        userEntity.setUserEmail("10001@qq.com");
        userEntity.setUserPassword("123456");
        System.out.printf("", new UserDaoImpl().loginByEmailOrPhoneAndPassword(userEntity).toString());
    }

    @org.junit.Test
    public void changePassword() {
        UserEntity userEntity = new UserEntity();
        userEntity.setUserName("jackjack");
        userEntity.setUserEmail("10001@qq.com");
        userEntity.setUserPassword("123456");
        new UserDaoImpl().changePassword(userEntity);
    }
}