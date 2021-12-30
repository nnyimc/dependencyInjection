package firstProject;

import org.junit.Test;

import knights.BraveKnight;

import static org.mockito.Mockito.*;
import quests.Quest;

public class BraveKnightTest {
	
	@Test
	public void knightShouldEmbarkOnQuest() {
		Quest mockQuest = mock(Quest.class);
		BraveKnight knight = new BraveKnight(mockQuest);
		knight.embarkOnQuest();
		verify(mockQuest, times(1)).embark();
;	}
}
