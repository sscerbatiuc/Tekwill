public class LearningSwitch {
	public static void main(String[] args) {
		
		final char aCapital ='A', aLowerCase = 'a', b='B',c='C';
		char option =  'A';
		switch(option){
			case aLowerCase:  // option == 'a'
				System.out.println("Valoarea este a");
			case aCapital:
				System.out.println("Valoarea este A");
				break; // Optional
			case b: // option == 'B'
				System.out.println("Valoarea este B");
				// break; // Optional
			case c: // option == 'C'
				System.out.println("Valoarea este C");
				break;
			//... numar nelimitat de case
			default:
				System.out.println("Nu am prevazut asa optiune. Sorry");
		}

		double salary = 5000;
		double salaryAvg = 5500;
		
		if(salary>salaryAvg){
			System.out.println("Your salary is above avg");
		} else {
			System.out.println("Your salary is below or equal avg");
		}

		int x = 5;
		String parImpar = x % 2 == 0 ? "" : 

		String message = salary > salaryAvg  ? "Your salary is above avg." : "Your salary is below or equal avg";
		System.out.println(message);

	}
}