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
 /* int i=0;
  List<work> getworks=registration.getInstance().getworkRecords();
 try { Class.forName("com.mysql.jdbc.Driver");
  Connection con = DriverManager.getConnection("jdbc:mysql//localhost:3306/workshop","root","vamsi4mysql");
  Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
  ResultSet rs=stmt.executeQuery("Select * from workshop");
  while(rs.next())
  {
	  getworks.get(i).setWorkid(rs.getString(1));
	  getworks.get(i).setTopic(rs.getString(2));
	  getworks.get(i).setVenue(rs.getString(3));
	  i++;
  }
  }
 catch(Exception e) {}
  return getworks;
  }
*/
}}
