package com.jin.domain.userinfo;

public interface UserInfoRepository {

    boolean refer(ReferUserInfo userInfo);

    void regist(UserInfo userInfoToJoin);
}
