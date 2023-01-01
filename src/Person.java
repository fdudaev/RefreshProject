public class Person {
    private String name;
    private String gender;
    private int age ;


    public Person (String name){
        System.out.println("This is a constructor in Person class, with parameter name");
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getGender(){
        return gender;
    }
    public void setGender(String gender){
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
