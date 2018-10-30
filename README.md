# MobileAutomationChallenge
# Prerequisites – SYSTEM SETUP
Appium: v1.8 or above, if not installed then you can install it from below mentioned URL:
  https://bitbucket.org/appium/appium.app/downloads/
  
Java: v1.8 v)(if not installed use:
http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) 

CalculaMediaFinal.apk: Copy the .apk file to your "Andriod/sdk/platform-tools/" path. I used Mac so my path was "/Users/sdwivedi/Library/Andriod/sdk/platform-tools"

Andriod Emulator: you can use any emulator of your choice,I used Andriod Virtual Device Manager. Once you launch the Emulator you should see the "CalculaMediaFinal" app in the App section.
(if you dont have it then download the andriod studio from the following link : "https://developer.android.com/studio/" you can launch the emulator from "Andriod Studio > tools > AVD Manager")

Eclipse

Maven:Apache Maven 3.5.4 , if its not installed please install from "https://maven.apache.org/install.html"

#Clone the code by using below command at your folder destination where you want the code.
git clone https://github.com/manushray/MobileAutomationChallenge.git

#Open the Eclipse follow the below steps:
1. Click on the "File > Import "
2. Navigate to Maven > Existing Maven Projects & click on "Next".
3. Browse to the location of folder where you have clone the code & click on "Finish"

# I have created a partial Automation Framework comprise of (Selenium+JAVA+Page Object Model+TestNG+Log4j+Extent Report) where my "Base" class is Parent of all the classes which is present under package name "mobileAndriod.mobileAndriodChallenge.codeBase"
# I have mention all the capabilities in this class only and my application code is present in "App" class present under package name "mobileAndriod.mobileAndriodChallenge.Pages".


# As I have made my code dynamic from where you can change the parameter and data set/Test Scneario by changing in the config.properties file which is present under package name "src/main/java/mobileAndriod/mobileAndriodChallenge/Configuration" 
you need to change at places :
1. Appium_URL(you have to give your appium server Host:port) like http://0.0.0.0:4723/wd/hub so your URL will look like "http://Host:port/wd/hub"
2. App_Path (you have to give your CalculaMediaFinal.apk file installed path that would be) "your file location of Andriod/sdk/platform-tools/CalculaMediaFinal.apk" mine was "/Users/sdwivedi/Library/Android/sdk/platform-tools/CalculaMediaFinal.apk"

# you only have to make 2 changes and run the code either by command line or from Eclipse itself:
# BUT MAKE SURE YOUR APPIUM & EMULATOR SHOULD UP & RUNNING
#Command Line Command, go to the project folder and run the below command:
mvn clean install
#Eclipse:
Click on "Project > Run As > Maven test"


Once Code will run , please refresh the project so that you can view the result either on eclipse console or in FinalExtentReport.html(this you have to view in Browser)this is for better reporint purpose.





