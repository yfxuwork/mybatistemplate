package cn.learnmybatis.chapter6.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 角色表
 *
 * @author 
 */
public class SysRole2 implements Serializable {
    /**
     * 角色ID
     *
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    private Long id;

    /**
     * 角色名
     *
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    private String role_name;

    /**
     * 有效标志
     *
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    private Integer enabled;



    private List<SysPrivilege> privilegeList;

    public List<SysPrivilege> getPrivilegeList() {
        return privilegeList;
    }

    public void setPrivilegeList(List<SysPrivilege> privilegeList) {
        this.privilegeList = privilegeList;
    }


    private CreateInfo createInfo;

    public CreateInfo getCreateInfo() {
        return createInfo;
    }

    public void setCreateInfo(CreateInfo createInfo) {
        this.createInfo = createInfo;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    private static final long serialVersionUID = 1L;

    private SysUser user;

    public SysUser getUser() {
        return user;
    }

    public void setUser(SysUser user) {
        this.user = user;
    }

    /**
     * This method returns the value of the database column sys_role.id
     *
     * @return the value of sys_role.id
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
    public SysRole2 withId(Long id) {
        this.setId(id);
        return this;
    }

    /**
     * This method sets the value of the database column sys_role.id
     *
     * @param id the value for sys_role.id
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column sys_role.role_name
     *
     * @return the value of sys_role.role_name
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    public String getRole_name() {
        return role_name;
    }

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    public SysRole2 withRole_name(String role_name) {
        this.setRole_name(role_name);
        return this;
    }

    /**
     * This method sets the value of the database column sys_role.role_name
     *
     * @param role_name the value for sys_role.role_name
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    /**
     * This method returns the value of the database column sys_role.enabled
     *
     * @return the value of sys_role.enabled
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    public Integer getEnabled() {
        return enabled;
    }

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    public SysRole2 withEnabled(Integer enabled) {
        this.setEnabled(enabled);
        return this;
    }

    /**
     * This method sets the value of the database column sys_role.enabled
     *
     * @param enabled the value for sys_role.enabled
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
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
        sb.append(", role_name=").append(role_name);
        sb.append(", enabled=").append(enabled);
        sb.append("]");
        return sb.toString();
    }

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */


}