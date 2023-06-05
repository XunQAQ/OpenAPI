package com.watson.project.model.dto.interfaceinfo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.watson.project.common.PageRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 查询请求
 *
 * @author watson
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class InterfaceInfoQueryRequest extends PageRequest implements Serializable {
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
     * Created By
     */
    private Long userId;

    /**
     * Deletion Status (0 - Not Deleted, 1 - Deleted)
     */

    private Integer isDelete;


}