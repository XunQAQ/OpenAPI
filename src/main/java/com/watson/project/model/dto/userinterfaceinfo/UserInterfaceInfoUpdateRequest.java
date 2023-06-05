package com.watson.project.model.dto.userinterfaceinfo;


import lombok.Data;

import java.io.Serializable;

/**
 * 更新请求
 *
 * @TableName product
 */
@Data
public class UserInterfaceInfoUpdateRequest implements Serializable {


    private Long id;


    private Integer totalNum;

    /**
     * Remaining number of calls
     */
    private Integer leftNum;

    /**
     * 0 - Normal, 1 - Disabled
     */
    private Integer status;
}