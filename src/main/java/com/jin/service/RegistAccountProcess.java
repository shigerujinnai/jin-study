package com.jin.service;

import com.jin.domain.account.AccountManager;
import com.jin.domain.credit.CreditCardManager;

public class RegistAccountProcess {

    private static RegistAccountProcess instance;

    private AccountManager accountManager;

    private CreditCardManager creditCardManager;


    private RegistAccountProcess() {
        accountManager = new AccountManager();
        creditCardManager = new CreditCardManager();
    }

    public static RegistAccountProcess getInstance() {
        if (instance == null) {
            instance = new RegistAccountProcess();
        }
        return instance;
    }

    public void registAccount(RegistUserInfo userInfo) {

        if (accountManager.referUserInfo(userInfo.toUserInfo())) {
            System.out.println("登録済みメンバーのためNG");
            return;
        }
        if (!userInfo.getAge().isAdult()) {
            System.out.println("未成年のためNG");
            return;
        }

        // if 既に登録されているcreditカードか？
        if (creditCardManager.referUserInfo(userInfo.toCreditCardInfo())) {
            System.out.println("登録されているcreditカードのためNG");
        }
        //  // creditカード審査NGのため

        // creditカードの有効期限はすぎていないか？
        //        if(userInfo.getCreditCardExpirationPeriod().past())
        //  // creditカード審査NGのため


        // UserIDの発番

        // アカウントマネージャへ登録依頼する

        // creditカードマネージャへ登録依頼する
    }

}
