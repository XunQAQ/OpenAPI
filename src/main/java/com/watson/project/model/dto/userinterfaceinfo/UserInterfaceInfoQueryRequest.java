package com.watson.project.model.dto.userinterfaceinfo;

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
public class UserInterfaceInfoQueryRequest extends PageRequest implements Serializable {
    /**
     * Primary key
     */

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


}