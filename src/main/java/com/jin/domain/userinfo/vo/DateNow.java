package com.jin.domain.userinfo.vo;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;

@RequiredArgsConstructor
@Getter
public class DateNow {

    private final LocalDate value;
}
