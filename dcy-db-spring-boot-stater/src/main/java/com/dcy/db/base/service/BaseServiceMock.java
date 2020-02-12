package com.dcy.db.base.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.dcy.db.base.model.PageHelper;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * @Author：dcy
 * @Description:
 * @Date: 2020-02-12 09:49
 */
public class BaseServiceMock<T> implements BaseService<T> {

    @Override
    public boolean save(T t) {
        return false;
    }

    @Override
    public boolean saveBatch(Collection<T> collection) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<T> collection) {
        return false;
    }

    @Override
    public boolean removeById(Serializable serializable) {
        return false;
    }

    @Override
    public boolean removeByMap(Map<String, Object> map) {
        return false;
    }

    @Override
    public boolean removeByIds(Collection<? extends Serializable> collection) {
        return false;
    }

    @Override
    public boolean updateById(T t) {
        return false;
    }

    @Override
    public boolean updateBatchById(Collection<T> collection) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(T t) {
        return false;
    }

    @Override
    public T getById(Serializable serializable) {
        return null;
    }

    @Override
    public Collection<T> listByIds(Collection<? extends Serializable> collection) {
        return null;
    }

    @Override
    public Collection<T> listByMap(Map<String, Object> map) {
        return null;
    }

    @Override
    public IPage<T> page(IPage<T> iPage) {
        return null;
    }

    @Override
    public IPage<T> pageList(PageHelper<T> pageHelper, T t) {
        return null;
    }

    @Override
    public List<T> list() {
        return null;
    }

    @Override
    public List<T> list(T t) {
        return null;
    }
}
