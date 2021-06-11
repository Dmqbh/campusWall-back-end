package com.nf.campuswall.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

public class UserEntity {
    //用户id
    private Integer userId;

    //用户名
    private String userName;

    //用户密码
    private String userPassword;

    //用户邮箱
    private String userEmail;

    //用户性别
    private String userSex;

    //用户地址
    private String userAddress;

    //用户生日
    private LocalDate userBirthday;

    //用户手机号
    private String userPhone;

    //用户头像
    private String userHeadPortrait;

    //用户财富
    private BigDecimal userWealth;

    //用户注册时间
    private LocalDate userCreateTime;

    //用户资料修改时间
    private LocalDate gmtModified;

    //用户启用状态（0代表停用，1代表启用）
    private Integer isUserState;


    public UserEntity() {
    }

    public UserEntity(Integer userId, String userName, String userPassword, String userEmail, String userSex, String userAddress, LocalDate userBirthday, String userPhone, String userHeadPortrait, BigDecimal userWealth, LocalDate userCreateTime, LocalDate gmtModified, Integer isUserState) {
        this.userId = userId;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userEmail = userEmail;
        this.userSex = userSex;
        this.userAddress = userAddress;
        this.userBirthday = userBirthday;
        this.userPhone = userPhone;
        this.userHeadPortrait = userHeadPortrait;
        this.userWealth = userWealth;
        this.userCreateTime = userCreateTime;
        this.gmtModified = gmtModified;
        this.isUserState = isUserState;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public LocalDate getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(LocalDate userBirthday) {
        this.userBirthday = userBirthday;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserHeadPortrait() {
        return userHeadPortrait;
    }

    public void setUserHeadPortrait(String userHeadPortrait) {
        this.userHeadPortrait = userHeadPortrait;
    }

    public BigDecimal getUserWealth() {
        return userWealth;
    }

    public void setUserWealth(BigDecimal userWealth) {
        this.userWealth = userWealth;
    }

    public LocalDate getUserCreateTime() {
        return userCreateTime;
    }

    public void setUserCreateTime(LocalDate userCreateTime) {
        this.userCreateTime = userCreateTime;
    }

    public LocalDate getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(LocalDate gmtModified) {
        this.gmtModified = gmtModified;
    }

    public Integer getIsUserState() {
        return isUserState;
    }

    public void setIsUserState(Integer isUserState) {
        this.isUserState = isUserState;
    }
}
