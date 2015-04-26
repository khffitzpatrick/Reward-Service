package RewardsService.AcceptanceTests;

import EligibilityService.CustomerEligibility;
import EligibilityService.EligibilityService;
import RewardService.RewardMapper;
import RewardService.RewardsService;
import cucumber.annotation.Before;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import cucumber.runtime.PendingException;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;


public class RewardsServiceStepDefs {

	private RewardServiceTestUtil rewardServiceTestUtil;
	
	private RewardsService rewardsService;
	
	private EligibilityService eligibilityService;
	
	private RewardMapper rewardMapper;
	
	@Before
	public void setup() {
		rewardServiceTestUtil = new RewardServiceTestUtil();
		eligibilityService = mock(EligibilityService.class);
		rewardMapper = new RewardMapper();
		rewardsService = new RewardsService(eligibilityService, rewardMapper);
	}
	
	@Given("^I am a customer with channel subscriptions$")
	public void I_am_a_customer_with_channel_subscriptions() {
		
		rewardServiceTestUtil.createCustomerPortfolio();
	}

	@Given("^I am a customer with channel subscriptions to the Movies and Music channels$")
	public void I_am_a_customer_with_channel_subscriptions_to_the_Movies_and_Music_channels() {
		
		rewardServiceTestUtil.createCustomerPortfolio();
	}

	@Given("^I am a customer with a subscription to the (.*) channel")
	public void I_am_a_customer_with_a_subscription_to_a_specified_channel(final String channel) {
		rewardServiceTestUtil.createCustomerPortfolio(channel);
	}
	
	@When("^I am eligible for rewards")
	public void I_am_eligible_for_rewards() {
	    when(eligibilityService.isCustomerEligible(rewardServiceTestUtil.getAccountNumber())).thenReturn(CustomerEligibility.CUSTOMER_ELIGIBLE);
	}

	@When("^I am not eligible for rewards")
	public void I_am_not_eligible_for_rewards() {
		when(eligibilityService.isCustomerEligible(rewardServiceTestUtil.getAccountNumber())).thenReturn(CustomerEligibility.CUSTOMER_INELIGIBLE);
	}

	@When("^there is a technical failure")
	public void there_is_a_technical_failure() {
		when(eligibilityService.isCustomerEligible(rewardServiceTestUtil.getAccountNumber())).thenReturn(CustomerEligibility.TECHNICAL_FAILURE);
	}

	@When("^I supply an invalid account number")
	public void I_supply_an_invalid_account_number() {
		when(eligibilityService.isCustomerEligible(rewardServiceTestUtil.getAccountNumber())).thenReturn(CustomerEligibility.INVALID_ACCOUNT);
	}
	
	@Then("^I expect to be rewarded the (.*)")
	public void I_expect_to_be_rewarded(final String expectedRewards) {
	    String rewardMessage = rewardsService.getRewardMessageForCustomer(rewardServiceTestUtil.getCustomerPortfolio());
	    assertEquals(expectedRewards, rewardMessage);
	}

	@Then("^I expect to be shown the message '(.*)'")
	public void I_expect_to_be_shown_the_message(final String expectedMessage) {
	    String rewardMessage = rewardsService.getRewardMessageForCustomer(rewardServiceTestUtil.getCustomerPortfolio());
	    assertEquals(expectedMessage, rewardMessage);
	}
}
