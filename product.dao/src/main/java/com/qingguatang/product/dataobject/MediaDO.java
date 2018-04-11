package com.qingguatang.product.dataobject;

import java.util.Date;

public class MediaDO {
    /**编号*/
    private String id;

    /**创建时间*/
    private Date gmtCreated;

    /**修改时间*/
    private Date gmtModified;

    /**关联资源id*/
    private String refId;

    /**资源类型*/
    private String type;

    /**资源url*/
    private String url;

    /**资源上传者账户id*/
    private String accountId;

    /**获取编号*/
    public String getId() {
        return id;
    }

    /**设置编号*/
    public void setId(String id) {
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

    /**获取关联资源id*/
    public String getRefId() {
        return refId;
    }

    /**设置关联资源id*/
    public void setRefId(String refId) {
        this.refId = refId;
    }

    /**获取资源类型*/
    public String getType() {
        return type;
    }

    /**设置资源类型*/
    public void setType(String type) {
        this.type = type;
    }

    /**获取资源url*/
    public String getUrl() {
        return url;
    }

    /**设置资源url*/
    public void setUrl(String url) {
        this.url = url;
    }

    /**获取资源上传者账户id*/
    public String getAccountId() {
        return accountId;
    }

    /**设置资源上传者账户id*/
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }
}