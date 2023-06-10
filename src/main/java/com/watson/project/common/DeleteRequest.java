package com.watson.project.common;

import lombok.Data;

import java.io.Serializable;

/**
 * delete
 *
 * @author watson
 */
@Data
public class DeleteRequest implements Serializable {
    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}