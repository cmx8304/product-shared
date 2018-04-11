package com.qingguatang.product.service;

import com.qingguatang.product.dataobject.CategoryDO;
import com.qingguatang.product.model.Category;
import com.qingguatang.product.model.Result;
import java.util.List;

public interface CategoryService {


    public Result<Category> addOrUpdate(CategoryDO categoryDO);

    public Result delete(String categoryId);

    public Result sort(List<CategoryDO> categorys);
}
