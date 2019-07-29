-- ----------------------------
-- Table structure for index
-- ----------------------------

DROP TABLE IF EXISTS index_intro;
CREATE TABLE index_intro(
  id int(11) NOT NULL AUTO_INCREMENT COMMENT 'id主键',
  day_heat_sum INT (10) NOT NULL COMMENT '过去24小时舆论场整体热度值',
	day_heat_level varchar (5) NOT NULL COMMENT '过去24小时舆论场整体热度等级 0=低 1=中等 2=高 3=超低 4=超高',
	day_heat_avg int(10) NOT NULL COMMENT '当日/时热度均值',
	day_heat_start VARCHAR (10) NOT NULL COMMENT '统计启动时间',
	day_heat_end VARCHAR (10) NOT NULL COMMENT '统计终止时间',
  create_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '添加时间',
	creator VARCHAR (10) NOT NULL COMMENT '创建者',
  update_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '修改时间',
	updater VARCHAR (10) NOT NULL COMMENT '编辑者',
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS index_stats;
CREATE TABLE index_stats(
  id int(11) NOT NULL AUTO_INCREMENT COMMENT 'id主键',
	event_id varchar(50) NOT NULL COMMENT '事件ID',
  title VARCHAR(50) NOT NULL COMMENT '事件标题',
	img VARCHAR(150) COMMENT '图片名',
	first_type VARCHAR(10) COMMENT '事件主类型',
	rank_time VARCHAR(20) COMMENT '统计发生日期/小时',
	sum_heat int(10) COMMENT '当日/时热度总量',
	heat_exponent int(10) NOT NULL COMMENT '事件热度值',
	pro decimal(10,2) NOT NULL COMMENT '事件热度占比',
	last_rank int(5) NOT NULL COMMENT '上一小时排名',
    current_rank int(5) NOT NULL COMMENT '当前排名',
	is_day TINYINT(2) NOT NULL DEFAULT 1 COMMENT '0=小时 1=天',
	is_valid TINYINT(2) NOT NULL DEFAULT 1 COMMENT '0=过期数据 1=正式数据',
  create_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '添加时间',
	creator VARCHAR (10) NOT NULL COMMENT '创建者',
  update_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '修改时间',
	updater VARCHAR (10) NOT NULL COMMENT '编辑者',
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS index_month_event_detail;
CREATE TABLE index_month_event_detail(
  id int(11) NOT NULL AUTO_INCREMENT COMMENT 'id主键',
	event_id varchar(50) NOT NULL COMMENT '事件ID',
  title VARCHAR(40) NOT NULL COMMENT '事件标题',
	first_type VARCHAR(20) COMMENT '事件主类型',
	inf decimal(10,2) NOT NULL COMMENT '综合影响力',
	type_pro decimal(10,2) NOT NULL COMMENT '比同类型事件影响力高%',
	all_pro decimal(10,2) NOT NULL COMMENT '比全部事件影响力高%',
	seven_day_inf int(10) NOT NULL COMMENT '近7天趋势影响力值',
	seven_day_time VARCHAR(20) COMMENT '近7天趋势影响力值对应日期',
	seven_day_start VARCHAR(20) COMMENT '事件起始日期',
  create_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '添加时间',
	creator VARCHAR (10) NOT NULL COMMENT '创建者',
  update_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '修改时间',
	updater VARCHAR (10) NOT NULL COMMENT '编辑者',
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS index_month_event_all;
CREATE TABLE index_month_event_all(
  id int(11) NOT NULL AUTO_INCREMENT COMMENT 'id主键',
	event_id varchar(50) NOT NULL COMMENT '事件ID',
  title VARCHAR(50) NOT NULL COMMENT '事件标题',
	img VARCHAR(150) COMMENT '图片名',
	first_type VARCHAR(20) NOT NULL COMMENT '事件主类型',
	start_time varchar(30) NOT NULL COMMENT '事件开始时间',
	inf_exponent decimal(10,2) NOT NULL COMMENT '事件综合影响力指数',
	tags VARCHAR(50) COMMENT '事件标签(用分号;分隔)',
  create_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '添加时间',
	creator VARCHAR (10) NOT NULL COMMENT '创建者',
  update_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '修改时间',
	updater VARCHAR (10) NOT NULL COMMENT '编辑者',
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for index
-- ----------------------------

DROP TABLE IF EXISTS search_navbar;
CREATE TABLE search_navbar(
  id int(11) NOT NULL AUTO_INCREMENT COMMENT 'id主键',
	event_id varchar(50) NOT NULL COMMENT '事件ID',
  title VARCHAR(50) NOT NULL COMMENT '事件标题',
	img_url VARCHAR(150) COMMENT '图片名URL',
	first_type VARCHAR(10) NOT NULL COMMENT '事件主类型',
	inf_exponent decimal(10,2) NOT NULL COMMENT '事件综合影响力指数',
	media VARCHAR(100) COMMENT '参与媒体',
  create_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '添加时间',
	creator VARCHAR (10) NOT NULL COMMENT '创建者',
  update_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '修改时间',
	updater VARCHAR (10) NOT NULL COMMENT '编辑者',
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS search_result;
CREATE TABLE search_result(
  id int(11) NOT NULL AUTO_INCREMENT COMMENT 'id主键',
	event_id varchar(50) NOT NULL COMMENT '事件ID',
  title VARCHAR(50) NOT NULL COMMENT '事件标题',
	img_url VARCHAR(150) COMMENT '图片名URL',
	first_type VARCHAR(10) NOT NULL COMMENT '事件主类型',
	inf_exponent decimal(10,2) NOT NULL COMMENT '事件综合影响力指数',
	media VARCHAR(100) COMMENT '参与媒体',
	tags VARCHAR(50) COMMENT '事件标签',
	start_time VARCHAR(50) COMMENT '事件起始日期',
	media VARCHAR(100) COMMENT '参与媒体',
	descript VARCHAR(150) COMMENT '事件概述',
  create_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '添加时间',
	creator VARCHAR (10) NOT NULL COMMENT '创建者',
  update_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '修改时间',
	updater VARCHAR (10) NOT NULL COMMENT '编辑者',
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


-- ----------------------------
-- Table structure for event_heat_ratio
-- ----------------------------
DROP TABLE IF EXISTS `event_heat_ratio`;
CREATE TABLE `event_heat_ratio`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `event_id` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '事件id',
  `heat_type` tinyint(2) NOT NULL COMMENT '热度类型，0-每天热度，1-小时热度',
  `time_point` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '热度时间节点',
  `heat_value` decimal(10, 2) NOT NULL COMMENT '热度值',
  `point` int(3) NOT NULL COMMENT '热度排名',
  `pro` decimal(10, 2) NOT NULL COMMENT '热度占比',
  `create_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '添加时间',
  `creator` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '添加人',
  `update_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '修改时间',
  `updater` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '修改人',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 682 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '事件热度表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for event_history_top
-- ----------------------------
DROP TABLE IF EXISTS `event_history_top`;
CREATE TABLE `event_history_top`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `event_id` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '事件id',
  `top_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '榜单名称',
  `history_rank` int(3) NOT NULL COMMENT '榜单排名',
  `create_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '添加时间',
  `creator` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '添加人',
  `update_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '修改时间',
  `updater` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '修改人',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '事件历史成就表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for event_indicator
-- ----------------------------
DROP TABLE IF EXISTS `event_indicator`;
CREATE TABLE `event_indicator`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `event_id` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '事件id',
  `avg_vel` decimal(10, 2) NOT NULL COMMENT '平均传播速度',
  `is_end` tinyint(2) NOT NULL COMMENT '0-未结束，1-已结束',
  `max_vel` int(5) NOT NULL COMMENT '峰值传播速度',
  `continued_time` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '事件持续时间',
  `near_hot_inf` decimal(10, 2) NOT NULL COMMENT '当前事件热度值',
  `create_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '添加时间',
  `creator` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '添加人',
  `update_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '修改时间',
  `updater` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '修改人',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '事件指标表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for event_info
-- ----------------------------
DROP TABLE IF EXISTS `event_info`;
CREATE TABLE `event_info`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id主键',
  `event_id` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '事件ID',
  `title` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '事件标题',
  `description` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '事件描述',
  `first_type` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '事件主类型',
  `start_time` timestamp(0) NOT NULL COMMENT '事件开始时间',
  `tags` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '事件标签(用分号;分隔)',
  `img_url` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '关联事件图片url',
  `is_end` tinyint(2) NOT NULL DEFAULT 1 COMMENT '0=事件未结束 1=已结束',
  `create_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '添加时间',
  `creator` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '创建者',
  `update_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '修改时间',
  `updater` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '编辑者',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 59 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for event_meanwhile_case
-- ----------------------------
DROP TABLE IF EXISTS `event_meanwhile_case`;
CREATE TABLE `event_meanwhile_case`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `event_id` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '事件id',
  `relavent_event_id` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '传播趋势同期事件id',
  `create_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '添加时间',
  `creator` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '添加人',
  `update_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '修改时间',
  `updater` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '修改人',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 44 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '同期事件关系表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for event_relavent_case
-- ----------------------------
DROP TABLE IF EXISTS `event_relavent_case`;
CREATE TABLE `event_relavent_case`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `event_id` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '事件id',
  `relavent_type` tinyint(2) NOT NULL COMMENT '关联类型，0-同类，1-相关',
  `relavent_event_id` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '关联事件id',
  `point` int(1) NULL DEFAULT NULL COMMENT '关联事件显示顺序',
  `title` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '关联事件标题',
  `info_exponent` decimal(10, 2) NULL DEFAULT NULL COMMENT '影响力指数',
  `img_url` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '关联事件图片url',
  `create_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `creator` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `update_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0),
  `updater` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 70 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '事件相关表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for event_stats
-- ----------------------------
DROP TABLE IF EXISTS `event_stats`;
CREATE TABLE `event_stats`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `event_id` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '事件id',
  `effect_inf` decimal(10, 2) NOT NULL COMMENT '事件影响力指数',
  `effect_type_pro` decimal(10, 2) NOT NULL COMMENT '高于同类事件影响力占比',
  `effect_all_pro` decimal(10, 2) NOT NULL COMMENT '高于全部事件影响力占比',
  `effect_class_avg` decimal(10, 2) NOT NULL COMMENT '同类事件影响力均值',
  `weibo_inf` decimal(10, 2) NOT NULL COMMENT '微博影响力指数',
  `weibo_type_pro` decimal(10, 2) NOT NULL COMMENT '高于微博同类事件影响力占比',
  `weibo_all_pro` decimal(10, 2) NOT NULL COMMENT '高于微博全部事件影响力占比',
  `weibo_class_avg` decimal(10, 2) NOT NULL COMMENT '微博同类事件影响力均值',
  `weixin_inf` decimal(10, 2) NOT NULL COMMENT '微信影响力指数',
  `weixin_type_pro` decimal(10, 2) NOT NULL COMMENT '高于微信同类事件影响力占比',
  `weixin_all_pro` decimal(10, 2) NOT NULL COMMENT '高于微信全部事件影响力占比',
  `weixin_class_avg` decimal(10, 2) NOT NULL COMMENT '微信同类事件影响力均值',
  `media_inf` decimal(10, 2) NOT NULL COMMENT '网媒影响力指数',
  `media_type_pro` decimal(10, 2) NOT NULL COMMENT '高于网媒同类事件影响力占比',
  `media_all_pro` decimal(10, 2) NOT NULL COMMENT '高于网媒全部事件影响力占比',
  `media_class_avg` decimal(10, 2) NOT NULL COMMENT '网媒同类事件影响力均值',
  `media_num` int(3) NOT NULL COMMENT '媒体参与数',
  `ccp_media_in` decimal(10, 2) NOT NULL COMMENT '央级媒体参与度',
  `ccp_type_pro` decimal(10, 2) NOT NULL COMMENT '央级媒体高于同类事件参与度',
  `ccp_all_pro` decimal(10, 2) NOT NULL COMMENT '央级媒体高于全部事件参与度',
  `ccp_class_avg` decimal(10, 2) NOT NULL COMMENT '央级媒体同类事件参与度均值',
  `finance_media_in` decimal(10, 2) NOT NULL COMMENT '财经媒体参与度',
  `finance_type_pro` decimal(10, 2) NOT NULL COMMENT '财经媒体高于同类事件参与度',
  `finance_all_pro` decimal(10, 2) NOT NULL COMMENT '财经媒体高于全部事件参与度',
  `finance_class_avg` decimal(10, 2) NOT NULL COMMENT '财经媒体同类事件参与度均值',
  `tech_media_in` decimal(10, 2) NOT NULL COMMENT '科技媒体参与度',
  `tech_type_pro` decimal(10, 2) NOT NULL COMMENT '科技媒体高于同类事件参与度',
  `tech_all_pro` decimal(10, 2) NOT NULL COMMENT '科技媒体高于全部事件参与度',
  `tech_class_avg` decimal(10, 2) NOT NULL COMMENT '科技媒体同类事件参与度均值',
  `create_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '添加时间',
  `creator` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '添加人',
  `update_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '修改时间',
  `updater` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '修改人',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '事件概况表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for event_timeline_trend
-- ----------------------------
DROP TABLE IF EXISTS `event_timeline_trend`;
CREATE TABLE `event_timeline_trend`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `event_id` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '事件id',
  `platform_type` tinyint(2) NOT NULL COMMENT '平台类型，0-全局，1-微博，2-微信，3-网媒',
  `time` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '趋势时间节点',
  `num` int(5) NOT NULL COMMENT '趋势值',
  `create_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '添加时间',
  `creator` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '添加人',
  `update_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '修改时间',
  `updater` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '修改人',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 22727 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '事件趋势表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for convergence_kol
-- ----------------------------
DROP TABLE IF EXISTS `convergence_kol`;
CREATE TABLE `convergence_kol` (
  `kol_id` int(20) NOT NULL AUTO_INCREMENT COMMENT '意见领袖观点表主键id',
  `event_id` varchar(40) COLLATE utf8_bin NOT NULL COMMENT '事件ID',
  `username` varchar(20) COLLATE utf8_bin NOT NULL COMMENT '微博主账号名',
  `fans` int(10) DEFAULT NULL COMMENT '粉丝数',
  `weibo_num` int(10) DEFAULT NULL COMMENT '参与次数',
  `avatar` varchar(200) COLLATE utf8_bin DEFAULT NULL COMMENT '微博主头像URL',
  `webo_text` varchar(500) COLLATE utf8_bin NOT NULL COMMENT '微博内容',
  `if_forward` tinyint(2) NOT NULL COMMENT '是否转发 0=原创 1=转发',
  `weibo_time` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '微博发布时间',
  `url` varchar(200) COLLATE utf8_bin DEFAULT NULL COMMENT '微博URL',
  `sex` tinyint(2) DEFAULT NULL COMMENT '微博主性别  0=男 1=女',
  `root_weibo` varchar(500) COLLATE utf8_bin DEFAULT NULL COMMENT '博主转发的原始微博',
  `v_type` tinyint(2) DEFAULT NULL COMMENT '是否大V 0=是 1=否',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '添加时间',
  `creator` varchar(10) COLLATE utf8_bin NOT NULL COMMENT '添加人',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `updater` varchar(10) COLLATE utf8_bin NOT NULL COMMENT '修改人',
  PRIMARY KEY (`kol_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Table structure for convergence_media
-- ----------------------------
DROP TABLE IF EXISTS `convergence_media`;
CREATE TABLE `convergence_media` (
  `media_id` int(20) NOT NULL AUTO_INCREMENT COMMENT '媒体观点表主键id',
  `event_id` varchar(40) COLLATE utf8_bin NOT NULL COMMENT '事件ID',
  `title` varchar(50) COLLATE utf8_bin NOT NULL COMMENT '媒体观点',
  `media_num` int(5) NOT NULL COMMENT '媒体报道数',
  `media` varchar(300) COLLATE utf8_bin NOT NULL COMMENT '相关媒体（按分号；隔开）',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '添加时间',
  `creator` varchar(10) COLLATE utf8_bin NOT NULL COMMENT '添加人',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `updater` varchar(10) COLLATE utf8_bin NOT NULL COMMENT '修改人',
  PRIMARY KEY (`media_id`)
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Table structure for convergence_top_words
-- ----------------------------
DROP TABLE IF EXISTS `convergence_top_words`;
CREATE TABLE `convergence_top_words` (
  `top_id` int(20) NOT NULL AUTO_INCREMENT COMMENT ' 高频词表主键id',
  `event_id` varchar(40) COLLATE utf8_bin NOT NULL COMMENT '事件ID',
  `word` varchar(10) COLLATE utf8_bin NOT NULL COMMENT '高频词',
  `num` int(5) NOT NULL COMMENT '高频词出现的次数',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '添加时间',
  `creator` varchar(10) COLLATE utf8_bin NOT NULL COMMENT '添加人',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `updater` varchar(10) COLLATE utf8_bin NOT NULL COMMENT '修改人',
  PRIMARY KEY (`top_id`)
) ENGINE=InnoDB AUTO_INCREMENT=201 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- Table structure for portrait_activity
-- ----------------------------
DROP TABLE IF EXISTS `portrait_activity`;
CREATE TABLE `portrait_activity` (
  `activity_id` int(20) NOT NULL AUTO_INCREMENT COMMENT '活跃度表主键id',
  `event_id` varchar(40) COLLATE utf8_bin NOT NULL COMMENT '事件ID',
  `title` varchar(80) COLLATE utf8_bin NOT NULL COMMENT '事件标题',
  `activity` tinyint(2) NOT NULL COMMENT '活跃度；0=0-0.2；1=0.2-0.4；2=0.4-0.8；3=0.8-1.5；4=1.5以上',
  `pro` decimal(4,2) NOT NULL COMMENT '占比',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '添加时间',
  `creator` varchar(10) COLLATE utf8_bin NOT NULL COMMENT '添加人',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `updater` varchar(10) COLLATE utf8_bin NOT NULL COMMENT '修改人',
  PRIMARY KEY (`activity_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Table structure for portrait_pattern
-- ----------------------------
DROP TABLE IF EXISTS `portrait_pattern`;
CREATE TABLE `portrait_pattern` (
  `pattern_id` int(20) NOT NULL AUTO_INCREMENT COMMENT '参与规律表主键id',
  `event_id` varchar(40) COLLATE utf8_bin NOT NULL COMMENT '事件ID',
  `webo_num` decimal(8,1) NOT NULL COMMENT '微博数(保留一位小数)',
  `time` varchar(10) COLLATE utf8_bin NOT NULL COMMENT '发布时间(24小时制)',
  `account_type` tinyint(2) NOT NULL COMMENT '高影响力账号类型 0=事件相关账号 1=全局账号',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '添加时间',
  `creator` varchar(10) COLLATE utf8_bin NOT NULL COMMENT '添加人',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `updater` varchar(10) COLLATE utf8_bin NOT NULL COMMENT '修改人',
  PRIMARY KEY (`pattern_id`)
) ENGINE=InnoDB AUTO_INCREMENT=49 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Table structure for portrait_province
-- ----------------------------
DROP TABLE IF EXISTS `portrait_province`;
CREATE TABLE `portrait_province` (
  `province_id` int(20) NOT NULL AUTO_INCREMENT COMMENT '地域分布表主键id',
  `event_id` varchar(40) COLLATE utf8_bin NOT NULL COMMENT '事件ID',
  `province` varchar(5) COLLATE utf8_bin NOT NULL COMMENT '省份',
  `pro` decimal(4,2) NOT NULL COMMENT '占比',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '添加时间',
  `creator` varchar(10) COLLATE utf8_bin NOT NULL COMMENT '添加人',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `updater` varchar(10) COLLATE utf8_bin NOT NULL COMMENT '修改人',
  PRIMARY KEY (`province_id`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Table structure for portrait_sex
-- ----------------------------
DROP TABLE IF EXISTS `portrait_sex`;
CREATE TABLE `portrait_sex` (
  `sex_id` int(20) NOT NULL AUTO_INCREMENT COMMENT '性别表主键id',
  `event_id` varchar(40) COLLATE utf8_bin NOT NULL COMMENT '事件ID',
  `sex` tinyint(2) NOT NULL COMMENT '0=男 1=女',
  `pro` decimal(4,2) NOT NULL COMMENT '占比',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '添加时间',
  `creator` varchar(10) COLLATE utf8_bin NOT NULL COMMENT '添加人',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `updater` varchar(10) COLLATE utf8_bin NOT NULL COMMENT '修改人',
  PRIMARY KEY (`sex_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Table structure for portrait_tags
-- ----------------------------
DROP TABLE IF EXISTS `portrait_tags`;
CREATE TABLE `portrait_tags` (
  `tags_id` int(20) NOT NULL AUTO_INCREMENT COMMENT '标签表主键id',
  `event_id` varchar(40) COLLATE utf8_bin NOT NULL COMMENT '事件ID',
  `tag` varchar(20) COLLATE utf8_bin NOT NULL COMMENT '标签数量',
  `num` int(3) NOT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '添加时间',
  `creator` varchar(10) COLLATE utf8_bin NOT NULL COMMENT '添加人',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `updater` varchar(10) COLLATE utf8_bin NOT NULL COMMENT '修改人',
  PRIMARY KEY (`tags_id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
