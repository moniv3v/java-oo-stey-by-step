package practice09;

public class Klass {
    private int number;
    private Student leader;

    public Klass(int number){
        this.number=number;
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName(){
        return "Class "+this.getNumber();
    }

    public void assignLeader(Student student){
        if(student.getKlass() != this || student.getKlass()==null){
            System.out.print("It is not one of us.\n");
            this.leader = new Student();
        }else{
            this.leader = student;
        }
    }

    public void appendMember(Student student){
        student.setKlass(this);
    }


    public Student getLeader(){
        return leader;
    }
}