package com.qingguatang.product.model;

/**
 * 统一返回集合模型，用于封装集合查询的结果
 * @author cmx
 * @date 2018/3/27
 * @param <T>
 */
public class PagingData<T>{
    private int totalItems;
    private int totalPages;
    private int pageSize;
    private int currentPage;
    private T data;

  public int getTotalItems() {
    return totalItems;
  }

  public void setTotalItems(int totalItems) {
    this.totalItems = totalItems;
  }

  public int getTotalPages() {
    return totalPages;
  }

  public void setTotalPages(int totalPages) {
    this.totalPages = totalPages;
  }

  public int getPageSize() {
    return pageSize;
  }

  public void setPageSize(int pageSize) {
    this.pageSize = pageSize;
  }

  public int getCurrentPage() {
    return currentPage;
  }

  public void setCurrentPage(int currentPage) {
    this.currentPage = currentPage;
  }

  public T getData() {
    return data;
  }

  public void setData(T data) {
    this.data = data;
  }
}
