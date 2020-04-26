-- 创建数据库
DROP DATABASE IF EXISTS MICROSERVICE;
CREATE database MICROSERVICE;
USE MICROSERVICE;

-- 创建表
DROP TABLE IF EXISTS APP_BOOK;
CREATE TABLE APP_BOOK (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `author` varchar(255) DEFAULT NULL COMMENT '书籍作者',
  `name` varchar(255) DEFAULT NULL COMMENT '书籍名称',
  `price` float DEFAULT 0 COMMENT '书籍价格',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `description` varchar(255) DEFAULT NULL COMMENT '书籍描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;