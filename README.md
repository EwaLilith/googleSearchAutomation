# Welcome to googleSearchAutomation!

Test Automation Framework was created for testing UI for Google Home and Google Search Pages
TAF is based on Selenium, Test NG and Allure reporting

# Main stack
- Java 11
- Maven (newest)
- Selenium (newest)
- TestNG (newest)
- Cucumber(1.2.5)
- lo4j2 (newest)
- Chrome, Geckodriver, IE drivers need to be added locally
- Chrome, Firefox, IE browsers relevant to downloaded drivers

# Main rules
1. Do not push code without MERGE REQUEST
2. Follow Java IntelliJ basic code styling
3. Run your changes before pushing

# Merge requests rules
1. Commits should be small and atomic
2. Merge requests should be small and atomic
3. Commits should be described according good practices from https://wiki.openstack.org/wiki/GitCommitMessages

# How to run tests:
For Selenium tests
1. mvn clean test -Dsurefire.suiteXmlFiles=[test path] -Dexecution.environment=[environment name] -Dexecution.environment=[browser name]
2. From IntelliJ:
    3. Running from TestNG.xml file
    4. Running from feature files
    5. Running from Runner classes assigned to feature files
    
# Reports Selenium project
Allure for reports

