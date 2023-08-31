package com.huobi.model.generic;

import java.math.BigDecimal;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Symbol {

  private String symbol;

  @JSONField(name = "bc")
  private String baseCurrency;

  @JSONField(name = "qc")
  private String quoteCurrency;

  @JSONField(name = "state")
  private String state;

  @JSONField(name = "ve")
  private Boolean visible;

  @JSONField(name = "te")
  private Boolean tradeEnabled;

  @JSONField(name = "tap")
  private Integer amountPrecision;


}
