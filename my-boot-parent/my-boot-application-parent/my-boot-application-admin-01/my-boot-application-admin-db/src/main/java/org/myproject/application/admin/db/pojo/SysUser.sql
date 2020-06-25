-- auto Generated on 2020-06-25
DROP TABLE IF EXISTS sys_user;
CREATE TABLE sys_user(
	id BIGINT (15) NOT NULL AUTO_INCREMENT COMMENT 'id',
	username VARCHAR (50) COMMENT '用户名',
	`name` VARCHAR (50) COMMENT '姓名',
	`password` VARCHAR (50) COMMENT '密码',
	enabled VARCHAR (50) COMMENT '启用状态',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'sys_user';
