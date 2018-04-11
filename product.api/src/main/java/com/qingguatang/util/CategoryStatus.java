package com.qingguatang.util;

public enum CategoryStatus {
  ENABLED(1,"可用"),DISABLED(2,"不可用");
  int value;
  String name;


  CategoryStatus(int value,String name) {
    this.value = value;
    this.name = name;
  }

  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public static CategoryStatus getByValue(int value){
    for (CategoryStatus categoryStatus: CategoryStatus.values()) {
      if(categoryStatus.value == value){
        return categoryStatus;
      }
    }
    throw new IllegalArgumentException("NO element matches" + value);
  }
}
