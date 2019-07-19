/**
 * Copyright  2019-2029 联通集团财务有限公司版权所有。
 */
package com.coatardbul.sail.model.feign;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: suxiaolei
 * @date: 2019/6/24
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDto<T> {
    /**
     * 响应头
     */
    private ResponseHeadDro head;
    /**
     * 响应体
     */
    private T body;
}
