package com.jin.domain.credit;

import com.jin.domain.credit.vo.CreditCardExpirationPeriod;
import com.jin.domain.credit.vo.CreditCardNumber;
import com.jin.domain.credit.vo.CreditCardSecurityCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class ReferCreditCard {

    private final CreditCardNumber creditCardNumber;
    private final CreditCardExpirationPeriod cardExpirationPeriod;
    private final CreditCardSecurityCode creditCardSecurityCode;

}
