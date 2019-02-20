package com.jin.service;

import com.jin.domain.credit.CreditCardInfo;
import com.jin.domain.credit.ReferCreditCard;
import com.jin.domain.credit.vo.CreditCardExpirationPeriod;
import com.jin.domain.credit.vo.CreditCardNumber;
import com.jin.domain.credit.vo.CreditCardSecurityCode;
import com.jin.domain.sequential.UserId;
import com.jin.domain.userinfo.ReferUserInfo;
import com.jin.domain.userinfo.UserInfo;
import com.jin.domain.userinfo.vo.Address;
import com.jin.domain.userinfo.vo.AddressNumber;
import com.jin.domain.userinfo.vo.Age;
import com.jin.domain.userinfo.vo.BirthDay;
import com.jin.domain.userinfo.vo.CourseInfo;
import com.jin.domain.userinfo.vo.DateNow;
import com.jin.domain.userinfo.vo.DayTellNumber;
import com.jin.domain.userinfo.vo.Gender;
import com.jin.domain.userinfo.vo.MailAddress;
import com.jin.domain.userinfo.vo.TellNumber;
import com.jin.domain.userinfo.vo.UserName;
import com.jin.domain.userinfo.vo.UserNameKana;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class UserInfoToJoin {

    private final UserName userName;

    private final UserNameKana userNameKana;

    private final Gender gender;

    private final BirthDay birthDay;

    private final Age age;

    private final AddressNumber addressNumber;

    private final Address address;

    private final TellNumber tellNumber;

    private final DayTellNumber dayTellNumber;

    private final MailAddress mailAddress;

    private final CourseInfo courseInfo;

    private final CreditCardNumber creditCardNumber;

    private final CreditCardExpirationPeriod creditCardExpirationPeriod;

    private final CreditCardSecurityCode creditCardSecurityCode;


    public UserInfoToJoin(
            UserName userName,
            UserNameKana userNameKana,
            Gender gender,
            BirthDay birthDay,
            DateNow now,
            AddressNumber addressNumber,
            Address address,
            TellNumber tellNumber,
            DayTellNumber dayTellNumber,
            MailAddress mailAddress,
            CourseInfo courseInfo,
            CreditCardNumber creditCardNumber,
            CreditCardExpirationPeriod creditCardExpirationPeriod,
            CreditCardSecurityCode creditCardSecurityCode
    ) {
        this.userName = userName;
        this.userNameKana = userNameKana;
        this.gender = gender;
        this.birthDay = birthDay;
        this.age = new Age(birthDay, now);
        this.addressNumber = addressNumber;
        this.address = address;
        this.tellNumber = tellNumber;
        this.dayTellNumber = dayTellNumber;
        this.mailAddress = mailAddress;
        this.courseInfo = courseInfo;
        this.creditCardNumber = creditCardNumber;
        this.creditCardExpirationPeriod = creditCardExpirationPeriod;
        this.creditCardSecurityCode = creditCardSecurityCode;
    }

    public ReferUserInfo toReferUserInfo() {
        return new ReferUserInfo(userName, birthDay);
    }

    public ReferCreditCard toReferCreditCard() {
        return new ReferCreditCard(creditCardNumber, creditCardExpirationPeriod, creditCardSecurityCode);
    }

    public UserInfo toUserInfo(UserId userId) {
        return new UserInfo(
                userId,
                this.userName,
                this.userNameKana,
                this.gender,
                this.birthDay,
                this.addressNumber,
                this.address,
                this.tellNumber,
                this.dayTellNumber
        );
    }

    public CreditCardInfo toCreditCardInfo(UserId userId) {
        return new CreditCardInfo(
                userId,
                this.creditCardNumber,
                this.creditCardExpirationPeriod,
                this.creditCardSecurityCode
        );
    }
}
