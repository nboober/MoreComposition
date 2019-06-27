package composition;

abstract class Person {

    protected String name = "";
    protected int age = 0;

    public Person(){

    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return "The driver's name is " + this.name + ".";
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getAge(){
        return this.name + " is " + this.age + " years old.";
    }

}
