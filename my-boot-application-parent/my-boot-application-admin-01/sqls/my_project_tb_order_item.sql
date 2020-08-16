create table tb_order_item
(
    id                 bigint auto_increment
        primary key,
    order_id           bigint                      not null,
    order_no           int                         not null,
    goods_id           bigint                      not null,
    goods_code         varchar(32)                 not null,
    goods_name         varchar(32)                 null,
    goods_single_price decimal(10, 2) default 0.00 null,
    goods_num          int            default 1    null,
    goods_total_price  decimal(10, 2) default 0.00 null
)
    comment '订单项目';

