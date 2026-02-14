public class Student{
    public String name;
    public String id="1001";
    public int age;
    //methods
    public void standUp(String i){
        System.out.println(name+ " with id " + i + " standup please");
    }
    public void correctionAge(int a){
        age = a+1;
    }
    public void sitDown(String i){
        System.out.println(name+ " with id " + i + " sitdown please");
    }
    public void showDetails(){
        System.out.println("Name: "+name);
        System.out.println("Id: "+id);
        System.out.println("Correct Age: "+age);
    }
}
