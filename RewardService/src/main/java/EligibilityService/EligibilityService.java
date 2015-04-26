package EligibilityService;

import RewardDomainObjects.AccountNumber;

public interface EligibilityService {

	public CustomerEligibility isCustomerEligible(final AccountNumber accountNumber);
}
