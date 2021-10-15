package com.qf.dao;

import com.qf.pojo.TbToken;
import com.qf.pojo.TbTokenExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbTokenMapper {
    long countByExample(TbTokenExample example);

    int deleteByExample(TbTokenExample example);

    int insert(TbToken record);

    int insertSelective(TbToken record);

    List<TbToken> selectByExample(TbTokenExample example);

    int updateByExampleSelective(@Param("record") TbToken record, @Param("example") TbTokenExample example);

    int updateByExample(@Param("record") TbToken record, @Param("example") TbTokenExample example);
}