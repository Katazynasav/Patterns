package ExerciseJavaAdvacned;

public class Person {
    public boolean isAdaptive;
    public boolean knowsMath;

    public Person(boolean isAdaptive, boolean knowsMath) {
        this.isAdaptive = isAdaptive;
        this.knowsMath = knowsMath;
    }
    public void sayHello(String greeting){
        System.out.println("Hello " + greeting);

    }
}
