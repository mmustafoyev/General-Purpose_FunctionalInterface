package lamdasUseCaseScenario;

public class Developer {
    private final String name;
    private final Level level;
    private final int yearsOfExperience;
    private final String[] skills;

    public Developer(String name, Level level, int yearsOfExperience, String[] skills) {
        this.name = name;
        this.level = level;
        this.yearsOfExperience = yearsOfExperience;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public Level getLevel() {
        return level;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public String[] getSkills() {
        return skills;
    }
    enum Level {JUNIOR, MIDDLE, SENIOR, LEAD}
}
