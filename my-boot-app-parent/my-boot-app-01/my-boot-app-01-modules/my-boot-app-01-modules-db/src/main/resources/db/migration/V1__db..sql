create table if not exists area_address
(
    id      bigint(15) auto_increment comment 'id'
        primary key,
    area_id bigint(15)  default -1 not null comment 'areaId',
    address varchar(50) default '' not null comment 'address'
)
    comment 'area_address';

create table if not exists area_info
(
    id   bigint(15) auto_increment comment 'id'
        primary key,
    code varchar(50) default '' not null comment 'code',
    pid  varchar(50) default '' not null comment 'pid',
    name varchar(50) default '' not null comment 'name'
)
    comment 'area_info';

create table if not exists auth_permission
(
    id          bigint(15) auto_increment comment 'id'
        primary key,
    name        varchar(50) default '' not null comment 'name',
    code        varchar(50) default '' not null comment 'code',
    description varchar(50) default '' not null comment 'description',
    enabled     int         default -1 not null comment 'enabled'
)
    comment 'auth_permission';

create table if not exists auth_role
(
    id          bigint(15) auto_increment comment 'id'
        primary key,
    name        varchar(50) default '' not null comment 'name',
    description varchar(50) default '' not null comment 'description',
    enabled     int         default -1 not null comment 'enabled'
)
    comment 'auth_role';

create table if not exists auth_user
(
    id              bigint(15) auto_increment comment 'id'
        primary key,
    username        varchar(50) default ''                    not null comment 'username',
    password        varchar(50) default ''                    not null comment 'password',
    name            varchar(50) default ''                    null comment 'name',
    enabled         int         default -1                    not null comment 'enabled',
    last_login_time datetime    default '1000-01-01 00:00:00' null comment 'lastLoginTime',
    create_time     datetime    default '1000-01-01 00:00:00' null comment 'createTime'
)
    comment 'auth_user';

create table if not exists bill_info
(
    id               bigint(15) auto_increment comment 'id'
        primary key,
    bill_no          varchar(50)    default ''      not null comment '订单号',
    transaction_no   varchar(50)    default ''      not null comment '交易号',
    trading_platform varchar(50)    default ''      not null comment '交易平台',
    customer_id      bigint(15)     default -1      not null comment '客户ID',
    customer_no      varchar(50)    default ''      not null comment '客户编号',
    customer_name    varchar(50)    default ''      not null comment '客户姓名',
    total_price      decimal(13, 4) default -1.0000 not null comment '总价'
)
    comment 'bill_info';

create table if not exists customer_info
(
    id        bigint(15) auto_increment comment 'id'
        primary key,
    code      varchar(50) default '' not null comment 'code',
    name      varchar(50) default '' not null comment 'name',
    nick_name varchar(50) default '' not null comment 'nickName',
    type      varchar(50) default '' not null comment 'type',
    sex       int         default 0  null comment '性别（0:男，1:女）'
)
    comment 'customer_info';

create table if not exists customer_type
(
    id          bigint(15) auto_increment comment 'id'
        primary key,
    name        varchar(50) default '' not null comment 'name',
    description varchar(50) default '' not null comment 'description',
    enabled     int         default -1 not null comment 'enabled'
)
    comment 'customer_type';

create table if not exists device_info
(
    id         bigint(15) auto_increment comment 'id'
        primary key,
    code       varchar(50) default '' not null comment 'code',
    name       varchar(50) default '' not null comment 'name',
    type_id    bigint(15)  default -1 not null comment 'typeId',
    status     varchar(50) default '' not null comment 'status',
    start_time datetime               null comment '启用时间',
    end_time   datetime               null comment '停用时间'
)
    comment 'device_info';

create table if not exists flyway_schema_history
(
    installed_rank int                                 not null
        primary key,
    version        varchar(50)                         null,
    description    varchar(200)                        not null,
    type           varchar(20)                         not null,
    script         varchar(1000)                       not null,
    checksum       int                                 null,
    installed_by   varchar(100)                        not null,
    installed_on   timestamp default CURRENT_TIMESTAMP not null,
    execution_time int                                 not null,
    success        tinyint(1)                          not null
);

create index flyway_schema_history_s_idx
    on flyway_schema_history (success);

create table if not exists member_info
(
    id            bigint(15) auto_increment comment 'id'
        primary key,
    member_no     varchar(50) default '' not null comment '会员编号',
    member_name   varchar(50) default '' not null comment '会员姓名',
    customer_id   bigint(15)  default -1 not null comment '客户ID',
    customer_code varchar(50) default '' not null comment '客户编号',
    customer_name varchar(50) default '' not null comment '客户类型'
)
    comment 'member_info';

create table if not exists price_info
(
    id       bigint(15) auto_increment comment 'id'
        primary key,
    code     varchar(50)    default ''      not null comment 'code',
    type     varchar(50)    default ''      not null comment 'type',
    point    int            default -1      not null comment 'point',
    price    decimal(13, 4) default -1.0000 not null comment 'price',
    internal decimal(13, 4) default -1.0000 not null comment 'internal'
)
    comment 'price_info';

