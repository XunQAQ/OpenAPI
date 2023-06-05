package com.watson.project.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.watson.project.common.ErrorCode;
import com.watson.project.exception.BusinessException;
import com.watson.project.model.entity.InterfaceInfo;
import com.watson.project.service.InterfaceInfoService;
import com.watson.project.mapper.InterfaceInfoMapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

/**
* @author watson
* @description 针对表【interface_info(Interface Information)】的数据库操作Service实现
* @createDate 2023-05-23 16:44:58
*/
@Service
public class InterfaceInfoServiceImpl extends ServiceImpl<InterfaceInfoMapper, InterfaceInfo>
    implements InterfaceInfoService{

    @Override
    public void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add) {
        if (interfaceInfo == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        String name = interfaceInfo.getName();

        // 创建时，所有参数必须非空
        if (add) {
            if (StringUtils.isAnyBlank(name)) {
                throw new BusinessException(ErrorCode.PARAMS_ERROR);
            }
        }
        if (StringUtils.isNotBlank(name) && name.length() >   50) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "name is too long");
        }
    }

}




