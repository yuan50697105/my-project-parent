-- MySQL dump 10.13  Distrib 8.0.12, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: my_project
-- ------------------------------------------------------
-- Server version	8.0.12

/*!40101 SET @OLD_CHARACTER_SET_CLIENT = @@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS = @@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION = @@COLLATION_CONNECTION */;
SET NAMES utf8mb4;
/*!40103 SET @OLD_TIME_ZONE = @@TIME_ZONE */;
/*!40103 SET TIME_ZONE = '+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS = @@UNIQUE_CHECKS, UNIQUE_CHECKS = 0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS = @@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS = 0 */;
/*!40101 SET @OLD_SQL_MODE = @@SQL_MODE, SQL_MODE = 'NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES = @@SQL_NOTES, SQL_NOTES = 0 */;

--
-- Table structure for table `sys_role`
--

DROP TABLE IF EXISTS tb_sys_role;
/*!40101 SET @saved_cs_client = @@character_set_client */;
SET character_set_client = utf8mb4;
CREATE TABLE `sys_role`
(
    `id`          bigint(15)  NOT NULL AUTO_INCREMENT COMMENT 'id',
    `name`        varchar(50) NOT NULL COMMENT '角色名称',
    `description` varchar(50) DEFAULT NULL COMMENT '角色描述',
    `enabled`     varchar(50) DEFAULT 'enable' COMMENT '启用状态',
    PRIMARY KEY (`id`),
    KEY `name` (`name`),
    KEY `enabled` (`enabled`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 1276764540188626946
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci COMMENT ='sys_role';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sys_role`
--

LOCK TABLES tb_sys_role WRITE;
/*!40000 ALTER TABLE tb_sys_role
    DISABLE KEYS */;
INSERT INTO tb_sys_role (`id`, `name`, `description`, `enabled`)
VALUES (1, '管理员', NULL, NULL),
       (2, '管理员', NULL, NULL),
       (3, '管理员', NULL, NULL),
       (1276764439621799936, '管理员', NULL, NULL),
       (1276764540188626944, '管理员', NULL, NULL),
       (1276764540188626945, '管理员', NULL, NULL);
/*!40000 ALTER TABLE tb_sys_role
    ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sys_role_route`
--

DROP TABLE IF EXISTS tb_sys_role_route;
/*!40101 SET @saved_cs_client = @@character_set_client */;
SET character_set_client = utf8mb4;
CREATE TABLE `sys_role_route`
(
    `id`       bigint(20) NOT NULL AUTO_INCREMENT,
    `role_id`  bigint(20) NOT NULL,
    `route_id` bigint(20) NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci COMMENT ='角色路由表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sys_role_route`
--

LOCK TABLES tb_sys_role_route WRITE;
/*!40000 ALTER TABLE tb_sys_role_route
    DISABLE KEYS */;
/*!40000 ALTER TABLE tb_sys_role_route
    ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sys_route`
--

DROP TABLE IF EXISTS tb_sys_route;
/*!40101 SET @saved_cs_client = @@character_set_client */;
SET character_set_client = utf8mb4;
CREATE TABLE `sys_route`
(
    `id`  bigint(20) NOT NULL AUTO_INCREMENT,
    `url` varchar(1000) DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 17
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci COMMENT ='路由表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sys_route`
--

LOCK TABLES tb_sys_route WRITE;
/*!40000 ALTER TABLE tb_sys_route
    DISABLE KEYS */;
INSERT INTO tb_sys_route (`id`, `url`)
VALUES (1, 'sys/role/update'),
       (2, 'sys/role/delete{id}'),
       (3, 'sys/role/get'),
       (4, 'sys/role/list'),
       (5, 'sys/role/data'),
       (6, 'sys/role/delete'),
       (7, 'sys/role/delete'),
       (8, 'sys/role/save'),
       (9, 'sys/user/update'),
       (10, 'sys/user/delete{id}'),
       (11, 'sys/user/get'),
       (12, 'sys/user/list'),
       (13, 'sys/user/data'),
       (14, 'sys/user/delete'),
       (15, 'sys/user/delete'),
       (16, 'sys/user/save');
/*!40000 ALTER TABLE tb_sys_route
    ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sys_user`
--

DROP TABLE IF EXISTS tb_sys_user;
/*!40101 SET @saved_cs_client = @@character_set_client */;
SET character_set_client = utf8mb4;
CREATE TABLE `sys_user`
(
    `id`       bigint(15)  NOT NULL AUTO_INCREMENT COMMENT 'id',
    `username` varchar(50) NOT NULL COMMENT '用户名',
    `name`     varchar(50) NOT NULL COMMENT '姓名',
    `password` varchar(50) NOT NULL COMMENT '密码',
    `enabled`  varchar(50) DEFAULT 'enable' COMMENT '启用状态',
    PRIMARY KEY (`id`),
    UNIQUE KEY `username` (`username`),
    KEY `name` (`name`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci COMMENT ='sys_user';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sys_user`
--

LOCK TABLES tb_sys_user WRITE;
/*!40000 ALTER TABLE tb_sys_user
    DISABLE KEYS */;
/*!40000 ALTER TABLE tb_sys_user
    ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sys_user_role`
--

DROP TABLE IF EXISTS tb_sys_user_role;
/*!40101 SET @saved_cs_client = @@character_set_client */;
SET character_set_client = utf8mb4;
CREATE TABLE `sys_user_role`
(
    `user_id` bigint(20) DEFAULT NULL,
    `role_id` bigint(20) NOT NULL,
    `id`      bigint(20) NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci COMMENT ='用户角色';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sys_user_role`
--

LOCK TABLES tb_sys_user_role WRITE;
/*!40000 ALTER TABLE tb_sys_user_role
    DISABLE KEYS */;
/*!40000 ALTER TABLE tb_sys_user_role
    ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_customer_info`
--

DROP TABLE IF EXISTS `tb_customer_info`;
/*!40101 SET @saved_cs_client = @@character_set_client */;
SET character_set_client = utf8mb4;
CREATE TABLE `tb_customer_info`
(
    `id`        bigint(15)  NOT NULL AUTO_INCREMENT COMMENT 'id',
    `name`      varchar(50) NOT NULL COMMENT 'name',
    `name_py`   varchar(50) NOT NULL COMMENT 'namePy',
    `name_py_f` varchar(50) NOT NULL COMMENT 'namePyF',
    `phone`     varchar(50) NOT NULL COMMENT 'phone',
    `age`       int(11)     NOT NULL COMMENT 'age',
    PRIMARY KEY (`id`),
    KEY `name` (`name`),
    KEY `name_py` (`name_py`),
    KEY `name_py_f` (`name_py_f`),
    KEY `phone` (`phone`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci COMMENT ='tb_customer_info';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_customer_info`
--

LOCK TABLES `tb_customer_info` WRITE;
/*!40000 ALTER TABLE `tb_customer_info`
    DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_customer_info`
    ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_customer_type`
--

DROP TABLE IF EXISTS `tb_customer_type`;
/*!40101 SET @saved_cs_client = @@character_set_client */;
SET character_set_client = utf8mb4;
CREATE TABLE `tb_customer_type`
(
    `id`   bigint(20) NOT NULL AUTO_INCREMENT,
    `naem` int(11)    NOT NULL,
    PRIMARY KEY (`id`),
    UNIQUE KEY `tb_customer_type_naem_uindex` (`naem`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_customer_type`
--

LOCK TABLES `tb_customer_type` WRITE;
/*!40000 ALTER TABLE `tb_customer_type`
    DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_customer_type`
    ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE = @OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE = @OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS = @OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS = @OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT = @OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS = @OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION = @OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES = @OLD_SQL_NOTES */;

-- Dump completed on 2020-06-29 22:47:59
