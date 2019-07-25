/**
 * Copyright  2019-2029 联通集团财务有限公司版权所有。
 */
package com.coatardbul.sail.controller;

import com.coatardbul.sail.common.api.CommonResult;
import com.coatardbul.sail.model.feign.AreamFeignInputDto;
import com.coatardbul.sail.service.feign.DownloadFileService;
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
 * @date: 2019/7/25
 */
@Api(value = "下载文件信息")
@Slf4j
@RestController
@RequestMapping(value = "/download")
public class DownloadFileController {
    @Autowired
    DownloadFileService downloadFileService;

    @ApiOperation(value = "下载文件信息", notes = "")
    @RequestMapping(value = "/downloadFile", method = RequestMethod.POST)
    public CommonResult getAream( ) {

        return downloadFileService.downloadFile();

    }
}
