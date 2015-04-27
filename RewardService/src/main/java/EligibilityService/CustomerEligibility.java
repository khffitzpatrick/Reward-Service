package EligibilityService;

//FIMXE: TECHNICAL_FAILURE and INVALID_ACCOUNT shoudl be exceptions instead
public enum CustomerEligibility {
	CUSTOMER_ELIGIBLE(""), 
	CUSTOMER_INELIGIBLE("You are not eligible for any rewards"), 
	TECHNICAL_FAILURE("You are not eligible for any rewards"), 
	INVALID_ACCOUNT("The account number supplied is not valid");

	private String eligibilityDesc;
	
	private CustomerEligibility(final String eligibilityDesc) {
		this.eligibilityDesc = eligibilityDesc;
	}
	
	public String getEligibilityDesc() {
		return eligibilityDesc;
	}
}
