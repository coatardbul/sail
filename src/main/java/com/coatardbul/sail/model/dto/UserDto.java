package com.coatardbul.sail.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    /**
     * 主键id
     */
    @NotEmpty(message = "主键id不能为空")
    @Length(max = 22)
    private String userId;
    /**
     * 账号
     */
    private String account;
}
