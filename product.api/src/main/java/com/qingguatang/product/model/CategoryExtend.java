package com.qingguatang.product.model;

public class CategoryExtend extends Category{
  private Long parentCategoryId;

  public Long getParentCategoryId() {
    return parentCategoryId;
  }

  public void setParentCategoryId(Long parentCategoryId) {
    this.parentCategoryId = parentCategoryId;
  }
}
