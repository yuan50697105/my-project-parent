-- auto Generated on 2020-08-23
-- DROP TABLE IF EXISTS area_info;
CREATE TABLE if not exists area_info
(
    id     BIGINT(15)  NOT NULL AUTO_INCREMENT COMMENT 'id',
    code   VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'code',
    pid    VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'pid',
    `name` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'name',
    PRIMARY KEY (id)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4 COMMENT 'area_info';
