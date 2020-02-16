package com.dcy.web.base.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.dcy.db.base.model.PageHelper;


/**
 * @Author：dcy
 * @Description: 公共service
 * @Date: 2019/9/6 11:07
 */
public interface BaseService<T> extends IService<T> {

    /**
     * 分页
     *
     * @param pageHelper 分页实体
     * @param entity     实体类
     * @return
     */
    IPage<T> pageList(PageHelper<T> pageHelper, T entity);
}
