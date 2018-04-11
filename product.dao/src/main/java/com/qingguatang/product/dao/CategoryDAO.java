package com.qingguatang.product.dao;

import com.qingguatang.product.dataobject.CategoryDO;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author cmx
 * @Date 2018-04-10
 */
@Mapper
public interface CategoryDAO {

    /**
     * 根据id删除类目
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 增加类目
     * @param record
     * @return
     */
    int insert(CategoryDO record);

    /**
     * 根据条件查询
     * @param categoryDO
     * @return
     */
    CategoryDO selectByPrimaryKey(CategoryDO categoryDO);

    /**
     * 查询所有
     * @return
     */
    List<CategoryDO> selectAll();

    /**
     * 更新数据库
     * @param record
     * @return
     */
    int updateByPrimaryKey(CategoryDO record);

    /**
     * 查询父类的子类的最后一个排序号
     * @param categoryDO
     * @return
     */
    int querySortInFather(CategoryDO categoryDO);

    /**
     * 同时删除父类和子类
     * @param categoryDO
     */
    void deleteFatherAndChild(CategoryDO categoryDO);
}