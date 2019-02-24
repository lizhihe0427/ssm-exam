package com.itheima.domain;

/**
 * @Author: lizhihe
 * @Date: 2019/2/24 22:32
 * @Version 1.0
 */

public class Test {
    public User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Test{" +
                "user=" + user +
                ", testName='" + testName + '\'' +
                '}';
    }

    private String testName;

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }
}
