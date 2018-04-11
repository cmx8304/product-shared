package com.qingguatang.product.model;

/**
 * 统一返回结果模型，用于封装事务操作的结果
 * @author cmx
 * @date 2018/3/27
 * @param <T>
 */
public class Result<T> {
    private Boolean isSuccess;
    private String code;
    private String message;
    private T data;

  public Boolean getSuccess() {
    return isSuccess;
  }

  public void setSuccess(Boolean success) {
    isSuccess = success;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public T getData() {
    return data;
  }

  public void setData(T data) {
    this.data = data;
  }
}
