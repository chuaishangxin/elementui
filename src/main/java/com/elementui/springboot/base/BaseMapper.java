package com.elementui.springboot.base;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author wpq
 * @date 2018/10/12 10:53
 */
public interface BaseMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
