package com.bhaiti.kela.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PathVariable;
import com.bhaiti.kela.beans.registration;
@Controller
public class WorkDeleteController {
@RequestMapping(method = RequestMethod.DELETE, value="/delete/work/{regdNum}")
@ResponseBody
public String deleteWorkRecord(@PathVariable("regdNum") String regdNum) {
System.out.println("In deleteWorkRecord");   
    return registration.getInstance().deleteWork(regdNum);
}
}