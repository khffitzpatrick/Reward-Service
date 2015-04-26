Feature: Rewards Service

Scenario: General Acceptance Criteria

	Given I am a customer with channel subscriptions to the Movies and Music channels
	
	When I am eligible for rewards
	
	Then I expect to be rewarded the Pirates of the Caribbean Collection, Karaoke Pro Microphone
	
############################################################################################################

Scenario: Eligible Sports Customer

	Given I am a customer with a subscription to the Sports channel
	
	When I am eligible for rewards
	
	Then I expect to be rewarded the Champions League Final Ticket
	
############################################################################################################

Scenario: Eligible Kids Customer

	Given I am a customer with a subscription to the Kids channel
	
	When I am eligible for rewards
	
	Then I expect to be shown the message 'You are not eligible for any rewards'
	
############################################################################################################

Scenario: Eligible Music Customer

	Given I am a customer with a subscription to the Music channel
	
	When I am eligible for rewards
	
	Then I expect to be rewarded the Karaoke Pro Microphone
	
############################################################################################################

Scenario: Eligible News Customer

	Given I am a customer with a subscription to the News channel
	
	When I am eligible for rewards
	
	Then I expect to be shown the message 'You are not eligible for any rewards'
	
############################################################################################################
	
Scenario: Eligible Movies Customer

	Given I am a customer with a subscription to the Movies channel
	
	When I am eligible for rewards
	
	Then I expect to be rewarded the Pirates of the Caribbean Collection
	
############################################################################################################
	
Scenario: Ineligible Customer

	Given I am a customer with channel subscriptions
	
	When I am not eligible for rewards
	
	Then I expect to be shown the message 'You are not eligible for any rewards'
		
############################################################################################################
	
Scenario: Technical Failure Checking Rewards

	Given I am a customer with channel subscriptions
	
	When there is a technical failure
	
	Then I expect to be shown the message 'You are not eligible for any rewards'
		
############################################################################################################

Scenario: Invalid Account Number Checking Rewards

	Given I am a customer with channel subscriptions
	
	When I supply an invalid account number
	
	Then I expect to be shown the message 'The account number supplied is not valid'
		
############################################################################################################