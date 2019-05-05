package com.csjlb.cms.service.impl;

import java.util.List;

import com.csjlb.common.constant.UserConstants;
import com.csjlb.common.utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.csjlb.cms.mapper.UserMapper;
import com.csjlb.cms.domain.User;
import com.csjlb.cms.service.IUserService;
import com.csjlb.common.core.text.Convert;

/**
 * 用户 服务层实现
 * 
 * @author csjlb
 * @date 2019-04-26
 */
@Service
public class UserServiceImpl implements IUserService 
{
	@Autowired
	private UserMapper userMapper;

	/**
     * 查询用户信息
     * 
     * @param id 用户ID
     * @return 用户信息
     */
    @Override
	public User selectUserById(Long id)
	{
	    return userMapper.selectUserById(id);
	}
	
	/**
     * 查询用户列表
     * 
     * @param user 用户信息
     * @return 用户集合
     */
	@Override
	public List<User> selectUserList(User user)
	{
	    return userMapper.selectUserList(user);
	}
	
    /**
     * 新增用户
     * 
     * @param user 用户信息
     * @return 结果
     */
	@Override
	public int insertUser(User user)
	{
	    return userMapper.insertUser(user);
	}
	
	/**
     * 修改用户
     * 
     * @param user 用户信息
     * @return 结果
     */
	@Override
	public int updateUser(User user)
	{
	    return userMapper.updateUser(user);
	}

	/**
     * 删除用户对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteUserByIds(String ids)
	{
		return userMapper.deleteUserByIds(Convert.toStrArray(ids));
	}

	/**
	 * 校验手机号码
	 * @param user
	 * @return
	 */
	@Override
	public String checkPhoneUnique(User user) {
		Long userId = StringUtils.isNull(user.getId()) ? -1L : user.getId();
		User info = userMapper.checkPhoneUnique(user.getPhonenumber());
		if (StringUtils.isNotNull(info) && info.getId().longValue() != userId.longValue())
		{
			return UserConstants.USER_PHONE_NOT_UNIQUE;
		}
		return UserConstants.USER_PHONE_UNIQUE;
	}

}
