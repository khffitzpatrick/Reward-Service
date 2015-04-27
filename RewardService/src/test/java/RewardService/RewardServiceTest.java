package RewardService;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import EligibilityService.CustomerEligibility;
import EligibilityService.EligibilityService;
import RewardDomainObjects.ChannelSubscription;
import RewardDomainObjects.CustomerPortfolio;
import RewardDomainObjects.Reward;

public class RewardServiceTest {

	private RewardService rewardService;
	private EligibilityService eligibilityService;
	private RewardMapper rewardMapper;
	
	@Before
	public void setup() {
		
		rewardMapper = mock(RewardMapper.class);
		eligibilityService = mock(EligibilityService.class);
		rewardService = new RewardService(eligibilityService, rewardMapper);
	}
	
	@Test
	public void shouldGetNoRewardMessageIfCustomerIsNotEligible() {
		//Arrange
		CustomerPortfolio portfolio = spy(CustomerPortfolio.class);
		when(eligibilityService.isCustomerEligible(portfolio.getAccountNumber())).thenReturn(CustomerEligibility.CUSTOMER_INELIGIBLE);
		
		//Act
		String rewardMessage = rewardService.getRewardMessageForCustomer(portfolio);
		
		//Assert
		assertEquals(CustomerEligibility.CUSTOMER_INELIGIBLE.getEligibilityDesc(), rewardMessage);
	}
	
	@Test
	public void shouldGetErrorMessageIfAccountInvalid() {
		//Arrange
		CustomerPortfolio portfolio = spy(CustomerPortfolio.class);
		when(eligibilityService.isCustomerEligible(portfolio.getAccountNumber())).thenReturn(CustomerEligibility.INVALID_ACCOUNT);
		
		//Act
		String rewardMessage = rewardService.getRewardMessageForCustomer(portfolio);
		
		//Assert
		assertEquals(CustomerEligibility.INVALID_ACCOUNT.getEligibilityDesc(), rewardMessage);
	}
	
	@Test
	public void shouldRewardMessageIfEligibleAndAwardsAvailable() {
		//Arrange
		CustomerPortfolio portfolio = spy(CustomerPortfolio.class);
		when(eligibilityService.isCustomerEligible(portfolio.getAccountNumber())).thenReturn(CustomerEligibility.CUSTOMER_ELIGIBLE);
		when(portfolio.getSubscriptions()).thenReturn(Arrays.asList(ChannelSubscription.MUSIC));
		Reward expectedReward = Reward.KARAOKE_PRO_MICROPHONE;
		when(rewardMapper.getReward(anyListOf(ChannelSubscription.class))).thenReturn(Arrays.asList(expectedReward));
		
		//Act
		String rewardMessage = rewardService.getRewardMessageForCustomer(portfolio);
		
		//Assert
		assertEquals(expectedReward.getRewardDesc(), rewardMessage);
	}
	
	@Test
	public void shouldNotGetRewardIfEligibleButNoRewards() {
		//Arrange
		CustomerPortfolio portfolio = spy(CustomerPortfolio.class);
		when(eligibilityService.isCustomerEligible(portfolio.getAccountNumber())).thenReturn(CustomerEligibility.CUSTOMER_ELIGIBLE);
		when(portfolio.getSubscriptions()).thenReturn(Arrays.asList(ChannelSubscription.MUSIC));
		when(rewardMapper.getReward(anyListOf(ChannelSubscription.class))).thenReturn(new ArrayList<Reward>());
		
		//Act
		String rewardMessage = rewardService.getRewardMessageForCustomer(portfolio);
		
		//Assert
		assertEquals(CustomerEligibility.CUSTOMER_INELIGIBLE.getEligibilityDesc(), rewardMessage);
	}
}
