create table tb_order_info
(
    id            bigint auto_increment
        primary key,
    order_no      varchar(32)                 null,
    customer_id   bigint                      not null,
    customer_name int                         not null,
    total_price   decimal(10, 2) default 0.00 null,
    constraint tb_order_info_order_no_uindex
        unique (order_no)
)
    comment '订单类型';

