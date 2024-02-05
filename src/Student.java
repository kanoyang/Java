public class Student extends People{

    private int grades;


    public Student(String name , int age, String address ,int grades){
        super(name, age, address);
        this.grades=grades;
    }


    public void learning(){
        System.out.println("learning....");
    }

    @Override
    public void Walk(){
        System.out.println("this walk from the Student");
    }

}
