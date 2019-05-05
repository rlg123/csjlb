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
import com.csjlb.cms.domain.Org;
import com.csjlb.cms.service.IOrgService;
import com.csjlb.common.core.controller.BaseController;
import com.csjlb.common.core.page.TableDataInfo;
import com.csjlb.common.core.domain.AjaxResult;
import com.csjlb.common.utils.poi.ExcelUtil;

/**
 * 用户公司 信息操作处理
 * 
 * @author csjlb
 * @date 2019-04-28
 */
@Controller
@RequestMapping("/cms/org")
public class OrgController extends BaseController
{
    private String prefix = "cms/org";
	
	@Autowired
	private IOrgService orgService;
	
	@RequiresPermissions("cms:org:view")
	@GetMapping()
	public String org()
	{
	    return prefix + "/org";
	}
	
	/**
	 * 查询用户公司列表
	 */
	@RequiresPermissions("cms:org:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Org org)
	{
		startPage();
        List<Org> list = orgService.selectOrgList(org);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出用户公司列表
	 */
	@RequiresPermissions("cms:org:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Org org)
    {
    	List<Org> list = orgService.selectOrgList(org);
        ExcelUtil<Org> util = new ExcelUtil<Org>(Org.class);
        return util.exportExcel(list, "org");
    }
	
	/**
	 * 新增用户公司
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存用户公司
	 */
	@RequiresPermissions("cms:org:add")
	@Log(title = "用户公司", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(Org org)
	{		
		return toAjax(orgService.insertOrg(org));
	}

	/**
	 * 修改用户公司
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Long id, ModelMap mmap)
	{
		Org org = orgService.selectOrgById(id);
		mmap.put("org", org);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存用户公司
	 */
	@RequiresPermissions("cms:org:edit")
	@Log(title = "用户公司", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(Org org)
	{		
		return toAjax(orgService.updateOrg(org));
	}
	
	/**
	 * 删除用户公司
	 */
	@RequiresPermissions("cms:org:remove")
	@Log(title = "用户公司", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(orgService.deleteOrgByIds(ids));
	}
	
}
