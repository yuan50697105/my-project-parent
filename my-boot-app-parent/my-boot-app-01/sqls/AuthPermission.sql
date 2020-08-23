-- auto Generated on 2020-08-23
-- DROP TABLE IF EXISTS auth_permission;
CREATE TABLE if not exists auth_permission(
  id BIGINT (15) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `name` VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'name',
  code VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'code',
  description VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'description',
  enabled INT (11) NOT NULL DEFAULT -1 COMMENT 'enabled',
  PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'auth_permission';
