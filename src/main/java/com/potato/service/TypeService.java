package com.potato.service;

import com.potato.po.Type;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface TypeService {

    //新增分类
    Type saveType(Type type);

    //查询(根据id)
    Type getType(Long id);

    //查询（根据名字）
    Type getTypeByName(String name);

    //列表查询
    Page<Type> listType(Pageable pageable);

    List<Type> listType();

    //首页查询个数
    List<Type> listTypeTop(Integer size);

    //修改
    Type updateType(Long id,Type type);

    //删除
    void deleteType(Long id);
}
