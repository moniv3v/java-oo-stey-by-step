package practice09;

public class Teacher extends Person{
    private Klass klass;
    public Teacher(int id, String name,int age){
        super(id,name,age);
    }
    public Teacher(int id, String name,int age, Klass klass){
        super(id,name,age);
        this.klass = klass;
    }

    public String introduce(){
        if(klass==null){
            return super.introduce()+" I am a Teacher. I teach No Class.";
        }
        return super.introduce()+" I am a Teacher. I teach "+this.getKlass().getDisplayName()+".";
    }

    public String introduceWith(Student student){
        if(student.getKlass()==this.getKlass()){
            return super.introduce()+" I am a Teacher. I teach "+student.getName()+".";
        }
        return super.introduce()+" I am a Teacher. I don't teach "+student.getName()+".";
    }

    public Klass getKlass() {
        return klass;
    }
}
