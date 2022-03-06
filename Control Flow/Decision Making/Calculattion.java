/* About loops :

The block of code is executed repeatedly until the condition evaluates true...

1) for loop:- The block of code is executed repeatedly until the condition evaluates true...
		syntax: for(initialization;condition;increment / decrement)
				{ statements;}
		use when we know the exact number of times which the block of code is executed....

	 for-each loop:-
         Java provides an enhanced for loop to traverse the data structures like array or collection. In the for-each loop, we don't need to update the loop variable.
         The syntax to use the for-each loop in java is given below.
		public class Calculation {    
                    public static void main(String[] args) {    
                            // TODO Auto-generated method stub    
                        String[] names = {"Java","C","C++","Python","JavaScript"};    
                         System.out.println("Printing the content of the array names:\n");    
                               for(String name:names) {    
                                System.out.println(name);    
                                   }    
                                 }    
                               }    


2) while loop:-- same as for loop but while loop is used when we don't know about number of times the block of code is executed...
			syntax:-- while(condition)
					{ statement;}

3) do-while loop:-- It iterates the block of code when we don't know the number of times but we need to execute the statement at least once..
			syntax: do	
				{ statement;
				} while(condition);






















*/