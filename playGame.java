import java.util.*;
class game {	
void play(String str,char s)
{
	int i,c=0;
	//System.out.println("Play game");
	for(i=0;i<str.length();i++)
	{
		if(str.charAt(i)==s)
		{
			c=1;
			break;
		}
	}
	if(c==1)
	{
		System.out.println("Present");
	}
	else
		System.out.println("Not present");
	}
void instructGame()
{	
	System.out.println("display Instructions");
}
void exitGame()
{
	
}
}
public class playGame
{
	public static void main(String args[])
	{
		game obj = new game();
		Scanner sc = new Scanner(System.in);
		int ch;
		System.out.println("Enter ur choice:1. Play game 2.view instructions 3. exit game");
		ch = sc.nextInt();

		System.out.println("Enter a word\n");
		String str = sc.next();
		System.out.println("Enter letter");
		char s = sc.next().charAt(0);
		if(ch==1)
		{
			obj.play(str,s);
		}
		else if(ch==2){
			obj.instructGame();
		}
		else if(ch==3)
		{
			obj.exitGame();
		}
	}
}
