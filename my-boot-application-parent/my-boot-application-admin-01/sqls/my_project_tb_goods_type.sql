create table tb_goods_type
(
    id   bigint auto_increment
        primary key,
    name varchar(255) not null,
    constraint tb_goods_type_name_uindex
        unique (name)
);

