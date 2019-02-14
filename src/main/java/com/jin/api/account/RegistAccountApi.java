package com.jin.api.account;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class RegistAccountApi {

    @RequestMapping(value = "/account/regist", method = RequestMethod.POST)
    public void registAccount() {
        // サービスを呼び出す
        // 引数で渡された申込ユーザ情報をサービスへ渡す
    }


}
