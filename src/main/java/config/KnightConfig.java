package config;

import org.springframework.context.annotation.*;

import knights.BraveKnight;
import knights.Knight;
import quests.Quest;
import quests.SlayDragonQuest;

@Configuration
public class KnightConfig {
	
	@Bean
	public Knight knight() {
		return new BraveKnight( quest() );
	}
	
	@Bean
	public Quest quest() {
		return new SlayDragonQuest( System.out );
	}

}
