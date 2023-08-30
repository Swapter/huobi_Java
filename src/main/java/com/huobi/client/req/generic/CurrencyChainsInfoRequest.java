package com.huobi.client.req.generic;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CurrencyChainsInfoRequest {

  private String currency;

  @Builder.Default
  private boolean authorizedUser = true;

}
