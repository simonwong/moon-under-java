package com.moonunder.common.enums;

/**
 * @author simon
 */
public interface BasicEnum<T> {

  /**
   * 获取枚举值
   * @return 枚举值
   */
  T getValue();

  /**
   * 获取枚举描述
   * @return 枚举描述
   */
  String getDescription();
}
