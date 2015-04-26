package RewardService;

import java.util.ArrayList;
import java.util.List;

import RewardDomainObjects.ChannelSubscription;
import RewardDomainObjects.Reward;

public class RewardMapper {
	
	public RewardMapper() {
		
	}
	
	private Reward getReward(final ChannelSubscription subscription) {
		switch(subscription) {
		case SPORTS: 
			return Reward.CHAMPIONS_LEAGUE_FINAL_TICKET;
		case MUSIC:
			return Reward.KARAOKE_PRO_MICROPHONE;
		case MOVIES:
			return Reward.PIRATES_OF_THE_CARIBBEAN_COLLECTION;
		default:
			return Reward.NO_REWARD;
		}
	}
	
	public List<Reward> getReward(final List<ChannelSubscription> subscriptions) {
		List<Reward> rewards = new ArrayList<Reward>();
		for (ChannelSubscription subscription: subscriptions) {
			Reward reward = getReward(subscription);
			if (!reward.equals(Reward.NO_REWARD)) {
				rewards.add(reward);
			}
		}
		return rewards;
	}
}
