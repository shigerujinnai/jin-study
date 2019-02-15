package com.jin.domain.account;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AccountManager {

    private UserInfoRepository userInfoRepository;

    public boolean referUserInfo(ReferUserInfo referUserInfo) {
        return false;
    }
}


