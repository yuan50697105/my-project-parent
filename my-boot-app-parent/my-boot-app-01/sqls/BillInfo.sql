-- auto Generated on 2020-08-28
-- DROP TABLE IF EXISTS bill_info;
CREATE TABLE bill_info(
	id BIGINT (15) NOT NULL AUTO_INCREMENT COMMENT 'id',
	bill_no VARCHAR (50) NOT NULL DEFAULT '' COMMENT '订单号',
	transaction_no VARCHAR (50) NOT NULL DEFAULT '' COMMENT '交易号',
	trading_platform VARCHAR (50) NOT NULL DEFAULT '' COMMENT '交易平台',
	customer_id BIGINT (15) NOT NULL DEFAULT -1 COMMENT '客户ID',
	customer_no VARCHAR (50) NOT NULL DEFAULT '' COMMENT '客户编号',
	customer_name VARCHAR (50) NOT NULL DEFAULT '' COMMENT '客户姓名',
	total_price DECIMAL (13,4) NOT NULL DEFAULT -1 COMMENT '总价',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'bill_info';
