package com.qingguatang.product.control;

import com.qingguatang.product.api.CategoryApi;
import com.qingguatang.product.dao.CategoryDAO;
import com.qingguatang.product.dataobject.CategoryDO;
import com.qingguatang.product.model.Category;
import com.qingguatang.product.model.CategoryExtend;
import com.qingguatang.product.model.Media;
import com.qingguatang.product.model.Result;
import com.qingguatang.product.param.CategoryQueryParam;
import com.qingguatang.util.CategoryStatus;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author cmx
 * @date 2018/4/10
 */
@Controller
public class CategoryApiControl implements CategoryApi{
  @Autowired
  private CategoryDAO categoryDAO;

  @Override
  public Result<List<Category>> save(List<Category> categorys) {
    return null;
  }

  @Override
  public List<Category> query(CategoryQueryParam categoryQueryParam) {
    List<CategoryDO> categoryDOList = categoryDAO.selectAll();
    Map<Long,CategoryExtend> categoryMap = new LinkedHashMap<>();
    for (CategoryDO categoryDO:categoryDOList) {
      Media media = new Media();
      media.setId(categoryDO.getMediaId());
      int value = categoryDO.getStatus();

      CategoryExtend category = new CategoryExtend();
      category.setId(categoryDO.getId());
      category.setGmtCreated(categoryDO.getGmtCreated());
      category.setGmtModified(categoryDO.getGmtModified());
      category.setName(categoryDO.getName());
      category.setMediaId(media.getId());
      category.setStatus(CategoryStatus.getByValue(categoryDO.getStatus()));
      category.setParentCategoryId(categoryDO.getParentCategoryId());

      categoryMap.put(category.getId(),category);
    }
    categoryMap.forEach((id,category)->{
      CategoryExtend parent = null;
      if(categoryMap.containsKey(category.getParentCategoryId())){
        parent = categoryMap.get(category.getParentCategoryId());
      }else{
        parent = new CategoryExtend();
        parent.setId(0l);
        categoryMap.put(0l,parent);
      }
      category.getCategoryList().add(category);
    });
        return null;
  }

  /**
   * 添加类目
   * @param categoryExtend
   */
  public void addCategory(CategoryExtend categoryExtend){
    CategoryDO categoryDO = new CategoryDO();
    categoryDO.setName(categoryExtend.getName());
    CategoryDO categoryDO1 = categoryDAO.selectByPrimaryKey(categoryDO);
    //名称不能重复
    if (categoryDO1 == null)
    {
      /**
       * 为子类
       */
      if (categoryExtend.getParentCategoryId() != 0){
        categoryDO.setParentCategoryId(categoryExtend.getParentCategoryId());
      }else {
        //为父类
        categoryDO.setParentCategoryId(0l);
      }
      //排序到父系统类目的最后一个
      int sort = categoryDAO.querySortInFather(categoryDO);
      categoryDO.setSort(sort + 1);
      categoryDO.setGmtCreated(new Date());
      categoryDO.setGmtModified(new Date());
      categoryDO.setMediaId(categoryExtend.getMediaId());
      categoryExtend.setStatus(categoryExtend.getStatus());
      categoryDAO.insert(categoryDO);
    }
  }
  public void deleteCategory(CategoryExtend categoryExtend){
    CategoryDO categoryDO = new CategoryDO();
    /**
     * 子类
     */
    if (categoryExtend.getParentCategoryId() != 0){
      categoryDAO.deleteByPrimaryKey(categoryExtend.getId());
    }else{
      /**
       * 父类得到id删除，也为子类的父id
       */
       categoryDO.setId(categoryExtend.getId());
       categoryDAO.deleteFatherAndChild(categoryDO);
    }
  }
}
