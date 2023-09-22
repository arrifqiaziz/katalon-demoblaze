# katalon-demoblaze
Project Katalon Week 3 - Bootcamp Intermediate Quality Assurance Sanbercode Batch 49

This repository is a documentation of week 2 from [Bootcamp Intermediate Quality Assurance Sanbercode](https://sanbercode.com/) :

- [Advance Katalon Automation](https://github.com/arrifqiaziz/cypress-cura-health) with cool instructure [Elvanisa Ayu Muhsina](https://www.linkedin.com/in/elvanisa/)

## Requirement for this Automation is :
- Use `Groovy` based `Katalon Studio version 8.6.5`
- Testing web from [`Demoblaze`](https://demoblaze.com/)
- Testing dilaksanakan dengan Website Browser `Mozilla Firefox version 113.0.2`

## IF ELSE Condition
In this automation testing use the `IF ELSE CONDITION` in test case `Login and Logout - Data Driven Test`
```
if (WebUI.verifyElementPresent(findTestObject('Menu Bar/Logout'), 1, FailureHandling.OPTIONAL)) {
    println('Success Login')
    WebUI.verifyElementPresent(findTestObject('Menu Bar/Logout'), 1)
    WebUI.click(findTestObject('Menu Bar/Logout'))
} else {
    println('Failed Login - Wrong Username or Password')
    WebUI.verifyElementPresent(findTestObject('Register and Login Form/Error Login'), 1)
}
```
Which is, if the element `Menu Bar/Logout` is found and present it print Success Login etc, otherwise it print Failed Login etc\

## Data Driven Test
In this testing use also `Data Driven Test` in Test Case `Login and Logout - Data Driven Test` and `Verify Contact Us Page`\
DDT in `Login and Logout - Data Driven Test` use `Internal Data` which set manual in Katalon, but in `Verify Contact Us Page` use dataset from file `.xls` which can access in [`DDT Dataset`](https://github.com/arrifqiaziz/katalon-demoblaze/tree/main/Data%20Set)\

## Report
For easier reporting, the test case is group by it feature in `Test Suite`
```
TS - About and Contact Us
TS - Cart and Purchase
TS - Login
```
And the all feature is group also in one `Test Suites Collection`
```
TSC - All Feature
```


#### Signature

Made with Heart, Hard Work, Smart Think and Whole Soul <3

Name : Arrifqi Aziz Ardhiansyah

[LinkedIn](https://www.linkedin.com/in/arrifqiaziz/) | [GitHub](https://github.com/arrifqiaziz)
