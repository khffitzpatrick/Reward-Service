package EligibilityService;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import RewardDomainObjects.Reward;

public class CustomerEligibilityTest {
	
	@Test
	public void shouldGetDescriptionOfEligibleCustomer() {
		//Arrange & Act
		CustomerEligibility eligibility = CustomerEligibility.CUSTOMER_ELIGIBLE;
		
		//Assert
		assertEquals("", eligibility.getEligibilityDesc());
	}
	
	@Test
	public void shouldGetDescriptionOfIneligibleCustomer() {
		//Arrange & Act
		CustomerEligibility eligibility = CustomerEligibility.CUSTOMER_INELIGIBLE;
		
		//Assert
		assertEquals("You are not eligible for any rewards", eligibility.getEligibilityDesc());
	}
	
	@Test
	public void shouldGetDescriptionOfTechnicalFailure() {
		//Arrange & Act
		CustomerEligibility eligibility = CustomerEligibility.TECHNICAL_FAILURE;
		
		//Assert
		assertEquals("You are not eligible for any rewards", eligibility.getEligibilityDesc());
	}
	
	@Test
	public void shouldGetDescriptionOfInvalidAccount() {
		//Arrange & Act
		CustomerEligibility eligibility = CustomerEligibility.INVALID_ACCOUNT;
		
		//Assert
		assertEquals("The account number supplied is not valid", eligibility.getEligibilityDesc());
	}
}
