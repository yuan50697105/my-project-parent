create table tb_sys_user_role
(
    id          bigint       null,
    create_time datetime     null,
    update_time datetime     null,
    creater     varchar(255) null,
    modifier    varchar(255) null,
    version     int          null,
    is_delete   int          null,
    user_id     bigint       null,
    role_id     bigint       null
)
    comment '系统用户';

