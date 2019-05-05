package com.csjlb.cms.mapper;

import com.csjlb.cms.domain.User;
import java.util.List;	

/**
 * 用户 数据层
 * 
 * @author csjlb
 * @date 2019-04-26
 */
public interface UserMapper 
{
	/**
     * 查询用户信息
     * 
     * @param id 用户ID
     * @return 用户信息
     */
	public User selectUserById(Long id);
	
	/**
     * 查询用户列表
     * 
     * @param user 用户信息
     * @return 用户集合
     */
	public List<User> selectUserList(User user);
	
	/**
     * 新增用户
     * 
     * @param user 用户信息
     * @return 结果
     */
	public int insertUser(User user);
	
	/**
     * 修改用户
     * 
     * @param user 用户信息
     * @return 结果
     */
	public int updateUser(User user);
	
	/**
     * 删除用户
     * 
     * @param id 用户ID
     * @return 结果
     */
	public int deleteUserById(Long id);
	
	/**
     * 批量删除用户
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteUserByIds(String[] ids);

	/**
	 * 校验手机号码是否唯一
	 *
	 * @param phonenumber 手机号码
	 * @return 结果
	 */
	public User checkPhoneUnique(String phonenumber);

}