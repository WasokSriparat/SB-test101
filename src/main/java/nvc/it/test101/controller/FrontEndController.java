package nvc.it.test101.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FrontEndController {
    String viewPath = "frontend/";

    @GetMapping("/")
    public String index(){
        return viewPath+"index";
    }

    @GetMapping("/about")
    public String about(){
        return viewPath+"about";
    }

    @GetMapping("/product")
    public String product(){
        return viewPath+"product";
    }

    @GetMapping("/contact")
    public String contact(){
        return viewPath+"contact";
    }
}
