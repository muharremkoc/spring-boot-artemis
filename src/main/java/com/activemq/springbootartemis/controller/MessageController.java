package com.activemq.springbootartemis.controller;

import com.activemq.springbootartemis.service.DispatcherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

   @Autowired
    DispatcherService dispatcherService;

   @PostMapping("/message")
   public ResponseEntity<String> send(@RequestBody String message){
       dispatcherService.sendMessage(message);
       return new ResponseEntity<>("Mesaage Send"+message, HttpStatus.OK);
   }


}
