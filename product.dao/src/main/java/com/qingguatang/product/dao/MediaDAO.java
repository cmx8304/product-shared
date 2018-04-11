package com.qingguatang.product.dao;

import com.qingguatang.product.dataobject.MediaDO;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MediaDAO {
    int deleteByPrimaryKey(String id);

    int insert(MediaDO record);

    MediaDO selectByPrimaryKey(String id);

    List<MediaDO> selectAll();

    int updateByPrimaryKey(MediaDO record);
}