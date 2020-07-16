package org.person.dy.business.controller;

import org.person.dy.business.domain._do.ServiceData;
import org.person.dy.business.domain.dto.UserDto;
import org.person.dy.business.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 类说明
 *
 * @author caiwenlao
 * @date 2020/4/8 21:25
 */
@RestController
@RequestMapping("/demo")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/info/{id}")
    public ServiceData<UserDto> getUserInfo(@PathVariable String id){
        UserDto userDto = userService.getUserInfoById(id);
        return ServiceData.successReturn(userDto);
    }

    @GetMapping("/info/hello")
    public void hello(){
        System.out.println("处理器被调用");
    }
}
