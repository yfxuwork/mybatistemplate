package cn.learnmybatis.chapter6.model;

import java.io.Serializable;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 权限表
 *
 * @author 
 */
public class SysPrivilege implements Serializable {
    /**
     * 权限ID
     *
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    private Long id;

    /**
     * 权限名称
     *
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    private String privilege_name;

    /**
     * 权限URL
     *
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    private String privilege_url;

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column sys_privilege.id
     *
     * @return the value of sys_privilege.id
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
    public SysPrivilege withId(Long id) {
        this.setId(id);
        return this;
    }

    /**
     * This method sets the value of the database column sys_privilege.id
     *
     * @param id the value for sys_privilege.id
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column sys_privilege.privilege_name
     *
     * @return the value of sys_privilege.privilege_name
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    public String getPrivilege_name() {
        return privilege_name;
    }

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    public SysPrivilege withPrivilege_name(String privilege_name) {
        this.setPrivilege_name(privilege_name);
        return this;
    }

    /**
     * This method sets the value of the database column sys_privilege.privilege_name
     *
     * @param privilege_name the value for sys_privilege.privilege_name
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    public void setPrivilege_name(String privilege_name) {
        this.privilege_name = privilege_name;
    }

    /**
     * This method returns the value of the database column sys_privilege.privilege_url
     *
     * @return the value of sys_privilege.privilege_url
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    public String getPrivilege_url() {
        return privilege_url;
    }

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    public SysPrivilege withPrivilege_url(String privilege_url) {
        this.setPrivilege_url(privilege_url);
        return this;
    }

    /**
     * This method sets the value of the database column sys_privilege.privilege_url
     *
     * @param privilege_url the value for sys_privilege.privilege_url
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    public void setPrivilege_url(String privilege_url) {
        this.privilege_url = privilege_url;
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
        sb.append(", privilege_name=").append(privilege_name);
        sb.append(", privilege_url=").append(privilege_url);
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
        SysPrivilege other = (SysPrivilege) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPrivilege_name() == null ? other.getPrivilege_name() == null : this.getPrivilege_name().equals(other.getPrivilege_name()))
            && (this.getPrivilege_url() == null ? other.getPrivilege_url() == null : this.getPrivilege_url().equals(other.getPrivilege_url()));
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
        result = prime * result + ((getPrivilege_name() == null) ? 0 : getPrivilege_name().hashCode());
        result = prime * result + ((getPrivilege_url() == null) ? 0 : getPrivilege_url().hashCode());
        return result;
    }
}