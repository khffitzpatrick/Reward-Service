$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('RewardsService\AcceptanceTests\acceptanceCriteria.feature');
formatter.feature({
  "id": "rewards-service",
  "description": "",
  "name": "Rewards Service",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "rewards-service;general-acceptance-criteria",
  "description": "",
  "name": "General Acceptance Criteria",
  "keyword": "Scenario",
  "line": 3,
  "type": "scenario"
});
formatter.step({
  "name": "I am a customer with channel subscriptions to the Movies and Music channels",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "I am eligible for rewards",
  "keyword": "When ",
  "line": 7
});
formatter.step({
  "name": "I expect to be rewarded the Pirates of the Caribbean Collection, Karaoke Pro Microphone",
  "keyword": "Then ",
  "line": 9
});
formatter.match({
  "location": "RewardsServiceStepDefs.I_am_a_customer_with_channel_subscriptions_to_the_Movies_and_Music_channels()"
});
formatter.result({
  "duration": 391043480,
  "status": "passed"
});
formatter.match({
  "location": "RewardsServiceStepDefs.I_am_eligible_for_rewards()"
});
formatter.result({
  "duration": 229102,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Pirates of the Caribbean Collection, Karaoke Pro Microphone",
      "offset": 28
    }
  ],
  "location": "RewardsServiceStepDefs.I_expect_to_be_rewarded(String)"
});
formatter.result({
  "duration": 3144738,
  "status": "passed"
});
formatter.scenario({
  "id": "rewards-service;eligible-sports-customer",
  "description": "",
  "name": "Eligible Sports Customer",
  "keyword": "Scenario",
  "line": 13,
  "type": "scenario",
  "comments": [
    {
      "value": "############################################################################################################",
      "line": 11
    }
  ]
});
formatter.step({
  "name": "I am a customer with a subscription to the Sports channel",
  "keyword": "Given ",
  "line": 15
});
formatter.step({
  "name": "I am eligible for rewards",
  "keyword": "When ",
  "line": 17
});
formatter.step({
  "name": "I expect to be rewarded the Champions League Final Ticket",
  "keyword": "Then ",
  "line": 19
});
formatter.match({
  "arguments": [
    {
      "val": "Sports",
      "offset": 43
    }
  ],
  "location": "RewardsServiceStepDefs.I_am_a_customer_with_a_subscription_to_a_specified_channel(String)"
});
formatter.result({
  "duration": 194338,
  "status": "passed"
});
formatter.match({
  "location": "RewardsServiceStepDefs.I_am_eligible_for_rewards()"
});
formatter.result({
  "duration": 187499,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Champions League Final Ticket",
      "offset": 28
    }
  ],
  "location": "RewardsServiceStepDefs.I_expect_to_be_rewarded(String)"
});
formatter.result({
  "duration": 198897,
  "status": "passed"
});
formatter.scenario({
  "id": "rewards-service;eligible-kids-customer",
  "description": "",
  "name": "Eligible Kids Customer",
  "keyword": "Scenario",
  "line": 23,
  "type": "scenario",
  "comments": [
    {
      "value": "############################################################################################################",
      "line": 21
    }
  ]
});
formatter.step({
  "name": "I am a customer with a subscription to the Kids channel",
  "keyword": "Given ",
  "line": 25
});
formatter.step({
  "name": "I am eligible for rewards",
  "keyword": "When ",
  "line": 27
});
formatter.step({
  "name": "I expect to be shown the message \u0027You are not eligible for any rewards\u0027",
  "keyword": "Then ",
  "line": 29
});
formatter.match({
  "arguments": [
    {
      "val": "Kids",
      "offset": 43
    }
  ],
  "location": "RewardsServiceStepDefs.I_am_a_customer_with_a_subscription_to_a_specified_channel(String)"
});
formatter.result({
  "duration": 64399,
  "status": "passed"
});
formatter.match({
  "location": "RewardsServiceStepDefs.I_am_eligible_for_rewards()"
});
formatter.result({
  "duration": 186929,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "You are not eligible for any rewards",
      "offset": 34
    }
  ],
  "location": "RewardsServiceStepDefs.I_expect_to_be_shown_the_message(String)"
});
formatter.result({
  "duration": 202317,
  "status": "passed"
});
formatter.scenario({
  "id": "rewards-service;eligible-music-customer",
  "description": "",
  "name": "Eligible Music Customer",
  "keyword": "Scenario",
  "line": 33,
  "type": "scenario",
  "comments": [
    {
      "value": "############################################################################################################",
      "line": 31
    }
  ]
});
formatter.step({
  "name": "I am a customer with a subscription to the Music channel",
  "keyword": "Given ",
  "line": 35
});
formatter.step({
  "name": "I am eligible for rewards",
  "keyword": "When ",
  "line": 37
});
formatter.step({
  "name": "I expect to be rewarded the Karaoke Pro Microphone",
  "keyword": "Then ",
  "line": 39
});
formatter.match({
  "arguments": [
    {
      "val": "Music",
      "offset": 43
    }
  ],
  "location": "RewardsServiceStepDefs.I_am_a_customer_with_a_subscription_to_a_specified_channel(String)"
});
formatter.result({
  "duration": 72378,
  "status": "passed"
});
formatter.match({
  "location": "RewardsServiceStepDefs.I_am_eligible_for_rewards()"
});
formatter.result({
  "duration": 195478,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Karaoke Pro Microphone",
      "offset": 28
    }
  ],
  "location": "RewardsServiceStepDefs.I_expect_to_be_rewarded(String)"
});
formatter.result({
  "duration": 196618,
  "status": "passed"
});
formatter.scenario({
  "id": "rewards-service;eligible-news-customer",
  "description": "",
  "name": "Eligible News Customer",
  "keyword": "Scenario",
  "line": 43,
  "type": "scenario",
  "comments": [
    {
      "value": "############################################################################################################",
      "line": 41
    }
  ]
});
formatter.step({
  "name": "I am a customer with a subscription to the News channel",
  "keyword": "Given ",
  "line": 45
});
formatter.step({
  "name": "I am eligible for rewards",
  "keyword": "When ",
  "line": 47
});
formatter.step({
  "name": "I expect to be shown the message \u0027You are not eligible for any rewards\u0027",
  "keyword": "Then ",
  "line": 49
});
formatter.match({
  "arguments": [
    {
      "val": "News",
      "offset": 43
    }
  ],
  "location": "RewardsServiceStepDefs.I_am_a_customer_with_a_subscription_to_a_specified_channel(String)"
});
formatter.result({
  "duration": 73518,
  "status": "passed"
});
formatter.match({
  "location": "RewardsServiceStepDefs.I_am_eligible_for_rewards()"
});
formatter.result({
  "duration": 189209,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "You are not eligible for any rewards",
      "offset": 34
    }
  ],
  "location": "RewardsServiceStepDefs.I_expect_to_be_shown_the_message(String)"
});
formatter.result({
  "duration": 321997,
  "status": "passed"
});
formatter.scenario({
  "id": "rewards-service;eligible-movies-customer",
  "description": "",
  "name": "Eligible Movies Customer",
  "keyword": "Scenario",
  "line": 53,
  "type": "scenario",
  "comments": [
    {
      "value": "############################################################################################################",
      "line": 51
    }
  ]
});
formatter.step({
  "name": "I am a customer with a subscription to the Movies channel",
  "keyword": "Given ",
  "line": 55
});
formatter.step({
  "name": "I am eligible for rewards",
  "keyword": "When ",
  "line": 57
});
formatter.step({
  "name": "I expect to be rewarded the Pirates of the Caribbean Collection",
  "keyword": "Then ",
  "line": 59
});
formatter.match({
  "arguments": [
    {
      "val": "Movies",
      "offset": 43
    }
  ],
  "location": "RewardsServiceStepDefs.I_am_a_customer_with_a_subscription_to_a_specified_channel(String)"
});
formatter.result({
  "duration": 71808,
  "status": "passed"
});
formatter.match({
  "location": "RewardsServiceStepDefs.I_am_eligible_for_rewards()"
});
formatter.result({
  "duration": 213145,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Pirates of the Caribbean Collection",
      "offset": 28
    }
  ],
  "location": "RewardsServiceStepDefs.I_expect_to_be_rewarded(String)"
});
formatter.result({
  "duration": 196048,
  "status": "passed"
});
formatter.scenario({
  "id": "rewards-service;ineligible-customer",
  "description": "",
  "name": "Ineligible Customer",
  "keyword": "Scenario",
  "line": 63,
  "type": "scenario",
  "comments": [
    {
      "value": "############################################################################################################",
      "line": 61
    }
  ]
});
formatter.step({
  "name": "I am a customer with channel subscriptions",
  "keyword": "Given ",
  "line": 65
});
formatter.step({
  "name": "I am not eligible for rewards",
  "keyword": "When ",
  "line": 67
});
formatter.step({
  "name": "I expect to be shown the message \u0027You are not eligible for any rewards\u0027",
  "keyword": "Then ",
  "line": 69
});
formatter.match({
  "location": "RewardsServiceStepDefs.I_am_a_customer_with_channel_subscriptions()"
});
formatter.result({
  "duration": 41033,
  "status": "passed"
});
formatter.match({
  "location": "RewardsServiceStepDefs.I_am_not_eligible_for_rewards()"
});
formatter.result({
  "duration": 208016,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "You are not eligible for any rewards",
      "offset": 34
    }
  ],
  "location": "RewardsServiceStepDefs.I_expect_to_be_shown_the_message(String)"
});
formatter.result({
  "duration": 183510,
  "status": "passed"
});
formatter.scenario({
  "id": "rewards-service;technical-failure-checking-rewards",
  "description": "",
  "name": "Technical Failure Checking Rewards",
  "keyword": "Scenario",
  "line": 73,
  "type": "scenario",
  "comments": [
    {
      "value": "############################################################################################################",
      "line": 71
    }
  ]
});
formatter.step({
  "name": "I am a customer with channel subscriptions",
  "keyword": "Given ",
  "line": 75
});
formatter.step({
  "name": "there is a technical failure",
  "keyword": "When ",
  "line": 77
});
formatter.step({
  "name": "I expect to be shown the message \u0027You are not eligible for any rewards\u0027",
  "keyword": "Then ",
  "line": 79
});
formatter.match({
  "location": "RewardsServiceStepDefs.I_am_a_customer_with_channel_subscriptions()"
});
formatter.result({
  "duration": 41603,
  "status": "passed"
});
formatter.match({
  "location": "RewardsServiceStepDefs.there_is_a_technical_failure()"
});
formatter.result({
  "duration": 210295,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "You are not eligible for any rewards",
      "offset": 34
    }
  ],
  "location": "RewardsServiceStepDefs.I_expect_to_be_shown_the_message(String)"
});
formatter.result({
  "duration": 202316,
  "status": "passed"
});
formatter.scenario({
  "id": "rewards-service;invalid-account-number-checking-rewards",
  "description": "",
  "name": "Invalid Account Number Checking Rewards",
  "keyword": "Scenario",
  "line": 83,
  "type": "scenario",
  "comments": [
    {
      "value": "############################################################################################################",
      "line": 81
    }
  ]
});
formatter.step({
  "name": "I am a customer with channel subscriptions",
  "keyword": "Given ",
  "line": 85
});
formatter.step({
  "name": "I supply an invalid account number",
  "keyword": "When ",
  "line": 87
});
formatter.step({
  "name": "I expect to be shown the message \u0027The account number supplied is not valid\u0027",
  "keyword": "Then ",
  "line": 89
});
formatter.match({
  "location": "RewardsServiceStepDefs.I_am_a_customer_with_channel_subscriptions()"
});
formatter.result({
  "duration": 41033,
  "status": "passed"
});
formatter.match({
  "location": "RewardsServiceStepDefs.I_supply_an_invalid_account_number()"
});
formatter.result({
  "duration": 208015,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "The account number supplied is not valid",
      "offset": 34
    }
  ],
  "location": "RewardsServiceStepDefs.I_expect_to_be_shown_the_message(String)"
});
formatter.result({
  "duration": 185789,
  "status": "passed"
});
});