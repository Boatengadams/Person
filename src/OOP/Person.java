// Question: How can a Person class represent personal details and basic actions?
package OOP;
//    PERSON
//        NAME , ADDRESS , HABBIES , WORK
//            walk(),run(),sleep(),eat(),drink(),
public class Person {
    private final String name;
    private final String address;
    private final String hobbies;
    private final String work;

    public Person(String name, String address, String hobbies, String work) {
        this.name = name;
        this.address = address;
        this.hobbies = hobbies;
        this.work = work;
    }

    public void walk() { System.out.println(name + " is walking."); }
    public void run() { System.out.println(name + " is running."); }
    public void sleep() { System.out.println(name + " is sleeping."); }
    public void eat() { System.out.println(name + " is eating."); }
    public void drink() { System.out.println(name + " is drinking."); }

    @Override
    public String toString() {
        return name + " | " + address + " | " + hobbies + " | " + work;
    }

    public static void main(String[] args) {
        Person person = new Person("Adams", "Accra", "reading", "student");
        System.out.println(person);
        person.walk();
    }
}
