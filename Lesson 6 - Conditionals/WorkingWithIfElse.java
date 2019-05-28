public class WorkingWithIfElse {
	public static void main(String[] args){
		int a = 0, b = 13;
		System.out.println("Valoarea a="+a);
		if(a>0){
			System.out.println("a > 0");
		} else if (a==0){
			System.out.println("a = 0");
		}  
		else {
			System.out.println("a < 0");
		}
		System.out.println("Trying again");
		
		System.out.println("Valoarea a="+ a++);
		if(a>0){
			System.out.println("a > 0");
		} else if (a==0){
			System.out.println("a = 0");
		}  
		else {
			System.out.println("a < 0");
		}
	}
}