import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.navigateToUrl(GlobalVariable.baseURL)

WebUI.click(findTestObject('Page_Onliner/HomePage/catalogMenuButton'))

WebUI.click(findTestObject('Page_Onliner/CatalogPage/electronicsMenuButton'))

WebUI.mouseOver(findTestObject('Page_Onliner/CatalogPage/tvVideoButton'))

WebUI.click(findTestObject('Page_Onliner/CatalogPage/televisionsMenuButton'))

WebUI.click(findTestObject('Page_Onliner/CatalogPage/samsungItem'))

CustomKeywords.'onliner.NumberElements.checkNumberElements'(productsPerPage)

CustomKeywords.'onliner.ProductsName.checkProductsName'('Samsung')

