package com.bhaiti.kela.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.bhaiti.kela.beans.*;
import com.fasterxml.jackson.annotation.JsonFormat;
@Controller
public class WorkRegistrationController {
	@JsonFormat(shape=JsonFormat.Shape.ARRAY)
  @RequestMapping(method = RequestMethod.POST, value="/register/work")
  @ResponseBody
  public registrationreply registerwork(@RequestBody work w) {
  System.out.println("In register work");
        registrationreply workregreply = new registrationreply();           
        registration.getInstance().add(w);
        //We are setting the below value just to reply a message back to the caller
        workregreply.setWorkid(w.getWorkid());
        workregreply.setTopic(w.getTopic());
        workregreply.setVenue(w.getVenue());
        workregreply.setDate(w.getDate());
        workregreply.setOrganiser(w.getOrganiser());
        workregreply.setReg_fee(w.getReg_fee());
        workregreply.setLocation(w.getLocation());
        workregreply.setStatus("Successful");
        return workregreply;
}
}