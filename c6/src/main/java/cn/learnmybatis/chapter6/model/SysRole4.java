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
public class SysRole4 implements Serializable {
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

    private Enabled2 enabled2;

    public Enabled2 getEnabled2() {
        return enabled2;
    }

    public void setEnabled2(Enabled2 enabled2) {
        this.enabled2 = enabled2;
    }

    /**
     * 创建人
     *
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    private Long create_by;

    /**
     * 创建时间
     *
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    private Date create_time;

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
    public SysRole4 withId(Long id) {
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
    public SysRole4 withRole_name(String role_name) {
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
     * This method returns the value of the database column sys_role.create_by
     *
     * @return the value of sys_role.create_by
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    public Long getCreate_by() {
        return create_by;
    }

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    public SysRole4 withCreate_by(Long create_by) {
        this.setCreate_by(create_by);
        return this;
    }

    /**
     * This method sets the value of the database column sys_role.create_by
     *
     * @param create_by the value for sys_role.create_by
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    public void setCreate_by(Long create_by) {
        this.create_by = create_by;
    }

    /**
     * This method returns the value of the database column sys_role.create_time
     *
     * @return the value of sys_role.create_time
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
    public SysRole4 withCreate_time(Date create_time) {
        this.setCreate_time(create_time);
        return this;
    }

    /**
     * This method sets the value of the database column sys_role.create_time
     *
     * @param create_time the value for sys_role.create_time
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
        sb.append(", role_name=").append(role_name);
        sb.append(", create_by=").append(create_by);
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
        SysRole4 other = (SysRole4) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRole_name() == null ? other.getRole_name() == null : this.getRole_name().equals(other.getRole_name()))
            && (this.getCreate_by() == null ? other.getCreate_by() == null : this.getCreate_by().equals(other.getCreate_by()))
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
        result = prime * result + ((getRole_name() == null) ? 0 : getRole_name().hashCode());
        result = prime * result + ((getCreate_by() == null) ? 0 : getCreate_by().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        return result;
    }
}