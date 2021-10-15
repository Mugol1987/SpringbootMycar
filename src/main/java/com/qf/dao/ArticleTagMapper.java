package com.qf.dao;

import com.qf.pojo.ArticleTag;
import com.qf.pojo.ArticleTagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArticleTagMapper {
    long countByExample(ArticleTagExample example);

    int deleteByExample(ArticleTagExample example);

    int insert(ArticleTag record);

    int insertSelective(ArticleTag record);

    List<ArticleTag> selectByExample(ArticleTagExample example);

    int updateByExampleSelective(@Param("record") ArticleTag record, @Param("example") ArticleTagExample example);

    int updateByExample(@Param("record") ArticleTag record, @Param("example") ArticleTagExample example);
}