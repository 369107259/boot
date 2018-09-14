package com.spring.boot.entity;

import java.util.Date;

public class CarTeam {
    private Long id;

    private Byte status;

    private Date createTime;

    private Date updateTime;

    private String carTeamName;

    private Long contactWay;

    private String personLiable;

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

    public String getCarTeamName() {
        return carTeamName;
    }

    public void setCarTeamName(String carTeamName) {
        this.carTeamName = carTeamName == null ? null : carTeamName.trim();
    }

    public Long getContactWay() {
        return contactWay;
    }

    public void setContactWay(Long contactWay) {
        this.contactWay = contactWay;
    }

    public String getPersonLiable() {
        return personLiable;
    }

    public void setPersonLiable(String personLiable) {
        this.personLiable = personLiable == null ? null : personLiable.trim();
    }
}