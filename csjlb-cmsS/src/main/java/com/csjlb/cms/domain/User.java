package com.csjlb.cms.domain;


import com.csjlb.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;

/**
 * 用户表 t_cs_user
 * 
 * @author csjlb
 * @date 2019-04-26
 */
public class User extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 用户id */
	private Long id;
	/** 公司ID */
	private Long orgId;
	/** 所属用户组（关联sys_dept） */
	private Long sDepId;
	/** 登录账号 */
	private String loginName;
	/** 用户昵称 */
	private String userName;
	/** email */
	private String email;
	/** 用户性别（0男 1女 2未知） */
	private String sex;
	/** 手机号码 */
	private String phonenumber;
	/** 头像路径 */
	private String avatar;
	/** 密码 */
	private String password;
	/** 生日 */
	private Date birthday;
	/** 联系地址 */
	private String address;
	/** 帐号状态（0正常 1停用） */
	private String status;
	/** 删除标志（0代表存在 2代表删除） */
	private String delFlag;
	/** 所在公司名，left join org */
	private String org_name;

	public void setId(Long id) 
	{
		this.id = id;
	}

	public Long getId() 
	{
		return id;
	}
	public void setOrgId(Long orgId) 
	{
		this.orgId = orgId;
	}

	public Long getOrgId() 
	{
		return orgId;
	}
	public void setSDepId(Long sDepId) 
	{
		this.sDepId = sDepId;
	}

	public Long getSDepId() 
	{
		return sDepId;
	}
	public void setLoginName(String loginName) 
	{
		this.loginName = loginName;
	}

	public String getLoginName() 
	{
		return loginName;
	}
	public void setUserName(String userName) 
	{
		this.userName = userName;
	}

	public String getUserName() 
	{
		return userName;
	}
	public void setEmail(String email) 
	{
		this.email = email;
	}

	public String getEmail() 
	{
		return email;
	}
	public void setSex(String sex) 
	{
		this.sex = sex;
	}

	public String getSex() 
	{
		return sex;
	}
	public void setPhonenumber(String phonenumber)
	{
		this.phonenumber = phonenumber;
	}

	public String getPhonenumber()
	{
		return phonenumber;
	}
	public void setAvatar(String avatar) 
	{
		this.avatar = avatar;
	}

	public String getAvatar() 
	{
		return avatar;
	}
	public void setPassword(String password) 
	{
		this.password = password;
	}

	public String getPassword() 
	{
		return password;
	}
	public void setBirthday(Date birthday) 
	{
		this.birthday = birthday;
	}

	public Date getBirthday() 
	{
		return birthday;
	}
	public void setAddress(String address) 
	{
		this.address = address;
	}

	public String getAddress() 
	{
		return address;
	}
	public void setStatus(String status) 
	{
		this.status = status;
	}

	public String getStatus() 
	{
		return status;
	}
	public void setDelFlag(String delFlag) 
	{
		this.delFlag = delFlag;
	}

	public String getDelFlag() 
	{
		return delFlag;
	}

	public String getOrg_name() {
		return org_name;
	}

	public void setOrg_name(String org_name) {
		this.org_name = org_name;
	}

	@Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("orgId", getOrgId())
            .append("sDepId", getSDepId())
            .append("loginName", getLoginName())
            .append("userName", getUserName())
            .append("email", getEmail())
            .append("sex", getSex())
            .append("phonenumber", getPhonenumber())
            .append("avatar", getAvatar())
            .append("password", getPassword())
            .append("birthday", getBirthday())
            .append("address", getAddress())
            .append("status", getStatus())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
