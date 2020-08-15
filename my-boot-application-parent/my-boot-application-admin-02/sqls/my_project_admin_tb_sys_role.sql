create table tb_sys_role
(
    id          bigint       not null
        primary key,
    create_time datetime     null,
    update_time datetime     null,
    creater     varchar(255) null,
    modifier    varchar(255) null,
    version     int          null,
    is_delete   int          null,
    name        varchar(255) null,
    description varchar(255) null
)
    comment '角色';

