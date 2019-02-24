package com.itheima.domain;

import java.io.Serializable;
import java.util.List;

/**
 * @Author: lizhihe
 * @Date: 2019/2/22 19:55
 * @Version 1.0
 * 用户实体类
 */
public class User implements Serializable {
    private Integer uid;
    private String username;
    private String password;
    private String rolename;
    private List<Cust> custs;

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", rolename='" + rolename + '\'' +
                ", custs=" + custs +
                '}';
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public List<Cust> getCusts() {
        return custs;
    }

    public void setCusts(List<Cust> custs) {
        this.custs = custs;
    }
}
