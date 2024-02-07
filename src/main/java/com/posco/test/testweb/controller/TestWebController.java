package com.posco.test.testweb.controller;


import com.posco.test.testweb.entity.Job;
import com.posco.test.testweb.model.ReqVo;
import com.posco.test.testweb.service.TestWebService;
import io.micrometer.common.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class TestWebController {

    @Autowired
    private TestWebService testWebService;

    @RequestMapping(path = "/list")
    public String list(){
        return "/list";
    }
    
    @RequestMapping(path = "/register")
    public String register(
        @RequestParam(value = "id", required = false) String id,
        Model model
    ){
        if(StringUtils.isNotEmpty(id))
            model.addAttribute("id", id);
        else
            model.addAttribute("id", "");
        return "register";
    }

    @ResponseBody
    @PostMapping(path = "/save")
    public String save(@RequestBody ReqVo reqVo){
        testWebService.save(reqVo);
        return "true";
    }

    @ResponseBody
    @GetMapping(path = "/search")
    public List<Job> search() {
        return testWebService.search();
    }

    @ResponseBody
    @GetMapping(path = "/detail")
    public Job detail(@RequestParam String id) {
        return testWebService.search(id);
    }
}
