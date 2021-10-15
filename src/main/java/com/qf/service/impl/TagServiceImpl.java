package com.qf.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.dao.TagMapper;
import com.qf.dto.DataGridResult;
import com.qf.dto.QueryDTO;
import com.qf.pojo.Tag;
import com.qf.pojo.TagExample;
import com.qf.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagServiceImpl implements TagService {

    @Autowired
    private TagMapper tagMapper;

    @Override
    public int addTag(Tag tag) {
        int i = tagMapper.insertSelective(tag);
        return i;
    }

    @Override
    public void delTag(Integer id) {
        tagMapper.deleteByExample(id);
    }

    @Override
    public int updateTag(Tag tag) {
        int i = tagMapper.updateByExampleSelective(tag);
        return i;
    }

    @Override
    public Tag findById(Integer id) {
        return tagMapper.selectByPrimaryKey(id);
    }

    @Override
    public DataGridResult findByPage(QueryDTO queryDTO) {
        PageHelper.offsetPage(queryDTO.getOffset(),queryDTO.getLimit());
        TagExample example = new TagExample();
        if (queryDTO.getSort() != null && !"".equals(queryDTO.getSort())){
            example.getOrderByClause("id" + queryDTO.getOrder());

        }
        List<Tag> tags = tagMapper.selectByExample(example);
        PageInfo<Tag> info = new PageInfo<>(tags);
        long total = info.getTotal();
        DataGridResult dataGridResult = new DataGridResult(total,tags);
        return dataGridResult;
    }
}
