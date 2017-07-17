package venu.test;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController  
public class MyRestController {  
   
 @RequestMapping(value = "/hello", method = RequestMethod.GET)  
 public String sayHello()  
 {  
  return "Hello! This is a simple Rest Service Example.......";  
 }  
  

  
 @RequestMapping(value = "/SMSResponse", method = RequestMethod.POST,headers="Accept=application/json")  
 public String logMessage(@RequestBody Object orderResponse)  
 {  
	 String status = "Success";
	   if (orderResponse!=null){
		   System.out.println("Customer responded with order confirmation!");
		   System.out.println("The JSON Object " + orderResponse);
	   } else {
		   System.out.println("Unable to deliver the Message!");
		   status = "fail";
	   }
    return status;  
  }
 
 

 

}  
