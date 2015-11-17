package com.smmall.controller.system;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.smmall.controller.BaseController;
import com.smmall.entity.LogFormMap;
import com.smmall.mapper.LogMapper;
import com.smmall.plugin.PageView;
import com.smmall.util.Common;

/**
 * 
 * @author liuyaliu 2015-11-15
 * @Email: 308690763@qq.com
 * @version 1.0.0v
 */
@Controller
@RequestMapping("/log/")
public class LogController extends BaseController {
	@Inject
	private LogMapper logMapper;

	@RequestMapping("list")
	public String listUI(Model model) throws Exception {
		return Common.BACKGROUND_PATH + "/system/log/list";
	}

	@ResponseBody
	@RequestMapping("findByPage")
	public PageView findByPage( String pageNow,
			String pageSize) throws Exception {
		LogFormMap logFormMap = getFormMap(LogFormMap.class);
		String order = " order by id asc";
		logFormMap.put("$orderby", order);
		logFormMap=toFormMap(logFormMap, pageNow, pageSize);
        pageView.setRecords(logMapper.findByPage(logFormMap));
		return pageView;
	}
}