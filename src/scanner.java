import java.util.Scanner;
public class scanner 
{

	
	public static void main(String[] args)
	{
		Scanner input  = new Scanner(System.in);
		System.out.println("Podaj imi�");
		String imi� = input.nextLine();
		System.out.println("Witaj " + imi�);
		
		System.out.println("Podaj tw�j wiek");
		int wiek = input.nextInt();
		System.out.println("Tw�j wiek to " + wiek);
		System.out.println("Podaj tw�j wzrost");
		double wzrost = input.nextDouble();
		System.out.println("Podaj twoj� wag�");
		double waga = input.nextDouble();
		wzrost = wzrost/100;
		double bmi = waga/(Math.pow(wzrost,2));
		System.out.println("Twoja warto�c BMI to " +bmi);
		if (bmi<18.5)
		{
			System.out.println("Jeste� zbyt szczup�y");
		}
		else if (bmi>25)
		{
			System.out.println("jeste� zbyt gruby.Czas na odchudzanie");
			
		}
		else 
			{
				System.out.println("Masz prawid�owy stosunek wzrostu do masy cia�a-BMI, gratuluj�");
				
			}
		}
		
		
		
		
	
	
	}


