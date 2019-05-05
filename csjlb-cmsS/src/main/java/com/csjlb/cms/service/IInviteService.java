package com.csjlb.cms.service;

import com.csjlb.cms.domain.Invite;
import java.util.List;

/**
 * 招聘 服务层
 * 
 * @author csjlb
 * @date 2019-05-05
 */
public interface IInviteService 
{
	/**
     * 查询招聘信息
     * 
     * @param inviteId 招聘ID
     * @return 招聘信息
     */
	public Invite selectInviteById(Long inviteId);
	
	/**
     * 查询招聘列表
     * 
     * @param invite 招聘信息
     * @return 招聘集合
     */
	public List<Invite> selectInviteList(Invite invite);
	
	/**
     * 新增招聘
     * 
     * @param invite 招聘信息
     * @return 结果
     */
	public int insertInvite(Invite invite);
	
	/**
     * 修改招聘
     * 
     * @param invite 招聘信息
     * @return 结果
     */
	public int updateInvite(Invite invite);
		
	/**
     * 删除招聘信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteInviteByIds(String ids);
	
}
