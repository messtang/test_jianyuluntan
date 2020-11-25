package com.webtest.xldemo;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import com.webtest.dataprovider.*;
public class XDataProvider {

	@DataProvider(name = "loginData")
	public Object[][] getDataOfLogin() throws IOException {
		return new ExcelDataProvider()
				.getTestDataByExcel("data.xlsx","login");
	}
	@DataProvider(name = "registerData")
	public Object[][] getDataOfRegister() throws IOException {
		return new ExcelDataProvider()
				.getTestDataByExcel("data.xlsx", "register");
	}
	
}
