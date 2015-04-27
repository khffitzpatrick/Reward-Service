package RewardService;

import java.util.List;

import EligibilityService.CustomerEligibility;
import EligibilityService.EligibilityService;
import RewardDomainObjects.AccountNumber;
import RewardDomainObjects.ChannelSubscription;
import RewardDomainObjects.CustomerPortfolio;
import RewardDomainObjects.Reward;

public class RewardService {

	private EligibilityService eligibilityService;
	private RewardMapper rewardMapper;
	
	public RewardService(final EligibilityService eligibilityService, final RewardMapper rewardMapper) {
		this.eligibilityService = eligibilityService;
		this.rewardMapper = rewardMapper;
	}
	
	/*
	 * TODO: find out required return value: would this be better as an object encapsulating
	 * a list of Rewards and any error messages to be displayed?
	 */
	public String getRewardMessageForCustomer(final CustomerPortfolio customerPortfolio) {
		String rewardMessage;
		
		final AccountNumber accountNumber = customerPortfolio.getAccountNumber();
		CustomerEligibility eligiblity = eligibilityService.isCustomerEligible(accountNumber);
		
		if (eligiblity.equals(CustomerEligibility.CUSTOMER_ELIGIBLE)) {
			rewardMessage = getRewardMessage(customerPortfolio.getSubscriptions());
		} else {
			rewardMessage = eligiblity.getEligibilityDesc();
		}
		
		return rewardMessage;
	}

	private String getRewardMessage(final List<ChannelSubscription> subscriptions) {
		String rewardMessage = "";
		List<Reward> rewards = rewardMapper.getReward(subscriptions);
		if (rewards.isEmpty()) {
			return CustomerEligibility.CUSTOMER_INELIGIBLE.getEligibilityDesc();
		}
		
		//FIXME: use StringUtils to delimit with commas instead
		for (int i=0; i<rewards.size(); i++) {
			Reward reward = rewards.get(i);
			
			rewardMessage += reward.getRewardDesc();
			if (i < rewards.size() -1) {
				rewardMessage += ", ";
			}			
		}
		return rewardMessage;
	}
}
