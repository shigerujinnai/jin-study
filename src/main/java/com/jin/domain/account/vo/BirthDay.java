package com.jin.domain.account.vo;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;

@RequiredArgsConstructor
@Getter
public class BirthDay {

    private final LocalDate value;
}
