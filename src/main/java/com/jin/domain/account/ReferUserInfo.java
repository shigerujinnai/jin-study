package com.jin.domain.account;

import com.jin.domain.account.vo.BirthDay;
import com.jin.domain.account.vo.UserName;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class ReferUserInfo {

    private final UserName userName;

    private final BirthDay birthday;
}
