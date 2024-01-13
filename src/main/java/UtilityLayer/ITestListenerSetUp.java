package UtilityLayer;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class ITestListenerSetUp extends ExtentSetUp implements ITestListener {
	ExtentReports extentReports;
	ExtentTest extentTest;

	@Override
	public void onStart(ITestContext context) {
		extentReports = ExtentSetUp.SetUp(context.getSuite().getName());
	}

	@Override
	public void onTestStart(ITestResult result) {
		extentTest = extentReports.createTest(result.getMethod().getMethodName());

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		extentTest.log(Status.PASS, result.getMethod().getMethodName());
		String Destination = ExtentSetUp.ScreenShot("PassScreenShot", result.getMethod().getMethodName());
		extentTest.addScreenCaptureFromPath(Destination);

	}

	@Override
	public void onTestFailure(ITestResult result) {
		extentTest.log(Status.FAIL, result.getMethod().getMethodName());
		String Destination = ExtentSetUp.ScreenShot("FailScreenShot", result.getMethod().getMethodName());
		extentTest.addScreenCaptureFromPath(Destination);

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		extentTest.log(Status.SKIP, result.getMethod().getMethodName());

	}

	@Override
	public void onFinish(ITestContext context) {
		extentReports.flush();
	}

}
