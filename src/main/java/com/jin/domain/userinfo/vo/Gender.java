package com.jin.domain.userinfo.vo;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum Gender {
    MEN("男性"),
    WOMEN("女性");

    private final String value;
}