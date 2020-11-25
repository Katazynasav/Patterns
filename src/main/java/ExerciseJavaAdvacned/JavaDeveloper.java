package ExerciseJavaAdvacned;

public class JavaDeveloper extends Developer {
    public JavaDeveloper(boolean isAdaptive, boolean knowsMath) {
        super(isAdaptive, knowsMath);
    }

    public JavaDeveloper(boolean isAdaptive, boolean knowsMath, boolean knowsOracle, String knowsProgramingLanguage) {
        super(isAdaptive, knowsMath, knowsOracle, knowsProgramingLanguage);
    }
    private boolean isJavaDeveloper;

    public JavaDeveloper(boolean isAdaptive, boolean knowsMath, boolean isJavaDeveloper) {
        super(isAdaptive, knowsMath);
        this.isJavaDeveloper = isJavaDeveloper;
    }

    public JavaDeveloper(boolean isAdaptive, boolean knowsMath, boolean knowsOracle, String knowsProgramingLanguage, boolean isJavaDeveloper) {
        super(isAdaptive, knowsMath, knowsOracle, knowsProgramingLanguage);
        this.isJavaDeveloper = isJavaDeveloper;
    }
}
