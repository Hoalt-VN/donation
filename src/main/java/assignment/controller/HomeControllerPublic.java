package assignment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/publication")
public class HomeControllerPublic {

    @RequestMapping("/home")
    public String showMyPage(){
        return "admin/home";
    }
    @RequestMapping("/showdetaildonation")
    public String showDetailDonation(){
        return "public/detail";
    }

    @RequestMapping("/showlogin")
    public String showLogin(){
        return "admin/login";
    }

}
