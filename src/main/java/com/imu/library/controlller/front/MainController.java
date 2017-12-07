package com.imu.library.controlller.front;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;


/**
 * Created by 文辉 on 2017/7/18.
 */
@Controller
public class MainController {


    @RequestMapping("/main")
    public String showAllGoods(Model model, HttpSession session) {


        return "main";
    }


}
