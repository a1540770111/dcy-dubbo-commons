package com.dcy.db.base.model;

import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author：dcy
 * @Description: 分页类
 * @Date: 2020-02-14 09:08
 */
@Data
public class PageModel {
    /**
     * 当前页面
     */
    @TableField(exist = false)
    @ApiModelProperty(value = "当前页面")
    private int current = 1;
    /**
     * 每页多少条
     */
    @TableField(exist = false)
    @ApiModelProperty(value = "每页多少条")
    private int size = 30;
    /**
     * 排序字段
     */
    @TableField(exist = false)
    @ApiModelProperty(value = "排序字段")
    private String sort;
    /**
     * 排序类型
     */
    @TableField(exist = false)
    @ApiModelProperty(value = "排序类型")
    private String order;

}
