package tester;

import java.util.Scanner;

import com.app.fruits.Apple;
import com.app.fruits.Fruit;
import com.app.fruits.Mango;
import com.app.fruits.Orange;

public class FruitBasket {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter basket size");
		Fruit[] fruits = new Fruit[sc.nextInt()];

		boolean exit = false;
		int counter = 0;
		while (!exit) {
			System.out.println("Option 1: Add Mango, Option 2: Add Orange, Option 3: Add Apple"
					+ " Option 4. display names 5.display details of all fresh fruits 6.mark stale 7.mark all sour fruits stale 8.fruit specific functionality 100.exit");
			System.out.println("choose");
			switch (sc.nextInt()) {
			case 1: {
				System.out.println("Add mango details : 1.Color 2.Weight 3.Fresh");
				fruits[counter++] = new Mango(sc.next(), sc.nextDouble(), sc.nextBoolean());
				break;
			}
			case 2: {
				System.out.println("Add orange details : 1.Color 2.Weight 3.Fresh");
				fruits[counter++] = new Orange(sc.next(), sc.nextDouble(), sc.nextBoolean());
				break;
			}
			case 3: {
				System.out.println("Add Apple details : 1.Color 2.Weight 3.Fresh");
				fruits[counter++] = new Apple(sc.next(), sc.nextDouble(), sc.nextBoolean());
				break;
			}
			case 4: {
				for(int i = 0; i < counter; i++) {
					System.out.println(fruits[i].getName());
				}
				break;
			}
			case 5: {
				for (Fruit f : fruits) {
					if (f != null && f.isFresh()) {
						System.out.println(f);
					}
				}
				break;
			}
			case 6: {
				System.out.println("Input index");
				int index = sc.nextInt();
				if(index >=0 && index < counter) {
					fruits[index].setFresh(false);
				}
				else {
					System.out.println("Invalid index!!!");
				}
				break;
			}
			case 7: {
				for(int i = 0; i< counter; i++) {
					if(fruits[i].isFresh() && fruits[i].taste().equals("sour")) {
						fruits[i].setFresh(false);
					}
				}
				break;
			}
			case 8: {
				System.out.println("Input index");
				int index = sc.nextInt();
				if (index >= 0 && index < counter) {
					Fruit f1 = fruits[index];
					if (f1 instanceof Mango) {
						((Mango) f1).pulp();

					} else if (f1 instanceof Orange) {
						((Orange) f1).juice();
					} else if (f1 instanceof Apple) {
						((Apple) f1).jam();
					}
				}
				else {
					System.out.println("invalid index!!!");
				}
				break;
			}
			case 100: {
				System.exit(0);
			}
			default:
				System.out.println("Invalid option");
				
			}
		}
		sc.close();

	}

}
