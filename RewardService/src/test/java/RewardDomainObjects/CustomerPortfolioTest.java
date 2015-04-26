package RewardDomainObjects;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class CustomerPortfolioTest {

	@Test
	public void shouldCreateCustomerSubscription() {
		//Arrange
		final AccountNumber accountNumber = new AccountNumber(50);
		final List<ChannelSubscription> subscriptions = Arrays.asList(ChannelSubscription.MOVIES, ChannelSubscription.KIDS);
			
		//Act
		final CustomerPortfolio customerSubscriptions = new CustomerPortfolio(accountNumber, subscriptions);
		
		//Assert
		assertEquals(accountNumber, customerSubscriptions.getAccountNumber());
		assertEquals(subscriptions, customerSubscriptions.getSubscriptions());
	}
}
