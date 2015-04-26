package RewardDomainObjects;

public enum Reward {
	CHAMPIONS_LEAGUE_FINAL_TICKET("Champions League Final Ticket"), KARAOKE_PRO_MICROPHONE("Karaoke Pro Microphone"), PIRATES_OF_THE_CARIBBEAN_COLLECTION("Pirates of the Caribbean Collection"), NO_REWARD("No reward"); 

	private String rewardDesc;
	
	private Reward(final String rewardDesc) {
		this.rewardDesc = rewardDesc;
	}
	
	public String getRewardDesc() {
		return rewardDesc;
	}
}
