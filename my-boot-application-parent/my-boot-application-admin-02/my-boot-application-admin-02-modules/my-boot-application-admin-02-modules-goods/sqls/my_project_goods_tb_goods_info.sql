create table tb_goods_info
(
    id          bigint       not null,
    name        varchar(100) null,
    description varchar(500) null,
    constraint tb_goods_info_id_uindex
        unique (id)
)
    comment '商品类型';

alter table tb_goods_info
    add primary key (id);

