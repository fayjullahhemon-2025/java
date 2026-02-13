public class Tester{
    public static void main(String[] args){
        Student s1 = new Student();
        Student s2 = new Student();
        System.out.println(s1); //s1 store the address of the object
        System.out.println(s2.name); //s2.name is null because we haven't assigned any value to it.

        s1.name = "ALice";
        s1.id = "5001";
        s1.age = 20;

        s2.name = "Bob";
        
        s2.age = 22;
        Student s3  = new Student();
        s3 = s2;

        System.out.println(s1.name); 
        System.out.println(s1.age); 
        System.out.println(s1.id); 
        System.out.println(s2.name); 
        System.out.println(s2.id); 
        System.out.println(s2.age); 
        System.out.println(s3.name); 
        System.out.println(s3.id); 
        System.out.println(s3.age); 
        
    }
}
