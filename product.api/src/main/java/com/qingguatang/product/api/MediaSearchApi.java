package com.qingguatang.product.api;

import com.qingguatang.product.model.Media;
import com.qingguatang.product.model.PagingData;
import com.qingguatang.product.param.MediaQueryParam;

public interface MediaSearchApi {
    PagingData<Media> query(MediaQueryParam mediaQueryParam);
}
