package com.auto.impl;

import com.auto.mapper.BaseSqlMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by sky on 2017/5/7.
 */
public class BaseSqlImpl<T> implements BaseSqlMapper<T> {
    @Autowired
    BaseSqlMapper<T> baseSqlMapper;

    public int add(T t) {
        return baseSqlMapper.add(t);
    }

    public void delete(int id) {
        baseSqlMapper.delete(id);
    }

    public T get(int id) {
        return baseSqlMapper.get(id);
    }

    public int update(T t) {
        return baseSqlMapper.update(t);
    }

    public List<T> list() {
        return baseSqlMapper.list();
    }

    public int count() {
        return baseSqlMapper.count();
    }
}
