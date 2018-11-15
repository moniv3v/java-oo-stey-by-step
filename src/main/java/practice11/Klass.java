package practice11;

public class Klass {
    private int number;
    private Student leader;
    private Teacher teacher;

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
            if(teacher!=null){
                teacher.notifyTeacher(student);
            }
        }
    }

    public void appendMember(Student student){
        student.setKlass(this);
        if(teacher!=null){
            teacher.notifyTeacher(student);
        }
    }

    public Student getLeader(){
        return leader;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
