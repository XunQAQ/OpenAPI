package com.watson.project.model.dto.interfaceinfo;

import lombok.Data;

import java.io.Serializable;

/**
 * 创建请求
 *
 * @TableName product
 */
@Data
public class InterfaceInfoAddRequest implements Serializable {


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
     * Request Method
     */
    private String method;

}