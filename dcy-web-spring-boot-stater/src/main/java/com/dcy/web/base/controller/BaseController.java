package com.dcy.web.base.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.dcy.common.model.ResponseData;
import com.dcy.db.base.model.PageHelper;
import com.dcy.web.base.service.BaseService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/**
 * @Author：dcy
 * @Description: 公共controller
 * @Date: 2019/9/6 13:19
 */
@Slf4j
public class BaseController<Service extends BaseService<Entity>, Entity> {

    @Autowired
    protected Service baseService;

    /**
     * 分页
     *
     * @param pageHelper
     * @param entity
     * @return
     */
    @ApiOperation(value = "分页查询", notes = "分页查询")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageHelper", value = "分页信息", dataType = "PageHelper", paramType = "query"),
            @ApiImplicitParam(name = "entity", value = "查询对象", dataType = "Entity", paramType = "query")
    })
    @GetMapping(value = "/page")
    public ResponseData<IPage<Entity>> page(PageHelper<Entity> pageHelper, Entity entity) {
        return ResponseData.success(baseService.pageList(pageHelper, entity));
    }


    /**
     * 查询全部
     *
     * @return
     */
    @ApiOperation(value = "获取全部信息", notes = "获取全部信息")
    @GetMapping(value = "/all")
    public ResponseData<List<Entity>> all() {
        return ResponseData.success(baseService.list());
    }


    @ApiOperation(value = "根据对象id，查询详细信息", notes = "根据对象id，查询详细信息")
    @GetMapping(value = "/getDetailById")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "实体类Id", dataType = "Serializable", paramType = "query")
    })
    public ResponseData<Entity> getEntityById(@RequestParam Serializable id) {
        return (ResponseData<Entity>) ResponseData.success(baseService.getById(id));
    }
    /**
     * 添加
     *
     * @param entity
     * @return
     */
    @ApiOperation(value = "添加", notes = "添加")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "body", dataType = "Entity", name = "entity", value = "对象参数", required = true)
    })
    @PostMapping(value = "/save")
    public ResponseData<Boolean> save(@RequestBody Entity entity) {
        return ResponseData.success(baseService.save(entity));
    }

    /**
     * 修改
     *
     * @param entity
     * @return
     */
    @ApiOperation(value = "修改", notes = "修改")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "body", dataType = "Entity", name = "entity", value = "对象参数", required = true)
    })
    @PostMapping(value = "/update")
    public ResponseData<Boolean> update(@RequestBody Entity entity) {
        return ResponseData.success(baseService.updateById(entity));
    }

    /**
     * 删除
     *
     * @param id
     * @return
     */
    @ApiOperation(value = "删除", notes = "删除")
    @PostMapping(value = "/delete")
    public ResponseData<Boolean> delete(@RequestParam Serializable id) {
        return ResponseData.success(baseService.removeById(id));
    }

    /**
     * 根据idList删除（对应的泛型是基本数据类型）
     *
     * @param idList
     * @return
     */
    @ApiOperation(value = "根据list删除", notes = "根据list删除")
    @PostMapping(value = "/deleteBatch")
    public ResponseData<Boolean> deleteBatch(@RequestBody Collection<? extends Serializable> idList) {
        return ResponseData.success(baseService.removeByIds(idList));
    }
}
