package com.jin.infra.account;

import com.jin.domain.userinfo.ReferUserInfo;
import com.jin.domain.userinfo.UserInfoRepository;
import com.jin.service.UserInfoToJoin;

public class UserInfoRepositoryImpl implements UserInfoRepository {
    @Override
    public boolean refer(ReferUserInfo userInfo) {
        return false;
    }

    @Override
    public void regist(UserInfoToJoin userInfoToJoin) {
    }
}
