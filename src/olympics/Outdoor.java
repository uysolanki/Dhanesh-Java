package olympics;

public class Outdoor {
	String gameName;
	public Outdoor(String gameName)
	{
		this.gameName=gameName;
	}
	
	
	public void getPlayer()
	{
		switch(gameName)
		{
		case "cricket" : System.out.println("Kohli"); break;
		case "football" : System.out.println("Ronaldo"); break;
		}
	}
}
