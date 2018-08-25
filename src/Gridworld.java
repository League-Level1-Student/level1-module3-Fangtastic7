
import java.awt.Color;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class Gridworld {
	
public static void main(String[] args) {
	int x=0;
	World world = new World();
	
	Location location = new Location(5, 5);
	Location location2 = new Location(7,7);
	Location location3 = new Location(7,6);
	Location location4= new Location(7,8);
	//location.
	//location.
	//Object object = new Object();
	Bug bug1 = new Bug();
	bug1.setColor(Color.BLUE);
	bug1.setDirection(90);
	
	Actor actor = new Actor();
	Actor actor2 = new Actor();
	actor.equals(bug1);
	//object.
	world.show();
	Flower flower = new Flower();
	actor2.equals(flower);
//	world.add(location3, flower);
//	world.add(location4, flower);
	
//	world.add(location, bug1  );
//	world.add(location2, bug1);
	Flower flower2 = new Flower();
	Flower flower3 = new Flower();
		for(int i=0;i<10;i++) {
			for(int y=0;y<10;y++) {
			Location location5 = new Location(i,y);
			//Location location6 = new Location(i,y);
			
			 if(i%2==0){
				flower3.setColor(Color.WHITE);
				world.add(location5, flower3);
			}
			else if(i%1==0){
				flower2.setColor(Color.RED);
				world.add(location5, flower2);
			}
			 if(i<5) {
					if(y<4) {
						flower.setColor(Color.BLUE);
						world.add( location5, flower);
					}
				}
			
			
			}
		}
	}

public  void show() {
	
	
	
	
}
public void add(Location loc, Actor occupant) {


	
	//Bug bug2 = new Bug();
//	bug2.setColor(Color.RED);
	
//	bug1.putSelfInGrid(occupant, loc);
	
}

}
