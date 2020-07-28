create table tb_sys_log
(
    id     bigint auto_increment
        primary key,
    url    varchar(500) null,
    method varchar(20)  null,
    params varchar(255) null
);

