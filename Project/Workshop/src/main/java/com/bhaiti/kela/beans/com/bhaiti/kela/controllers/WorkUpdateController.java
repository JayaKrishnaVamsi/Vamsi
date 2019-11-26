package com.bhaiti.kela.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.bhaiti.kela.beans.work;
import com.bhaiti.kela.beans.registration;
@Controller
public class WorkUpdateController {
@RequestMapping(method = RequestMethod.PUT, value="/update/work")
@ResponseBody
public String updateWorkRecord(@RequestBody work w) {
System.out.println("In updateWorkRecord");   
    return registration.getInstance().upDateWork(w);
}
}