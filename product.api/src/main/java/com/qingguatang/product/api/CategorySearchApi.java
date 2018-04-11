package com.qingguatang.product.api;

import com.qingguatang.product.model.Category;
import com.qingguatang.product.param.CategoryQueryParam;
import java.util.List;

public interface CategorySearchApi {
    public List<Category> query(CategoryQueryParam categoryQueryParam);
}
