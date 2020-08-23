-- auto Generated on 2020-08-23
-- DROP TABLE IF EXISTS customer_info;
CREATE TABLE if not exists customer_info(
  id BIGINT (15) NOT NULL AUTO_INCREMENT COMMENT 'id',
  code VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'code',
  `name` VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'name',
  nick_name VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'nickName',
  `type` VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'type',
  PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'customer_info';
