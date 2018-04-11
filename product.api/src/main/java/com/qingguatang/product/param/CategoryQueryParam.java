package com.qingguatang.product.param;

import com.qingguatang.util.CategoryStatus;

/**
 * CategoryParam的描述:<br>
 *
 * @author cmx 26/03/2018 12:31 PM
 */
public class CategoryQueryParam {

  /**
   * 类目状态
   */
  private CategoryStatus status;

  public CategoryStatus getStatus() {
    return status;
  }

  public void setStatus(CategoryStatus status) {
    this.status = status;
  }
}
