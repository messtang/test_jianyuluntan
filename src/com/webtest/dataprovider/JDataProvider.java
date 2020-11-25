package com.webtest.dataprovider;

import com.webtest.dataprovider.ExcelDataProvider;
import org.testng.annotations.DataProvider;
import java.io.IOException;
/*
数据提供者DataProvider
 */
public class JDataProvider {
    @DataProvider(name = "loginData")
    public Object[][] LoginDataProvider() throws IOException {
        return new ExcelDataProvider()
                .getTestDataByExcel("user-data.xlsx","Sheet1");
    }

    @DataProvider(name = "newSectionData")
    public Object[][] NewSectionDataProvider() throws IOException {
        return new ExcelDataProvider()
                .getTestDataByExcel("section-data.xlsx","Sheet1");
    }

    @DataProvider(name="transferSectionData")
    public Object[][] TransferDataProvider() throws IOException {
        return new ExcelDataProvider()
                .getTestDataByExcel("section-data.xlsx","Sheet2");
    }

    @DataProvider(name="addPointData")
    public Object[][] AddPointDataProvider() throws IOException {
        return new ExcelDataProvider().
                getTestDataByExcel("point-data.xlsx","Sheet1");

    }

    @DataProvider(name="exchangePointData")
    public Object[][] ExchangePointDataProvider() throws IOException {
        return new ExcelDataProvider().
                getTestDataByExcel("point-data.xlsx","Sheet2");

    }

    @DataProvider(name="forum_title")
    public Object[][] get_forum_title_data() throws IOException{
        return new ExcelDataProvider().
                getTestDataByExcel("conf/Site_setting_data.xlsx", "forum_title");
    }

    @DataProvider(name="forum_subtitle")
    public Object[][] get_forum_subtitle_data() throws IOException{
        return new ExcelDataProvider().
                getTestDataByExcel("conf/Site_setting_data.xlsx", "forum_subtitle");
    }

    @DataProvider(name="level_description")
    public Object[][] get_level_description_data() throws IOException{
        return new ExcelDataProvider().
                getTestDataByExcel("conf/Level_setting_data.xlsx", "level_description");
    }

    @DataProvider(name="required_growth_value")
    public Object[][] get_required_growth_value_data() throws IOException{
        return new ExcelDataProvider().
                getTestDataByExcel("conf/Level_setting_data.xlsx", "required_growth_value");
    }

    @DataProvider(name="growth_value")
    public Object[][] get_growth_value_data() throws IOException{
        return new ExcelDataProvider().
                getTestDataByExcel("conf/Growth_setting_data.xlsx", "growth_value");
    }

    @DataProvider(name="integral")
    public Object[][] get_integral_data() throws IOException{
        return new ExcelDataProvider().
                getTestDataByExcel("conf/Growth_setting_data.xlsx", "integral");
    }

    @DataProvider(name="Points_sign_in")
    public Object[][] get_Points_sign_in_data() throws IOException{
        return new ExcelDataProvider().
                getTestDataByExcel("conf/Sign_in_setting_data.xlsx", "Points_sign_in");
    }

    @DataProvider(name="friendship_link_add")
    public Object[][] get_friendship_link_add_data() throws IOException{
        return new ExcelDataProvider().
                getTestDataByExcel("friendship_link_data.xlsx", "friendship_link_add");
    }

    @DataProvider(name="friendship_link_sort")
    public Object[][] get_friendship_link_sort_data() throws IOException{
        return new ExcelDataProvider()
                .getTestDataByExcel("friendship_link_data.xlsx", "friendship_link_sort");
    }



}
