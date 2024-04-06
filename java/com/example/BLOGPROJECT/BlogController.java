package com.example.BLOGPROJECT;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller

@RequestMapping("api/html")
public class BlogController {



//    @GetMapping("Test")
//    public String MyOrder(Model m){
//          return "Test";
//    }
//
//    @GetMapping("Services")
//    public String Tests(Model m){
//        return "services";
//    }
//
//    @PostMapping("/Display")
//    String Names(Model model){
//        List<Datas> lst =  DemoService.GetNames();
//        model.addAttribute("mydata", lst);
//        return "redirect:/Home";
//    }
//    @GetMapping("/Home")
//    public String FinalDisplay(){
//        return "Home";
//    }



    @GetMapping("Services")
    public String Tests(Model model) {
        // Add any necessary attributes to the model
        return "services";
    }
//    "api/html/AddRow"
    @PostMapping("/AddRow")
    public String AddRow(@ModelAttribute("newDatas") Datas datas) {
        DemoService.addRow(datas);
        return "blog"; // Assuming you have a "/Home" endpoint
    }
    @GetMapping("/pricing")
    public String price(Model m){
        return "price";
    }
    @GetMapping("/samole")
    public String samole(Model m){
        return "samole";
    }
    @GetMapping( )
    public String login(Model m){
        return "login";
    }
//    @PostMapping("api/html/Display")
//    public String Names(Model model) {
//        // Retrieve data
//        List<Datas> lst = DemoService.GetNames();
//
//        // Add data to the model
//        model.addAttribute("mydata", lst);
//
//        // Redirect to another endpoint
//        return "Home"; // Assuming you have a "/Home" endpoint
//    }
//    @GetMapping("login")
//    public String homePage(Model model) {
//        // Add any necessary attributes to the model
//        return "login"; // Assuming you have a view named "home"
//    }

}
