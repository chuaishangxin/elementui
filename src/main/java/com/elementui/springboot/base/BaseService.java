package com.elementui.springboot.base;

import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @author wpq
 * @date 2018/10/18 15:33
 */
public abstract class BaseService<T> {

    @Autowired
    private BaseMapper<T> baseMapper;

    public List<T> selectByExample(Example example) {
        return baseMapper.selectByExample(example);
    }

    public List<T> selectAll() {
        return baseMapper.selectAll();
    }

    public int insertSelective(T t) {
        return baseMapper.insertSelective(t);
    }
}
