
public class Doggo {
	int numberOfFriends;
	String favoriteFood;

	void bark() {
		System.out.println("bark");
	}

	void walk() {
		System.out.println("walk");
	}

	Doggo(String favoriteFood, int numberOfFriends) {
		this.favoriteFood = favoriteFood;
		this.numberOfFriends = numberOfFriends;
	}
}
