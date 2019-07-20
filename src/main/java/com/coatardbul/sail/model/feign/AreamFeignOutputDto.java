package com.coatardbul.sail.model.feign;

import com.coatardbul.sail.model.entity.AreaItem;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AreamFeignOutputDto {

    private List<AreaItem> list;
}
