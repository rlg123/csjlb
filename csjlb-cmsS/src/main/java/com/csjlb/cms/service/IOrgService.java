package com.csjlb.cms.service;

import com.csjlb.cms.domain.Org;
import java.util.List;

/**
 * 用户公司 服务层
 * 
 * @author csjlb
 * @date 2019-04-28
 */
public interface IOrgService 
{
	/**
     * 查询用户公司信息
     * 
     * @param id 用户公司ID
     * @return 用户公司信息
     */
	public Org selectOrgById(Long id);
	
	/**
     * 查询用户公司列表
     * 
     * @param org 用户公司信息
     * @return 用户公司集合
     */
	public List<Org> selectOrgList(Org org);
	
	/**
     * 新增用户公司
     * 
     * @param org 用户公司信息
     * @return 结果
     */
	public int insertOrg(Org org);
	
	/**
     * 修改用户公司
     * 
     * @param org 用户公司信息
     * @return 结果
     */
	public int updateOrg(Org org);
		
	/**
     * 删除用户公司信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteOrgByIds(String ids);
	
}
