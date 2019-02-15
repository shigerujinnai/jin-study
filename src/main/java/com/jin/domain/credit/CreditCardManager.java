package com.jin.domain.credit;

import lombok.Getter;

@Getter
public class CreditCardManager {

    private CreditCardRepository creditCardRepository;

    public CreditCardManager() {
        // リポジトリの生成
        creditCardRepository = null;
    }

    public boolean referUserInfo(ReferCreditCard creditCard) {

        return false;
    }

}
