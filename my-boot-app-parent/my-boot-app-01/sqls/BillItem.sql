-- auto Generated on 2020-08-30
# DROP TABLE IF EXISTS bill_item;
CREATE TABLE bill_item
(
    id          BIGINT(15)     NOT NULL AUTO_INCREMENT COMMENT 'id',
    bill_id     BIGINT(15)     NOT NULL DEFAULT -1 COMMENT 'billId',
    content     VARCHAR(50)    NOT NULL DEFAULT '' COMMENT 'content',
    `name`      VARCHAR(50)    NOT NULL DEFAULT '' COMMENT 'name',
    quantity    INT(11)        NOT NULL DEFAULT -1 COMMENT 'quantity',
    unit        INT(11)        NOT NULL DEFAULT -1 COMMENT 'unit',
    unit_price  DECIMAL(13, 4) NOT NULL DEFAULT -1 COMMENT 'unitPrice',
    total_price DECIMAL(13, 4) NOT NULL DEFAULT -1 COMMENT 'totalPrice',
    PRIMARY KEY (id)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4 COMMENT 'bill_item';
