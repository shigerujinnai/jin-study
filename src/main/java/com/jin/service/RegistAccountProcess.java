package com.jin.service;

import com.jin.domain.credit.CreditCardRepository;
import com.jin.domain.sequential.UserId;
import com.jin.domain.userinfo.UserInfoRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class RegistAccountProcess {

    private final UserInfoRepository userInfoRepository;

    private final CreditCardRepository creditCardRepository;

    public void registAccount(UserInfoToJoin userInfoToJoin) {

        if (userInfoRepository.refer(userInfoToJoin.toReferUserInfo())) {
            System.out.println("登録済みメンバーのためNG");
            return;
        }
        if (!userInfoToJoin.getAge().isAdult()) {
            System.out.println("未成年のためNG");
            return;
        }

        // if 既に登録されているcreditカードか？
        if (creditCardRepository.refer(userInfoToJoin.toReferCreditCard())) {
            //  // creditカード審査NGのため
            System.out.println("登録されているcreditカードのためNG");
        }


        // creditカードの有効期限はすぎていないか？
        if (userInfoToJoin.getCreditCardExpirationPeriod().past()) {
            System.out.println("有効期限の過ぎたcreditカードのためNG");
        }

        UserId userId = new UserId("test");

        userInfoRepository.regist(userInfoToJoin.toUserInfo(userId));
        // アカウント情報の登録
        creditCardRepository.regist(userInfoToJoin.toCreditCardInfo(userId));
    }

}
