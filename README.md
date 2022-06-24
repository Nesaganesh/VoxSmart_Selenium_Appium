VoxSmart Selenium Appium 
This project has examples of doing Web and Mobile Automation 

Following below tools have been used
  1. Cucumber
  2. Selenium
  3. Appium
  4. Dependency Injection

Folder Structure
  1. Clients:
      AndroidNative: Sets Android Driver can either have browserstack or local appium instance
      Chrome: Sets chrome driver to run tests from local
      DriverFactory: Change  the below values to run either in chrome/android
        
      a.  TODO: Can move these into a config file 
          1. public static Clients client = Clients.ANDROID;
          2. public static Clients client = Clients.CHROME;
  2. Helper:
      WaitHelper: Waits for the element to be visible
  3. Hooks:
      BasTest: Gets Driver details from the DriverFactory
  4. PageObjects;
    Home Screen - For whatsapp feature all screen automation is impelmented
    TradingHomePage - for https://myvip.avatrade.com/?wtrelogin=1
  5. StepsDefinition:
    TradingSteps : Trading steps defined here  
    WhatsAppSteps : WhatsApp steps definied here 


Resources:
  Features:
    
    a. AvatradeSample.feature
        Was able to automate upto selecting crypto from the dropdown
      
    b. WhatsApp.feature
          Was managed to launch the whatsapp in android Emulator 
          Tried through whats app API to setup the initial number but was unsuccessful 
          And do automation for adding contacts and sending files 


      
      
      
