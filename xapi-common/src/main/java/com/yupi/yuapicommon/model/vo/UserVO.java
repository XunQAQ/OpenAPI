package com.yupi.yuapicommon.model.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户视图
 *
 * @author Watson
 * @from Watson
 */
@Data
public class UserVO implements Serializable {
   
    private Long id;

   
    private String userName;

   
    private String userAccount;

  
    private String userAvatar;

    
    private Integer gender;

    
    private String userRole;

   
    private Date createTime;

    
    private Date updateTime;

    private static final long serialVersionUID = 1L;
}