package prototype.personalexample;

import java.util.ArrayList;
import java.util.List;


public class Demo {
	public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        List<Animal> animalsCopy = new ArrayList<>();

        Dog dog = new Dog();
        dog.idade = 10;
        dog.acao = "latir";
        dog.nome = "doguinho";
        animals.add(dog);

        Dog anotherDog = (Dog) dog.clone();
        animals.add(anotherDog);

        Cat cat = new Cat();
        cat.idade = 10;
        cat.nome = "gatito";
        cat.acao = "miar";
        animals.add(cat);

        cloneAndCompare(animals, animalsCopy);
    }

    private static void cloneAndCompare(List<Animal> animals, List<Animal> animalsCopy) {
        for (Animal animal : animals) {
            animalsCopy.add(animal.clone());
        } 

        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i) != animalsCopy.get(i)) {
                System.out.println(i + ": Animals are different objects (yay!)");
                if (animals.get(i).equals(animalsCopy.get(i))) {
                    System.out.println(i + ": And they are identical (yay!)");
                } else {
                    System.out.println(i + ": But they are not identical (booo!)");
                }
            } else {
                System.out.println(i + ": Shape objects are the same (booo!)");
            }
        }
    }
}
