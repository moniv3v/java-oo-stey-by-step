package practice10;

public class Student extends Person{
    private Klass klass;
    public Student(int id, String name,int age,Klass klass){
        super(id,name,age);
        this.klass = klass;
    }

    public Student(){}

    public String introduce(){
        if(klass.getLeader()!=null&&this.getName().equals(klass.getLeader().getName())){
            return super.introduce()+" I am a Student. I am Leader of "+this.getKlass().getDisplayName()+".";
        }
        return super.introduce()+" I am a Student. I am at "+this.getKlass().getDisplayName()+".";
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

}
