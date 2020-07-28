create table tb_sys_user
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
    on tb_sys_user (name);

INSERT INTO my_project.tb_sys_user (id, username, name, password, enabled)
VALUES (487712524263751681, 'aa', 'aa', 'aa', 'aaa');