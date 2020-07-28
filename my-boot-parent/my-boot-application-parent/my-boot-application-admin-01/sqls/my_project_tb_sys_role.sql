create table tb_sys_role
(
    id          bigint(15) auto_increment comment 'id'
        primary key,
    name        varchar(50)                  not null comment '角色名称',
    description varchar(50)                  null comment '角色描述',
    enabled     varchar(50) default 'enable' null comment '启用状态'
)
    comment 'sys_role';

create index enabled
    on tb_sys_role (enabled);

create index name
    on tb_sys_role (name);

INSERT INTO my_project.tb_sys_role (id, name, description, enabled)
VALUES (1, '管理员', null, null);
INSERT INTO my_project.tb_sys_role (id, name, description, enabled)
VALUES (2, '管理员', null, null);
INSERT INTO my_project.tb_sys_role (id, name, description, enabled)
VALUES (3, '管理员', null, null);
INSERT INTO my_project.tb_sys_role (id, name, description, enabled)
VALUES (1276764439621799936, '管理员', null, null);
INSERT INTO my_project.tb_sys_role (id, name, description, enabled)
VALUES (1276764540188626944, '管理员', null, null);
INSERT INTO my_project.tb_sys_role (id, name, description, enabled)
VALUES (1276764540188626945, '管理员', null, null);