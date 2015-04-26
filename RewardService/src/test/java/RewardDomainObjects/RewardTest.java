package RewardDomainObjects;

import static org.junit.Assert.*;

import org.junit.Test;

public class RewardTest {

	@Test
	public void shouldGetDescriptionOfChampionsLeagueTicket() {
		//Arrange & Act
		Reward reward = Reward.CHAMPIONS_LEAGUE_FINAL_TICKET;
		
		//Assert
		assertEquals("Champions League Final Ticket", reward.getRewardDesc());
	}
	
	@Test
	public void shouldGetDescriptionOfKaraokeMic() {
		//Arrange & Act
		Reward reward = Reward.KARAOKE_PRO_MICROPHONE;
		
		//Assert
		assertEquals("Karaoke Pro Microphone", reward.getRewardDesc());
	}
	
	@Test
	public void shouldGetDescriptionOfPiratesOfCaribbeanCollection() {
		//Arrange & Act
		Reward reward = Reward.PIRATES_OF_THE_CARIBBEAN_COLLECTION;
		
		//Assert
		assertEquals("Pirates of the Caribbean Collection", reward.getRewardDesc());
	}
	
	@Test
	public void shouldGetDescriptionOfNoReward() {
		//Arrange & Act
		Reward reward = Reward.NO_REWARD;
		
		//Assert
		assertEquals("No reward", reward.getRewardDesc());
	}
}
