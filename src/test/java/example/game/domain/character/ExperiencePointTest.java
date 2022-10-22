package example.game.domain.character;

import org.junit.Test;
import static org.junit.Assert.*;

public class ExperiencePointTest {

    @Test
    public void should_create_experiencePoint() {
        final int experiencePointValue = 0;
        final ExperiencePoint experiencePoint = new ExperiencePoint(experiencePointValue);

        assertEquals(experiencePointValue, experiencePoint.getExperiencePoint());
    }

    @Test(expected = IllegalArgumentException.class)
    public void should_not_0_less_experiencePoint_value() {
        final int ngExperiencePointValue = -1;
        final ExperiencePoint experiencePoint = new ExperiencePoint(ngExperiencePointValue);
    }

    @Test
    public void should_add_experiencePoint() {
        final int initExperiencePointValue = 0;
        final ExperiencePoint initExperiencePoint = new ExperiencePoint(initExperiencePointValue);
        final int addedExperiencePointValue = 34;
        final ExperiencePoint addedExperiencePoint = initExperiencePoint.addExperiencePoint(addedExperiencePointValue);

        assertEquals(addedExperiencePointValue, addedExperiencePoint.getExperiencePoint());
    }
}
