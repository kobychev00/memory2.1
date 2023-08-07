public class PersonImpl {
    String name;
    String surname;

    public PersonImpl(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return getName() + " " + getSurname();
    }

    public static void printPerson(PersonImpl person) {
        System.out.println(person.getName() + " " + person.getSurname());
    }

    public static void changePerson(PersonImpl person) {
        PersonImpl person1 = new PersonImpl("Ilya", "Lagutenko");
        System.out.println(person1.getName() + " " + person1.getSurname());
    }

    public static void changePersonField(PersonImpl person) {
        person.setName("Ilya");
        person.setSurname("Lagutenko");
    }
}
