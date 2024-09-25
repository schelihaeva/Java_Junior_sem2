import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {

        Animal[] animals = new Animal[]{
                new Dog("Тузик", 4, "Питбуль"),
                new Dog("Грязнуля", 1, "Такса"),
                new Cat("Васька", 6, "Черно-белый"),
                new Cat("Рыжик", 3, "Рыжий")
        };

        for (Animal animal : animals) {
            System.out.println(animal.getClass().getSimpleName() + ":");
            System.out.println("Кличка: " + animal.name);
            System.out.println("Возраст: " + animal.age);

            try {
                Method method = animal.getClass().getMethod("makeSound");
                method.invoke(animal);
            } catch (Exception e) {
                System.out.println("Метод 'makeSound()' не найден.");
            }

            System.out.println();
        }


    }
}
