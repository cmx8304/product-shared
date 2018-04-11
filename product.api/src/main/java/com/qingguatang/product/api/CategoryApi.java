package com.qingguatang.product.api;

import com.qingguatang.product.model.Category;
import com.qingguatang.product.model.Result;
import java.util.List;

public interface CategoryApi extends CategorySearchApi{
  Result<List<Category>> save(List<Category> categories);

}
