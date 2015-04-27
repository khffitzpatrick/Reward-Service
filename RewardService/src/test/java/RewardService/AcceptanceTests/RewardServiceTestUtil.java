package RewardService.AcceptanceTests;

import java.util.Arrays;
import java.util.List;

import RewardDomainObjects.AccountNumber;
import RewardDomainObjects.ChannelSubscription;
import RewardDomainObjects.CustomerPortfolio;

public class RewardServiceTestUtil {
	
	private CustomerPortfolio customerPortfolio;
	
	public void createCustomerPortfolio() {
		final AccountNumber accountNumber = new AccountNumber(50);
		final List<ChannelSubscription> subscriptions = Arrays.asList(ChannelSubscription.MOVIES, ChannelSubscription.MUSIC);
		this.customerPortfolio = new CustomerPortfolio(accountNumber, subscriptions);
	}
	
	public void createCustomerPortfolio(final String channel) {
		final AccountNumber accountNumber = new AccountNumber(50);
		final List<ChannelSubscription> subscriptions = Arrays.asList(ChannelSubscription.valueOf(channel.toUpperCase()));
		this.customerPortfolio = new CustomerPortfolio(accountNumber, subscriptions);
	}
	

	public AccountNumber getAccountNumber() {
		return customerPortfolio.getAccountNumber();
	}

	public CustomerPortfolio getCustomerPortfolio() {
		return customerPortfolio;
	}
	
}
