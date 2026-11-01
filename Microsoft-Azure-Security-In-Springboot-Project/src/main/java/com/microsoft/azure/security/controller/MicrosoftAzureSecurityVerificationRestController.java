package com.microsoft.azure.security.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("microsoft/azure/security")
public class MicrosoftAzureSecurityVerificationRestController {


    @GetMapping("/test")
    public ResponseEntity<Object> microsoftAzureSecurityVerification(){
        try {
            return  new ResponseEntity<>("Microsoft azure security verification successfully done..!", HttpStatus.OK);
        }
        catch (RuntimeException e){
            return  new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
