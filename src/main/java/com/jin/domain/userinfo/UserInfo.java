package com.jin.domain.userinfo;

import com.jin.domain.sequential.UserId;
import com.jin.domain.userinfo.vo.Address;
import com.jin.domain.userinfo.vo.AddressNumber;
import com.jin.domain.userinfo.vo.BirthDay;
import com.jin.domain.userinfo.vo.DayTellNumber;
import com.jin.domain.userinfo.vo.Gender;
import com.jin.domain.userinfo.vo.TellNumber;
import com.jin.domain.userinfo.vo.UserName;
import com.jin.domain.userinfo.vo.UserNameKana;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class UserInfo {

    private final UserId userId;

    private final UserName userName;

    private final UserNameKana userNameKana;

    private final Gender gender;

    private final BirthDay birthDay;

    private final AddressNumber addressNumber;

    private final Address address;

    private final TellNumber tellNumber;

    private final DayTellNumber dayTellNumber;

}
