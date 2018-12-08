

public class RaceCarRunner {
	public static void main(String[] args) {
		/* Do the following things without changing the RaceCar class */
		
		// 1. Create a RaceCar and place it in 5th position
	RaceCar heh = new RaceCar("hi",5);
		// 2. Print the RaceCar's position in the race
System.out.println(heh.getPositionInRace());
		// 3. Crash the RaceCar
		heh.crash();
		// 4. If the car is damaged. Bring it in for a pit stop.
if(heh.damaged==true) {
	heh.pit();
}
		// 5. Help the car move into first place.
for(int i =heh.getPositionInRace();i>1;i--) {
heh.overtake();
}

	}
}
