/*
 * Copyright (c) 2018-2999 广州市蓝海创新科技有限公司 All rights reserved.
 *
 * https://www.mall4j.com/
 *
 * 未经允许，不可做商业用途！
 *
 * 版权所有，侵权必究！
 */

package com.yami.shop.bean.app.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.yami.shop.bean.model.Transport;
import com.yami.shop.common.serializer.json.ImgJsonSerializer;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

/**
 * @author lanhai
 */
@Data
public class ProdPropDto {
    /**
     * 店铺ID
     */
    @Schema(description = "店铺ID" , required = true)
    private Long valueId;

    /**
     * 店铺名称
     */
    @Schema(description = "店铺名称" , required = true)
    private String propValue;

    /**
     * 商品ID
     */
    @Schema(description = "商品ID" , required = true)
    private Long prodId;

    /**
     * 商品名称
     */
    @Schema(description = "商品名称" )
    private String prodName;

    /**
     * 商品价格
     */
    @Schema(description = "商品价格" , required = true)
    private Double price;

    /**
     * 商品详情
     */
    @Schema(description = "详细描述" )
    private String content;

    /**
     * 商品原价
     */
    @Schema(description = "商品原价" , required = true)
    private Double oriPrice;

    /**
     * 库存量
     */
    @Schema(description = "库存量" , required = true)
    private Integer totalStocks;

    /**
     * 简要描述,卖点等
     */
    @Schema(description = "简要描述,卖点等" , required = true)
    private String brief;





}
