package com.jin.service;

import com.jin.domain.account.UserInfoRepository;
import com.jin.domain.credit.CreditCardRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class RegistAccountProcess {

    private final UserInfoRepository userInfoRepository;

    private final CreditCardRepository creditCardRepository;

    public void registAccount(RegistUserInfo userInfo) {

        if (userInfoRepository.refer(userInfo.toUserInfo())) {
            System.out.println("登録済みメンバーのためNG");
            return;
        }
        if (!userInfo.getAge().isAdult()) {
            System.out.println("未成年のためNG");
            return;
        }

        // if 既に登録されているcreditカードか？
        if (creditCardRepository.refer(userInfo.toCreditCardInfo())) {
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
