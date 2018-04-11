package com.qingguatang.product.service.impl;

import com.qingguatang.product.dao.CategoryDAO;
import com.qingguatang.product.dataobject.CategoryDO;
import com.qingguatang.product.model.Category;
import com.qingguatang.product.model.Result;
import com.qingguatang.product.service.CategoryService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public class CategoryServiceImpl implements CategoryService{
  @Autowired
  private CategoryDAO categoryDAO;


  @Override
  public Result<Category> addOrUpdate(CategoryDO categoryDO) {
    categoryDAO.insert(categoryDO);
    return  null;
  }

  @Override
  public Result delete(String categoryId) {
    return null;
  }

  @Override
  public Result sort(List<CategoryDO> categorys) {
    return null;
  }
}
