package com.huobi.service.huobi.parser.generic;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.huobi.model.generic.ChainInfo;
import com.huobi.model.generic.CurrencyChain;
import com.huobi.service.huobi.parser.HuobiModelParser;

import java.util.List;

public class ChainInfoParser implements HuobiModelParser<ChainInfo> {

  @Override
  public ChainInfo parse(JSONObject json) {
    return json.toJavaObject(ChainInfo.class);
  }

  @Override
  public ChainInfo parse(JSONArray json) {
    return null;
  }

  @Override
  public List<ChainInfo> parseArray(JSONArray jsonArray) {
    return jsonArray.toJavaList(ChainInfo.class);
  }
}
