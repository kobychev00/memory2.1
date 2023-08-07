import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Память 2.1");

        printSeparotor(5);

        int value = 33; // локальная переменная value, зона видимости 3-10 сторчка
        changeValue(22);
        printValue(value);

        printSeparotor(6);

        Integer number = 22; // wrapper переменной типа int, ссылочный тип данных, создается в heap, доступен по ссылке любом месте программы
        changeNumberInteger(number);
        printNumberInteger(number);

        printSeparotor(7);

        Integer[] array = new Integer[]{3, 4}; // ссылочный тип данных, создается в heap, доступен по ссылке в любом месте программы
        printArrayValue(array);
        changeArrayValue(array);

        printSeparotor(8);

        printArrayValue(array);
        changeArrayIndex(array);

        printSeparotor(9);

        PersonImpl person1 = new PersonImpl("Lyapis", "Trubetskoy");

        PersonImpl.printPerson(person1);
        PersonImpl.changePerson(person1);

        printSeparotor(10);

        PersonImpl person2 = new PersonImpl("Lyapis", "Trubetskoy");
        PersonImpl.printPerson(person2);
        PersonImpl.changePersonField(person2);
        PersonImpl.printPerson(person2);

    }

    public static void changePerson(PersonImpl person) {
        PersonImpl person1 = new PersonImpl("Ilya", "Lagutenko");
        System.out.println(person1.getName() + " " + person1.getSurname());
    }

    public static void changeArrayIndex(Integer[] array) { // ссылочный тип данных, создается в heap, доступен по ссылке в любом месте
        array = new Integer[]{3, 4};
        array[0] = 99; //меняем значение элемента объекта, полученного по ссылке
        System.out.println("Current array's value is " + Arrays.toString(array));
    }

    public static void changeArrayValue(Integer[] array) {
        array = new Integer[]{1, 2}; //меняем значение объекта, полученного по ссылке
        System.out.println("Current array's value is " + Arrays.toString(array));
    }

    public static void printArrayValue(Integer[] array) {
        System.out.println("Current array's value is " + Arrays.toString(array));
    }

    public static void printNumberInteger(Integer number) {
        System.out.println("Current object's value is " + number);
    }

    public static void changeNumberInteger(Integer value) {
        value = 22; // объект, ссылочный тип, значение передается по ссылке, доступен в любом месте программы
        System.out.println("Object's value was changed on " + value);
    }

    public static void changeValue(int number) {
        number = 22; // локальная переменная number, зона видимости 14-15 сторчка
        System.out.println("Varieble's number was changed on " + number);
    }

    public static void printValue(int value) {
        System.out.println("Current varieble's value is " + value);
    }


    public static void printSeparotor (int number) {
        System.out.println("Exercise " + number);
        System.out.println("--------------------------------------------");
    }
}

