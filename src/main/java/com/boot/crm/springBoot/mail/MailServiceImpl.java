//package com.boot.crm.springBoot.mail;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.core.io.ClassPathResource;
//import org.springframework.core.io.FileSystemResource;
//import org.springframework.mail.SimpleMailMessage;
//import org.springframework.mail.javamail.JavaMailSender;
//import org.springframework.mail.javamail.MimeMessageHelper;
//import org.springframework.stereotype.Service;
//
//import javax.mail.MessagingException;
//import javax.mail.internet.MimeMessage;
//import java.io.File;
//
///**
// * @Author: 华为周旭阳
// * @Date:Create in 2019/1/3 14:42
// * @Description:
// */
//@Service
//public class MailServiceImpl implements MailService {
//    private final Logger logger = LoggerFactory.getLogger(this.getClass());
//
//    @Autowired
//    private JavaMailSender mailSender;
//
//    @Value("${spring.mail.username}") //邮件的发送者
//    private String from;
//
//
//    @Override
//    public void sendSimpleMail(String to, String subject, String content) {
//        SimpleMailMessage mailMessage = new SimpleMailMessage();
//        mailMessage.setFrom(from);
//        mailMessage.setTo(to);
//        mailMessage.setSubject(subject);
//        mailMessage.setText(content);
//        try {
//            mailSender.send(mailMessage);
//            logger.info("简单邮件已发送");
//        }catch (Exception e){
//            logger.error("发送简单邮件发生异常");
//        }
//
//    }
//
//    @Override
//    public void sendAttachmentMail(String to, String subject, String content) throws MessagingException {
//        //使用JavaMail的MimeMessage，支付更加复杂的邮件格式和内容
//        MimeMessage mimeMessage = mailSender.createMimeMessage();
//        //创建MimeMessageHelper对象，处理MimeMessage的辅助类
//        MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage, true);
//        //使用mimeMessageHelper辅助类设定参数
//        messageHelper.setFrom(from);
//        messageHelper.setTo(to);
//        messageHelper.setSubject(subject);
//        messageHelper.setText(content);
//        //加载文件资源，作为附件
////        ClassPathResource pathResource = new ClassPathResource("C:\\Users\\wanda\\Desktop\\长护险居民端4-20.docx");
//        File file = new File("C:\\Users\\wanda\\Desktop\\长护险居民端4-20.docx");
//        //加入附件
//        messageHelper.addAttachment("attachment",file); //邮件中显示附件的别名
//        //发送邮件
//        mailSender.send(mimeMessage);
//    }
//
//    @Override
//    public void sendRichContentMail(String to, String subject, String content) throws MessagingException {
//        //使用JavaMail的MimeMessage，支付更加复杂的邮件格式和内容
//        MimeMessage mimeMessage = mailSender.createMimeMessage();
//        //创建MimeMessageHelper对象，处理MimeMessage的辅助类
//        MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage, true);
//        messageHelper.setFrom(from);
//        messageHelper.setTo(to);
//        messageHelper.setSubject(subject);
//        //第二个参数true，表示text的内容为html，然后注意<img/>标签，src='cid:file'，'cid'是contentId的缩写，
//        // 'file'是一个标记，需要在后面的代码中调用MimeMessageHelper的addInline方法替代成文件
//        messageHelper.setText(
//                "<body> <p style=\"color: red\">Hello html mail </p> <img src='cid:file'/> </body>",true);
//        FileSystemResource file = new FileSystemResource("C:\\Users\\wanda\\Desktop\\长护险居民端4-20.docx");
//        messageHelper.addInline("file",file);
//        mailSender.send(mimeMessage);
//    }}
