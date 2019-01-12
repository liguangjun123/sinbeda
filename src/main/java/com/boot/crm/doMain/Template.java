package com.boot.crm.doMain;

import java.util.Date;

/**
 * @Author: 华为周旭阳
 * @Date:Create in 2019/1/3 14:42
 * @Description:
 */
public class Template {
    private String templateLayoutId;

    private String templateLayoutName;

    private String templateLayoutCode;

    private String templateLayoutPath;

    private String state;

    private String templateLayoutType;

    private String templateLayoutOrg;

    private String templateLayoutVerNo;

    private String companyCode;

    private String submitUser;

    private String submitUserName;

    private Date submitTime;

    private String approveUser;

    private String approveUserName;

    private Date approveTime;

    private String workflowId;

    private String createUser;

    private String createUserName;

    private Date createTime;

    private String modifyUser;

    private String modifyUserName;

    private Date modifyTime;

    private String deleteUser;

    private String deleteUserName;

    private Date deleteTime;

    private String templateLayoutDescription;

    private String templateLayoutApplyReason;

    public String getTemplateLayoutDescription() {
        return templateLayoutDescription;
    }

    public void setTemplateLayoutDescription(String templateLayoutDescription) {
        this.templateLayoutDescription = templateLayoutDescription == null ? null : templateLayoutDescription.trim();
    }

    public String getTemplateLayoutApplyReason() {
        return templateLayoutApplyReason;
    }

    public void setTemplateLayoutApplyReason(String templateLayoutApplyReason) {
        this.templateLayoutApplyReason = templateLayoutApplyReason == null ? null : templateLayoutApplyReason.trim();
    }

    public String getTemplateLayoutId() {
        return templateLayoutId;
    }

    public void setTemplateLayoutId(String templateLayoutId) {
        this.templateLayoutId = templateLayoutId == null ? null : templateLayoutId.trim();
    }

    public String getTemplateLayoutName() {
        return templateLayoutName;
    }

    public void setTemplateLayoutName(String templateLayoutName) {
        this.templateLayoutName = templateLayoutName == null ? null : templateLayoutName.trim();
    }

    public String getTemplateLayoutCode() {
        return templateLayoutCode;
    }

    public void setTemplateLayoutCode(String templateLayoutCode) {
        this.templateLayoutCode = templateLayoutCode == null ? null : templateLayoutCode.trim();
    }

    public String getTemplateLayoutPath() {
        return templateLayoutPath;
    }

    public void setTemplateLayoutPath(String templateLayoutPath) {
        this.templateLayoutPath = templateLayoutPath == null ? null : templateLayoutPath.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getTemplateLayoutType() {
        return templateLayoutType;
    }

    public void setTemplateLayoutType(String templateLayoutType) {
        this.templateLayoutType = templateLayoutType == null ? null : templateLayoutType.trim();
    }

    public String getTemplateLayoutOrg() {
        return templateLayoutOrg;
    }

    public void setTemplateLayoutOrg(String templateLayoutOrg) {
        this.templateLayoutOrg = templateLayoutOrg == null ? null : templateLayoutOrg.trim();
    }

    public String getTemplateLayoutVerNo() {
        return templateLayoutVerNo;
    }

    public void setTemplateLayoutVerNo(String templateLayoutVerNo) {
        this.templateLayoutVerNo = templateLayoutVerNo == null ? null : templateLayoutVerNo.trim();
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode == null ? null : companyCode.trim();
    }

    public String getSubmitUser() {
        return submitUser;
    }

    public void setSubmitUser(String submitUser) {
        this.submitUser = submitUser == null ? null : submitUser.trim();
    }

    public String getSubmitUserName() {
        return submitUserName;
    }

    public void setSubmitUserName(String submitUserName) {
        this.submitUserName = submitUserName == null ? null : submitUserName.trim();
    }

    public Date getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(Date submitTime) {
        this.submitTime = submitTime;
    }

    public String getApproveUser() {
        return approveUser;
    }

    public void setApproveUser(String approveUser) {
        this.approveUser = approveUser == null ? null : approveUser.trim();
    }

    public String getApproveUserName() {
        return approveUserName;
    }

    public void setApproveUserName(String approveUserName) {
        this.approveUserName = approveUserName == null ? null : approveUserName.trim();
    }

    public Date getApproveTime() {
        return approveTime;
    }

    public void setApproveTime(Date approveTime) {
        this.approveTime = approveTime;
    }

    public String getWorkflowId() {
        return workflowId;
    }

    public void setWorkflowId(String workflowId) {
        this.workflowId = workflowId == null ? null : workflowId.trim();
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public String getCreateUserName() {
        return createUserName;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName == null ? null : createUserName.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getModifyUser() {
        return modifyUser;
    }

    public void setModifyUser(String modifyUser) {
        this.modifyUser = modifyUser == null ? null : modifyUser.trim();
    }

    public String getModifyUserName() {
        return modifyUserName;
    }

    public void setModifyUserName(String modifyUserName) {
        this.modifyUserName = modifyUserName == null ? null : modifyUserName.trim();
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getDeleteUser() {
        return deleteUser;
    }

    public void setDeleteUser(String deleteUser) {
        this.deleteUser = deleteUser == null ? null : deleteUser.trim();
    }

    public String getDeleteUserName() {
        return deleteUserName;
    }

    public void setDeleteUserName(String deleteUserName) {
        this.deleteUserName = deleteUserName == null ? null : deleteUserName.trim();
    }

    public Date getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }
}