package co.tellmehow.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class MyController {
    
	@RequestMapping("/myController")
    @ResponseBody
    public String handleRequest () {
        System.out.println("-- handling request in controller --");
        return "Tell Me How: MyController running now";
    }
	
	
	
	
}