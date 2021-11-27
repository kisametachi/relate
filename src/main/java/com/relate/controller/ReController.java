package com.relate.controller;

import com.relate.constants.ApiPath;
import com.relate.service.ReService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = ApiPath.API)
public class ReController {

    @GetMapping( ApiPath.HELLO)
    public String HelloMethod() {
        return "helloWorld! we are Related... somehow :)";
    }

}
