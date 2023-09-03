package com.moonunder.common.core.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author simon
 */
@Data
@AllArgsConstructor
public class ResponseDTO<T> {
  private Integer code;
  private String msg;
  private T data;

  public static <T> ResponseDTO<T> ok(T data) {
    return build(data, 200, "成功");
  }

  public static <T> ResponseDTO<T> build(T data, Integer code, String msg) {
    return new ResponseDTO<>(code, msg, data);
  }
}