package com.watson.project.model.dto.userinterfaceinfo;


import lombok.Data;

import java.io.Serializable;

/**
 * 创建请求
 *
 * @TableName product
 */
@Data
public class UserInterfaceInfoAddRequest implements Serializable {

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

}