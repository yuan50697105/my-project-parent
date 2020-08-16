create table tb_sys_role_route
(
    id       bigint auto_increment
        primary key,
    role_id  bigint not null,
    route_id bigint not null
)
    comment '角色路由表';

