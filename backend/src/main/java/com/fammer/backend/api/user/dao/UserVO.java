package com.fammer.backend.api.user.dao;

import lombok.Data;

@Data
public class UserVO{


	private String id;
    private String userId;
    private String name;
    private String password;
    private String phone;

    public UserVO(String userId, String name, String password, String phone) {
            this.userId = userId;
            this.name = name;
            this.password = password;
            this.phone = phone;        
	}
    
}