-- 创建库
create database if not exists api_db;

-- 切换库
use api_db;



CREATE TABLE IF NOT EXISTS api_db.`interface_info` (
                                                      `id` bigint NOT NULL AUTO_INCREMENT COMMENT 'Primary Key' primary key ,
                                                      `name` varchar(256) NOT NULL COMMENT 'Name',
                                                      `description` varchar(256) NULL COMMENT 'Description',
                                                       `url` varchar(512) NOT NULL COMMENT 'Interface Address',
                                                    `requestParams` text  NULL COMMENT 'Request Params',
                                                      `requestHeader` text NULL COMMENT 'Request Headers',
                                                      `responseHeader` text NULL COMMENT 'Response Headers',
                                                      `status` int DEFAULT 0 NOT NULL COMMENT 'Interface Status (0 - Closed, 1 - Open)',
                                                      `method` varchar(256) NOT NULL COMMENT 'Request Method',

                                                      `userId` bigint NOT NULL COMMENT 'Created By',
                                                      `createTime` datetime DEFAULT CURRENT_TIMESTAMP NOT NULL COMMENT 'Creation Time',
                                                      `updateTime` datetime DEFAULT CURRENT_TIMESTAMP NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT 'Update Time',
                                                      `isDelete` tinyint DEFAULT 0 NOT NULL COMMENT 'Deletion Status (0 - Not Deleted, 1 - Deleted)'
) COMMENT 'Interface Information';

use api_db;

CREATE TABLE IF NOT EXISTS api_db.user_interface_info (
                                                         id BIGINT NOT NULL AUTO_INCREMENT COMMENT 'Primary key',
                                                         userId BIGINT NOT NULL COMMENT 'User ID of the caller',
                                                         interfaceInfoId BIGINT NOT NULL COMMENT 'Interface ID',
                                                         totalNum INT DEFAULT 0 NOT NULL COMMENT 'Total number of calls',
                                                         leftNum INT DEFAULT 0 NOT NULL COMMENT 'Remaining number of calls',
                                                         status INT DEFAULT 0 NOT NULL COMMENT '0 - Normal, 1 - Disabled',
                                                         createTime DATETIME DEFAULT CURRENT_TIMESTAMP NOT NULL COMMENT 'Creation time',
                                                         updateTime DATETIME DEFAULT CURRENT_TIMESTAMP NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT 'Update time',
                                                         isDelete TINYINT DEFAULT 0 NOT NULL COMMENT 'Deletion status (0 - Not deleted, 1 - Deleted)',
                                                         PRIMARY KEY (id)
) COMMENT 'User interface relationship table';

