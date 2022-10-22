package example.game.domain.character;

import lombok.Data;

/**
 * Experience Point class.
 */
@Data
public class ExperiencePoint {

    /** Experience Point */
    final int experiencePoint;

    public ExperiencePoint(final int experiencePoint) {
        if(experiencePoint < 0) {
            throw new IllegalArgumentException("must 0 or more experience point value:" + experiencePoint);
        }
        this.experiencePoint = experiencePoint;
    }

    /**
     * add Experience Point
     *
     * @param addedExperiencePoint add Experience Point.
     * @return new ExperiencePoint class.
     */
    public ExperiencePoint addExperiencePoint(final int addedExperiencePoint) {
        return new ExperiencePoint(this.experiencePoint + addedExperiencePoint);
    }
}
