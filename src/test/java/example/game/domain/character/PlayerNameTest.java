package example.game.domain.character;

import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerNameTest {

    @Test
    public void should_create_player_name() {
        final String name = "playerName";
        final PlayerName playerName = new PlayerName(name);
        assertEquals(name, playerName.getPlayerName());
    }

    @Test
    public void should_change_player_name() {
        final String name = "playerName";
        final PlayerName playerName = new PlayerName(name);

        final String newName = "newPlayerName";
        final PlayerName newPlayerName = playerName.changePlayerName(newName);
        assertEquals(newName, newPlayerName.getPlayerName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void should_not_player_name_under_2_characters() {
        final String name = "pn";
        final PlayerName ngPlayerName = new PlayerName(name);
    }

    @Test(expected = IllegalArgumentException.class)
    public void should_not_player_name_more_21_characters() {
        final String name = "BadPlayerNameMore21Chara";
        final PlayerName ngPlayerName = new PlayerName(name);
    }
}
