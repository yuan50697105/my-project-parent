create table tb_customer_log
(
    id            bigint auto_increment
        primary key,
    customer_id   bigint       not null,
    customer_name varchar(255) not null,
    content       varchar(500) not null
);

