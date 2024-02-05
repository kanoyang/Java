public class Teacher extends People{

    private String subject;

    public Teacher(String name , int age, String address ,String subject){
        super(name, age, address);//繼承於parent Class constructor

        this.subject=subject;
    }


    public void Teacheing(){
        System.out.println("Teaching....");
    }

    @Override
    public void Walk(){

        System.out.println("Walk from Teachers");
    }

}
