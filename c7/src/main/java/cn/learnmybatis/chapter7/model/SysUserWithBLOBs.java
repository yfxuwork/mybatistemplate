package cn.learnmybatis.chapter7.model;

import java.io.Serializable;
import java.util.Arrays;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 用户表
 *
 * @author 
 */
public class SysUserWithBLOBs extends SysUser implements Serializable {
    /**
     * 简介
     *
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    private String user_info;

    /**
     * 头像
     *
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    private byte[] head_img;

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column sys_user.user_info
     *
     * @return the value of sys_user.user_info
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    public String getUser_info() {
        return user_info;
    }

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    public SysUserWithBLOBs withUser_info(String user_info) {
        this.setUser_info(user_info);
        return this;
    }

    /**
     * This method sets the value of the database column sys_user.user_info
     *
     * @param user_info the value for sys_user.user_info
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    public void setUser_info(String user_info) {
        this.user_info = user_info;
    }

    /**
     * This method returns the value of the database column sys_user.head_img
     *
     * @return the value of sys_user.head_img
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    public byte[] getHead_img() {
        return head_img;
    }

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    public SysUserWithBLOBs withHead_img(byte[] head_img) {
        this.setHead_img(head_img);
        return this;
    }

    /**
     * This method sets the value of the database column sys_user.head_img
     *
     * @param head_img the value for sys_user.head_img
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    public void setHead_img(byte[] head_img) {
        this.head_img = head_img;
    }

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", user_info=").append(user_info);
        sb.append(", head_img=").append(head_img);
        sb.append("]");
        return sb.toString();
    }

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        SysUserWithBLOBs other = (SysUserWithBLOBs) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUser_name() == null ? other.getUser_name() == null : this.getUser_name().equals(other.getUser_name()))
            && (this.getUser_password() == null ? other.getUser_password() == null : this.getUser_password().equals(other.getUser_password()))
            && (this.getUser_email() == null ? other.getUser_email() == null : this.getUser_email().equals(other.getUser_email()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUser_info() == null ? other.getUser_info() == null : this.getUser_info().equals(other.getUser_info()))
            && (Arrays.equals(this.getHead_img(), other.getHead_img()));
    }

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUser_name() == null) ? 0 : getUser_name().hashCode());
        result = prime * result + ((getUser_password() == null) ? 0 : getUser_password().hashCode());
        result = prime * result + ((getUser_email() == null) ? 0 : getUser_email().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getUser_info() == null) ? 0 : getUser_info().hashCode());
        result = prime * result + (Arrays.hashCode(getHead_img()));
        return result;
    }
}