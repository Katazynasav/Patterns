package ExerciseJavaAdvacned;

public class PHPDeveloper extends Developer {
    private boolean isPHPDeveloper;

    public PHPDeveloper(boolean isAdaptive, boolean knowsMath, boolean isPHPDeveloper) {
        super(isAdaptive, knowsMath);
        this.isPHPDeveloper = isPHPDeveloper;
    }

    public PHPDeveloper(boolean isAdaptive, boolean knowsMath, boolean knowsOracle, String knowsProgramingLanguage, boolean isPHPDeveloper) {
        super(isAdaptive, knowsMath, knowsOracle, knowsProgramingLanguage);
        this.isPHPDeveloper = isPHPDeveloper;
    }

    public PHPDeveloper(boolean isPHPDeveloper) {
        this.isPHPDeveloper = isPHPDeveloper;
    }
}
