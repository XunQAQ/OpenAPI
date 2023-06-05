package com.watson.project.service;

import com.watson.project.model.entity.UserInterfaceInfo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author watson
* @description 针对表【user_interface_info(User interface relationship table)】的数据库操作Service
* @createDate 2023-05-28 23:02:31
*/
public interface UserInterfaceInfoService extends IService<UserInterfaceInfo> {

    void validUserInterfaceInfo(UserInterfaceInfo userInterfaceInfo, boolean b);


    /**
     * invoke the api and count++
     * @param interfaceInfoID
     * @param userId
     * @return
     */
    boolean invokeCount(long interfaceInfoID, long userId);
}
