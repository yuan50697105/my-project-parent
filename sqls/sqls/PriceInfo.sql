-- auto Generated on 2020-08-27
-- DROP TABLE IF EXISTS price_info;
CREATE TABLE if not exists price_info
(
    id       BIGINT(15)     NOT NULL AUTO_INCREMENT COMMENT 'id',
    code     VARCHAR(50)    NOT NULL DEFAULT '' COMMENT 'code',
    `type`   VARCHAR(50)    NOT NULL DEFAULT '' COMMENT 'type',
    point    INT(11)        NOT NULL DEFAULT -1 COMMENT 'point',
    price    DECIMAL(13, 4) NOT NULL DEFAULT -1 COMMENT 'price',
    internal DECIMAL(13, 4) NOT NULL DEFAULT -1 COMMENT 'internal',
    PRIMARY KEY (id)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4 COMMENT 'price_info';
