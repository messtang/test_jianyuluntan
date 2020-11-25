package com.webtest.demo;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Friendship_link extends BaseTest{
	@BeforeMethod(description="管理员登录")
	public void login_to() {
		webtest.open("http://127.0.0.1/index.php/denglu.html");
		webtest.type("name=user", "admin");
		webtest.type("name=pwd", "12345678");
		webtest.click("id=submit");
		webtest.runJs("document.getElementById('jianyuluntansidebar').scrollTo(0,document.getElementById('jianyuluntansidebar').scrollHeight)");
		
	}
	
	@AfterMethod
	public void submitAndQuit() throws InterruptedException {
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		webtest.click("id=formsubmit");
		webtest.click("xpath=//a[text()='退出']");
		assertEquals(webtest.isDisplayed("class=navbar-brand"), true);
	}
	
	@Test(description="添加友情链接",dataProvider="friendship_link_add",dataProviderClass=JDataProvider.class)
	public void test_friendship_link_add(String name,String url) {
		webtest.click("xpath=//a[text()='添加友情链接']");
		webtest.typeAndClear("name=mingcheng", name);		
		webtest.typeAndClear("name=dizhi", url);
		webtest.click("xpath=//label[@class='custom-control-label']");
	}

	
}
