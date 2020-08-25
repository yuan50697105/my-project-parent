-- auto Generated on 2020-08-23
# DROP TABLE IF EXISTS auth_user;
CREATE TABLE if not exists auth_user
(
    id         BIGINT(15)  NOT NULL AUTO_INCREMENT COMMENT 'id',
    username   VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'username',
    `password` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'password',
    `name`     VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'name',
    enabled    INT(11)     NOT NULL DEFAULT 1 COMMENT 'enabled',
    PRIMARY KEY (id)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4 COMMENT 'auth_user';
-- auto Generated on 2020-08-23
# DROP TABLE IF EXISTS auth_role;
CREATE TABLE if not exists auth_role
(
    id          BIGINT(15)  NOT NULL AUTO_INCREMENT COMMENT 'id',
    `name`      VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'name',
    description VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'description',
    enabled     INT(11)     NOT NULL DEFAULT -1 COMMENT 'enabled',
    PRIMARY KEY (id)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4 COMMENT 'auth_role';
-- auto Generated on 2020-08-23
-- DROP TABLE IF EXISTS auth_permission;
CREATE TABLE if not exists auth_permission
(
    id          BIGINT(15)  NOT NULL AUTO_INCREMENT COMMENT 'id',
    `name`      VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'name',
    code        VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'code',
    description VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'description',
    enabled     INT(11)     NOT NULL DEFAULT -1 COMMENT 'enabled',
    PRIMARY KEY (id)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4 COMMENT 'auth_permission';
alter table auth_user add column last_login_time datetime default now();
alter table auth_user
    add create_time datetime default now() null;

