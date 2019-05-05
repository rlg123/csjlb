package com.csjlb.cms.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.csjlb.cms.mapper.InviteMapper;
import com.csjlb.cms.domain.Invite;
import com.csjlb.cms.service.IInviteService;
import com.csjlb.common.core.text.Convert;

/**
 * 招聘 服务层实现
 * 
 * @author csjlb
 * @date 2019-05-05
 */
@Service
public class InviteServiceImpl implements IInviteService 
{
	@Autowired
	private InviteMapper inviteMapper;

	/**
     * 查询招聘信息
     * 
     * @param inviteId 招聘ID
     * @return 招聘信息
     */
    @Override
	public Invite selectInviteById(Long inviteId)
	{
	    return inviteMapper.selectInviteById(inviteId);
	}
	
	/**
     * 查询招聘列表
     * 
     * @param invite 招聘信息
     * @return 招聘集合
     */
	@Override
	public List<Invite> selectInviteList(Invite invite)
	{
	    return inviteMapper.selectInviteList(invite);
	}
	
    /**
     * 新增招聘
     * 
     * @param invite 招聘信息
     * @return 结果
     */
	@Override
	public int insertInvite(Invite invite)
	{
	    return inviteMapper.insertInvite(invite);
	}
	
	/**
     * 修改招聘
     * 
     * @param invite 招聘信息
     * @return 结果
     */
	@Override
	public int updateInvite(Invite invite)
	{
	    return inviteMapper.updateInvite(invite);
	}

	/**
     * 删除招聘对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteInviteByIds(String ids)
	{
		return inviteMapper.deleteInviteByIds(Convert.toStrArray(ids));
	}
	
}
