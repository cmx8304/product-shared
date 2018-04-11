package com.qingguatang.product.model;

import com.qingguatang.util.MediaType;

/**
 * 多媒体对象
 * @author cmx
 * @date 2018/3/27
 */
public class Media extends BaseModel{

    /**
     * 关联资源id
     */
    private String refId;
    /**
     * 资源类型
     */
    private MediaType type;
    /**
     * 资源url
     */
    private String url;
    /**
     * 资源上传者id
     */
    private long accountId;

    public String getRefId() {
        return refId;
    }

    public void setRefId(String refId) {
        this.refId = refId;
    }

    public MediaType getType() {
        return type;
    }

    public void setType(MediaType type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }
}
