-- 创建库
create database if not exists api_db;

-- 切换库
use api_db;
# 7b837ccbcdacb0a2d36af15d478fb188
-- 用户表
create table if not exists user
(
    id           bigint auto_increment comment 'id' primary key,
    userName     varchar(256)                           null comment 'User nickname',
    userAccount  varchar(256)                           not null comment 'Account',
    userAvatar   varchar(1024)                          null comment 'User avatar',
    gender       tinyint                               null comment 'Gender',
    userRole     varchar(256) default 'user'            not null comment 'User role: user / admin',
    userPassword varchar(512)                           not null comment 'Password',
    accessKey    varchar(512)                           not null comment 'Access key',
    secretKey    varchar(512)                           not null comment 'Secret key',
    createTime   datetime     default CURRENT_TIMESTAMP not null comment 'Creation time',
    updateTime   datetime     default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment 'Update time',
    isDelete     tinyint      default 0                 not null comment 'Is deleted',
    constraint uni_userAccount
        unique (userAccount)
) comment 'User';


-- 帖子表
create table if not exists post
(
    id            bigint auto_increment comment 'id' primary key,
    age           int comment '年龄',
    gender        tinyint  default 0                 not null comment '性别（0-男, 1-女）',
    education     varchar(512)                       null comment '学历',
    place         varchar(512)                       null comment '地点',
    job           varchar(512)                       null comment '职业',
    contact       varchar(512)                       null comment '联系方式',
    loveExp       varchar(512)                       null comment '感情经历',
    content       text                               null comment '内容（个人介绍）',
    photo         varchar(1024)                      null comment '照片地址',
    reviewStatus  int      default 0                 not null comment '状态（0-待审核, 1-通过, 2-拒绝）',
    reviewMessage varchar(512)                       null comment '审核信息',
    viewNum       int                                not null default 0 comment '浏览数',
    thumbNum      int                                not null default 0 comment '点赞数',
    userId        bigint                             not null comment '创建用户 id',
    createTime    datetime default CURRENT_TIMESTAMP not null comment '创建时间',
    updateTime    datetime default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间',
    isDelete      tinyint  default 0                 not null comment '是否删除'
) comment '帖子';



