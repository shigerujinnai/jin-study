package com.jin.domain.userinfo.vo;

import lombok.Getter;

@Getter
public class Age {

    private Integer age;

    public Age(BirthDay birthday, DateNow now) {
        calcAgeNow(birthday, now);
    }

    private void calcAgeNow(BirthDay birthday, DateNow now) {
        this.age = new Integer(18);
        // 計算する
    }

    public boolean isAdult() {
        return age >= 20;
    }
}
