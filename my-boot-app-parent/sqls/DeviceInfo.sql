-- auto Generated on 2020-08-25
-- DROP TABLE IF EXISTS device_info;
CREATE TABLE if not exists device_info
(
    id       BIGINT(15)  NOT NULL AUTO_INCREMENT COMMENT 'id',
    code     VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'code',
    `name`   VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'name',
    type_id  BIGINT(15)  NOT NULL DEFAULT -1 COMMENT 'typeId',
    `status` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'status',
    PRIMARY KEY (id)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4 COMMENT 'device_info';
