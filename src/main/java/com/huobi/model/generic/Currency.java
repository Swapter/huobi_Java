package com.huobi.model.generic;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.*;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Currency {
    @JSONField(name = "cc")
    private String id;

    @JSONField(name = "dn")
    private String displayName;

    @JSONField(name = "fn")
    private String fullName;

    @JSONField(name = "at")
    private int type;

    @JSONField(name = "wp")
    private int withdrawPrecision;

    @JSONField(name = "ft")
    private String feeType;

    @JSONField(name = "dma")
    private String depositMinAmount;

    @JSONField(name = "wma")
    private String withdrawMinAmount;

    @JSONField(name = "sp")
    private String showPrecision;

    @JSONField(name = "w")
    private String weight;

    @JSONField(name = "qc")
    private Boolean beQuoteCurrency;

    @JSONField(name = "state")
    private String state;

    @JSONField(name = "v")
    private Boolean visible;

    @JSONField(name = "whe")
    private Boolean whiteEnabled;

    @JSONField(name = "cd")
    private Boolean countryDisabled;

    @JSONField(name = "de")
    private Boolean depositEnabled;

    @JSONField(name = "wed")
    private Boolean withdrawEnabled;

    @JSONField(name = "cawt")
    private Boolean addressWithTage;

    @JSONField(name = "fc")
    private Integer fastConfirms;

    @JSONField(name = "sc")
    private Integer safeConfirms;

    @JSONField(name = "swd")
    private String suspendWithdraw;

    @JSONField(name = "wd")
    private String withdrawDesc;

    @JSONField(name = "sdd")
    private String suspendDeposit;

    @JSONField(name = "dd")
    private String depositDesc;

    @JSONField(name = "svd")
    private String suspendVisibleDesc;

    @JSONField(name = "tags")
    private String tags;



}