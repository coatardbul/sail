
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
public class RequestDto<T> {

    /**
     * 请求头
     */
    private RequestHeadDto head;

    /**
     * 请求体
     */
    private T body;
    /**
     * 数字签名
     */
    private String sign;
}
