package com.jin.domain.credit;

import com.jin.domain.account.vo.UserId;
import com.jin.domain.credit.vo.CreditCardExpirationPeriod;
import com.jin.domain.credit.vo.CreditCardNumber;
import com.jin.domain.credit.vo.CreditCardSecurityCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class CreditCardInfo {

    private final UserId userId;

    private final CreditCardNumber cardNumber;
    private final CreditCardExpirationPeriod expirationPeriod;
    private final CreditCardSecurityCode securityCode;

}
