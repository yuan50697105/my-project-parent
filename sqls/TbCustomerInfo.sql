-- auto Generated on 2020-06-29
-- DROP TABLE IF EXISTS tb_customer_info;
CREATE TABLE tb_customer_info(
	id BIGINT (15) NOT NULL AUTO_INCREMENT COMMENT 'id',
	`name` VARCHAR (50) NOT NULL COMMENT 'name',
	name_py VARCHAR (50) NOT NULL COMMENT 'namePy',
	name_py_f VARCHAR (50) NOT NULL COMMENT 'namePyF',
	phone VARCHAR (50) NOT NULL COMMENT 'phone',
	age INT (11) NOT NULL COMMENT 'age',
	INDEX(name),
	INDEX(name_py),
	INDEX(name_py_f),
	INDEX(phone),
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'tb_customer_info';
