public class HeyJude{
	public static void main(String[] args) {    
		String HEY = "Hey Jude";                                            //Declarar las cadenas
		String DONT = "don't ";
		String MAKE = "make it bad";
		String AFRAID = "be afraid";
		String LETM = "let me down";
		String TAKES = "take a sad song and make it better";
		String MADEG = "you were made to go out and get her";
		String HAVEF = "you have found her, now go and get her";
		String REMEMBER = "remember to ";
		String LETH = "let her into your heart";
		String LETU = "let her under your skin";
		String THEN = "then you ";
		String START = "can start ";
		String BEGIN = "begin ";
		String MAKEIT = "to make it better";
		String BETTER = "better ";
		String NA = "na ";
		String OH = "oh";
		int p=0, n=0, b=0;

		while (p<7){																	//Párrafos que comienzan con Hey Jude
			if (p==0 || p==1 || p==3 || p==5){System.out.print(HEY+", ");}				//Primer línea
				if (p==0 || p==1 || p==3 || p==5){System.out.print(DONT);}
				if (p==0 || p==5) {System.out.println(MAKE);}
					if (p==1) {System.out.println(AFRAID);}
						if(p==3){System.out.println(LETM);}
				if (p==0 || p==5) {System.out.println(TAKES);}							//Segunda línea
					if (p==1){System.out.println(MADEG);}
					if(p==3){System.out.println(HAVEF);}
				if (p==0 || p==1 || p==3 || p==5){System.out.print(REMEMBER);}			//Tercer línea
					if (p==0 || p==3){System.out.println(LETH);}
					if (p==1 || p==5){System.out.println(LETU);}
				if (p==0 || p==1 || p==3 || p==5){System.out.print(THEN);}				//Cuarta línea
					if (p==0 || p==3){System.out.print(START);}
					if (p==1 || p==5){System.out.print(BEGIN);}
						if (p==0 || p==1 || p==3 || p==5){System.out.print(MAKEIT);System.out.println();}
							if (p==0 || p==1 || p==3){System.out.println();}
							if (p==5){while (b<5){System.out.print(BETTER);b++;}}b=0;	//Quinta línea		//Repeticiones de better
								if (p==5){System.out.println(OH);}
								if (p==5){System.out.println();}
			if (p==2 || p==4 || p==6){while (n<10) {System.out.print(NA);n++;}}n=0;		//Repeticiones de na
					if (p==2 || p==4){System.out.println();}
				if (p==2 || p==4) {System.out.println();}
								if (p==6){System.out.println(""+HEY);}
				
					p++;
		}
	}
}