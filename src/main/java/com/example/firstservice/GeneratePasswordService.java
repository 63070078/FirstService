package com.example.firstservice;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.Random;

@RestController
public class GeneratePasswordService {
    @RequestMapping(path = "{name}.generate", method = RequestMethod.GET)
    public String generate(@PathVariable("name") String name) {
        Random rn = new Random();
        int randomNum = rn.nextInt();
        return "Hi" +","+ name + '\n' + "Your new password is"+" "+randomNum+".";
    }
}
