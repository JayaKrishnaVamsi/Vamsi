package com.bhaiti.kela.controllers;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.bhaiti.kela.beans.work;
import com.bhaiti.kela.beans.registration;
@Controller
public class workretrievecontroller {
  @RequestMapping(method = RequestMethod.GET, value="/work/allwork")
  @ResponseBody
  public List<work> getAllWorks() {
  return registration.getInstance().getworkRecords();
  }
}
