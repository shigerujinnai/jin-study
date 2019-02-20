package com.jin.domain.credit.vo;

import com.jin.domain.userinfo.vo.DateNow;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;

@RequiredArgsConstructor
@Getter
public class CreditCardExpirationPeriod {

    private final LocalDate value;

    private final DateNow now;

    public boolean past() {
        return value.isBefore(now.getValue());
    }
}
