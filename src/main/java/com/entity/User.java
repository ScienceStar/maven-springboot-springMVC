package com.entity;

import java.io.Serializable;

/**
 * @ClassName User
 * @Description: TODO
 * @Author lxc
 * @Date 2020/3/17
 * @Version V1.0
 **/
public class User implements Serializable{
    private long userId;
    private String ckId;
    private String userAccount;
    private String userPassword;
    private String userName;
    private int userStatus;
    private String createDateTime;
    private String registerIp;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getCkId() {
        return ckId;
    }

    public void setCkId(String ckId) {
        this.ckId = ckId;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(int userStatus) {
        this.userStatus = userStatus;
    }

    public String getCreateDateTime() {
        return createDateTime;
    }

    public void setCreateDateTime(String createDateTime) {
        this.createDateTime = createDateTime;
    }

    public String getRegisterIp() {
        return registerIp;
    }

    public void setRegisterIp(String registerIp) {
        this.registerIp = registerIp;
    }
}
