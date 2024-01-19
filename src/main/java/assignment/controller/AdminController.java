package assignment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/administrate")
public class AdminController {
    @RequestMapping("/showaccount")
    public String showAccount(){
        return "admin/account";
    }
    @RequestMapping("/showdonation")
    public String showDonation(){
        return "admin/donation";
    }

}
