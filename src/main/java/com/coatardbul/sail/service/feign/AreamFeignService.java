package com.coatardbul.sail.service.feign;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.coatardbul.sail.common.api.CommonResult;
import com.coatardbul.sail.common.util.RequestUtil;
import com.coatardbul.sail.feign.AreamFeign;
import com.coatardbul.sail.model.feign.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AreamFeignService {
    @Autowired
    AreamFeign areamFeign;


    public CommonResult<Object> aream(AreamFeignInputDto areamFeignInputDto) {
        RequestHeadDto requestHeadDto = RequestUtil.getRequestHeadInstance();
        RequestDto requestDto=new RequestDto();
        requestDto.setHead(requestHeadDto);
        requestDto.setBody(areamFeignInputDto);
        requestDto.setSign("1111111111");
        String strJson=areamFeign.getAream(requestDto);
        if(strJson==null){
            return CommonResult.failed("调用失败");
        }
        ResponseDto<AreamFeignOutputDto> responseDto =
                JSON.parseObject(strJson, new TypeReference<ResponseDto<AreamFeignOutputDto>>() {});
        return CommonResult.success(responseDto.getBody());
    }
}
