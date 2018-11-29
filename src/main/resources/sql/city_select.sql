/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50547
Source Host           : localhost:3306
Source Database       : lzcf_hx

Target Server Type    : MYSQL
Target Server Version : 50547
File Encoding         : 65001

Date: 2018-10-12 15:08:19
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for city_select
-- ----------------------------
DROP TABLE IF EXISTS `city_select`;
CREATE TABLE `city_select` (
  `id` varchar(32) NOT NULL,
  `city` varchar(30) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of city_select
-- ----------------------------
INSERT INTO `city_select` VALUES ('11', '北京市');
INSERT INTO `city_select` VALUES ('12', '天津市');
INSERT INTO `city_select` VALUES ('13', '河北省');
INSERT INTO `city_select` VALUES ('14', '山西省');
INSERT INTO `city_select` VALUES ('15', '内蒙古自治区');
INSERT INTO `city_select` VALUES ('21', '辽宁省');
INSERT INTO `city_select` VALUES ('22', '吉林省');
INSERT INTO `city_select` VALUES ('23', '黑龙江省');
INSERT INTO `city_select` VALUES ('31', '上海市');
INSERT INTO `city_select` VALUES ('32', '江苏省');
INSERT INTO `city_select` VALUES ('33', '浙江省');
INSERT INTO `city_select` VALUES ('34', '安徽省');
INSERT INTO `city_select` VALUES ('35', '福建省');
INSERT INTO `city_select` VALUES ('36', '江西省');
INSERT INTO `city_select` VALUES ('37', '山东省');
INSERT INTO `city_select` VALUES ('41', '河南省');
INSERT INTO `city_select` VALUES ('42', '湖北省');
INSERT INTO `city_select` VALUES ('43', '湖南省');
INSERT INTO `city_select` VALUES ('44', '广东省');
INSERT INTO `city_select` VALUES ('45', '广西壮族自治区');
INSERT INTO `city_select` VALUES ('46', '海南省');
INSERT INTO `city_select` VALUES ('50', '重庆市');
INSERT INTO `city_select` VALUES ('51', '四川省');
INSERT INTO `city_select` VALUES ('52', '贵州省');
INSERT INTO `city_select` VALUES ('53', '云南省');
INSERT INTO `city_select` VALUES ('54', '西藏自治区');
INSERT INTO `city_select` VALUES ('61', '陕西省');
INSERT INTO `city_select` VALUES ('62', '甘肃省');
INSERT INTO `city_select` VALUES ('63', '青海省');
INSERT INTO `city_select` VALUES ('64', '宁夏回族自治区');
INSERT INTO `city_select` VALUES ('65', '新疆维吾尔自治区');
INSERT INTO `city_select` VALUES ('71', '台湾省');
INSERT INTO `city_select` VALUES ('81', '香港特别行政区');
INSERT INTO `city_select` VALUES ('82', '澳门特别行政区');
INSERT INTO `city_select` VALUES ('91', '国外');
