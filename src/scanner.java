import java.util.Scanner;
public class scanner 
{

	
	public static void main(String[] args)
	{
		Scanner input  = new Scanner(System.in);
		System.out.println("Podaj imiê");
		String imiê = input.nextLine();
		System.out.println("Witaj " + imiê);
		
		System.out.println("Podaj twój wiek");
		int wiek = input.nextInt();
		System.out.println("Twój wiek to " + wiek);
		System.out.println("Podaj twój wzrost");
		double wzrost = input.nextDouble();
		System.out.println("Podaj twoj¹ wagê");
		double waga = input.nextDouble();
		wzrost = wzrost/100;
		double bmi = waga/(Math.pow(wzrost,2));
		System.out.println("Twoja wartoœc BMI to " +bmi);
		if (bmi<18.5)
		{
			System.out.println("Jesteœ zbyt szczup³y");
		}
		else if (bmi>25)
		{
			System.out.println("jesteœ zbyt gruby.Czas na odchudzanie");
			
		}
		else 
			{
				System.out.println("Masz prawid³owy stosunek wzrostu do masy cia³a-BMI, gratulujê");
				
			}
		}
		
		
		
		
	
	
	}


