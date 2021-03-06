package com.qf.dao;

import com.qf.pojo.ArticleAction;
import com.qf.pojo.ArticleActionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArticleActionMapper {
    long countByExample(ArticleActionExample example);

    int deleteByExample(ArticleActionExample example);

    int insert(ArticleAction record);

    int insertSelective(ArticleAction record);

    List<ArticleAction> selectByExample(ArticleActionExample example);

    int updateByExampleSelective(@Param("record") ArticleAction record, @Param("example") ArticleActionExample example);

    int updateByExample(@Param("record") ArticleAction record, @Param("example") ArticleActionExample example);
}