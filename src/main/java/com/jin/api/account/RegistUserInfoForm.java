package com.jin.api.account;

import com.jin.service.RegistUserInfo;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class RegistUserInfoForm {

    private final String name;

    private final String nameKana;

    private final String gender;

    private final String addressNumber;

    private final String address;

    private final String tellNumber;

    private final String dayTimeTellNumber;

    private final String mailAddress;

    private final String coursePlan;

    private final String creditCardNumber;

    private final String creditCardExpirationDate;

    private final String creditCardSecurityCode;

    public boolean validation() {
        return true;
    }

    public RegistUserInfo toDomain() {
        // ドメイン情報を生成する
        return null;
    }

}
