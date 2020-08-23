-- auto Generated on 2020-08-23
-- DROP TABLE IF EXISTS area_address;
CREATE TABLE if not exists area_address
(
    id      BIGINT(15)  NOT NULL AUTO_INCREMENT COMMENT 'id',
    area_id BIGINT(15)  NOT NULL DEFAULT -1 COMMENT 'areaId',
    address VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'address',
    PRIMARY KEY (id)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4 COMMENT 'area_address';
