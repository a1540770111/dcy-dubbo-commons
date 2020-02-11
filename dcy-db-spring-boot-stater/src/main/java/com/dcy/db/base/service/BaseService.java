package com.dcy.db.base.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.dcy.db.base.model.PageHelper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * @Author：dcy
 * @Description:
 * @Date: 2020-02-10 12:41
 */
public interface BaseService<T> {


    /**
     * 插入一条记录（选择字段，策略插入）
     *
     * @param entity 实体对象
     */
    @PostMapping("/save")
    boolean save(T entity);

    /**
     * 插入（批量）
     *
     * @param entityList 实体对象集合
     */
    @PostMapping("/saveBatch")
    boolean saveBatch(Collection<T> entityList);

    /**
     * 批量修改插入
     *
     * @param entityList 实体对象集合
     */
    @PostMapping("/saveOrUpdateBatch")
    boolean saveOrUpdateBatch(Collection<T> entityList);

    /**
     * 根据 ID 删除
     *
     * @param id 主键ID
     */
    @PostMapping("/removeById")
    boolean removeById(Serializable id);

    /**
     * 根据 columnMap 条件，删除记录
     *
     * @param columnMap 表字段 map 对象
     */
    @PostMapping("/removeByMap")
    boolean removeByMap(Map<String, Object> columnMap);

    /**
     * 删除（根据ID 批量删除）
     *
     * @param idList 主键ID列表
     */
    @PostMapping("/removeByIds")
    boolean removeByIds(Collection<? extends Serializable> idList);

    /**
     * 根据 ID 选择修改
     *
     * @param entity 实体对象
     */
    @PostMapping("/updateById")
    boolean updateById(T entity);

    /**
     * 根据ID 批量更新
     *
     * @param entityList 实体对象集合
     */
    @PostMapping("/updateBatchById")
    boolean updateBatchById(Collection<T> entityList);

    /**
     * TableId 注解存在更新记录，否插入一条记录
     *
     * @param entity 实体对象
     */
    @PostMapping("/saveOrUpdate")
    boolean saveOrUpdate(T entity);

    /**
     * 根据 ID 查询
     *
     * @param id 主键ID
     */
    @GetMapping("/getById")
    T getById(Serializable id);

    /**
     * 查询（根据ID 批量查询）
     *
     * @param idList 主键ID列表
     */
    @GetMapping("/listByIds")
    Collection<T> listByIds(Collection<? extends Serializable> idList);

    /**
     * 查询（根据 columnMap 条件）
     *
     * @param columnMap 表字段 map 对象
     */
    @GetMapping("/listByMap")
    Collection<T> listByMap(Map<String, Object> columnMap);


    /**
     * 无条件翻页查询
     *
     * @param page 翻页对象
     * @see Wrappers#emptyWrapper()
     */
    @GetMapping("/page")
    IPage<T> page(IPage<T> page);

    /**
     * 分页
     *
     * @param pageHelper 分页实体
     * @param entity     实体类
     * @return
     */
    @GetMapping("/pageList")
    IPage<T> pageList(PageHelper<T> pageHelper, T entity);

    /**
     * 查询所有
     */
    @GetMapping("/list")
    List<T> list();

    /**
     * 查询所有
     *
     * @param entity 实体对象
     * @return
     */
    @GetMapping("/listByEn")
    List<T> list(T entity);
}
