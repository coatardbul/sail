/**
 * Copyright  2019-2029 联通集团财务有限公司版权所有。
 */
package com.coatardbul.sail.feign.fallback;

import com.coatardbul.sail.feign.AreamFeign;
import com.coatardbul.sail.model.feign.RequestDto;

import feign.hystrix.FallbackFactory;

/**
 * @author: suxiaolei
 * @date: 2019/7/23
 */
public class AreamFeignFallback implements FallbackFactory<AreamFeign> {
    /**
     * Returns an instance of the fallback appropriate for the given cause
     *
     * @param cause corresponds to {@link AbstractCommand#getExecutionException()}
     *              often, but not always an instance of {@link FeignException}.
     */
    @Override
    public AreamFeign create(Throwable cause) {
        return new AreamFeign() {
            @Override
            public String fundPayPush(RequestDto requestDto) {
                return null;
            }

            @Override
            public String fundAllocationPush(RequestDto requestDto) {
                return null;
            }
        };
    }
}
