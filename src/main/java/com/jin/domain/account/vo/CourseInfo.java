package com.jin.domain.account.vo;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum CourseInfo {
    Basic("ベーシック"),
    NikoNiko("ニコニコ");


    private final String value;

}
