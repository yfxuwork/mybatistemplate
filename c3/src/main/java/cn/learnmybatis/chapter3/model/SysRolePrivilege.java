package cn.learnmybatis.chapter3.model;

import java.io.Serializable;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 角色权限关联表
 *
 * @author 
 */
public class SysRolePrivilege implements Serializable {
    /**
     * 角色ID
     *
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    private Long role_id;

    /**
     * 权限ID
     *
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    private Long privilege_id;

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column sys_role_privilege.role_id
     *
     * @return the value of sys_role_privilege.role_id
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
    public SysRolePrivilege withRole_id(Long role_id) {
        this.setRole_id(role_id);
        return this;
    }

    /**
     * This method sets the value of the database column sys_role_privilege.role_id
     *
     * @param role_id the value for sys_role_privilege.role_id
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    public void setRole_id(Long role_id) {
        this.role_id = role_id;
    }

    /**
     * This method returns the value of the database column sys_role_privilege.privilege_id
     *
     * @return the value of sys_role_privilege.privilege_id
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    public Long getPrivilege_id() {
        return privilege_id;
    }

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    public SysRolePrivilege withPrivilege_id(Long privilege_id) {
        this.setPrivilege_id(privilege_id);
        return this;
    }

    /**
     * This method sets the value of the database column sys_role_privilege.privilege_id
     *
     * @param privilege_id the value for sys_role_privilege.privilege_id
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    public void setPrivilege_id(Long privilege_id) {
        this.privilege_id = privilege_id;
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
        sb.append(", role_id=").append(role_id);
        sb.append(", privilege_id=").append(privilege_id);
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
        SysRolePrivilege other = (SysRolePrivilege) that;
        return (this.getRole_id() == null ? other.getRole_id() == null : this.getRole_id().equals(other.getRole_id()))
            && (this.getPrivilege_id() == null ? other.getPrivilege_id() == null : this.getPrivilege_id().equals(other.getPrivilege_id()));
    }

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRole_id() == null) ? 0 : getRole_id().hashCode());
        result = prime * result + ((getPrivilege_id() == null) ? 0 : getPrivilege_id().hashCode());
        return result;
    }
}