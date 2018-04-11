package com.qingguatang.product.param;

import com.qingguatang.util.MediaType;

/**
 * MediaQueryParam的描述:<br>
 *
 * @author cmx 26/03/2018 12:31 PM
 */
public class MediaQueryParam {

  /**
   * 资源类型
   */
  private MediaType type;

  public MediaType getType() {
    return type;
  }

  public void setType(MediaType type) {
    this.type = type;
  }
}
