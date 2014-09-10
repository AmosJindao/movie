##mysql 5.5.38

##創建數據MOVIE
CREATE SCHEMA `MOVIE` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;

##管理者表
CREATE TABLE `MOVIE`.`manager` (
  `name` VARCHAR(60) NOT NULL COMMENT '管理者的姓名',
  `password` VARCHAR(100) NULL COMMENT '加鹽並md5加密後的密碼',
  `original_password` VARCHAR(100) NULL COMMENT '原先的密碼',
  `sex` TINYINT UNSIGNED NULL COMMENT '性別 0是女 1是男',
  `age` TINYINT UNSIGNED NULL COMMENT '年齡',
  `birthday` DATE NULL,
  `phone_mobile` VARCHAR(11) NULL COMMENT '手機號',
  `phone_home` VARCHAR(15) NULL COMMENT '家裏電話',
  `phone_company` VARCHAR(15) NULL COMMENT '公司電話',
  `email` VARCHAR(100) NULL,
  `qq` VARCHAR(15) NULL COMMENT 'qq號',
  `wechat` VARCHAR(100) NULL COMMENT '微信號',
  `salt` VARCHAR(45) NULL COMMENT '密碼加密的鹽',
  `del_flag` TINYINT(1) NOT NULL COMMENT '刪除標識 0正常 -1刪除',
  `create_date` TIMESTAMP NOT NULL DEFAULT now() COMMENT '創建時間',
  `modify_date` TIMESTAMP NULL COMMENT '修改時間',
  PRIMARY KEY (`name`),
  UNIQUE INDEX `name_UNIQUE` (`name` ASC))
COMMENT = '管理者';

##角色表
CREATE TABLE `MOVIE`.`roles` (
  `name` VARCHAR(60) NOT NULL COMMENT '角色名稱',
  `description` VARCHAR(600) NULL COMMENT '描述',
  `del_flag` TINYINT(1) NOT NULL DEFAULT 0 COMMENT '刪除標識 0表示正常 -1表示已刪除',
  `create_date` TIMESTAMP NOT NULL DEFAULT now() COMMENT '創建時間',
  `modify_date` TIMESTAMP NULL COMMENT '修改時間',
  PRIMARY KEY (`role_name`),
  UNIQUE INDEX `role_name_UNIQUE` (`role_name` ASC))
COMMENT = '角色';

##管理者表和角色表的關係表
CREATE TABLE `MOVIE`.`manager_roles_relation` (
  `manager_name` VARCHAR(60) NOT NULL COMMENT '管理者姓名',
  `role_name` VARCHAR(60) NOT NULL COMMENT '角色名',
  `create_date` TIMESTAMP NOT NULL DEFAULT now() COMMENT '創建時間',
  PRIMARY KEY (`manager_name`, `role_name`))
COMMENT = '管理者表和角色表的關係表';

##影片表
CREATE TABLE `MOVIE`.`movie` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '電影的唯一ID',
  `serial_number` VARCHAR(100) NULL COMMENT '電影唯一編號',
  `name` VARCHAR(100) NOT NULL COMMENT '電影名稱',
  `director` VARCHAR(450) NULL COMMENT '導演',
  `tags` VARCHAR(450) NULL COMMENT '標籤，或者電影類型',
  `screenwriter` VARCHAR(450) NULL COMMENT '編劇',
  `star` VARCHAR(450) NULL COMMENT '主演',
  `producer_country` VARCHAR(100) NULL COMMENT '製片國家或者地區',
  `language` VARCHAR(45) NULL COMMENT '語言',
  `release_time` VARCHAR(500) NULL COMMENT '上映時間',
  `m_length` VARCHAR(200) NULL COMMENT '影片長度',
  `aliases` VARCHAR(500) NULL COMMENT '別名，又名，或者其他名字',
  `imdb_url` VARCHAR(200) NULL COMMENT 'IMDB鏈接',
  `rotten_tomatoes_url` VARCHAR(200) NULL COMMENT 'Rotten Tomatoes鏈接',
  `description` VARCHAR(1000) NULL COMMENT '電影簡介',
  `del_flag` TINYINT(1) NOT NULL DEFAULT 0 COMMENT '刪除標識 0表示正常 -1表示已刪除',
  `create_date` TIMESTAMP NOT NULL DEFAULT now() COMMENT '創建時間',
  `modify_date` TIMESTAMP NULL COMMENT '修改時間',
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC))
COMMENT = '影片表';
