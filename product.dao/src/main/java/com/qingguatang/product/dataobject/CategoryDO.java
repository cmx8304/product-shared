package com.qingguatang.product.dataobject;

import java.util.Date;

public class CategoryDO {
    /**编号*/
    private Long id;

    /**创建时间*/
    private Date gmtCreated;

    /**修改时间*/
    private Date gmtModified;

    /**类目名称*/
    private String name;

    /**类目图片*/
    private Long mediaId;

    /**类目状态*/
    private int status;

    /**类目顺序*/
    private Integer sort;

    /**父类目id*/
    private Long parentCategoryId;

    /**获取编号*/
    public Long getId() {
        return id;
    }

    /**设置编号*/
    public void setId(Long id) {
        this.id = id;
    }

    /**获取创建时间*/
    public Date getGmtCreated() {
        return gmtCreated;
    }

    /**设置创建时间*/
    public void setGmtCreated(Date gmtCreated) {
        this.gmtCreated = gmtCreated;
    }

    /**获取修改时间*/
    public Date getGmtModified() {
        return gmtModified;
    }

    /**设置修改时间*/
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**获取类目名称*/
    public String getName() {
        return name;
    }

    /**设置类目名称*/
    public void setName(String name) {
        this.name = name;
    }

    /**获取类目图片*/
    public Long getMediaId() {
        return mediaId;
    }

    /**设置类目图片*/
    public void setMediaId(Long mediaId) {
        this.mediaId = mediaId;
    }

    /**获取类目状态*/
    public int getStatus() {
        return status;
    }

    /**设置类目状态*/
    public void setStatus(int status) {
        this.status = status;
    }

    /**获取类目顺序*/
    public Integer getSort() {
        return sort;
    }

    /**设置类目顺序*/
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**获取父类目id*/
    public Long getParentCategoryId() {
        return parentCategoryId;
    }

    /**设置父类目id*/
    public void setParentCategoryId(Long parentCategoryId) {
        this.parentCategoryId = parentCategoryId;
    }
}