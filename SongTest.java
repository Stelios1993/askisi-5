import java.util.Scanner;

public class SongTest {

	public static void main(String[] args) {
		Scanner stelios = new Scanner (System.in);
				
		Singer frank= new Singer("Frank Sinatra");
		new Song("White Christmas",frank, "https://www.youtube.com/watch?v=q_XzZNCDWCA" );
		new Song ("Let It Snow! Let It Snow! Let It Snow!",frank, "https://www.youtube.com/watch?v=vGRC2LYmHfU" );
				
		Singer wham = new Singer ("Wham!");
		new Song ("Last Christmas",wham, "https://www.youtube.com/watch?v=E8gmARGvPlI" );
				
		Singer mariah = new Singer ("Mariah Carey");
		new Song ("All I Want for Christmas Is You",mariah,"https://www.youtube.com/watch?v=yXQViqx6GMY" );
				
		Singer chris = new Singer ("Chris Rea");
		new Song ("Driving home for christmas",chris, "https://www.youtube.com/watch?v=EvDxSW8mzvU");
				
		Singer sia = new Singer ("Sia");
		new Song ("Santa's Coming For Us",sia, "https://www.youtube.com/watch?v=V3EYjVPRClU" );
		
		while (true){
			System.out.println("***** Welcome to our DMST Christmas Music Application *****");
			System.out.println("Menu:");
			System.out.println("Type 1 to display singers' List");
			System.out.println("Type 2 to display Frank's Sinatra available songs");
			System.out.println("Type here:");
			int choice = stelios.nextInt();
			
			if (choice==1) {
				System.out.println("**Display Singer's List**");
				for (Singer sngr:Singer.singers) {
					if (sngr != null)
					System.out.println(sngr.toString());
				}
			}
				else if (choice==2) {
				System.out.println("Frank's Sinatra available songs" + "\n");
				int counter=0;
				for(Song sng:Song.songs) {
					if(sng != null)
						if(sng.getSinger() == frank)
							counter++;
					}
				System.out.println(counter +  "song(s) were found");				
				
				for(Song sng:Song.songs) {
					if(sng != null)
						if(sng.getSinger() == frank)
							System.out.println(sng.toString());
				}
			}
			
			else if (choice<1 || choice>2) {
				System.out.println("wrong input" +"\nYou can only type 1 or 2" +"\nTry harder next time");
			}
			System.out.println("***********************************************************"  +"\n" + "\n");
		}
	}
}