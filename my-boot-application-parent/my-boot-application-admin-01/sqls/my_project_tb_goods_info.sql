create table tb_goods_info
(
    id      bigint auto_increment
        primary key,
    code    bigint         null,
    name    varchar(255)   null,
    price   decimal(10, 2) null,
    type_id bigint         not null,
    constraint tb_goods_info_code_uindex
        unique (code)
);

