
package com.coatardbul.sail.controller;

import com.coatardbul.sail.common.api.CommonResult;
import com.coatardbul.sail.model.dto.UserDto;
import com.coatardbul.sail.model.feign.AreamFeignInputDto;
import com.coatardbul.sail.service.feign.AreamFeignService;
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

/**
 * @author: suxiaolei
 * @date: 2019/7/24
 */
@Api(value = "区域信息")
@Slf4j
@RestController
@RequestMapping(value = "/query")
public class AreamController {
    @Autowired
    AreamFeignService areamFeignService;

    @ApiOperation(value = "获取区域信息", notes = "")
    @RequestMapping(value = "/getAream", method = RequestMethod.POST)
    public CommonResult getAream(@RequestBody @Valid AreamFeignInputDto areamFeignInputDto, BindingResult bindingResult) {
        //dto对象的非空，长度检查
        if (bindingResult.hasErrors()) {
            log.error("" + bindingResult.getFieldError().getDefaultMessage());
            return CommonResult.failed(bindingResult.getFieldError().getDefaultMessage());
        }
       return areamFeignService.aream(areamFeignInputDto);

    }
}
