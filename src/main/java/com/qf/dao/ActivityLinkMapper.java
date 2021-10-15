package com.qf.dao;

import com.qf.pojo.ActivityLink;
import com.qf.pojo.ActivityLinkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActivityLinkMapper {
    long countByExample(ActivityLinkExample example);

    int deleteByExample(ActivityLinkExample example);

    int insert(ActivityLink record);

    int insertSelective(ActivityLink record);

    List<ActivityLink> selectByExample(ActivityLinkExample example);

    int updateByExampleSelective(@Param("record") ActivityLink record, @Param("example") ActivityLinkExample example);

    int updateByExample(@Param("record") ActivityLink record, @Param("example") ActivityLinkExample example);
}