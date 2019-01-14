//package com.boot.crm.springBoot.mail;
//
//import javax.mail.MessagingException;
//
///**
// * @Author: 华为周旭阳
// * @Date:Create in 2019/1/3 14:42
// * @Description:
// */
//public interface MailService {
//    /**
//     * 普通发送邮件
//     * @param to 邮件的接收者
//     * @param subject 邮件的主题
//     * @param content 邮件的内容
//     */
//    public void sendSimpleMail(String to,String subject,String content);
//
//    /**
//     * 发送带有附件的邮件
//     * @param to 邮件的接收者
//     * @param subject 邮件的主题
//     * @param content 邮件的内容
//     */
//    public void sendAttachmentMail(String to,String subject,String content) throws MessagingException;
//    /**
//     * 发送富文本文件
//     * @param to 邮件的接收者
//     * @param subject 邮件的主题
//     * @param content 邮件的内容
//     */
//    public void sendRichContentMail(String to,String subject,String content) throws MessagingException;
//
//}
