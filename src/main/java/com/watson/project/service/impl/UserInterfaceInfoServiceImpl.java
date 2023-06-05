package com.watson.project.service.impl;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.watson.project.common.ErrorCode;
import com.watson.project.exception.BusinessException;
import com.watson.project.model.entity.InterfaceInfo;
import com.watson.project.model.entity.UserInterfaceInfo;
import com.watson.project.service.UserInterfaceInfoService;
import com.watson.project.mapper.UserInterfaceInfoMapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

/**
* @author watson
* @description 针对表【user_interface_info(User interface relationship table)】的数据库操作Service实现
* @createDate 2023-05-28 23:02:31
*/
@Service
public class UserInterfaceInfoServiceImpl extends ServiceImpl<UserInterfaceInfoMapper, UserInterfaceInfo>
    implements UserInterfaceInfoService{


    @Override
    public void validUserInterfaceInfo(UserInterfaceInfo userinterfaceInfo, boolean add) {
        if (userinterfaceInfo == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }

        // 创建时，所有参数必须非空
        if (add) {
            if (userinterfaceInfo.getInterfaceInfoId() <= 0 || userinterfaceInfo.getUserId() <=0) {
                throw new BusinessException(ErrorCode.PARAMS_ERROR,"user or api is not exist");
            }
        }
        if (userinterfaceInfo.getLeftNum() <0) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "remianed invoke num is below 0");
        }
    }

    @Override
    public boolean invokeCount(long interfaceInfoID, long userId) {

        if (interfaceInfoID <= 0 || userId <= 0) {
            throw new BusinessException (ErrorCode. PARAMS_ERROR) ;
        }
        UpdateWrapper<UserInterfaceInfo> updateWrapper = new UpdateWrapper<> () ;
        updateWrapper.eq( "interfaceInfoId", interfaceInfoID);
        updateWrapper.eq( "userId", userId);
        updateWrapper.gt("leftNum",0);
        updateWrapper. setSql("leftNum = leftNum - 1, totalNum = totalNum + 1");
        return this.update (updateWrapper);
    }


}




