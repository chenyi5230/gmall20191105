package com.bubble.gmall.bean;

import java.math.BigDecimal;

public class UmsMemberLevel {
    private Long id;

    private String name;

    private Integer growthPoint;

    private Integer defaultStatus;

    private BigDecimal freeFreightPoint;

    private Integer commentGrowthPoint;

    private Integer privilegeFreeFreight;

    private Integer privilegeSignIn;

    private Integer privilegeComment;

    private Integer privilegePromotion;

    private Integer privilegeMemberPrice;

    private Integer priviledeBirthday;

    private String note;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getGrowthPoint() {
        return growthPoint;
    }

    public void setGrowthPoint(Integer growthPoint) {
        this.growthPoint = growthPoint;
    }

    public Integer getDefaultStatus() {
        return defaultStatus;
    }

    public void setDefaultStatus(Integer defaultStatus) {
        this.defaultStatus = defaultStatus;
    }

    public BigDecimal getFreeFreightPoint() {
        return freeFreightPoint;
    }

    public void setFreeFreightPoint(BigDecimal freeFreightPoint) {
        this.freeFreightPoint = freeFreightPoint;
    }

    public Integer getCommentGrowthPoint() {
        return commentGrowthPoint;
    }

    public void setCommentGrowthPoint(Integer commentGrowthPoint) {
        this.commentGrowthPoint = commentGrowthPoint;
    }

    public Integer getPrivilegeFreeFreight() {
        return privilegeFreeFreight;
    }

    public void setPrivilegeFreeFreight(Integer privilegeFreeFreight) {
        this.privilegeFreeFreight = privilegeFreeFreight;
    }

    public Integer getPrivilegeSignIn() {
        return privilegeSignIn;
    }

    public void setPrivilegeSignIn(Integer privilegeSignIn) {
        this.privilegeSignIn = privilegeSignIn;
    }

    public Integer getPrivilegeComment() {
        return privilegeComment;
    }

    public void setPrivilegeComment(Integer privilegeComment) {
        this.privilegeComment = privilegeComment;
    }

    public Integer getPrivilegePromotion() {
        return privilegePromotion;
    }

    public void setPrivilegePromotion(Integer privilegePromotion) {
        this.privilegePromotion = privilegePromotion;
    }

    public Integer getPrivilegeMemberPrice() {
        return privilegeMemberPrice;
    }

    public void setPrivilegeMemberPrice(Integer privilegeMemberPrice) {
        this.privilegeMemberPrice = privilegeMemberPrice;
    }

    public Integer getPriviledeBirthday() {
        return priviledeBirthday;
    }

    public void setPriviledeBirthday(Integer priviledeBirthday) {
        this.priviledeBirthday = priviledeBirthday;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}