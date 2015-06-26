/*
Navicat MySQL Data Transfer

Source Server         : maridb_localhost
Source Server Version : 50505
Source Host           : localhost:3307
Source Database       : mydb

Target Server Type    : MYSQL
Target Server Version : 50505
File Encoding         : 65001

Date: 2015-06-26 11:29:52
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `hello`
-- ----------------------------
DROP TABLE IF EXISTS `hello`;
CREATE TABLE `hello` (
  `id` bigint(20) NOT NULL DEFAULT '0',
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of hello
-- ----------------------------
INSERT INTO `hello` VALUES ('1', 'xiaoming');
INSERT INTO `hello` VALUES ('2', 'xiaofang');
INSERT INTO `hello` VALUES ('3', 'xiaoli');
INSERT INTO `hello` VALUES ('4', 'xiaowang');
