package se.kicks.pos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by samanjahanbakhsh on 16/02/16.
 */
@Controller
public class TestController {
    @RequestMapping("/test")
    @ResponseBody
    String home() {
        return "Hello World test!";
    }
}
