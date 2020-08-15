create table tb_goods_type
(
    id          bigint       not null,
    name        varchar(100) null comment '类型名称',
    description varchar(500) null comment '类型描述',
    constraint tb_goods_type_id_uindex
        unique (id)
)
    comment '商品类型';

alter table tb_goods_type
    add primary key (id);

