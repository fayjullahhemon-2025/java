public class Tester {
    public static void main(String[] args){
        Student s1 = new Student();
        Student s2 = new Student();
        s1.name = "Alice";
        s1.id = "5001";
        s1.age = 20;
        s2.name = "Bob";
        s2.age = 22;
        s2.id = "5002";
        s1.standUp(s1.id);
        System.out.println("Before correction age:"+s1.age);
        s1.correctionAge(18);
        s1.sitDown(s1.id);
        s1.showDetails();
    }
}
