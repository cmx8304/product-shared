package com.qingguatang.product.model;

import com.qingguatang.util.CategoryStatus;
import java.util.List;
/**
 * 类目对象
 * @author cmx
 * @date 2018/3/27
 */
public class Category extends BaseModel{

    /**
     * 类目对象
     */
    private String name;
    /**
     * 类目图片
     */
    private Long mediaId;
    /**
     * 类目状态
     */
    private CategoryStatus status;
    /**
     * 类目排序
     */
    private int sort;

    private List<Category> categoryList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getMediaId() {
        return mediaId;
    }

    public void setMediaId(Long mediaId) {
        this.mediaId = mediaId;
    }

    public CategoryStatus getStatus() {
        return status;
    }

    public void setStatus(CategoryStatus status) {
        this.status = status;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public List<Category> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<Category> categoryList) {
        this.categoryList = categoryList;
    }
}
