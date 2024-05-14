package com.yami.shop.bean.param;


import com.yami.shop.bean.model.ProdProp;
import lombok.Data;

import java.util.List;

@Data
public class StocksParam {
    /**
     * 店铺id
     */
    private Long[] ProdId;

    /*
    库存
     */
    private Integer stocks;
    /**
     * 价格
     */
    private Double oriPrice;


}
