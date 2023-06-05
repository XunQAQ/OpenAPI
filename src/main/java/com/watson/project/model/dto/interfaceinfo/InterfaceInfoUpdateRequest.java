package com.watson.project.model.dto.interfaceinfo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 更新请求
 *
 * @TableName product
 */
@Data
public class InterfaceInfoUpdateRequest implements Serializable {
    /**
     * Primary Key
     */

    private Long id;

    /**
     * Name
     */
    private String name;

    /**
     * Request Params
     */
    private String requestParams;

    /**
     * Description
     */
    private String description;

    /**
     * Interface Address
     */
    private String url;

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

}