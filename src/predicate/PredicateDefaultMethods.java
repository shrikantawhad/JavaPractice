package predicate;

import java.util.function.Predicate;

public class PredicateDefaultMethods {
	public static void main(String[] args) {

		Predicate<String> startsWithS = x ->x.toLowerCase().charAt(0)=='s';
		Predicate<String> endsWitht = x->x.toLowerCase().charAt(x.length()-1)=='t';
		Predicate<String> and = endsWitht.and(startsWithS);
		Predicate<String> or = startsWithS.or(endsWitht);
		Predicate<String> negate = startsWithS.negate();
		Predicate<Object> predicateIsEqual = Predicate.isEqual("Ram");
		
		System.out.print("Functional Method test (startsWithS) (I/P : shrikant): ");
		System.out.println(startsWithS.test("shrikant"));
		
		System.out.print("Functional Method test (endsWitht)  (I/P : Ram) : ");
		System.out.println(endsWitht.test("Ram"));
		
		System.out.print("Default Method \"and\"  (I/P : Vishal) : ");
		System.out.println(and.test("Vishal"));
			
		System.out.print("Default Method \"or\"  (I/P : Sujit) : ");
		System.out.println(or.test("Sujit"));
		
		System.out.print("Default Method \"negate\"  (I/P : Akshay) : ");
		System.out.print(negate.test("Akshay"));
		
		
		System.out.print("Static Method \"isEqual\"  (I/P : Ram) : ");
		System.out.print(predicateIsEqual.test("Prathamesh"));
		
		
		
		
		
	}
}
