package com.dcy.db.base.model;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @Author：dcy
 * @Description: 公共实体类
 * @Date: 2019/9/6 13:55
 */
@Getter
@Setter
public class BaseModel extends PageModel implements Serializable {
    /**
     * 创建者
     */
    @TableField(fill = FieldFill.INSERT)
    @ApiModelProperty(value = "创建者",hidden = true)
    private String createBy;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    @ApiModelProperty(value = "创建时间",hidden = true)
    private String createDate;

    /**
     * 更新者
     */
    @TableField(fill = FieldFill.UPDATE)
    @ApiModelProperty(value = "更新者",hidden = true)
    private String updateBy;

    /**
     * 更新时间
     */
    @TableField(fill = FieldFill.UPDATE)
    @ApiModelProperty(value = "更新时间",hidden = true)
    private String updateDate;

    /**
     * 删除标识
     * 不查询此字段
     */
    @TableLogic
    @TableField(select = false)
    @ApiModelProperty(value = "删除标识",hidden = true)
    private Integer delFlag;

    /**
     * 备注
     */
    @ApiModelProperty(value = "备注")
    private String remark;

    public static final String CREATE_BY = "create_by";

    public static final String CREATE_DATE = "create_date";

    public static final String UPDATE_BY = "update_by";

    public static final String UPDATE_DATE = "update_date";

    public static final String DEL_FLAG = "del_flag";

    public static final String REMARK = "remark";
}
