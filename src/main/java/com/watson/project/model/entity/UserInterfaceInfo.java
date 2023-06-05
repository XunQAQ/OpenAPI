package com.watson.project.model.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * User interface relationship table
 * @TableName user_interface_info
 */
@TableName(value ="user_interface_info")
@Data
public class UserInterfaceInfo implements Serializable {
    /**
     * Primary key
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * User ID of the caller
     */
    private Long userId;

    /**
     * Interface ID
     */
    private Long interfaceInfoId;

    /**
     * Total number of calls
     */
    private Integer totalNum;

    /**
     * Remaining number of calls
     */
    private Integer leftNum;

    /**
     * 0 - Normal, 1 - Disabled
     */
    private Integer status;

    /**
     * Creation time
     */
    private Date createTime;

    /**
     * Update time
     */
    private Date updateTime;

    /**
     * Deletion status (0 - Not deleted, 1 - Deleted)
     */
    @TableLogic
    private Integer isDelete;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}