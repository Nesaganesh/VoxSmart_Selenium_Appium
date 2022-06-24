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
        
      a. TODO: Can move these into a config file 
          
          public static Clients client = Clients.ANDROID;
          public static Clients client = Clients.CHROME;
          
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



      
      
<img width="325" alt="Screenshot 2022-06-24 at 10 25 14" src="https://user-images.githubusercontent.com/6851548/175511354-a49a2891-3aa7-4b90-8c2a-a5aa53523f08.png">
<img width="809" alt="Screenshot 2022-06-24 at 02 15 27" src="https://user-images.githubusercontent.com/6851548/175511358-e19322ee-891a-4597-9289-dcc859975c44.png">
<img width="790" alt="Screenshot 2022-06-24 at 02 13 07" src="https://user-images.githubusercontent.com/6851548/175511366-b4892ffd-bc2c-4f75-8d89-430bbc9bdc9c.png">
