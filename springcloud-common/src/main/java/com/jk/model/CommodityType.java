package com.jk.model;

public class CommodityType {
    private Integer commodityTypeId;
    private Integer commodityTypes;//商品类型
    private Integer commodityid;//商品Id

    public Integer getCommodityTypeId() {
        return commodityTypeId;
    }

    public void setCommodityTypeId(Integer commodityTypeId) {
        this.commodityTypeId = commodityTypeId;
    }

    public Integer getCommodityTypes() {
        return commodityTypes;
    }

    public void setCommodityTypes(Integer commodityTypes) {
        this.commodityTypes = commodityTypes;
    }

    public Integer getCommodityid() {
        return commodityid;
    }

    public void setCommodityid(Integer commodityid) {
        this.commodityid = commodityid;
    }
}
