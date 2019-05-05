package com.csjlb.cms.controller;

import java.util.List;

import com.csjlb.cms.domain.Org;
import com.csjlb.cms.service.IOrgService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.csjlb.common.annotation.Log;
import com.csjlb.common.enums.BusinessType;
import com.csjlb.cms.domain.User;
import com.csjlb.cms.service.IUserService;
import com.csjlb.common.core.controller.BaseController;
import com.csjlb.common.core.page.TableDataInfo;
import com.csjlb.common.core.domain.AjaxResult;
import com.csjlb.common.utils.poi.ExcelUtil;

/**
 * 用户 信息操作处理
 * 
 * @author csjlb
 * @date 2019-04-26
 */
@Controller
@RequestMapping("/cms/user")
public class UserController extends BaseController
{
    private String prefix = "cms/user";
	
	@Autowired
	private IUserService userService;
	@Autowired
	private IOrgService orgService;
	
	@RequiresPermissions("cms:user:view")
	@GetMapping()
	public String user()
	{
	    return prefix + "/user";
	}
	
	/**
	 * 查询用户列表
	 */
	@RequiresPermissions("cms:user:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(User user)
	{
		startPage();
        List<User> list = userService.selectUserList(user);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出用户列表
	 */
	@RequiresPermissions("cms:user:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(User user)
    {
    	List<User> list = userService.selectUserList(user);
        ExcelUtil<User> util = new ExcelUtil<User>(User.class);
        return util.exportExcel(list, "user");
    }
	
	/**
	 * 新增用户
	 */
	@GetMapping("/add")
	public String add(ModelMap mmap)
	{
		List<Org> list_org = orgService.selectOrgList(new Org("0","0"));
		mmap.put("orgList",list_org);
		return prefix + "/add";
	}
	
	/**
	 * 新增保存用户
	 */
	@RequiresPermissions("cms:user:add")
	@Log(title = "用户", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(User user)
	{		
		return toAjax(userService.insertUser(user));
	}

	/**
	 * 修改用户
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Long id, ModelMap mmap)
	{
		User user = userService.selectUserById(id);
		mmap.put("user", user);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存用户
	 */
	@RequiresPermissions("cms:user:edit")
	@Log(title = "用户", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(User user)
	{		
		return toAjax(userService.updateUser(user));
	}
	
	/**
	 * 删除用户
	 */
	@RequiresPermissions("cms:user:remove")
	@Log(title = "用户", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(userService.deleteUserByIds(ids));
	}


	/**
	 * 校验手机号码
	 */
	@PostMapping("/checkPhoneUnique")
	@ResponseBody
	public String checkPhoneUnique(User user)
	{
		return userService.checkPhoneUnique(user);
	}

}
