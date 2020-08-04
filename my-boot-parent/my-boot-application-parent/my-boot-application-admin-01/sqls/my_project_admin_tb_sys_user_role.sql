create table tb_sys_user_role
(
    id          bigint       not null
        primary key,
    create_time datetime     null,
    update_time datetime     null,
    creater     varchar(255) null,
    modifier    varchar(255) null,
    version     int          null,
    is_delete   int          null,
    user_id     bigint       not null,
    role_id     bigint       not null
)
    comment '系统用户';

