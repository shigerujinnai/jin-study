package com.jin.domain.account;

import com.jin.service.RegistUserInfo;

public interface UserInfoRepository {

    boolean refer(ReferUserInfo userInfo);

    void regist(RegistUserInfo registUserInfo);
}
