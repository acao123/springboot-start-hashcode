package com.rongda.myboot;

/**
 * @class: GetHashCodeClass.class
 * @description: 目标功能实现
 * @author: acao
 * @create: 2020-12-02 15:58
 **/
public class GetHashCodeClass {

    private final String target;

    public GetHashCodeClass(String target) {
        this.target = target;
    }

    public String getHashCode() {
        return String.valueOf(this.target.hashCode());
    }
}
