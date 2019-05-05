package com.csjlb.cms.domain;


import com.csjlb.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;

/**
 * 招聘表 t_cs_invite
 * 
 * @author csjlb
 * @date 2019-05-05
 */
public class Invite extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 招聘id */
	private Long inviteId;
	/** 招聘/求职：0:招聘,1:求职 */
	private Integer inviteType;
	/** 岗位名称 */
	private String jobName;
	/** 岗位描述 */
	private String jobIntroduce;
	/** 招聘描述 */
	private String inviteIntroduce;
	/** 联系方式 */
	private String contactWay;
	/** 地区id */
	private Long areaId;
	/** 发布人id */
	private Long publishUserId;
	/** 发布人姓名 */
	private String publishUserName;
	/** 发布时间 */
	private Date publishTime;
	/** 审核人id */
	private Long checkUserId;
	/** 审核人姓名 */
	private String checkUserName;
	/** 审核时间 */
	private Date checkTime;
	/** 审核结果：0:未审核,1:审核未通过,2:审核通过 */
	private Integer checkResult;
	/** 审核原因 */
	private String checkMessage;
	/** 是否显示-1:显示，0:不显示 */
	private Integer isShow;
	/** 浏览量 */
	private Integer browseCount;
	/** 备用1 */
	private String other1;
	/** 备用2 */
	private String other2;
	/** 备用3 */
	private String other3;
	/** 备用4 */
	private String other4;
	/** 备用5 */
	private String other5;

	public void setInviteId(Long inviteId) 
	{
		this.inviteId = inviteId;
	}

	public Long getInviteId() 
	{
		return inviteId;
	}
	public void setInviteType(Integer inviteType) 
	{
		this.inviteType = inviteType;
	}

	public Integer getInviteType() 
	{
		return inviteType;
	}
	public void setJobName(String jobName) 
	{
		this.jobName = jobName;
	}

	public String getJobName() 
	{
		return jobName;
	}
	public void setJobIntroduce(String jobIntroduce) 
	{
		this.jobIntroduce = jobIntroduce;
	}

	public String getJobIntroduce() 
	{
		return jobIntroduce;
	}
	public void setInviteIntroduce(String inviteIntroduce) 
	{
		this.inviteIntroduce = inviteIntroduce;
	}

	public String getInviteIntroduce() 
	{
		return inviteIntroduce;
	}
	public void setContactWay(String contactWay) 
	{
		this.contactWay = contactWay;
	}

	public String getContactWay() 
	{
		return contactWay;
	}
	public void setAreaId(Long areaId) 
	{
		this.areaId = areaId;
	}

	public Long getAreaId() 
	{
		return areaId;
	}
	public void setPublishUserId(Long publishUserId) 
	{
		this.publishUserId = publishUserId;
	}

	public Long getPublishUserId() 
	{
		return publishUserId;
	}
	public void setPublishUserName(String publishUserName) 
	{
		this.publishUserName = publishUserName;
	}

	public String getPublishUserName() 
	{
		return publishUserName;
	}
	public void setPublishTime(Date publishTime) 
	{
		this.publishTime = publishTime;
	}

	public Date getPublishTime() 
	{
		return publishTime;
	}
	public void setCheckUserId(Long checkUserId) 
	{
		this.checkUserId = checkUserId;
	}

	public Long getCheckUserId() 
	{
		return checkUserId;
	}
	public void setCheckUserName(String checkUserName) 
	{
		this.checkUserName = checkUserName;
	}

	public String getCheckUserName() 
	{
		return checkUserName;
	}
	public void setCheckTime(Date checkTime) 
	{
		this.checkTime = checkTime;
	}

	public Date getCheckTime() 
	{
		return checkTime;
	}
	public void setCheckResult(Integer checkResult) 
	{
		this.checkResult = checkResult;
	}

	public Integer getCheckResult() 
	{
		return checkResult;
	}
	public void setCheckMessage(String checkMessage) 
	{
		this.checkMessage = checkMessage;
	}

	public String getCheckMessage() 
	{
		return checkMessage;
	}
	public void setIsShow(Integer isShow) 
	{
		this.isShow = isShow;
	}

	public Integer getIsShow() 
	{
		return isShow;
	}
	public void setBrowseCount(Integer browseCount) 
	{
		this.browseCount = browseCount;
	}

	public Integer getBrowseCount() 
	{
		return browseCount;
	}
	public void setOther1(String other1) 
	{
		this.other1 = other1;
	}

	public String getOther1() 
	{
		return other1;
	}
	public void setOther2(String other2) 
	{
		this.other2 = other2;
	}

	public String getOther2() 
	{
		return other2;
	}
	public void setOther3(String other3) 
	{
		this.other3 = other3;
	}

	public String getOther3() 
	{
		return other3;
	}
	public void setOther4(String other4) 
	{
		this.other4 = other4;
	}

	public String getOther4() 
	{
		return other4;
	}
	public void setOther5(String other5) 
	{
		this.other5 = other5;
	}

	public String getOther5() 
	{
		return other5;
	}

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("inviteId", getInviteId())
            .append("inviteType", getInviteType())
            .append("jobName", getJobName())
            .append("jobIntroduce", getJobIntroduce())
            .append("inviteIntroduce", getInviteIntroduce())
            .append("contactWay", getContactWay())
            .append("areaId", getAreaId())
            .append("publishUserId", getPublishUserId())
            .append("publishUserName", getPublishUserName())
            .append("publishTime", getPublishTime())
            .append("checkUserId", getCheckUserId())
            .append("checkUserName", getCheckUserName())
            .append("checkTime", getCheckTime())
            .append("checkResult", getCheckResult())
            .append("checkMessage", getCheckMessage())
            .append("isShow", getIsShow())
            .append("browseCount", getBrowseCount())
            .append("other1", getOther1())
            .append("other2", getOther2())
            .append("other3", getOther3())
            .append("other4", getOther4())
            .append("other5", getOther5())
            .toString();
    }
}
