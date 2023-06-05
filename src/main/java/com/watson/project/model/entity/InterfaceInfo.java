package com.watson.project.model.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * Interface Information
 * @TableName interface_info
 */
@TableName(value ="interface_info")
@Data
public class InterfaceInfo implements Serializable {
    /**
     * Primary Key
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * Name
     */
    private String name;

    /**
     * Description
     */
    private String description;

    /**FF
     * Interface Address
     */
    private String url;

    /**
     * Request Params
     */
    private String requestParams;


    /**
     * Request Headers
     */

    private String requestHeader;
    /**
     * Response Headers
     */
    private String responseHeader;

    /**
     * Interface Status (0 - Closed, 1 - Open)
     */
    private Integer status;

    /**
     * Request Method
     */
    private String method;

    /**
     * Created By
     */
    private Long userId;

    /**
     * Creation Time
     */
    private Date createTime;

    /**
     * Update Time
     */
    private Date updateTime;

    /**
     * Deletion Status (0 - Not Deleted, 1 - Deleted)
     */
    @TableLogic
    private Integer isDelete;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}