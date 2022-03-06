/* We can convert one primitive data  type to another and this technique is called as "Type casting".
 There are two types:
1) Automatically by JVM
2)By programmer

1) automatically by JVM -- Is also called as Implicite type casting or widening type casting.
In this technique data is safe or data is not lose.

2)By programmer -- It is also called as explicite type casting or Narrowing type casting.
In this technique we lose the data. 




*/

class TypeCaste{
	public static void main(String [] args){

	int intNumber=50;
	
	double doubleNumber = intNumber;
	System.out.println("Before Type Casting the value of intNumber is "+intNumber);
	System.out.println("After Implicte Type casting the value of intNumber is "+doubleNumber);

	double doubleNumber2=50.50;
	//int intNumber2 = doubleValue;// throws error 
	System.out.println("Before Type Casting the value of intNumber is "+intNumber);
	int intNumber2 = (int) doubleNumber2;
	System.out.println("After Explicite Type casting the value of intNumber is "+intNumber2);
}
}