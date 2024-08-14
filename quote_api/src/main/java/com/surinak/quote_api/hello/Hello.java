package com.surinak.quote_api.hello;

// importing the different frameworks
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Hello {

    @RequestMapping("/hello")
    public String hello(
        @RequestParam(value="user", required=false, defaultValue="Champ")
        String user, 
        Model model) {
        model.addAttribute("user", user);
        return "hello";
    }
    
}
