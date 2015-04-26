package RewardService;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import RewardDomainObjects.ChannelSubscription;
import RewardDomainObjects.Reward;

public class RewardMapperTest {

	private RewardMapper rewardMapper;
	
	@Before
	public void setup() {
		rewardMapper = new RewardMapper();
	}
	
	@Test
	public void shouldGetTicketRewardForSports() {
		//Arrange
		ChannelSubscription subscription = ChannelSubscription.SPORTS;
		
		//Act
		List<Reward> rewards = rewardMapper.getReward(Arrays.asList(subscription));
		
		//Assert
		assertEquals(1, rewards.size());
		assertEquals(Reward.CHAMPIONS_LEAGUE_FINAL_TICKET, rewards.get(0));
	}
	
	@Test
	public void shouldGetMicrophoneRewardForMusic() {
		//Arrange
		ChannelSubscription subscription = ChannelSubscription.MUSIC;
		
		//Act
		List<Reward> rewards = rewardMapper.getReward(Arrays.asList(subscription));
		
		//Assert
		assertEquals(1, rewards.size());
		assertEquals(Reward.KARAOKE_PRO_MICROPHONE, rewards.get(0));
	}
	
	@Test
	public void shouldGetCarribeanRewardForMovies() {
		//Arrange
		ChannelSubscription subscription = ChannelSubscription.MOVIES;
		
		//Act
		List<Reward> rewards = rewardMapper.getReward(Arrays.asList(subscription));
		
		//Assert
		assertEquals(1, rewards.size());
		assertEquals(Reward.PIRATES_OF_THE_CARIBBEAN_COLLECTION, rewards.get(0));
	}
	
	@Test
	public void shouldGetNoRewardForKids() {
		//Arrange
		ChannelSubscription subscription = ChannelSubscription.KIDS;
		
		//Act
		List<Reward> rewards = rewardMapper.getReward(Arrays.asList(subscription));
		
		//Assert
		assertEquals(0, rewards.size());
	}
	
	@Test
	public void shouldGetNoRewardForNews() {
		//Arrange
		ChannelSubscription subscription = ChannelSubscription.NEWS;
		
		//Act
		List<Reward> rewards = rewardMapper.getReward(Arrays.asList(subscription));
		
		//Assert
		assertEquals(0, rewards.size());
	}
}
