<h2>Framework Structure of IOS App Automation using APPIUM + JAVA + TESTNG with complete Setup Guide over macOS Catalina</h2>

Software's to be installed - 
<ul>
  <li> Homebrew -> <i>/bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"</i>   [Install xcode first (point - 5) if there are errors in installing homebrew]</li> 
  <li>Carthage -> <i>brew install carthage</i></li>
  <li>Node and NPM -> <i>brew install node</i></li>
  <li>JDK(Download from here) -> <i>https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html</i></li>
  <li>Xcode[command line] -> <i>xcode-select --install</i></li>
  <li>Set JAVA_HOME in bash/zsh profile</li>
  <li>XCode -> <i>https://apps.apple.com/in/app/xcode/id497799835?mt=12</i></li>
  <li>Authorize-ios -> <i>npm install -g authorize-ios</i></li>
  <li>Ios deploy -> <i>brew install ios-deploy</i></li>
  <li>IdeviceInstaller -> <i>brew install ideviceinstaller</i></li>
  <li>IOS webkit debug proxy -> <i>brew install ios-webkit-debug-proxy</i></li>
  <li>Appium -> <i>npm install -g appium</i></li>
  <li>Appium Doctor -> <i>npm install -g appium-doctor</i></li>
  <li>Maven -> <i>brew install maven</i></li>
  <li>Set maven path in bash/zsh profile -> <i>export PATH=/usr/local/Cellar/maven/[maven_version]/bin:$PATH</i></li>
  <li>Install IDE of your choice -> IntelliJIdea or Eclipse</li>
  <li>Create a new project in XCODE and generate a .app build in the directory folder by <i>xcodebuild -sdk iphonesimulator[XX.X] </i>e.g. xcodebuild -sdk iphonesimulator11.4</li>
  <li>Start up appium in terminal -> Type <i>Appium</i></li>
  <li>Go to your project directory in terminal and run <i>mvn clean install > mvn clean test -Dsurefire.suiteXMLFiles=IOSTest.xml</i></li>
</ul>
