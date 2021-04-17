package com.singhal.login1.Controllers;


import com.singhal.login1.Services.UserService;
import com.singhal.login1.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    private UserService userService;

    @GetMapping("/test")
    public String test()
    {
        System.out.println("shubham kumar singhal");
        return "hi Shubham singhal";
    }

    @GetMapping("/saveUserDetails")
    public ResponseEntity<String> saveUserDetails(@RequestBody User user)
    {
        try {
            userService.saveUserEntry(user);
            return new ResponseEntity<>("success", HttpStatus.OK);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return new ResponseEntity<>("fail",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }



}
