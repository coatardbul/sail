package com.coatardbul.sail.controller;

import com.coatardbul.sail.common.api.CommonResult;
import com.coatardbul.sail.model.dto.UserDto;
import com.coatardbul.sail.model.entity.UserInfo;
import com.coatardbul.sail.service.UserInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Api(value = "银行账户信息")
@Slf4j
@RestController
@RequestMapping(value = "/test")
public class UserController {
    @Autowired
    UserInfoService userInfoService;

    @ApiOperation(value = "新增银行账户信息", notes = "新增银行账户信息")
    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public CommonResult insertBankAcc(@RequestBody @Valid UserDto userDto, BindingResult bindingResult) {
        //dto对象的非空，长度检查
        if (bindingResult.hasErrors()) {
            log.error("" + bindingResult.getFieldError().getDefaultMessage());
            return CommonResult.failed(bindingResult.getFieldError().getDefaultMessage());
        }
//        UserInfo userInfo=new UserInfo();
//        userInfo.setAccount("dsf");
//        userInfo.setUserId("123123");
//        userInfoService.insert(userInfo);
//        return userInfo;

        UserInfo userInfo = userInfoService.selectByPrimaryKey("123123");
        return CommonResult.success(userInfo);

    }
}
