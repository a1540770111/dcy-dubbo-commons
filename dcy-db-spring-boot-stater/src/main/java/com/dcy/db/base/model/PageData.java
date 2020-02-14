package com.dcy.db.base.model;

import lombok.Data;

import java.util.List;

/**
 * @Author：dcy
 * @Description:
 * @Date: 2020-02-13 17:08
 */
@Data
public class PageData<T> {

    private static final long serialVersionUID = 1L;

    /**
     * 当前页
     */
    private long current;
    /**
     * 当前分页总页数
     */
    private long pages;
    /**
     * 查询数据列表
     */
    private List<T> records;
    /**
     * 每页显示条数，默认 10
     */
    private long size;
    /**
     * 总数
     */
    private long total;
}
