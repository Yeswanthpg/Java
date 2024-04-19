public class Student {
    private String name;
    void setName(String nme){
        this.name =nme;
    }
    
    String getName(){
        return this.name;
    }
}
public class oops{
    public static void main(String[] args){
        Student yeswanth =new Student();
        yeswanth.setName("Yeswanth P G");
        System.out.println(yeswanth.getName());
        Student sankar = new Student();
    }
}
