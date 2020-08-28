-- auto Generated on 2020-08-28
-- DROP TABLE IF EXISTS member_info;
CREATE TABLE member_info(
	id BIGINT (15) NOT NULL AUTO_INCREMENT COMMENT 'id',
	member_no VARCHAR (50) NOT NULL DEFAULT '' COMMENT '会员编号',
	member_name VARCHAR (50) NOT NULL DEFAULT '' COMMENT '会员姓名',
	customer_id BIGINT (15) NOT NULL DEFAULT -1 COMMENT '客户ID',
	customer_code VARCHAR (50) NOT NULL DEFAULT '' COMMENT '客户编号',
	customer_name VARCHAR (50) NOT NULL DEFAULT '' COMMENT '客户类型',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'member_info';
