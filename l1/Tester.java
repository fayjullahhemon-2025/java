public class Tester{
    public static void main(String[] args){
        Student s1 = new Student();
        Student s2 = new Student();
        System.out.println(s1); //s1 store the address of the object
        System.out.println(s2.name); //s2.name is null because we haven't assigned any value to it.
    }
}
