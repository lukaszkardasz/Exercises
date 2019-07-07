package exercises.org.staticExercises;



public class University {

    public static void main(String[] args) {

        System.out.println("Liczba studentów przed zapisami: " + Student.getStudentsNumber());

        Student student1 = new Student("Janek", "Kowalski", 873433442);
        Student student2 = new Student("Zenek", "Kruc", 823232442);

        System.out.println("Liczba studentów po zapipsach: " + Student.getStudentsNumber());


    }
}
