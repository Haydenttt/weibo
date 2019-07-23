package com.unicom.mybatis;

import tk.mybatis.mapper.common.MySqlMapper;
import tk.mybatis.mapper.common.special.InsertUseGeneratedKeysMapper;

public interface UnicomMapper<T> extends tk.mybatis.mapper.common.Mapper<T>, MySqlMapper<T>,
        tk.mybatis.mapper.common.IdsMapper<T>, InsertUseGeneratedKeysMapper<T> {
    }
