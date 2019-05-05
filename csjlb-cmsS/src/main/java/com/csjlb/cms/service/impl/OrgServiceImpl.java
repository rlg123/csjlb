package com.csjlb.cms.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.csjlb.cms.mapper.OrgMapper;
import com.csjlb.cms.domain.Org;
import com.csjlb.cms.service.IOrgService;
import com.csjlb.common.core.text.Convert;

/**
 * 用户公司 服务层实现
 * 
 * @author csjlb
 * @date 2019-04-28
 */
@Service
public class OrgServiceImpl implements IOrgService 
{
	@Autowired
	private OrgMapper orgMapper;

	/**
     * 查询用户公司信息
     * 
     * @param id 用户公司ID
     * @return 用户公司信息
     */
    @Override
	public Org selectOrgById(Long id)
	{
	    return orgMapper.selectOrgById(id);
	}
	
	/**
     * 查询用户公司列表
     * 
     * @param org 用户公司信息
     * @return 用户公司集合
     */
	@Override
	public List<Org> selectOrgList(Org org)
	{
	    return orgMapper.selectOrgList(org);
	}
	
    /**
     * 新增用户公司
     * 
     * @param org 用户公司信息
     * @return 结果
     */
	@Override
	public int insertOrg(Org org)
	{
//		默认状态、删除状态为 0（正常）
		org.setStatus("0");
		org.setDelFlag("0");
	    return orgMapper.insertOrg(org);
	}
	
	/**
     * 修改用户公司
     * 
     * @param org 用户公司信息
     * @return 结果
     */
	@Override
	public int updateOrg(Org org)
	{
	    return orgMapper.updateOrg(org);
	}

	/**
     * 删除用户公司对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteOrgByIds(String ids)
	{
		return orgMapper.deleteOrgByIds(Convert.toStrArray(ids));
	}
	
}
