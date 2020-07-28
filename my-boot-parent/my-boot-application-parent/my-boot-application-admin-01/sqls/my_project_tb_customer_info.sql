create table tb_customer_info
(
    id        bigint(15) auto_increment comment 'id'
        primary key,
    name      varchar(50) not null comment 'name',
    name_py   varchar(50) not null comment 'namePy',
    name_py_f varchar(50) not null comment 'namePyF',
    phone     varchar(50) not null comment 'phone',
    age       int         not null comment 'age',
    type_id   bigint      not null
)
    comment 'tb_customer_info';

create index name
    on tb_customer_info (name);

create index name_py
    on tb_customer_info (name_py);

create index name_py_f
    on tb_customer_info (name_py_f);

create index phone
    on tb_customer_info (phone);

