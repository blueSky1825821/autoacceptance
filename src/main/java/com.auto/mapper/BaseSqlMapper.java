package com.auto.mapper;

import java.util.List;

/**
 * Created by sky on 2017/5/7.
 */
public interface BaseSqlMapper<T> {
    int add(T t);

    void delete(int id);

    T get(int id);

    int update(T t);

    List<T> list();

    int count();
}
