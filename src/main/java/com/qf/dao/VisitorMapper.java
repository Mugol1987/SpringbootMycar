package com.qf.dao;

import com.qf.pojo.Visitor;
import com.qf.pojo.VisitorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VisitorMapper {
    long countByExample(VisitorExample example);

    int deleteByExample(VisitorExample example);

    int insert(Visitor record);

    int insertSelective(Visitor record);

    List<Visitor> selectByExample(VisitorExample example);

    int updateByExampleSelective(@Param("record") Visitor record, @Param("example") VisitorExample example);

    int updateByExample(@Param("record") Visitor record, @Param("example") VisitorExample example);
}