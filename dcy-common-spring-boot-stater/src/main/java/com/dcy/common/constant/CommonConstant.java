package com.dcy.common.constant;

/**
 * @Author：dcy
 * @Description: 全局公共常量
 * @Date: 2019/9/6 13:36
 */
public interface CommonConstant {
    /**
     * token请求头名称
     */
    String TOKEN_HEADER = "Authorization";

    /**
     * The access token issued by the authorization server. This value is REQUIRED.
     */
    String ACCESS_TOKEN = "access_token";

    String BEARER_TYPE = "Bearer ";
    /**
     * ROLE_ANONYMOUS 匿名权限
     */
    String ROLE_ANONYMOUS = "ROLE_ANONYMOUS";

    /**
     * 公共父级id
     */
    String DEFAULT_PARENT_VAL = "0";
    /**
     * 删除
     */
    String STATUS_DEL = "1";

    /**
     * 正常
     */
    String STATUS_NORMAL = "0";

    /**
     * 锁定
     */
    String STATUS_LOCK = "9";

    /**
     * 目录
     */
    Integer CATALOG = -1;

    /**
     * 菜单
     */
    Integer MENU = 1;

    /**
     * 权限
     */
    Integer PERMISSION = 2;


    // auth-server 常量
    String SIGNING_KEY = "dcy!#$&*(!FGE";
    String CONTEXT_KEY_USER_ID = "currentUserId";
    String USER_INFO = "user_info";
    String CONTEXT_KEY_USERNAME = "currentUserName";
    /**
     * 存储用户权限
     */
    String REDIS_USER_MODULE_LIST_KEY = "user:module:resources:list:";


    /**
     * 日志链路追踪id信息头
     */
    String TRACE_ID_HEADER = "x-traceId-header";
    /**
     * 日志链路追踪id日志标志
     */
    String LOG_TRACE_ID = "traceId";

    /**
     * 租户id参数
     */
    String TENANT_ID_PARAM = "tenant_id";
    String CONTEXT_KEY_TENANT_ID = "currentTenantId";
}
