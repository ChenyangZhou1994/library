package com.imu.library.pojo;

public class User {
    private Integer userid;

    private String username;

    private String userpassword;

    private String useridnumber;

    private Integer userjobnumber;

    private Integer userlendinglevels;

    private Integer usercollegenumber;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword == null ? null : userpassword.trim();
    }

    public String getUseridnumber() {
        return useridnumber;
    }

    public void setUseridnumber(String useridnumber) {
        this.useridnumber = useridnumber == null ? null : useridnumber.trim();
    }

    public Integer getUserjobnumber() {
        return userjobnumber;
    }

    public void setUserjobnumber(Integer userjobnumber) {
        this.userjobnumber = userjobnumber;
    }

    public Integer getUserlendinglevels() {
        return userlendinglevels;
    }

    public void setUserlendinglevels(Integer userlendinglevels) {
        this.userlendinglevels = userlendinglevels;
    }

    public Integer getUsercollegenumber() {
        return usercollegenumber;
    }

    public void setUsercollegenumber(Integer usercollegenumber) {
        this.usercollegenumber = usercollegenumber;
    }
}