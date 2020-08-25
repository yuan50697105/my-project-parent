create schema if not exists my_project collate utf8mb4_0900_ai_ci;

create table if not exists area_address
(
    id bigint(15) auto_increment comment 'id'
        primary key,
    area_id bigint(15) default -1 not null comment 'areaId',
    address varchar(50) default '' not null comment 'address'
)
    comment 'area_address';

create table if not exists area_info
(
    id bigint(15) auto_increment comment 'id'
        primary key,
    code varchar(50) default '' not null comment 'code',
    pid varchar(50) default '' not null comment 'pid',
    name varchar(50) default '' not null comment 'name'
)
    comment 'area_info';

create table if not exists auth_permission
(
    id bigint(15) auto_increment comment 'id'
        primary key,
    name varchar(50) default '' not null comment 'name',
    code varchar(50) default '' not null comment 'code',
    description varchar(50) default '' not null comment 'description',
    enabled int default -1 not null comment 'enabled'
)
    comment 'auth_permission';

create table if not exists auth_role
(
    id bigint(15) auto_increment comment 'id'
        primary key,
    name varchar(50) default '' not null comment 'name',
    description varchar(50) default '' not null comment 'description',
    enabled int default -1 not null comment 'enabled'
)
    comment 'auth_role';

create table if not exists auth_user
(
    id bigint(15) auto_increment comment 'id'
        primary key,
    username varchar(50) default '' not null comment 'username',
    password varchar(50) default '' not null comment 'password',
    name varchar(50) default '' not null comment 'name',
    enabled int default -1 not null comment 'enabled',
    last_login_time datetime default '1000-01-01 00:00:00' not null comment 'lastLoginTime',
    create_time datetime default '1000-01-01 00:00:00' not null comment 'createTime'
)
    comment 'auth_user';

create table if not exists customer_info
(
    id bigint(15) auto_increment comment 'id'
        primary key,
    code varchar(50) default '' not null comment 'code',
    name varchar(50) default '' not null comment 'name',
    nick_name varchar(50) default '' not null comment 'nickName',
    type varchar(50) default '' not null comment 'type'
)
    comment 'customer_info';

create table if not exists customer_type
(
    id bigint(15) auto_increment comment 'id'
        primary key,
    name varchar(50) default '' not null comment 'name',
    description varchar(50) default '' not null comment 'description',
    enabled int default -1 not null comment 'enabled'
)
    comment 'customer_type';

create table if not exists device_info
(
    id bigint(15) auto_increment comment 'id'
        primary key,
    code varchar(50) default '' not null comment 'code',
    name varchar(50) default '' not null comment 'name',
    type_id bigint(15) default -1 not null comment 'typeId',
    status varchar(50) default '' not null comment 'status'
)
    comment 'device_info';


