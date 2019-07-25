/**
 * Copyright  2019-2029 联通集团财务有限公司版权所有。
 */
package com.coatardbul.sail.common.util;




import com.coatardbul.sail.model.feign.RequestDto;
import com.coatardbul.sail.model.feign.RequestHeadDto;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: suxiaolei
 * @date: 2019/6/26
 */
public class RequestUtil {

    public static String getSignByRequest(RequestDto requestDto) {
        return "123";
    }

    /**
     * 获取头的实例
     *
     * @return
     */
    public static RequestHeadDto getRequestHeadInstance() {
        RequestHeadDto requestHeadDto = new RequestHeadDto();
        String currentDate = new SimpleDateFormat("yyyyMMdd").format(new Date());
        String currentTime = new SimpleDateFormat("HHmmss").format(new Date());
        //必填  请求系统ID
        requestHeadDto.setReqSysCd("04");
        //必填  请求系统日期
        requestHeadDto.setReqSysDt(currentDate);
        //必填  请求系统时间
        requestHeadDto.setReqSysTm(currentTime);
        //必填  银行编码
        requestHeadDto.setReqInterBank("0000");
        //必填  请求方流水号 ????
        requestHeadDto.setReqSeqNum(String.valueOf(System.currentTimeMillis()));
        return requestHeadDto;
    }



}
