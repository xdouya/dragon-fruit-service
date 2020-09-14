package org.dy.system.controller;

import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.dy.system.domain.dto.AuthUserDto;
import org.dy.system.domain.po.UserPo;
import org.dy.system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author caiwl
 * @date 2020/9/14 21:15
 */
@Slf4j
@RestController
@RequestMapping("/auth")
public class AuthorizationController {

    @Autowired
    UserService userService;

    @PostMapping("/login")
    public ResponseEntity<Object> login(@RequestBody AuthUserDto authUser){
        UserPo userDto = userService.findByName(authUser.getUsername());
        return ResponseEntity.ok(userDto);
    }
}
