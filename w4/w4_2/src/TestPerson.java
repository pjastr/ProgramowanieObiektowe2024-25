public class TestPerson {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setAge(-39);
        p1.setAge(55);
        p1.setAge(122);
    }
}


class Person{
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (0< age && age <=100)
            this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
