package cn.learnmybatis.chapter3.model;

import java.io.Serializable;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 用户角色关联表
 *
 * @author 
 */
public class SysUserRole implements Serializable {
    /**
     * 用户ID
     *
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    private Long user_id;

    /**
     * 角色ID
     *
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    private Long role_id;

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column sys_user_role.user_id
     *
     * @return the value of sys_user_role.user_id
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    public Long getUser_id() {
        return user_id;
    }

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    public SysUserRole withUser_id(Long user_id) {
        this.setUser_id(user_id);
        return this;
    }

    /**
     * This method sets the value of the database column sys_user_role.user_id
     *
     * @param user_id the value for sys_user_role.user_id
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    /**
     * This method returns the value of the database column sys_user_role.role_id
     *
     * @return the value of sys_user_role.role_id
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    public Long getRole_id() {
        return role_id;
    }

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    public SysUserRole withRole_id(Long role_id) {
        this.setRole_id(role_id);
        return this;
    }

    /**
     * This method sets the value of the database column sys_user_role.role_id
     *
     * @param role_id the value for sys_user_role.role_id
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    public void setRole_id(Long role_id) {
        this.role_id = role_id;
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
        sb.append(", user_id=").append(user_id);
        sb.append(", role_id=").append(role_id);
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
        SysUserRole other = (SysUserRole) that;
        return (this.getUser_id() == null ? other.getUser_id() == null : this.getUser_id().equals(other.getUser_id()))
            && (this.getRole_id() == null ? other.getRole_id() == null : this.getRole_id().equals(other.getRole_id()));
    }

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUser_id() == null) ? 0 : getUser_id().hashCode());
        result = prime * result + ((getRole_id() == null) ? 0 : getRole_id().hashCode());
        return result;
    }
}