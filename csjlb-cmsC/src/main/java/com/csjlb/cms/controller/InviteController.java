package com.csjlb.cms.controller;

import java.util.List;
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
import com.csjlb.cms.domain.Invite;
import com.csjlb.cms.service.IInviteService;
import com.csjlb.common.core.controller.BaseController;
import com.csjlb.common.core.page.TableDataInfo;
import com.csjlb.common.core.domain.AjaxResult;
import com.csjlb.common.utils.poi.ExcelUtil;

/**
 * 招聘 信息操作处理
 * 
 * @author csjlb
 * @date 2019-05-05
 */
@Controller
@RequestMapping("/cms/invite")
public class InviteController extends BaseController
{
    private String prefix = "cms/invite";
	
	@Autowired
	private IInviteService inviteService;
	
	@RequiresPermissions("cms:invite:view")
	@GetMapping()
	public String invite()
	{
	    return prefix + "/invite";
	}
	
	/**
	 * 查询招聘列表
	 */
	@RequiresPermissions("cms:invite:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Invite invite)
	{
		startPage();
        List<Invite> list = inviteService.selectInviteList(invite);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出招聘列表
	 */
	@RequiresPermissions("cms:invite:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Invite invite)
    {
    	List<Invite> list = inviteService.selectInviteList(invite);
        ExcelUtil<Invite> util = new ExcelUtil<Invite>(Invite.class);
        return util.exportExcel(list, "invite");
    }

	/**
	 * 查看招聘/求职详情
	 */
	@GetMapping("/show/{inviteId}")
	public String show(@PathVariable("inviteId") Long inviteId, ModelMap mmap)
	{
		Invite invite = inviteService.selectInviteById(inviteId);
		System.out.println("111111111111111111111111111");
		mmap.put("invite", invite);
		return prefix + "/show";
	}
	/**
	 * 审核招聘/求职信息
	 */
	@GetMapping("/check/{inviteId}")
	public String check(@PathVariable("inviteId") Long inviteId, ModelMap mmap)
	{
		Invite invite = inviteService.selectInviteById(inviteId);
		System.out.println("111111111111111111111111111");
		mmap.put("invite", invite);
		return prefix + "/check";
	}
	
	/**
	 * 新增招聘
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存招聘
	 */
	@RequiresPermissions("cms:invite:add")
	@Log(title = "招聘", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(Invite invite)
	{		
		return toAjax(inviteService.insertInvite(invite));
	}

	/**
	 * 修改招聘
	 */
	@GetMapping("/edit/{inviteId}")
	public String edit(@PathVariable("inviteId") Long inviteId, ModelMap mmap)
	{
		Invite invite = inviteService.selectInviteById(inviteId);
		mmap.put("invite", invite);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存招聘
	 */
	@RequiresPermissions("cms:invite:edit")
	@Log(title = "招聘", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(Invite invite)
	{		
		return toAjax(inviteService.updateInvite(invite));
	}
	
	/**
	 * 删除招聘
	 */
	@RequiresPermissions("cms:invite:remove")
	@Log(title = "招聘", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(inviteService.deleteInviteByIds(ids));
	}
	
}
