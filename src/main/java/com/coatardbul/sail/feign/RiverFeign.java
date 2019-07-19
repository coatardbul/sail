
package com.coatardbul.sail.feign;

import com.coatardbul.sail.model.feign.RequestDto;
import feign.Headers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


//@FeignClient(name = "uap", url = "http://127.0.0.1:8888"configuration = {FeignLogConfig.class})
@FeignClient(name = "uap", url = "http://192.168.1.187:6001")
public interface RiverFeign {

    /**
     * 资金支付交易推送
     *
     * @return
     */
    // @RequestMapping(value = "uap/Payment/SinglePayQueryResult", method = RequestMethod.POST)
    @RequestMapping(value = "uap/AccountQuery/AccountQueryNowBalance", method = RequestMethod.POST)
    @Headers("Content-Type: application/json")
    public String fundPayPush(RequestDto requestDto);

    /**
     * 资金划拨交易推送
     *
     * @return
     */
    @RequestMapping(value = "uap/Payment/SingleUpDown", method = RequestMethod.POST)
    public String fundAllocationPush(RequestDto requestDto);
}
