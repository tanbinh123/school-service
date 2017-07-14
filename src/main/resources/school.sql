/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : school

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2017-07-14 09:04:55
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `classes`
-- ----------------------------
DROP TABLE IF EXISTS `classes`;
CREATE TABLE `classes` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `class_no` varchar(100) DEFAULT NULL,
  `class_name` varchar(100) DEFAULT NULL,
  `master_name` varchar(100) DEFAULT NULL,
  `message` varchar(255) DEFAULT NULL,
  `gradge` varchar(100) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=872987950718824449 DEFAULT CHARSET=utf8 COMMENT='班级表';

-- ----------------------------
-- Records of classes
-- ----------------------------
INSERT INTO `classes` VALUES ('1', '33333', '英才班', 'Davis', '少壮不努力老大徒伤悲', '高三（一班）', '2017-06-08 08:50:53');
INSERT INTO `classes` VALUES ('2', '1102', '尖子班', 'Davis', '高考冲刺', '高三（三班）', '2017-06-08 08:50:56');
INSERT INTO `classes` VALUES ('5', '1105', '43343', '343434', '43434', '434343', null);
INSERT INTO `classes` VALUES ('7', '33333', 'f', 'ffffff', 'fffffff', 'f', null);
INSERT INTO `classes` VALUES ('8', '1008', '43434', '34343', '434343', '4343', null);
INSERT INTO `classes` VALUES ('9', '1009', '43434', '45454545454', '43434354', '343435454', null);
INSERT INTO `classes` VALUES ('10', '1200', 'ffffff', 'fffffffffff', 'ffffffffff', 'fffffffff', null);
INSERT INTO `classes` VALUES ('11', '1242', '4665', '67676767', '6876767', '76767', null);
INSERT INTO `classes` VALUES ('14', '1115', '7777', 'Davis', '我们一起放飞吧', '高一（七班）', '2017-06-08 15:15:48');
INSERT INTO `classes` VALUES ('15', '1115', '6666', 'Davis', '啦啦啦，快要放假了', '初中（一班）', '2017-06-08 15:15:48');
INSERT INTO `classes` VALUES ('872740337603977216', 'beac', '555', '555', '55', '555', null);
INSERT INTO `classes` VALUES ('872740398664654848', 'd5aa', '7777777777777777', '77777777777', '77777777777', '7777777777', null);
INSERT INTO `classes` VALUES ('872740552327176192', '5b17', '655757', '7576575', '7657575', '56756756', null);
INSERT INTO `classes` VALUES ('872987950718824448', '263b', '54叶儿太阳', '特特', '同仁堂', '太热太热', null);

-- ----------------------------
-- Table structure for `student`
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `classes_id` bigint(20) NOT NULL,
  `student_name` varchar(100) DEFAULT NULL,
  `student_no` varchar(100) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('2', '1', '小艾', '211856', '2017-06-08 08:53:38');
INSERT INTO `student` VALUES ('3', '2', '小华', '211849', '2017-06-08 08:53:56');
INSERT INTO `student` VALUES ('5', '14', '小艾', '556a', '2017-06-08 18:26:20');
INSERT INTO `student` VALUES ('6', '15', '小艾', 'b545', '2017-06-08 18:26:29');
INSERT INTO `student` VALUES ('7', '14', '放飞', '5475', '2017-06-08 19:12:47');
INSERT INTO `student` VALUES ('8', '14', '人体一天一天也不', '8e30', '2017-06-09 09:23:17');
