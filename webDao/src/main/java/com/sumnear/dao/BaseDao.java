package com.sumnear.dao;

import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @authore sumnear
 * @create 2019-1-3 21:40
 */
public interface BaseDao<T> {
     Boolean insert(T var);
     Boolean delete(T var);
     Boolean update(T var);
     List<T> select(T var);
}


