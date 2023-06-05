package com.watson.project.service;

import com.watson.project.model.entity.InterfaceInfo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author watson
* @description 针对表【interface_info(Interface Information)】的数据库操作Service
* @createDate 2023-05-23 16:44:58
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {
    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);

}
