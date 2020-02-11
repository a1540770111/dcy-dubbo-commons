package com.dcy.web.config;

import cn.hutool.core.date.DatePattern;
import cn.hutool.core.date.DateUtil;
import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Author：dcy
 * @Description: 自动填充
 * @Date: 2019/9/6 10:44
 */
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {

    @Override
    public void insertFill(MetaObject metaObject) {
//        this.setInsertFieldValByName("createBy", BaseContextHandler.getUserID(), metaObject);
        this.setInsertFieldValByName("createDate", DateUtil.format(new Date(), DatePattern.PURE_DATETIME_MS_PATTERN), metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
//        this.setUpdateFieldValByName("updateBy", BaseContextHandler.getUserID(), metaObject);
        this.setUpdateFieldValByName("updateDate", DateUtil.format(new Date(), DatePattern.PURE_DATETIME_MS_PATTERN), metaObject);
    }
}
