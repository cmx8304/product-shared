package com.qingguatang.product.service;

import com.qingguatang.product.model.Media;
import com.qingguatang.product.model.Result;

public interface MediaService {
    Result<Media> add(Media media);

    Result delete(String mediaId);
}
