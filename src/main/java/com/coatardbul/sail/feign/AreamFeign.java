
package com.coatardbul.sail.feign;

import com.coatardbul.sail.common.config.FeignLogConfig;
import com.coatardbul.sail.model.feign.RequestDto;
import feign.Headers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "river", url = "http://127.0.0.1:9001", configuration = FeignLogConfig.class, fallbackFactory = String.class)
public interface AreamFeign {

    /**
     * @return
     */
    @RequestMapping(value = "river/query/getAreamList", method = RequestMethod.POST)
    @Headers("Content-Type: application/json")
    public String getAream(RequestDto requestDto);

    @RequestMapping(value = "river/download/downloadFile", method = RequestMethod.POST)
    @Headers("Content-Type: application/json")
    public ResponseEntity<byte[]> downloadFile(String filename);

}
