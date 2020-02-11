package com.dcy.web.base.service.impl;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dcy.db.base.model.PageHelper;
import com.dcy.db.base.service.BaseService;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * @Author：dcy
 * @Description: 公共serviceImpl
 * @Date: 2019/9/6 11:09
 */
public class BaseServiceImpl<M extends BaseMapper<T>, T> extends ServiceImpl<M, T> implements BaseService<T> {

    /**
     * 插入（批量）
     *
     * @param entityList 实体对象集合
     */
    @Override
    public boolean saveBatch(Collection<T> entityList) {
        return super.saveBatch(entityList);
    }

    /**
     * 批量修改插入
     *
     * @param entityList 实体对象集合
     */
    @Override
    public boolean saveOrUpdateBatch(Collection<T> entityList) {
        return super.saveOrUpdateBatch(entityList);
    }


    /**
     * 根据ID 批量更新
     *
     * @param entityList 实体对象集合
     */
    @Override
    public boolean updateBatchById(Collection<T> entityList) {
        return super.updateBatchById(entityList);
    }


    /**
     * 查询总记录数
     *
     * @see Wrappers#emptyWrapper()
     */
    @Override
    public int count() {
        return super.count();
    }

    /**
     * 查询所有
     *
     * @see Wrappers#emptyWrapper()
     */
    @Override
    public List<T> list() {
        return super.list();
    }

    /**
     * 查询所有
     *
     * @param entity 实体对象
     * @return
     */
    @Override
    public List<T> list(T entity) {
        return super.list(Wrappers.query(entity));
    }

    /**
     * 无条件翻页查询
     *
     * @param page 翻页对象
     * @see Wrappers#emptyWrapper()
     */
    @Override
    public IPage<T> page(IPage<T> page) {
        return super.page(page);
    }

    /**
     * 查询所有列表
     *
     * @see Wrappers#emptyWrapper()
     */
    @Override
    public List<Map<String, Object>> listMaps() {
        return super.listMaps();
    }

    /**
     * 查询全部记录
     */
    @Override
    public List<Object> listObjs() {
        return super.listObjs();
    }

    /**
     * 分页
     *
     * @param pageHelper 分页实体
     * @param entity     实体类
     * @return
     */
    @Override
    public IPage<T> pageList(PageHelper<T> pageHelper, T entity) {
        return super.page(pageHelper.getPagePlus(), Wrappers.query(entity));
    }

}
