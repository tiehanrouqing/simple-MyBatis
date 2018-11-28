/*
Navicat MySQL Data Transfer
Source Server         : abc
Source Server Version : 50724
Source Host           : localhost:3306
Source Database       : spring_boot
Target Server Type    : MYSQL
Target Server Version : 50724
File Encoding         : 65001
Date: 2018-11-27 21:48:43
*/
DROP DATABASE IF EXISTS spring_boot;

CREATE DATABASE spring_boot;

USE spring_boot;
SET FOREIGN_KEY_CHECKS=0;
 
-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `age` int(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
 
-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'summer', '12');
INSERT INTO `user` VALUES ('2', 'xiatian', '13');
