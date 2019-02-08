package com.cyb.blog.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.cyb.blog.dao.BlogMapper;
import com.cyb.blog.dao.FabulousMapper;
import com.cyb.blog.domain.Blog;
import com.cyb.blog.domain.BlogExample;
import com.cyb.blog.domain.BlogVO;
import com.cyb.blog.domain.FabulousExample;
import com.cyb.blog.domain.FabulousExample.Criteria;
import com.cyb.blog.domain.User;
import com.cyb.blog.entity.Pagenation;
import com.cyb.blog.service.BlogServices;
import com.cyb.blog.utils.Validate;

@Service(value="blogServices")
public class BlogServicesImpl implements BlogServices {

	@Resource
	private BlogMapper blogMapper;
	@Resource
	private FabulousMapper fabulousMapper;
	
	public long countByExample(BlogExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int deleteByExample(BlogExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int deleteByPrimaryKey(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int insert(Blog record) {
		record.setCreatetime(new Date());
		record.setId(UUID.randomUUID().toString());
		return blogMapper.insert(record);
	}

	public int insertSelective(Blog record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<Blog> selectByExample(BlogExample example) {
		// TODO Auto-generated method stub
		return null;
	}

	public Blog selectByPrimaryKey(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public int updateByExampleSelective(Blog record, BlogExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateByExample(Blog record, BlogExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateByPrimaryKeySelective(Blog record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateByPrimaryKey(Blog record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Pagenation getList(Blog blog, Pagenation pagenation) {
		BlogExample example = new BlogExample();
		long count = blogMapper.countByExample(example);
		pagenation.setDataCount(count);
		if(count > 0 && pagenation.searcha) {
			List<BlogVO> result = new ArrayList<BlogVO>();
			example.setPagenation(pagenation);
			List<Blog> list = blogMapper.selectByExample(example);
			Validate validate = new Validate();
			User user = validate.isLogin();
			for(Blog b : list) {
				BlogVO blogVO = BlogVO.toBlog(b);
				//查询点赞数量
				FabulousExample fabulousExample = new FabulousExample();
				Criteria criteria = fabulousExample.createCriteria();
				criteria.andBlogIdEqualTo(b.getId());
				long fabulousCount = fabulousMapper.countByExample(fabulousExample);
				blogVO.setFablousCount(fabulousCount);
				//查询当前用户点赞数量
				if(user != null) {
					criteria.andUserIdEqualTo(user.getId());
					long userFabulousCount = fabulousMapper.countByExample(fabulousExample);
					blogVO.setFablous(userFabulousCount==0);
				}
				result.add(blogVO);
			}
			pagenation.setPageDatas(result);
		}
		return pagenation;
	}
}
