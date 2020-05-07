package _01_AnimalFarm;

import java.util.ArrayList;

public class Farm {
public static void main(String[] args) {
	Pig pig = new Pig();
	Cow cow = new Cow();
	Hen hen = new Hen();
	Horse horse = new Horse();
	Cow cow2 = new Cow();
	Horse horse2 = new Horse();
	ArrayList<Animal> farm = new ArrayList<Animal>();
	farm.add(pig);
	farm.add(cow);
	farm.add(hen);
	farm.add(horse);
	farm.add(cow2);
	farm.add(horse2);
	for (int i = 0; i < farm.size(); i++) {
		farm.get(i).makeNoise();
	}
}
}
