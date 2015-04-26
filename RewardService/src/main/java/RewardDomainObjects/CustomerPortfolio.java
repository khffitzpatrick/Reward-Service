package RewardDomainObjects;

import java.util.List;

public class CustomerPortfolio {
	private AccountNumber accountNumber;
	private List<ChannelSubscription> subscriptions;
	
	public CustomerPortfolio() {
		
	}
	
	public CustomerPortfolio(final AccountNumber accountNumber, final List<ChannelSubscription> subscriptions) {
		this.accountNumber = accountNumber;
		this.subscriptions = subscriptions;
	}
	
	public AccountNumber getAccountNumber() {
		return accountNumber;
	}
	
	public List<ChannelSubscription> getSubscriptions() {
		return subscriptions;
	}
}
