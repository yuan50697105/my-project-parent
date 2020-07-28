create table tb_sys_user
(
    id          bigint                                 not null
        primary key,
    create_time datetime     default CURRENT_TIMESTAMP null,
    update_time datetime                               null,
    creater     varchar(255) default ''                null,
    modifier    varchar(255) default ''                null,
    version     int          default 0                 null,
    is_delete   int          default 0                 null,
    username    varchar(255) default ''                not null,
    name        varchar(255) default ''                not null,
    password    varchar(255)                           null,
    constraint tb_sys_user_username_uindex
        unique (username)
)
    comment '系统用户';

