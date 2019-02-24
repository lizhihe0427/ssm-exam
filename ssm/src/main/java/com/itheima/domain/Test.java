package com.itheima.domain;

/**
 * @Author: lizhihe
 * @Date: 2019/2/24 22:32
 * @Version 1.0
 */

public class Test {

    private String testName;

    @Override
    public String toString() {
        return "Test{" +
                "testName='" + testName + '\'' +
                '}';
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }
}
