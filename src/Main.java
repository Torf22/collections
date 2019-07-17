import person.Auth;
import person.Client;
import person.Person;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Motor goodMotor = new Motor("VB12", 2.7, 180);
        Motor goodgMotor = new Motor("VB12", 2.6, 180);
        Motor badMotor = new Motor("VB01", 1.4, 65);
        Wheel goodwheel = new Wheel("GoodYuear", 17.5);
        Wheel badwheel = new Wheel("Rosava", 14.5);
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", 2005, "BB2222NB", "red", badMotor, badwheel));
        cars.add(new Car("Tesla", 2019, "BB1111NB", "red", goodgMotor, goodwheel));
        cars.add(new Car("Mers", 2011, "BB3333NB", "green", badMotor, goodwheel));
        cars.add(new Car("ZAZ", 2010, "BB4444NB", "blue", goodMotor, goodwheel));
        Comparator car1 = new Car();
        Collections.sort(cars, car1);
        List<Car> cars2 = new ArrayList<>();
        Iterator<Car> iterator = cars.iterator();
        while (iterator.hasNext()) {
            Car car = iterator.next();
            if (car.getYear() < 2006) {
                cars2.add(car);
                iterator.remove();
            }
        }
        cars2.addAll(cars);
        List<Car> allCars = new ArrayList<>();
        allCars.addAll(cars);
        allCars.addAll(cars2);
        allCars.sort(((o1, o2) -> {
            return o1.getModel().compareTo(o2.getModel());
        }));
        for (Car allCar : allCars) {
            System.out.println(allCar);
        }
        List<Person> people = new ArrayList<>();
        List<Auth> auths = new ArrayList<>();
        people.add(new Person(1,"vaysa",32));
        people.add(new Person(2,"petya",31));
        people.add(new Person(3,"kolya",30));
        people.add(new Person(4,"anya",29));
        people.add(new Person(5,"masha",28));
        people.add(new Person(6,"andriy",30));
        people.add(new Person(7,"maxim",31));
        people.add(new Person(8,"vadym",32));
        people.add(new Person(9,"taras",33));

        auths.add(new Auth(5,"login5","password5"));
        auths.add(new Auth(2,"login2","password2"));
        auths.add(new Auth(1,"login1","password1"));
        auths.add(new Auth(7,"login7","password7"));
        auths.add(new Auth(3,"login3","password3"));
        auths.add(new Auth(4,"login4","password4"));
        auths.add(new Auth(8,"login8","password8"));
        auths.add(new Auth(6,"login6","password6"));
        auths.add(new Auth(9,"login9","password9"));
        auths.add(new Auth(9,"login10","password10"));

        List<Client> clients = new ArrayList<>();
        for (Person person : people) {
            for (Auth auth : auths) {
                if (person.getId() == auth.getId()){
                    clients.add(new Client(person, auth));
                }
            }
        }
        for (Client client : clients) {
            System.out.println(client);
        }
    }
}
//        Існують наступні об'єкти.
//        Створити класи під них.
//        Створити метод , який об'єднує об'єкти з однаковими id в єдиний об'єкт
//        і повертає вам цей список об'єктів.
//        Класс під загальний об'єкт рписати самостійно. Він повинен містити тільки необхідні поля
//
//
//        список 1
//        new Person(1,"vaysa",32);
//        new Person(2,"petya",31);
//        new Person(3,"kolya",30);
//        new Person(4,"anya",29);
//        new Person(5,"masha",28);
//        new Person(6,"andriy",30);
//        new Person(7,"maxim",31);
//        new Person(8,"vadym",32);
//        new Person(9,"taras",33);
//
//        список 2
//        new Auth(5,"login5","password5");
//        new Auth(2,"login2","password2");
//        new Auth(1,"login1","password1");
//        new Auth(7,"login7","password7");
//        new Auth(3,"login3","password3");
//        new Auth(4,"login4","password4");
//        new Auth(8,"login8","password8");
//        new Auth(6,"login6","password6");
//        new Auth(9,"login9","password9");
//
//        список 3 - це результат робботи методу
//        який об'єднює об'єкти з відповідними ід в один об'єкт з необхідним набором полів
//        -----------
//
//        описати метеостанцію за допомоги патерну observer
