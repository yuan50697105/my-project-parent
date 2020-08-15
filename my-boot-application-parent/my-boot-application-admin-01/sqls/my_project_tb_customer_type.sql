create table tb_customer_type
(
    id   bigint auto_increment
        primary key,
    name int not null,
    constraint tb_customer_type_naem_uindex
        unique (name)
);

