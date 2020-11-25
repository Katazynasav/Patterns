package ExerciseJavaAdvacned;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        JavaDeveloper javaDeveloper = new JavaDeveloper
                (true, true, true, "Java", true);
        System.out.println(javaDeveloper);

        javaDeveloper.useOracle();

        javaDeveloper.sayHello("Sir");
        Developer developer = new Developer();
        developer.sayHello();

        JavaScriptDeveloper javaScriptDeveloper = new JavaScriptDeveloper(true,true,true,"JavaScript",true);
        PHPDeveloper phpDeveloper = new PHPDeveloper(true,true,true,"PHP",true);

        List<Developer>developers = new ArrayList<Developer>();
        developers.add(javaDeveloper);
        developers.add(phpDeveloper);
        developers.add(javaScriptDeveloper);

        System.out.println(developers.toString());



    }
}
