package com.jin.api.account;


import com.jin.infra.account.UserInfoRepositoryImpl;
import com.jin.infra.credit.CreditCardRepositoryImpl;
import com.jin.service.RegistAccountProcess;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class RegistAccountApi {

    @RequestMapping(value = "/account/regist", method = RequestMethod.POST)
    public void registAccount(RegistUserInfoForm userInfo) {

        if (userInfo.validation()) {
            System.out.println("不正パラメータです");
        }
        RegistAccountProcess process = new RegistAccountProcess(
                new UserInfoRepositoryImpl(), new CreditCardRepositoryImpl());
        process.registAccount(userInfo.toDomain());
    }
}
