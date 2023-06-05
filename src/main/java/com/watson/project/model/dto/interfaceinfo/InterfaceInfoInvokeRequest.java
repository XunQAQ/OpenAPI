package com.watson.project.model.dto.interfaceinfo;

import lombok.Data;

import java.io.Serializable;

/**
 * invole Request
 *
 * @TableName product
 */
@Data
public class InterfaceInfoInvokeRequest implements Serializable {
    /**
     * Primary Key
     */

    private Long id;

    /**
     * Request Params
     */
    private String userRequestParams;



}