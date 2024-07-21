public class People {
    protected String name;
    protected int age;
    protected String address;


    public People(String name , int age, String address ){
        this.name=name;
        this.age=age;
        this.address=address;

    }
    public void Walk(){
        System.out.println("Walking..... form People");
    }
    public void Sleep(){
        System.out.println("Sleeping ....");
    }

    @Override
    public boolean equals(Object p){
        if(p instanceof People ) {
            People person = (People) p;
            return this.age == person.age;
        }
        return false;
    }



}
