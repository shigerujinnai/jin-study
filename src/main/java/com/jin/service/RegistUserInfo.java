package com.jin.service;

import com.jin.domain.account.ReferUserInfo;
import com.jin.domain.account.vo.Address;
import com.jin.domain.account.vo.AddressNumber;
import com.jin.domain.account.vo.Age;
import com.jin.domain.account.vo.BirthDay;
import com.jin.domain.account.vo.CourseInfo;
import com.jin.domain.account.vo.DateNow;
import com.jin.domain.account.vo.DayTellNumber;
import com.jin.domain.account.vo.Gender;
import com.jin.domain.account.vo.MailAddress;
import com.jin.domain.account.vo.TellNumber;
import com.jin.domain.account.vo.UserName;
import com.jin.domain.account.vo.UserNameKana;
import com.jin.domain.credit.ReferCreditCard;
import com.jin.domain.credit.vo.CreditCardExpirationPeriod;
import com.jin.domain.credit.vo.CreditCardNumber;
import com.jin.domain.credit.vo.CreditCardSecurityCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class RegistUserInfo {

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


    public RegistUserInfo(
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

    public ReferUserInfo toUserInfo() {
        return new ReferUserInfo(userName, birthDay);
    }

    public ReferCreditCard toCreditCardInfo() {
        return new ReferCreditCard(creditCardNumber, creditCardExpirationPeriod, creditCardSecurityCode);
    }
}
