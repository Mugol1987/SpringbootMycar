package com.qf.dao;

import com.qf.pojo.ActivityPdata;
import com.qf.pojo.ActivityPdataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActivityPdataMapper {
    long countByExample(ActivityPdataExample example);

    int deleteByExample(ActivityPdataExample example);

    int insert(ActivityPdata record);

    int insertSelective(ActivityPdata record);

    List<ActivityPdata> selectByExampleWithBLOBs(ActivityPdataExample example);

    List<ActivityPdata> selectByExample(ActivityPdataExample example);

    int updateByExampleSelective(@Param("record") ActivityPdata record, @Param("example") ActivityPdataExample example);

    int updateByExampleWithBLOBs(@Param("record") ActivityPdata record, @Param("example") ActivityPdataExample example);

    int updateByExample(@Param("record") ActivityPdata record, @Param("example") ActivityPdataExample example);
}