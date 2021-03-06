/**
 * 上海汽车集团财务有限责任公司
 * Copyright (c) 1994-2015 All Rights Reserved.
 */
package com.xqsight.authc.appcontroller;

import com.xqsight.sso.authc.SSOUsernamePasswordToken;
import com.xqsight.sso.enums.UserType;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author linhaoran
 * @version ShiroContoller.java, v 0.1 2015年7月3日 上午9:49:26 linhaoran
 */
@Controller
@RequestMapping("/system")
public class SystemUserLoginContoller extends AbstractLoginContoller {
    
    @Value(value = "${default.system.goto.url}")
    private String default_goto_url;

    /** 
     * @see com.saicfc.pmpf.sso.shiro.appcontroller.AbstractLoginContoller#chooseTokenInstance(String, String, boolean)
     */
    @Override
    protected SSOUsernamePasswordToken chooseTokenInstance(String username, String password, boolean isRememberMe) {
        return new SSOUsernamePasswordToken(username, password, isRememberMe, UserType.SYSTEM);
    }
    
    /** 
     * @see AbstractLoginContoller#getDefaultGotoUrl()
     */
    @Override
    protected String getDefaultGotoUrl() {
        return StringUtils.isNotBlank(default_goto_url) ? default_goto_url : super.getDefaultGotoUrl();
    }

}
