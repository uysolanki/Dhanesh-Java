package olympics;

public class Indoor   //ek java file me only 1 public allowed
{
	
		String gameName;
		public Indoor(String gameName)
		{
			this.gameName=gameName;
		}
		
		
		public void getPlayer()
		{
			switch(gameName)
			{
			case "badminton" : System.out.println("P V Sindhu"); break;
			case "table tennis" : System.out.println("Mukesh"); break;
			}
		}
}


class Mukesh
{
	
}


class Dhanesh
{
	
}