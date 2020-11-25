package ExerciseJavaAdvacned;

public class JavaScriptDeveloper extends Developer{
    private boolean isJavaScriptDeveloper;

    public JavaScriptDeveloper(boolean isAdaptive, boolean knowsMath, boolean isJavaScriptDeveloper) {
        super(isAdaptive, knowsMath);
        this.isJavaScriptDeveloper = isJavaScriptDeveloper;
    }

    public JavaScriptDeveloper(boolean isAdaptive, boolean knowsMath, boolean knowsOracle, String knowsProgramingLanguage, boolean isJavaScriptDeveloper) {
        super(isAdaptive, knowsMath, knowsOracle, knowsProgramingLanguage);
        this.isJavaScriptDeveloper = isJavaScriptDeveloper;
    }

    public JavaScriptDeveloper(boolean isJavaScriptDeveloper) {
        this.isJavaScriptDeveloper = isJavaScriptDeveloper;
    }
}
