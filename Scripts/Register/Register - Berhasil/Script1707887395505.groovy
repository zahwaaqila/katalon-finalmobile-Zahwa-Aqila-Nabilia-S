import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import io.appium.java_client.AppiumDriver
import com.kms.katalon.core.util.KeywordUtil

Mobile.startApplication('C:\\Users\\LENOVO\\Downloads\\Advantage+demo+3.2.apk', true)

Mobile.tap(findTestObject('Object Repository/Register/Register - Berhasil/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/Register/Register - Berhasil/android.widget.LinearLayout'), 0)

Mobile.tap(findTestObject('Object Repository/Register/Register - Berhasil/android.widget.TextView - SIGN UP TODAY'), 0)

// Perform registration steps
Mobile.tap(findTestObject('Object Repository/Register/Register - Berhasil/android.widget.EditText'), 0)

Mobile.setText(findTestObject('Register/Register - Berhasil/android.widget.TextView - USER NAME'), 'Lilula', 0)

Mobile.tap(findTestObject('Object Repository/Register/Register - Berhasil/android.widget.EditText (1)'), 0)

Mobile.setText(findTestObject('Object Repository/Register/Register - Berhasil/android.widget.EditText (1)'), 'lilu@gmail.com', 
    0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Register/Register - Berhasil/android.widget.EditText (2)'), 0)

Mobile.setText(findTestObject('Object Repository/Register/Register - Berhasil/android.widget.EditText (2)'), 'L@la1', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Register/Register - Berhasil/android.widget.EditText (3)'), 0)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('Object Repository/Register/Register - Berhasil/android.widget.EditText (3)'), 'L@la1', 0)

Mobile.hideKeyboard()

Mobile.scrollToText('Receive exclusive offers and promotions')

if (Mobile.verifyElementChecked(findTestObject('Object Repository/Register/Register - Berhasil/android.widget.CheckBox - Receive exclusive offers and promotions'), 
    0) == false) {
    Mobile.tap(findTestObject('Object Repository/Register/Register - Berhasil/android.widget.CheckBox - Receive exclusive offers and promotions'), 
        0)
} else if (Mobile.verifyElementChecked(findTestObject('Object Repository/Register/Register - Berhasil/android.widget.CheckBox - I agree to the Advantage.com Conditions'), 
    0 ) == false) {
    Mobile.tap(findTestObject('Object Repository/Register/Register - Berhasil/android.widget.CheckBox - I agree to the Advantage.com Conditions'), 
        0)
}else {
	Mobile.tap(findTestObject('Object Repository/Register/Register - Berhasil/android.widget.Button - REGISTER'), 0)
}

timeout = 10
AppiumDriver<?> driver = MobileDriverFactory.getDriver()
def toast = driver.findElementByXPath("//android.widget.Toast")
for (i = 0; i < timeout; i++) {
    if (toast != null) {
        Mobile.scrollToText('USER NAME')

        Mobile.setText(findTestObject('Register/Register - Berhasil/android.widget.TextView - USER NAME'), ''+i, 
            0)
		Mobile.hideKeyboard()
        Mobile.scrollToText('Receive exclusive offers and promotions')

        Mobile.tap(findTestObject('Object Repository/Register/Register - Berhasil/android.widget.Button - REGISTER'), 0)
    }
    
    timeout = 0
}

Mobile.tap(findTestObject('Object Repository/Register/Register - Berhasil/android.widget.ImageView'), 0)

Mobile.closeApplication()

