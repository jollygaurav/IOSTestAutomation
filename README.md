<h2>Framework Structure of IOS App Automation using APPIUM + JAVA + TESTNG with complete Setup Guide over macOS Catalina</h2>

Software's to be installed - 
<ul>
  <li> Homebrew -> 
    
    /bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"   
   
   [Install xcode first (point - 5) if there are errors in installing homebrew]
   </li> 
  <li>Carthage -> 
    
  ```
  brew install carthage
  ```
  </li>
  <li>Node and NPM -> 
  
  ```
  brew install node
  ```
  </li>
  <li>JDK(Download from here) -> 

  ```
  https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html
  ```
  </li>
  <li>Xcode[command line] -> 
  
  ```
  xcode-select --install
  ```
  </li>
  <li>Set JAVA_HOME in bash/zsh profile</li>
  <li>XCode -> 
  
  ```
  https://apps.apple.com/in/app/xcode/id497799835?mt=12
  ```
  </li>
  <li>Authorize-ios -> 
  
  ```
  npm install -g authorize-ios
  ```
  </li>
  <li>Ios deploy -> 
  
  ```
  brew install ios-deploy
  ```
  </li>
  <li>
  IdeviceInstaller -> 
  
  ```
  brew install ideviceinstaller
  ```
  </li>
  <li>IOS webkit debug proxy -> 
  
  ```
  brew install ios-webkit-debug-proxy
  ```
  </li>
  <li>Appium -> 
  
  ```
  npm install -g appium
  ```
  </li>
  <li>Appium Doctor -> 
  
  ```
  npm install -g appium-doctor
  ```
  </li>
  <li>Maven -> 
  
  ```
  brew install maven
  ```
  </li>
  <li>Set maven path in bash/zsh profile -> 
  
  ```
  export PATH=/usr/local/Cellar/maven/[maven_version]/bin:$PATH
  ```
  </li>
  <li>Install IDE of your choice -> IntelliJIdea or Eclipse</li>
  <li>Create a new project in XCODE and generate a .app build in the directory folder by 
  
  ```
  xcodebuild -sdk iphonesimulator[XX.X] e.g. xcodebuild -sdk iphonesimulator11.4
  ```
  </li>
  <li>Start up appium in terminal -> Type 
  
  ```
  Appium
  ```
  </li>
  <li>Go to your project directory in terminal and run 
  
  ```
  mvn clean install > mvn clean test -Dsurefire.suiteXMLFiles=IOSTest.xml
  ```
  </li>
</ul>
