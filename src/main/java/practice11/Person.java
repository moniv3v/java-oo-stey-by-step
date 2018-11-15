package practice11;

public class Person {
    private int id;
    private String name;
    private int age;

    public Person(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Person(){}

    public String introduce() {
        return ("My name is "+this.getName()+". I am "+this.getAge()+" years old.");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public boolean equals(Object person){
        if(this.id == ((Person) person).getId()){
            return true;
        }
        return false;
    }
}
