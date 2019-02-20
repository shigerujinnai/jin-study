package com.jin.domain.userinfo;

import com.jin.domain.userinfo.vo.BirthDay;
import com.jin.domain.userinfo.vo.UserName;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class ReferUserInfo {

    private final UserName userName;

    private final BirthDay birthday;
}
