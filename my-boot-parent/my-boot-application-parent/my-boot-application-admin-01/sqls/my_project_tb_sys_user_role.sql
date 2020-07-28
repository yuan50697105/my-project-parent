create table tb_sys_user_role
(
    user_id bigint null,
    role_id bigint not null,
    id      bigint not null
        primary key
)
    comment '用户角色';

