package com.spring.boot.entity;

import java.math.BigDecimal;
import java.util.Date;

public class OutboundOrder {
    private Long id;

    private Byte status;

    private Date createTime;

    private Date updateTime;

    private Long siteId;

    private BigDecimal price;

    private String plateNumber;

    private Long carTeamId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getSiteId() {
        return siteId;
    }

    public void setSiteId(Long siteId) {
        this.siteId = siteId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber == null ? null : plateNumber.trim();
    }

    public Long getCarTeamId() {
        return carTeamId;
    }

    public void setCarTeamId(Long carTeamId) {
        this.carTeamId = carTeamId;
    }
}