package ExerciseJavaAdvacned;

public class Developer extends Person {
    public Developer(boolean isAdaptive, boolean knowsMath) {
        super(isAdaptive, knowsMath);
    }
    private boolean knowsOracle;
    private String knowsProgramingLanguage;

    public Developer(boolean isAdaptive, boolean knowsMath, boolean knowsOracle, String knowsProgramingLanguage) {
        super(isAdaptive, knowsMath);
        this.knowsOracle = knowsOracle;
        this.knowsProgramingLanguage = knowsProgramingLanguage;
    }

    public Developer() {
        super(true,true);
    }

    public void useOracle(){
        System.out.println("Is using oracle");

    }
    public void sayHello(){
        System.out.println("Hey dude");
    }
    @Override
    public String toString() {
        return "Developer{" +
                "knowsOracle=" + knowsOracle +
                ", knowsProgramingLanguage='" + knowsProgramingLanguage + '\'' +
                ", isAdaptive=" + isAdaptive +
                ", knowsMath=" + knowsMath +
                '}';
    }
}
