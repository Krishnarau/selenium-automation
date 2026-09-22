package com.example.selenium_automation.utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportManager {

	
	public static ExtentReports extent;
	
	public static ExtentReports getReportObject() {
		
		
		
		String path= System.getProperty("user.dir")+"/test-output/ExtentReport.html";
		ExtentSparkReporter reporter= new ExtentSparkReporter(path);
		
		extent=new ExtentReports();
		
		extent.attachReporter(reporter);
		
		return extent;
	}
	
	
	
	
}
