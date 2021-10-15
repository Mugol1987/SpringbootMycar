package com.qf.service;

import com.qf.dto.DataGridResult;
import com.qf.dto.QueryDTO;
import com.qf.pojo.Tag;

public interface TagService {

    public int addTag(Tag tag);

    public void delTag(Integer id);

    public int updateTag(Tag tag);

    public Tag findById(Integer id);

    public DataGridResult findByPage(QueryDTO queryDTO);
}
