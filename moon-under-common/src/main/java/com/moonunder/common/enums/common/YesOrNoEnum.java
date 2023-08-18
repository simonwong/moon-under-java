package com.moonunder.common.enums.common;

import com.moonunder.common.enums.BasicEnum;
import com.moonunder.common.enums.dictionary.Dictionary;

/**
 * @author simon
 */
@Dictionary(name = "common.yesOrNo")
public enum YesOrNoEnum implements BasicEnum<Integer> {
  YES(1, "是"),
  NO(0, "否");

  private final int value;
  private final String description;

  YesOrNoEnum(int value, String description) {
    this.value = value;
    this.description = description;
  }

  @Override
  public Integer getValue() {
    return value;
  }

  @Override
  public String getDescription() {
    return description;
  }
}
