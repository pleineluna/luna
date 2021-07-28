/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80021
 Source Host           : localhost:3306
 Source Schema         : auth_test

 Target Server Type    : MySQL
 Target Server Version : 80021
 File Encoding         : 65001

 Date: 27/07/2021 14:09:42
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for um_t_role
-- ----------------------------
DROP TABLE IF EXISTS `um_t_role`;
CREATE TABLE `um_t_role`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `description` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `created_time` bigint(0) NOT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `role` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of um_t_role
-- ----------------------------
INSERT INTO `um_t_role` VALUES (1, '管理员拥有所有接口操作权限', 1627199362, '管理员', 'ADMIN');
INSERT INTO `um_t_role` VALUES (2, '普通拥有查看用户列表与修改密码权限，不具备对用户增删改权限', 1627199362, '普通用户', 'USER');

-- ----------------------------
-- Table structure for um_t_role_user
-- ----------------------------
DROP TABLE IF EXISTS `um_t_role_user`;
CREATE TABLE `um_t_role_user`  (
  `role_id` int(0) NULL DEFAULT NULL,
  `user_id` int(0) NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of um_t_role_user
-- ----------------------------
INSERT INTO `um_t_role_user` VALUES (1, 1);

-- ----------------------------
-- Table structure for um_t_user
-- ----------------------------
DROP TABLE IF EXISTS `um_t_user`;
CREATE TABLE `um_t_user`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `account` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `description` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of um_t_user
-- ----------------------------
INSERT INTO `um_t_user` VALUES (1, 'admin', '系统默认管理员', '$2a$10$N97RyMYeQ7aVTxLvdxq5NeBivdbj/u2GQtHERISUt8qhKBfnjSC1q', 'admin');
INSERT INTO `um_t_user` VALUES (2, 'user', '普通用户', '$2a$10$N97RyMYeQ7aVTxLvdxq5NeBivdbj/u2GQtHERISUt8qhKBfnjSC1q', 'user');
INSERT INTO `um_t_user` VALUES (3, 'user', 'test user', '$2a$10$N97RyMYeQ7aVTxLvdxq5NeBivdbj/u2GQtHERISUt8qhKBfnjSC1q', 'Jacks');

SET FOREIGN_KEY_CHECKS = 1;
