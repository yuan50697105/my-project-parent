create schema if not exists my_project;
use my_project;
create table if not exists sys_role
(
    id          bigint(15) auto_increment comment 'id'
        primary key,
    name        varchar(50)                  not null comment '角色名称',
    description varchar(50)                  null comment '角色描述',
    enabled     varchar(50) default 'enable' null comment '启用状态'
)
    comment 'sys_role';

create index enabled
    on sys_role (enabled);

create index name
    on sys_role (name);

create table if not exists sys_user
(
    id       bigint(15) auto_increment comment 'id'
        primary key,
    username varchar(50)                  not null comment '用户名',
    name     varchar(50)                  not null comment '姓名',
    password varchar(50)                  not null comment '密码',
    enabled  varchar(50) default 'enable' null comment '启用状态',
    constraint username
        unique (username)
)
    comment 'sys_user';

create index name
    on sys_user (name);

create table if not exists sys_user_role
(
    user_id bigint null,
    role_id bigint not null,
    id      bigint not null
        primary key
)
    comment '用户角色';

