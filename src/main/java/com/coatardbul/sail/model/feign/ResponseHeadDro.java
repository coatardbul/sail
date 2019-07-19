/**
 * Copyright  2019-2029 联通集团财务有限公司版权所有。
 */
package com.coatardbul.sail.model.feign;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;

/**
 * @author: suxiaolei
 * @date: 2019/6/24
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseHeadDro {
    /**
     * 平台应答码
     */
    @NotEmpty(message = "平台应答码不能为空")
    private String resCd;
    /**
     * 平台应答信息
     */
    @NotEmpty(message = "平台应答信息不能为空")
    private String resMsg;
    /**
     * 平台应答日期
     */
    @NotEmpty(message = "平台应答日期不能为空")
    private String resDt;
    /**
     * 平台应答时间
     */
    @NotEmpty(message = "平台应答时间不能为空")
    private String resTm;
    /**
     * 平台应答流水
     */
    @NotEmpty(message = "平台应答流水不能为空")
    private String resSeqNum;
    /**
     * 请求方流水号
     */
    @NotEmpty(message = "请求方流水号不能为空")
    private String reqSeqNum;

}
