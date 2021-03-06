
package com.coatardbul.sail.feign.fallback;

import com.coatardbul.sail.feign.AreamFeign;
import com.coatardbul.sail.model.feign.RequestDto;

import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

/**
 * @author: suxiaolei
 * @date: 2019/7/23
 */
@Slf4j
@Component
public class AreamFeignFallback implements FallbackFactory<AreamFeign> {
    /**
     * Returns an instance of the fallback appropriate for the given cause
     *
     *
     */
    @Override
    public AreamFeign create(Throwable cause) {
       return new AreamFeign() {
           @Override
           public String getAream(RequestDto requestDto) {
               log.error("调用失败", cause);
               return null;
           }

           @Override
           public ResponseEntity<byte[]> downloadFile(String filename) {
               log.error("调用失败", cause);
               return null;
           }
       };
    }
}
