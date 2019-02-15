package com.jin.domain.credit;

public interface CreditCardRepository {

    boolean refer(ReferCreditCard creditCard);

    void regist(CreditCardInfo cardInfo);
}
