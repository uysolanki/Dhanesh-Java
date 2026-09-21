//ctrl + shift + O  (orange)
package day1;

import olympics.Indoor;   //ony the public classes are imported
import olympics.Outdoor;

public class DriverApp {

	public static void main(String[] args) {
		Indoor g1=new Indoor("badminton");
		Outdoor g2=new Outdoor("football");
		
		g1.getPlayer();
		g2.getPlayer();
	}

}
