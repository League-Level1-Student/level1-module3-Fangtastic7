import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class Xbugs {
public static void main(String[] args) {
	World world = new World<>();
	world.show();
	for(int x=0;x<10;x++) {
		
	
		Location location = new Location(x,x);
		Location location2 = new Location(x,9-x);
		Bug bug = new Bug();
		world.add(location, bug);
		world.add(location2, bug);
	
	}
	
}
}
