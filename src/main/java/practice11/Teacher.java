package practice11;

import java.util.LinkedList;

public class Teacher extends Person {
    private LinkedList<Klass> klassList = new LinkedList<Klass>();

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(int id, String name, int age, LinkedList klass) {
        super(id, name, age);
        this.klassList = klass;
        for (Klass k : klassList) {
            k.setTeacher(this);
        }
    }

    public String introduce() {
        if (klassList.size() == 0) {
            return super.introduce() + " I am a Teacher. I teach No Class.";
        } else {
            String klassNames = "";
            for (int i = 0; i < klassList.size(); i++) {
                if (i != 0) {
                    klassNames += ", ";
                }
                klassNames += klassList.get(i).getNumber();
            }
            return super.introduce() + " I am a Teacher. I teach Class " + klassNames + ".";
        }
    }

    public String introduceWith(Student student) {
        for (Klass k : klassList) {
            if (student.getKlass() == k) {
                return super.introduce() + " I am a Teacher. I teach " + student.getName() + ".";
            }
        }
        return super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".";
    }

    public LinkedList<Klass> getClasses() {
        return klassList;
    }

    public boolean isTeaching(Student student) {
        for (Klass k : klassList) {
            if (student.getKlass() == k) {
                return true;
            }
        }
        return false;
    }

    public void notifyTeacher(Student student) {
        if (student.getKlass().getLeader()!=null && student.getId() == student.getKlass().getLeader().getId()) {
            System.out.print("I am " + this.getName() + ". I know " + student.getName() + " become Leader of " + student.getKlass().getDisplayName() + ".\n");
        } else {
            System.out.print("I am " + this.getName() + ". I know " + student.getName() + " has joined " + student.getKlass().getDisplayName() + ".\n");
        }
    }
}
