package Interface;

abstract class SuperHero {

    private String name;
    private String age;
    private String jobs;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void displsyHero() {
        System.out.println("Name = " + this.name + "\nAge = " + this.age+" Year");
    }

    public abstract void skill(String skill);
}
