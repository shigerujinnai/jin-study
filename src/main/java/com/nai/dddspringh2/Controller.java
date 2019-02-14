package com.nai.dddspringh2;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@AllArgsConstructor
public class Controller {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public Map hello() {
        Map<String, Object> res = new HashMap<>();
        res.put("response", "hello");
        return res;
    }
}
