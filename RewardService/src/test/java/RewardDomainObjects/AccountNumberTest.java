package RewardDomainObjects;

import static org.junit.Assert.*;

import org.junit.Test;

public class AccountNumberTest {

	@Test
	public void shouldCreateAccountNumber() {
		//Arrange
		final long accountNumberLong = 50;
		
		//Act
		final AccountNumber accountNumber = new AccountNumber(accountNumberLong);
		
		//Assert
		assertEquals(accountNumberLong, accountNumber.getAccountNumber());
	}
}
