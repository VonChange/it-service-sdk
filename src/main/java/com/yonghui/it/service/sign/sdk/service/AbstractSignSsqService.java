package com.yonghui.it.service.sign.sdk.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.yonghui.it.service.sign.sdk.domain.YhResponse;
import com.yonghui.it.service.sign.sdk.exception.SignException;
import com.yonghui.it.service.sign.sdk.service.model.auth.*;
import com.yonghui.it.service.sign.sdk.service.model.callback.*;
import com.yonghui.it.service.sign.sdk.service.model.contract.*;
import com.yonghui.it.service.sign.sdk.service.model.query.SignReqQueryShareEnterpriseInfo;
import com.yonghui.it.service.sign.sdk.service.model.query.SignVoShareEnterpriseInfo;
import com.yonghui.it.service.sign.sdk.service.model.user.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class  AbstractSignSsqService extends BaseSignSsqService {
     private static final Logger log = LoggerFactory.getLogger(AbstractSignSsqService.class);

     private  static volatile  UserModule userModule =null;
    private  static volatile  AuthModule authModule =null;
    private static volatile ContractModule contractModule= null;
    private static volatile CallbackModule callbackModule= null;
    private static volatile QueryModule queryModule= null;
    /**
     * 回调相关
     * @return CallbackModule
     */
    public  CallbackModule moduleCallback(){
        if (null == callbackModule) {
            synchronized (CallbackModule.class) {
                if (null == callbackModule) {
                    callbackModule = new CallbackModule();
                }
            }
        }
        return callbackModule;
    }

    /**
     * 合同相关
     * @return ContractModule
     */
    public  ContractModule moduleContract(){
        if (null == contractModule) {
            synchronized (ContractModule.class) {
                if (null == contractModule) {
                    contractModule = new ContractModule();
                }
            }
        }
        return contractModule;
    }

    /**
     * 电子签章用户模块
     * @return UserModule
     */
     public  UserModule moduleUser(){
         if (null == userModule) {
             synchronized (UserModule.class) {
                 if (null == userModule) {
                     userModule = new UserModule();
                 }
             }
         }
          return userModule;
     }

    /**
     * 认证相关
     * @return AuthModule
     */
    public  AuthModule moduleAuth(){
        if (null == authModule) {
            synchronized (AuthModule.class) {
                if (null == authModule) {
                    authModule = new AuthModule();
                }
            }
        }
        return authModule;
    }

    /**
     * 查询相关
     * @return QueryModule
     */
    public  QueryModule moduleQuery(){
        if (null == queryModule) {
            synchronized (QueryModule.class) {
                if (null == queryModule) {
                    queryModule = new QueryModule();
                }
            }
        }
        return queryModule;
    }

    /**
     * 电子签章用户模块
     */
    public  class UserModule{
        /**
         * 查询个人用户证件信息
         * @param signReqUser
         * @return
         * @throws SignException
         */
          public YhResponse<SignVoPersonalCredential> getPersonalCredential(SignReqUser signReqUser) throws SignException {
               return post(new TypeReference<YhResponse<SignVoPersonalCredential>>() {}, "getPersonalCredential", signReqUser);
          }

        /**
         * 查询企业证件信息
         * @param signReqUser
         * @return
         * @throws SignException
         */
          public YhResponse<SignVoEnterpriseCredential> getEnterpriseCredential(SignReqUser signReqUser) throws SignException {
               return post(new TypeReference<YhResponse<SignVoEnterpriseCredential>>() {}, "getEnterpriseCredential", signReqUser);
          }

        /**
         * 注册个人签署方
         * @param signReqUserRegPerson
         * @return
         * @throws SignException
         */
          public YhResponse<SignVoUserReg> userRegPersonal(SignReqUserRegPerson signReqUserRegPerson) throws SignException {
               return post(new TypeReference<YhResponse<SignVoUserReg>>() {}, "userRegPersonal", signReqUserRegPerson);
          }

        /**
         * 注册企业签署方
         * @param signReqUserRegEnterprise
         * @return
         * @throws SignException
         */
         public YhResponse<SignVoUserReg> userRegEnterprise(SignReqUserRegEnterprise signReqUserRegEnterprise) throws SignException {
             return post(new TypeReference<YhResponse<SignVoUserReg>>() {}, "userRegEnterprise", signReqUserRegEnterprise);
         }

        /**
         * 更新个人签署方
         * @param signReqUserUpdatePerson
         * @return
         * @throws SignException
         */
        public YhResponse<SignVoUserReg> userUpdatePersonal(SignReqUserUpdatePerson signReqUserUpdatePerson) throws SignException {
            return post(new TypeReference<YhResponse<SignVoUserReg>>() {}, "userUpdatePersonal", signReqUserUpdatePerson);
        }

        /**
         * 更新企业签署方
         * @param signReqUserUpdateEnterprise
         * @return
         * @throws SignException
         */
        public YhResponse<SignVoUserReg> userUpdateEnterprise(SignReqUserUpdateEnterprise signReqUserUpdateEnterprise) throws SignException {
            return post(new TypeReference<YhResponse<SignVoUserReg>>() {}, "userUpdateEnterprise", signReqUserUpdateEnterprise);
        }

         /**
          * 查询证书编号
          * @param signReqUser
          * @return SignVoUserCert
          * @throws SignException
          */
         public YhResponse<SignVoUserCert> userCert(SignReqUser signReqUser) throws SignException {
            return post(new TypeReference<YhResponse<SignVoUserCert>>() {}, "userCert", signReqUser);
         }

        /**
         * 查询签署方 申请证书状态查询
         * @param signReqUserApplyCertStatus
         * @return
         * @throws SignException
         */
         public YhResponse<SignVoUserApplyCertStatus> userApplyCertStatus(SignReqUserApplyCertStatus signReqUserApplyCertStatus) throws SignException {
            return post(new TypeReference<YhResponse<SignVoUserApplyCertStatus>>() {}, "userApplyCertStatus", signReqUserApplyCertStatus);
        }

        /**
         * 上传签署方签章图片
         * @param signReqUserUploadSign
         * @return
         * @throws SignException
         */
        public YhResponse<SignVoUserUploadSign> userUploadSign(SignReqUserUploadSign signReqUserUploadSign) throws SignException {
            YhResponse<SignVoUserUploadSign> result= post(new TypeReference<YhResponse<SignVoUserUploadSign>>() {}, "userUploadSign", signReqUserUploadSign);
            if(result.isOk()){
                result.getResult().setAccount(signReqUserUploadSign.getAccount()).setImageName(signReqUserUploadSign.getImageName());
            }
            return result;
        }

        public YhResponse<SignVoUserAutoCreateSign> userAutoCreateSign(SignReqUserAutoCreateSign signReqUserAutoCreateSign) throws SignException {
            YhResponse<SignVoUserAutoCreateSign> result= post(new TypeReference<YhResponse<SignVoUserAutoCreateSign>>() {}, "userCreateSign", signReqUserAutoCreateSign);
            if(result.isOk()){
                result.getResult().setAccount(signReqUserAutoCreateSign.getAccount());
            }
            return result;
        }

        /**
         * 下载签署方签章图片
         * @param signReqUserDownloadSign
         * @return
         * @throws SignException
         */
        public YhResponse<byte[]> userDownloadSign(SignReqUserDownloadSign signReqUserDownloadSign) throws SignException{
            return getBytes("userDownloadSign",signReqUserDownloadSign);
        }
     }

     public class AuthModule{
         /**
          * 企业认证
          * @param signReqEnterpriseIdentity
          * @return
          * @throws SignException
          */
         public YhResponse<SignVoEnterpriseIdentity> enterpriseIdentity(SignReqEnterpriseIdentity signReqEnterpriseIdentity) throws SignException {
             YhResponse<SignVoEnterpriseIdentity> response = post(new TypeReference<YhResponse<SignVoEnterpriseIdentity>>() {},
                     "enterpriseIdentity", signReqEnterpriseIdentity);
             /*if(response.isOk()){
                 if(response.getResult().getEnumAuthResultStatus().equals(EnumAuthResultStatus.noPass)){
                     return YhResponse.error(response.getResult().getMsg());
                 }
             }*/
             return response;
         }

         /**
          * 个人三要素认证
          * @param signReqPersonalIdentity
          * @return
          * @throws SignException
          */
         public YhResponse<SignVoPersonalIdentity> personalIdentity(SignReqPersonalIdentity signReqPersonalIdentity) throws SignException {

             YhResponse<SignVoPersonalIdentity> response = post(new TypeReference<YhResponse<SignVoPersonalIdentity>>() {}, "personalIdentity", signReqPersonalIdentity);
            /* if(response.isOk()){
                 if(response.getResult().getEnumAuthResultStatus().equals(EnumAuthResultStatus.noPass)){
                     return YhResponse.error(response.getResult().getMsg());
                 }
             }*/
             return response;
         }
         /**
          * 个人二要素认证
          * @param signReqPersonalIdentity
          * @return
          * @throws SignException
          */
         public YhResponse<SignVoPersonalIdentity2> personalIdentity2(SignReqPersonalIdentity2 signReqPersonalIdentity) throws SignException {
             YhResponse<SignVoPersonalIdentity2> response = post(new TypeReference<YhResponse<SignVoPersonalIdentity2>>() {}, "personalIdentity2", signReqPersonalIdentity);
            /* if(response.isOk()){
                 if(response.getResult().getEnumAuthResultStatus().equals(EnumAuthResultStatus.noPass)){
                     return YhResponse.error(response.getResult().getMsg());
                 }
             }*/
             return response;
         }

         /**
          * 个人认证需要的手机号验证码校验
          * @param signReqVerifyCode
          * @return
          * @throws SignException
          */
         public YhResponse<SignVoVerifyCode> verifyCode(SignReqVerifyCode signReqVerifyCode) throws SignException {
             YhResponse<SignVoVerifyCode> response = post(new TypeReference<YhResponse<SignVoVerifyCode>>() {}, "verifyCode", signReqVerifyCode);
             /*if(response.isOk()){
                 if(response.getResult().getEnumAuthResultStatus().equals(EnumAuthResultStatus.noPass)){
                     return YhResponse.error(response.getMessage());
                 }
             }*/
             return  response;
         }
     }

     public  class ContractModule{
         /**
          * 合同上传
          * @param signReqContractUpload
          * @return
          * @throws SignException
          */
         public YhResponse<SignVoContractUpload> contractUpload(SignReqContractUpload signReqContractUpload) throws SignException {
             return post(new TypeReference<YhResponse<SignVoContractUpload>>() {}, "contractUpload", signReqContractUpload);
         }

         /**
          * 自动签
          * @param signReqContractAutoSign
          * @return
          * @throws SignException
          */
         public YhResponse<SignVoContractAutoSign> contractAutoSign(SignReqContractAutoSign signReqContractAutoSign) throws SignException {
             YhResponse<SignVoContractAutoSign> result = post(new TypeReference<YhResponse<SignVoContractAutoSign>>() {}, "contractAutoSign", signReqContractAutoSign);
             if(result.isOk()){
                 result.getResult().setContractId(signReqContractAutoSign.getContractId());
             }
             return  result;
         }


         /**
          * 预览合同
          * @param signReqContractPreviewURL
          * @return
          * @throws SignException
          */
         public YhResponse<SignVoContractPreviewURL> contractPreviewURL(SignReqContractPreviewURL signReqContractPreviewURL) throws SignException {
             return post(new TypeReference<YhResponse<SignVoContractPreviewURL>>() {}, "contractPreviewURL", signReqContractPreviewURL);
         }

         /**
          * 手动签 合同发送
          * @param signReqContractSend
          * @return
          * @throws SignException
          */
         public YhResponse<SignVoContractSend> contractSend(SignReqContractSend signReqContractSend) throws SignException{
             return post(new TypeReference<YhResponse<SignVoContractSend>>() {}, "contractSend", signReqContractSend);
         }

         /**
          * 获取合同信息
          * @param signReqContract
          * @return
          * @throws SignException
          */
         public YhResponse<SignVoContractInfo> contractInfo(SignReqContract signReqContract) throws SignException {
             return post(new TypeReference<YhResponse<SignVoContractInfo>>() {}, "contractInfo", signReqContract);
         }

         /**
          * 合同下载
          * @param signReqContract
          * @return
          * @throws SignException
          */
         public YhResponse<byte[]> contractDownload(SignReqContract signReqContract) throws SignException {
             return getBytes("contractDownload",signReqContract);
         }

         public YhResponse<byte[]> contractImage(SignReqContractImage signReqContractImage) throws SignException {
             return getBytes("contractImage",signReqContractImage);
         }

         /**
          * 撤销合同
          * @param signReqContract
          * @return
          * @throws SignException
          */
         public YhResponse<SignVoContract> contractCancel(SignReqContract signReqContract) throws SignException {
             YhResponse<SignVoContract> result = post(new TypeReference<YhResponse<SignVoContract>>() {},
                     "contractCancel", signReqContract);
             if(result.isOk()){
                 result.getResult().setContractId(signReqContract.getContractId());
             }
             return  result;
         }


         /**
          * 合同延期
          * @param signReqDelayExpireTime
          * @return
          * @throws SignException
          */
         public YhResponse<SignVoDalayExpireTime> delayExpireTime(SignReqDelayExpireTime signReqDelayExpireTime) throws SignException {
             YhResponse<SignVoDalayExpireTime> result = post(new TypeReference<YhResponse<SignVoDalayExpireTime>>() {},
                     "delayExpireTime", signReqDelayExpireTime);
             return  result;
         }

         /**
          * 锁定并结束合同
          * @param signReqContract
          * @return
          * @throws SignException
          */
         public YhResponse<SignVoContract> contractLock(SignReqContract signReqContract) throws SignException {
             YhResponse<SignVoContract> result = post(new TypeReference<YhResponse<SignVoContract>>() {},
                     "contractLock", signReqContract);
             if(result.isOk()){
                 result.getResult().setContractId(signReqContract.getContractId());
             }
             return  result;
         }

         /**
          * 查询合同签署者状态
          * @param signReqContract
          * @return
          * @throws SignException
          */
         public YhResponse<List<SignVoContractSignerStatus>> contractSignerStatus(SignReqContract signReqContract) throws SignException {
             YhResponse<Map<String,Integer>> result = post(new TypeReference<YhResponse<Map<String,Integer>>>() {}, "contractSignerStatus", signReqContract);
             List<SignVoContractSignerStatus> list= new ArrayList<>();
             if(result.isOk()&&null!=result.getResult()&&result.getResult().size()>0){
                 for (Map.Entry<String,Integer> entry: result.getResult().entrySet()) {
                     list.add(new SignVoContractSignerStatus(entry.getKey(),entry.getValue()));
                 }
             }
             YhResponse<List<SignVoContractSignerStatus>> response= new YhResponse<>();
             response.setResult(list);
             response.setCode(result.getCode());
             response.setMessage(result.getMessage());
             return  response;
         }

         /**
          * 判断签署者签署状态 是否 已签署
          * @param account
          * @param signVoContractSignerStatusList
          * @return
          */
         public boolean contractSignerStatusIsSign(String  account,List<SignVoContractSignerStatus> signVoContractSignerStatusList) {
             for (SignVoContractSignerStatus signVoContractSignerStatus: signVoContractSignerStatusList) {
                 if(account.equals(signVoContractSignerStatus.getAccount())){
                     if(signVoContractSignerStatus.getStatusEnum().equals(SignVoContractSignerStatus.EnumStatus.signed)){
                         return true;
                     }
                     break;
                 }
             }
             return false;
         }

         /**
          * pdf 模版
          * @param signReqContractTemplate
          * @return
          * @throws SignException
          */
         public YhResponse<byte[]> contractTemplate(SignReqContractTemplate signReqContractTemplate) throws SignException {
             return postBytes("contractTemplate",signReqContractTemplate);
         }

         /**
          * 获取pdf 模版 文本域 位置及其大小
          * @param signReqContractImagePosition
          * @return
          * @throws SignException
          */
         public YhResponse<SignVoImagePosition> contractImagePosition(SignReqContractImagePosition signReqContractImagePosition) throws SignException {
             return post(new TypeReference<YhResponse<SignVoImagePosition>>() {}, "contractImagePosition", signReqContractImagePosition);
         }
     }

    public  class CallbackModule{
        /**
         * 设置异步回掉地址
         * @param url
         * @return
         * @throws SignException
         */
        public YhResponse<SignVoCallbackConfig> configCallbackUrl(String url) throws SignException {
            SignReqCallbackUrl signReqCallbackUrl = new SignReqCallbackUrl(url);
            return post(new TypeReference<YhResponse<SignVoCallbackConfig>>() {}, "configCallbackUrl", signReqCallbackUrl);
        }

        /**
         * 获取异步回调地址
         * @return
         * @throws SignException
         */
        public YhResponse<SignVoCallbackConfig> getCallbackUrl() throws SignException {
            return get(new TypeReference<YhResponse<SignVoCallbackConfig>>() {}, "getCallbackUrl", null);
        }

        /**
         * 获取具体异步回调信息
         * @param enumCallbackAction
         * @param messageId
         * @param <T>
         * @return
         * @throws SignException
         */
        public <T> YhResponse<T> getCallbackInfo(EnumCallbackAction enumCallbackAction,String messageId) throws SignException {
            SignReqGetCallback signReqGetCallback = new SignReqGetCallback(enumCallbackAction.getValue(),messageId);
            if(enumCallbackAction.equals(EnumCallbackAction.certApply)){
                return (YhResponse<T>) get(new TypeReference<YhResponse<SignVoCallbackCertApply>>() {},
                        "getCallbackInfo", signReqGetCallback);
            }
            if(enumCallbackAction.equals(EnumCallbackAction.signContract)){
                return (YhResponse<T>) get(new TypeReference<YhResponse<SignVoCallbackContract>>() {},
                        "getCallbackInfo", signReqGetCallback);
            }
            if(enumCallbackAction.equals(EnumCallbackAction.test)){
                return  YhResponse.success(null);
            }
            return YhResponse.error("未知action");
        }
    }

    public  class QueryModule{

        public YhResponse<List<SignVoShareEnterpriseInfo>> queryShareEnterpriseList(SignReqQueryShareEnterpriseInfo signReqQueryShareEnterpriseInfo) throws SignException {
            return get(new TypeReference<YhResponse<List<SignVoShareEnterpriseInfo>>>() {}, "queryShareEnterpriseList", signReqQueryShareEnterpriseInfo);
        }
    }




}
