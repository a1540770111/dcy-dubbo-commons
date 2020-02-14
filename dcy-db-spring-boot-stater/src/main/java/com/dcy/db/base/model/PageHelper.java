package com.dcy.db.base.model;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.metadata.OrderItem;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dcy.db.base.model.PageData;
import com.dcy.db.base.model.PageModel;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;


/**
 * @Author：dcy
 * @Description: 分页帮助类
 * @Date: 2019/8/9 15:23
 */
@Data
public class PageHelper<T> {

    private static final String ORDER_ASC = "asc";
    private static final String ORDER_DESC = "desc";

    /**
     * 当前页面
     */
    private int current = 1;
    /**
     * 每页多少条
     */
    private int size = 30;
    /**
     * 排序字段
     */
    private String sort;
    /**
     * 排序类型
     */
    private String order;

    /**
     * 获取mybatisPlus封装的Page对象
     *
     * @return
     */
    public IPage<T> getPagePlus() {
        Page<T> pagePlus = new Page<T>();
        pagePlus.setCurrent(this.getCurrent());
        pagePlus.setSize(this.getSize());
        List<OrderItem> orderItems = new ArrayList<OrderItem>();
        if (ORDER_ASC.equalsIgnoreCase(this.getOrder())) {
            OrderItem orderItem = new OrderItem();
            // 驼峰式转换下划线方式
            orderItem.setColumn(StrUtil.toUnderlineCase(this.getSort()));
            orderItems.add(orderItem);
        }
        if (ORDER_DESC.equalsIgnoreCase(this.getOrder())) {
            OrderItem orderItem = new OrderItem();
            orderItem.setAsc(false);
            orderItem.setColumn(StrUtil.toUnderlineCase(this.getSort()));
            orderItems.add(orderItem);
        }
        // 添加排序字段
        pagePlus.addOrder(orderItems);
        return pagePlus;
    }

    /**
     * 分页数据转换
     *
     * @param page
     * @return
     */
    public PageData<T> toPageDate(IPage<T> page) {
        PageData<T> pageData = new PageData<>();
        pageData.setCurrent(page.getCurrent());
        pageData.setPages(page.getPages());
        pageData.setRecords(page.getRecords());
        pageData.setSize(page.getSize());
        pageData.setTotal(page.getTotal());
        return pageData;
    }
}
