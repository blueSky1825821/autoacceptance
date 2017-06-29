/*
Navicat MySQL Data Transfer

Source Server         : 本地
Source Server Version : 50718
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50718
File Encoding         : 65001

Date: 2017-06-28 15:53:36
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user_account
-- ----------------------------
DROP TABLE IF EXISTS `user_account`;
CREATE TABLE `user_account` (
  `id` bigint(20) NOT NULL,
  `name` varchar(16) DEFAULT NULL,
  `sex` varchar(2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



use test;
DROP TABLE IF EXISTS t_user;
create table t_user
(
 userId  int primary key auto_increment,
 userName VARCHAR(50) not null,
 userAge int not null
);
insert into t_user values(1,'小王',10);
insert into t_user values(2,'红红',11);
insert into t_user values(3,'明明',12);
insert into t_user values(4,'天天',13);