package com.fammer.backend.api.user.controller;

import java.util.ArrayList;
import java.util.List;

import com.fammer.backend.api.user.dao.UserVO;
import com.fammer.backend.comm.response.dto.ResponseVO;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/user")
@CrossOrigin(origins = {"http://172.30.1.15:8080","http://localhost:8080"})
@Slf4j
public class UserController{

    @GetMapping(path = "/list")
    public ResponseVO<?> getUserList(){
        log.info("api call : "+Thread.currentThread().getStackTrace()[1].getClassName()+"."+Thread.currentThread().getStackTrace()[1].getMethodName());
        ResponseVO<List<UserVO>> resp = new ResponseVO<>();

        List<UserVO> list = new ArrayList<>();
        list.add(new UserVO("admin", " 1234", "운영자","010-1111-1111"));
        list.add(new UserVO("user1", " 2345", "유저1","010-2222-2222"));
        list.add(new UserVO("user2", " 3456", "유저12","010-3333-3333"));
        list.add(new UserVO("user3", " 4567", "유저13","010-4444-4444"));

        resp.setResponse(list);
        return resp;
    }

    @GetMapping(path = "/{id}")
    public ResponseVO<?> getUserSearch(@PathVariable int id){
        log.info("api call : "+Thread.currentThread().getStackTrace()[1].getClassName()+"."+Thread.currentThread().getStackTrace()[1].getMethodName());
        ResponseVO<UserVO> resp = new ResponseVO<>();


        List<UserVO> list = new ArrayList<>();
        list.add(new UserVO("admin", "1234", "운영자","010-1111-1111"));
        list.add(new UserVO("user1", "2345", "유저1","010-2222-2222"));
        list.add(new UserVO("user2", "3456", "유저12","010-3333-3333"));
        list.add(new UserVO("user3", "4567", "유저13","010-4444-4444"));

        resp.setResponse(list.get(id));
        return resp;
    }


    @RequestMapping(path = "/hello")
    public @ResponseBody String sayHello() {
        log.info("GET called on /hello resource");
        return "HELLO_TEXT";
    }
}