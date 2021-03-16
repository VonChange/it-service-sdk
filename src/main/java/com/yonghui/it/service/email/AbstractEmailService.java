package com.yonghui.it.service.email;

import com.fasterxml.jackson.core.type.TypeReference;
import com.yonghui.it.service.common.exception.ItServiceException;
import com.yonghui.it.service.common.service.BaseItService;
import com.yonghui.it.service.email.model.EmailSendAccount;
import com.yonghui.it.service.email.model.ItReqSendMail;
import com.yonghui.it.service.email.model.SendMailOrg;
import com.yonghui.it.service.sign.sdk.domain.YhResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public abstract class AbstractEmailService extends BaseItService {

    private static final Logger log = LoggerFactory.getLogger(AbstractEmailService.class);

    protected String getServiceName() {
        return "mail";
    }

    protected abstract EmailSendAccount initEmailSendAccount();

    public YhResponse<String> uploadAttachment(byte[] fileData, String orgFileName) throws ItServiceException{
        return uploadFile(new TypeReference<YhResponse<String>>() {
        }, "uploading",fileData,orgFileName);
    }

    public YhResponse<String> uploadAttachment(File file) throws ItServiceException{
        byte[] fileData = getBytes(file);
        if (null == fileData) {
            return YhResponse.error("读取文件错误");
        }
        return uploadAttachment(getBytes(file), file.getName());
    }

    public YhResponse<String> sendMail(ItReqSendMail itReqSendMail) throws ItServiceException {
        EmailSendAccount emailSendAccount = initEmailSendAccount();
        SendMailOrg sendMailOrg = new SendMailOrg();
        sendMailOrg.setAccount(emailSendAccount.getAccount());
        sendMailOrg.setPassword(emailSendAccount.getPassword());
        sendMailOrg.setSubject(itReqSendMail.getSubject());
        sendMailOrg.setContent(itReqSendMail.getContent());
        sendMailOrg.setTo(itReqSendMail.getReceiver());
        sendMailOrg.setRscMap(itReqSendMail.getRscMap());
        sendMailOrg.setFilePath(itReqSendMail.getFilePath());
        return post(new TypeReference<YhResponse<String>>() {
        }, "sendMail", sendMailOrg);
    }

    private byte[] getBytes(File file) {
        byte[] buffer = null;
        try {
            return Files.readAllBytes(file.toPath());
        } catch (IOException e) {
            log.error("IOException", e);
        }
        return buffer;
    }

}
