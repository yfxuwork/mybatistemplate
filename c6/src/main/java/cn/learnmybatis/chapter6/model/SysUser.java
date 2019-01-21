package cn.learnmybatis.chapter6.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 用户表
 *
 * @author 
 */
public class SysUser implements Serializable {
    /**
     * 用户ID
     *
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    private Long id;

    /**
     * 用户名
     *
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    private String user_name;

    /**
     * 密码
     *
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    private String user_password;

    /**
     * 邮箱
     *
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    private String user_email;

    /**
     * 创建时间
     *
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    private Date create_time;

    private SysRole role;

    private List<SysRole> roleList;

    public List<SysRole> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<SysRole> roleList) {
        this.roleList = roleList;
    }

    public SysRole getRole() {
        return role;
    }

    public void setRole(SysRole role) {
        this.role = role;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column sys_user.id
     *
     * @return the value of sys_user.id
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    public SysUser withId(Long id) {
        this.setId(id);
        return this;
    }

    /**
     * This method sets the value of the database column sys_user.id
     *
     * @param id the value for sys_user.id
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column sys_user.user_name
     *
     * @return the value of sys_user.user_name
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    public String getUser_name() {
        return user_name;
    }

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    public SysUser withUser_name(String user_name) {
        this.setUser_name(user_name);
        return this;
    }

    /**
     * This method sets the value of the database column sys_user.user_name
     *
     * @param user_name the value for sys_user.user_name
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    /**
     * This method returns the value of the database column sys_user.user_password
     *
     * @return the value of sys_user.user_password
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    public String getUser_password() {
        return user_password;
    }

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    public SysUser withUser_password(String user_password) {
        this.setUser_password(user_password);
        return this;
    }

    /**
     * This method sets the value of the database column sys_user.user_password
     *
     * @param user_password the value for sys_user.user_password
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    /**
     * This method returns the value of the database column sys_user.user_email
     *
     * @return the value of sys_user.user_email
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    public String getUser_email() {
        return user_email;
    }

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    public SysUser withUser_email(String user_email) {
        this.setUser_email(user_email);
        return this;
    }

    /**
     * This method sets the value of the database column sys_user.user_email
     *
     * @param user_email the value for sys_user.user_email
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    /**
     * This method returns the value of the database column sys_user.create_time
     *
     * @return the value of sys_user.create_time
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    public Date getCreate_time() {
        return create_time;
    }

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    public SysUser withCreate_time(Date create_time) {
        this.setCreate_time(create_time);
        return this;
    }

    /**
     * This method sets the value of the database column sys_user.create_time
     *
     * @param create_time the value for sys_user.create_time
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
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
        sb.append(", id=").append(id);
        sb.append(", user_name=").append(user_name);
        sb.append(", user_password=").append(user_password);
        sb.append(", user_email=").append(user_email);
        sb.append(", create_time=").append(create_time);
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
        SysUser other = (SysUser) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUser_name() == null ? other.getUser_name() == null : this.getUser_name().equals(other.getUser_name()))
            && (this.getUser_password() == null ? other.getUser_password() == null : this.getUser_password().equals(other.getUser_password()))
            && (this.getUser_email() == null ? other.getUser_email() == null : this.getUser_email().equals(other.getUser_email()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()));
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
        return result;
    }
}