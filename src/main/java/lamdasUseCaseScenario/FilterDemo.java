package lamdasUseCaseScenario;

public class FilterDemo {
    public static void main(String[] args) {
        Developer[] devs = new Developer[]{
                new Developer("Johnny Silverhand", Developer.Level.MIDDLE, 3, new String[]{"Security", "DevOps"}),
                new Developer("Johnny Mnemonic", Developer.Level.MIDDLE, 2, new String[]{"DevOps", "Data Science"}),
                new Developer("Rick Deckard", Developer.Level.JUNIOR, 1, new String[]{"AI", "Machine Learning"}),
                new Developer("Kevin Flynn", Developer.Level.SENIOR, 7, new String[]{"Java", "GameDev", "VR", "AR"}),
                new Developer("Angela Bennett", Developer.Level.JUNIOR, 2, new String[]{"QA", "Security"}),
                new Developer("Thomas Anderson", Developer.Level.SENIOR, 5, new String[]{"Java", "Spring", "VR"}),
        };
        DevelperFilter filter = dev -> dev.getYearsOfExperience() >= 3;
        for (Developer dev : devs) {
            if(filter.isSuitable(dev))
                System.out.println(dev.getName());
        }
    }
}
