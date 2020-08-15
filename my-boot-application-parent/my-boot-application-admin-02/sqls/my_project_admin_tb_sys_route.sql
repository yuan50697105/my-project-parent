create table tb_sys_route
(
    id          bigint        null,
    create_time datetime      null,
    update_time datetime      null,
    creater     varchar(255)  null,
    modifier    varchar(255)  null,
    version     int           null,
    is_delete   int           null,
    name        varchar(255)  null,
    url         varchar(1000) null,
    role_id     bigint        null
)
    comment '角色';

