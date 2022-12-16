CREATE TABLE IF NOT EXISTS `user`
(
    `id`          BIGINT UNSIGNED NOT NULL COMMENT 'id',
    `username`    VARCHAR(60)     NOT NULL COMMENT '用户名',
    `password`    VARCHAR(60)     NOT NULL COMMENT '密码',
    `nickname`    VARCHAR(60)     NOT NULL COMMENT '昵称',
    `create_time` DATETIME        NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_time`   DATETIME        NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`id`)
) COMMENT '用户表';
