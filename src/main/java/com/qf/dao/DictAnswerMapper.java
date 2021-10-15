package com.qf.dao;

import com.qf.pojo.DictAnswer;
import com.qf.pojo.DictAnswerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DictAnswerMapper {
    long countByExample(DictAnswerExample example);

    int deleteByExample(DictAnswerExample example);

    int insert(DictAnswer record);

    int insertSelective(DictAnswer record);

    List<DictAnswer> selectByExample(DictAnswerExample example);

    int updateByExampleSelective(@Param("record") DictAnswer record, @Param("example") DictAnswerExample example);

    int updateByExample(@Param("record") DictAnswer record, @Param("example") DictAnswerExample example);
}