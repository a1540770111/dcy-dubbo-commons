package com.dcy.db.base.model;

import lombok.Data;

/**
 * @Author：dcy
 * @Description:
 * @Date: 2020-02-14 09:08
 */
@Data
public class PageModel {
    private static final long serialVersionUID = 1L;

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
}
