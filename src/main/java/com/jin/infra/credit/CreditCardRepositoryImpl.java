package com.jin.infra.credit;

import com.jin.domain.credit.CreditCardInfo;
import com.jin.domain.credit.CreditCardRepository;
import com.jin.domain.credit.ReferCreditCard;

public class CreditCardRepositoryImpl implements CreditCardRepository {
    @Override
    public boolean refer(ReferCreditCard creditCard) {
        return false;
    }

    @Override
    public void regist(CreditCardInfo cardInfo) {

    }
}
