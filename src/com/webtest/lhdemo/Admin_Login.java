package com.webtest.lhdemo;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;
import com.webtest.core.BaseTest;
/*
后台登录界面
*/
//第一种解决办法,修改BaseTest:把初始化浏览器改为BeforMethod,添加关闭浏览器设置为AfterMethod
//第二种解决办法,
public class Admin_Login  extends BaseTest{

//    @Test(dataProviderClass = JDataProvider.class,dataProvider = "loginData")
//    public void test_Login(String username,String password) {
//        webtest.open("/index.php/denglu.html");
//
//        webtest.type("name=user", username);
//        webtest.type("name=pwd", password);
//        webtest.click("id=submit");
//        assertTrue(webtest.isTextPresent("剑鱼论坛后台"));
//    }

	@Test
	public void testLogin1() {

		webtest.open("/index.php/denglu.html");

		webtest.type("name=user", "admin");
		webtest.type("name=pwd", "12345678");
        webtest.click("id=submit");
		assertTrue(webtest.isTextPresent("剑鱼论坛后台"));
	}
//
//	@Test
//	public void testLogin2() {
//
//		webtest.open("/index.php/denglu.html");
//
//		webtest.type("name=user", "admin");
//		webtest.type("name=pwd", "");
//        webtest.click("id=submit");
//		assertTrue(webtest.isTextPresent("剑鱼论坛后台"));
//	}

}
