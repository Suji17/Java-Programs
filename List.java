//List is ordered collection and contain duplicates .
//List - ArrayList,LinkedList,Vector,Stack
import java.util.*;
public class List {
	public void arrayList() {
		System.out.println("----------------------------------");
		System.out.println("\tArrayList");
		//arraylist - class
		ArrayList<String> ar1=new ArrayList<>();
		
		//addding elements
		ar1.add("red"); 
		ar1.add("blue"); 	
		ar1.add("green"); 
		
		//adding all from another list
		ArrayList<String> ar2 =new ArrayList<>();
		ar2.add("yellow"); 
		ar2.add("red"); 	
	    ar1.addAll(ar2);
	    System.out.println(ar1);
	    
	    //get element
	    System.out.println(ar1.getFirst());
	    System.out.println(ar1.getLast());
	    System.out.println(ar1.get(3));
	    
	    //set a value
	    ar1.set(4,"black");
	    System.out.println("After set"+ar1 );
	    
	    //remove
	    ar1.remove(0);
	    ar1.remove("black");
	    System.out.println("After removing "+ ar1 );
	    
	    System.out.println("containing blue? " + ar1.contains("blue"));
	    System.out.println("Index of green : "+ ar1.indexOf("green"));
	    System.out.println("Size:"+ ar1.size());
	    
	    //iteration
	    System.out.println("Iteration:");
	    for(String color:ar1) {
	    	System.out.println(color+" ");
	    }System.out.println();
	    System.out.println(ar1.toArray());

	}
	
	public static void main(String[] args) {
		List ob=new List();
		ob.arrayList();
	}

}
