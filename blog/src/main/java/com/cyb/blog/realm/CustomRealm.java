package com.cyb.blog.realm;

import java.util.List;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.cyb.blog.domain.User;
import com.cyb.blog.domain.UserExample;
import com.cyb.blog.domain.UserExample.Criteria;
import com.cyb.blog.service.UserServices;

public class CustomRealm extends AuthorizingRealm {

	private static final Logger logger = LoggerFactory.getLogger(CustomRealm.class);
    @Autowired
    private UserServices userServices;
    
    /**
     * 用户授权认证
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        logger.info("======用户授权认证======");
        User user = (User) principalCollection.getPrimaryPrincipal();
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        simpleAuthorizationInfo.setRoles(userServices.queryRolesByName(user.getUserName()));
        return simpleAuthorizationInfo;
    }
    /**
     * 用户登陆认证
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        logger.info("======用户登陆认证======");
        String userName = authenticationToken.getPrincipal().toString();
        UserExample example = new UserExample();
		Criteria criteria = example.createCriteria();
		criteria.andUserNameEqualTo(userName);
		List<User> users = userServices.selectByExample(example);
		if(users != null && users.size() > 0) {
			User user = users.get(0);
			AuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(user, user.getPassword(), "CustomRealm");
	        return authenticationInfo;
		}
        return null;
    }
}
