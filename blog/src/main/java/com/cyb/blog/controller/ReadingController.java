package com.cyb.blog.controller;

import java.util.Date;
import java.util.UUID;
import javax.servlet.http.HttpSession;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.cyb.blog.domain.Fabulous;
import com.cyb.blog.domain.FabulousExample;
import com.cyb.blog.domain.User;
import com.cyb.blog.domain.FabulousExample.Criteria;
import com.cyb.blog.domain.Reading;
import com.cyb.blog.entity.Pagenation;
import com.cyb.blog.entity.Constant;
import com.cyb.blog.entity.Tips;
import com.cyb.blog.service.FabulousServices;
import com.cyb.blog.service.ReadingServices;
import com.cyb.blog.utils.Validate;

@CrossOrigin
@Controller
@RequestMapping(value="/readingController")
public class ReadingController {
	
	@Autowired
	private ReadingServices readingServices;
	@Autowired
	private FabulousServices fabulousServices;
	
	@RequestMapping(value="/publish")
	@ResponseBody
	public Tips publish (Reading reading) {
		Validate validate = new Validate();
		Tips tips = new Tips("false", false);
		User user = validate.validateAll(tips, null, null);
		if(tips.isValidate()) {
			tips.setValidate(false);
			if(StringUtils.isBlank(reading.getModal()) || !Constant.READING_MODALS.contains(reading.getModal())) {
				tips.setMsg("错误的类型！");
			}else if(StringUtils.isBlank(reading.getTitle())) {
				tips.setMsg("空的标题！");
			}else if(StringUtils.isBlank(reading.getRecommend())) {
				tips.setMsg("空的荐语！");
			}else {
				reading.setAuthor(user.getId());
				int count = readingServices.insert(reading);
				if(count > 1) {
					tips = new Tips("true", true);
				}
			}
		}
		return tips;
	}
	
	@RequestMapping(value="/getList")
	@ResponseBody
	public Pagenation getList (Reading reading, Pagenation pagenation) {
		pagenation = readingServices.getList(reading, pagenation);
		return pagenation;
	}
	
	@RequestMapping(value="/doFablous")
	@ResponseBody
	public Tips doFablous (Reading reading, HttpSession session) {
		Validate validate = new Validate();
		Tips tips = new Tips("false", false);
		User user = validate.validateAll(tips, null, null);
		if(tips.isValidate()) {
			tips.setValidate(false);
			FabulousExample fabulousExample = new FabulousExample();
			Criteria criteria = fabulousExample.createCriteria();
			criteria.andBlogIdEqualTo(reading.getId());
			criteria.andUserIdEqualTo(user.getId());
			long count = fabulousServices.countByExample(fabulousExample);
			if(count > 0) {
				int delete = fabulousServices.deleteByExample(fabulousExample);
				if(delete > 0) {
					tips = new Tips("取消点赞成功！", true);
				}
			}else {
				Fabulous fabulous = new Fabulous();
				fabulous.setId(UUID.randomUUID().toString());
				fabulous.setBlogId(reading.getId());
				fabulous.setUserId(user.getId());
				fabulous.setFabulousDate(new Date());
				int insert = fabulousServices.insert(fabulous);
				if( insert > 0) {
					tips = new Tips("点赞成功！", true);
				}
			}
		}
		return tips;
	}
}
