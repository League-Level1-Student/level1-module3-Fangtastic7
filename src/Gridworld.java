
import java.awt.Color;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class Gridworld {
public static void main(String[] args) {
	World world = new World();
	
	Location location = new Location(5, 5);
	Location location2 = new Location(7,7);
	Object object = new Object();
	
	
	Actor actor = new Actor();
	actor.equals(object);
	//object.
	world.show();
	world.add(location, actor  );
	world.add(location2, actor);
}
public  void show() {
	
	
	
	
}
public void add(Location loc, Actor occupant) {
	Bug bug1 = new Bug();
	bug1.setColor(Color.BLUE);
	Bug bug2 = new Bug();
	bug2.setColor(Color.RED);
	
	bug1.putSelfInGrid(occupant, loc);
	
}

}
