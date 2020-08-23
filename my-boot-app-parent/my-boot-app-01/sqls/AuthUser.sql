-- auto Generated on 2020-08-23
DROP TABLE IF EXISTS auth_user;
CREATE TABLE auth_user
(
    id         BIGINT(15)  NOT NULL AUTO_INCREMENT COMMENT 'id',
    username   VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'username',
    `password` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'password',
    `name`     VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'name',
    enabled    INT(11)     NOT NULL DEFAULT 1 COMMENT 'enabled',
    PRIMARY KEY (id)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4 COMMENT 'auth_user';
