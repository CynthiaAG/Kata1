package kata1;

import java.util.Date;

public class Kata1 {

    public static void main(String[] args) {
        Person person = new Person ("Cynthia", new Date(95, 11, 29));
        System.out.println(person.getName() + " tiene "+ person.getAge()+ " años.");
    }
}
