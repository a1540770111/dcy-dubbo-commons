package com.dcy.web.base.service.impl;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dcy.db.base.model.PageHelper;
import com.dcy.web.base.service.BaseService;

/**
 * @Author：dcy
 * @Description: 公共serviceImpl
 * @Date: 2019/9/6 11:09
 */
public class BaseServiceImpl<M extends BaseMapper<T>, T> extends ServiceImpl<M, T> implements BaseService<T> {


    @Override
    public IPage<T> pageList(PageHelper<T> pageHelper, T entity) {
        return super.baseMapper.selectPage(pageHelper.getPagePlus(), Wrappers.query(entity));
    }

}
