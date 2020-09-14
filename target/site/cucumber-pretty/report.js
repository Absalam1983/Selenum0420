$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("customerservice.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# Md Salam"
    }
  ],
  "line": 3,
  "name": "Digital service \u0026 device support",
  "description": "",
  "id": "digital-service-\u0026-device-support",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@Customerservice"
    }
  ]
});
formatter.scenario({
  "line": 6,
  "name": "validation of Digital service \u0026 device support",
  "description": "",
  "id": "digital-service-\u0026-device-support;validation-of-digital-service-\u0026-device-support",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "user visit homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "user click on customer service",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user click on Digital service \u0026 device support",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user should redirect to Digital service \u0026 device support page",
  "keyword": "Then "
});
formatter.match({
  "location": "customerservice.user_visit_homepage()"
});
formatter.result({
  "duration": 161547300,
  "status": "passed"
});
formatter.match({
  "location": "customerservice.user_click_on_customer_service()"
});
formatter.result({
  "duration": 33400,
  "status": "passed"
});
formatter.match({
  "location": "customerservice.user_click_on_Digital_service_device_support()"
});
formatter.result({
  "duration": 33800,
  "status": "passed"
});
formatter.match({
  "location": "customerservice.user_should_redirect_to_Digital_service_device_support_page()"
});
formatter.result({
  "duration": 27500,
  "status": "passed"
});
formatter.uri("gmail_login.feature");
formatter.feature({
  "line": 1,
  "name": "user want to sign in \u0026 sign off from  gmail  account",
  "description": "",
  "id": "user-want-to-sign-in-\u0026-sign-off-from--gmail--account",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "positive login \u0026 logout with valid E-Mail addriss and password",
  "description": "",
  "id": "user-want-to-sign-in-\u0026-sign-off-from--gmail--account;positive-login-\u0026-logout-with-valid-e-mail-addriss-and-password",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user visiting homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "click my account button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user enter \"\u003cE-Mail address\u003e\" \u0026 \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user click on sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user successfuly login to  the system",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user click on sing off button for logout",
  "keyword": "And "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "user-want-to-sign-in-\u0026-sign-off-from--gmail--account;positive-login-\u0026-logout-with-valid-e-mail-addriss-and-password;",
  "rows": [
    {
      "cells": [
        "E-Mail address",
        "password"
      ],
      "line": 14,
      "id": "user-want-to-sign-in-\u0026-sign-off-from--gmail--account;positive-login-\u0026-logout-with-valid-e-mail-addriss-and-password;;1"
    },
    {
      "cells": [
        "absalam164@gmail.com",
        "296408Ab$"
      ],
      "line": 15,
      "id": "user-want-to-sign-in-\u0026-sign-off-from--gmail--account;positive-login-\u0026-logout-with-valid-e-mail-addriss-and-password;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 15,
  "name": "positive login \u0026 logout with valid E-Mail addriss and password",
  "description": "",
  "id": "user-want-to-sign-in-\u0026-sign-off-from--gmail--account;positive-login-\u0026-logout-with-valid-e-mail-addriss-and-password;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user visiting homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "click my account button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user enter \"absalam164@gmail.com\" \u0026 \"296408Ab$\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user click on sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user successfuly login to  the system",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user click on sing off button for logout",
  "keyword": "And "
});
formatter.match({
  "location": "login.user_visiting_homepage()"
});
formatter.result({
  "duration": 79700,
  "status": "passed"
});
formatter.match({
  "location": "gmail_login.click_my_account_button()"
});
formatter.result({
  "duration": 75700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "absalam164@gmail.com",
      "offset": 12
    },
    {
      "val": "296408Ab$",
      "offset": 37
    }
  ],
  "location": "gmail_login.user_enter(String,String)"
});
formatter.result({
  "duration": 3271000,
  "status": "passed"
});
formatter.match({
  "location": "login.user_click_on_sign_in_button()"
});
formatter.result({
  "duration": 29700,
  "status": "passed"
});
formatter.match({
  "location": "gmail_login.user_successfuly_login_to_the_system()"
});
formatter.result({
  "duration": 30400,
  "status": "passed"
});
formatter.match({
  "location": "gmail_login.user_click_on_sing_off_button_for_logout()"
});
formatter.result({
  "duration": 37000,
  "status": "passed"
});
formatter.uri("login.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Md Salam"
    }
  ],
  "line": 3,
  "name": "User want to Sign in \u0026 Sign Off from Oscommerce",
  "description": "\r\nIn order to Sign in and Sign Off from account\r\nAs a register user\r\nI want to enter E-Mail Address, password, and click sign-in to login\r\nand Click Sign Off for Sign Out",
  "id": "user-want-to-sign-in-\u0026-sign-off-from-oscommerce",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@UserLogin"
    }
  ]
});
formatter.scenarioOutline({
  "line": 11,
  "name": "Positive login and logout with valid E-Mail Address and Password",
  "description": "",
  "id": "user-want-to-sign-in-\u0026-sign-off-from-oscommerce;positive-login-and-logout-with-valid-e-mail-address-and-password",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 13,
  "name": "user visiting homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "click My Account button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user enter \"\u003cE-Mail Address\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "user click on sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user successfully login to the system",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "user click on Log off Button for logout",
  "keyword": "And "
});
formatter.examples({
  "line": 20,
  "name": "",
  "description": "",
  "id": "user-want-to-sign-in-\u0026-sign-off-from-oscommerce;positive-login-and-logout-with-valid-e-mail-address-and-password;",
  "rows": [
    {
      "cells": [
        "E-Mail Address",
        "password"
      ],
      "line": 22,
      "id": "user-want-to-sign-in-\u0026-sign-off-from-oscommerce;positive-login-and-logout-with-valid-e-mail-address-and-password;;1"
    },
    {
      "cells": [
        "pat@yahoo.com",
        "Abc123"
      ],
      "line": 23,
      "id": "user-want-to-sign-in-\u0026-sign-off-from-oscommerce;positive-login-and-logout-with-valid-e-mail-address-and-password;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 23,
  "name": "Positive login and logout with valid E-Mail Address and Password",
  "description": "",
  "id": "user-want-to-sign-in-\u0026-sign-off-from-oscommerce;positive-login-and-logout-with-valid-e-mail-address-and-password;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@UserLogin"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "user visiting homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "click My Account button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user enter \"pat@yahoo.com\" and \"Abc123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "user click on sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user successfully login to the system",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "user click on Log off Button for logout",
  "keyword": "And "
});
formatter.match({
  "location": "login.user_visiting_homepage()"
});
formatter.result({
  "duration": 46200,
  "status": "passed"
});
formatter.match({
  "location": "login.click_My_Account_button()"
});
formatter.result({
  "duration": 36700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "pat@yahoo.com",
      "offset": 12
    },
    {
      "val": "Abc123",
      "offset": 32
    }
  ],
  "location": "login.user_enter_and(String,String)"
});
formatter.result({
  "duration": 102900,
  "status": "passed"
});
formatter.match({
  "location": "login.user_click_on_sign_in_button()"
});
formatter.result({
  "duration": 27400,
  "status": "passed"
});
formatter.match({
  "location": "login.user_successfully_login_to_the_system()"
});
formatter.result({
  "duration": 29500,
  "status": "passed"
});
formatter.match({
  "location": "login.user_click_on_Log_off_Button_for_logout()"
});
formatter.result({
  "duration": 31100,
  "status": "passed"
});
});