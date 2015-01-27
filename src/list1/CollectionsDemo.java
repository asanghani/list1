package list1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
/*
 1. void add(int index, Object obj)--->Inserts obj into the invoking list at the index passed in index. Any pre-existing elements at or beyond the point of insertion 
                                    are shifted up. Thus, no elements are overwritten.
 2. boolean addAll(int index, Collection c)-->Inserts all elements of c into the invoking list at the index passed in index. Any pre-existing elements at or beyond the 
 									point of insertion are shifted up. Thus, no elements are overwritten. Returns true if the invoking list changes and returns false otherwise.   
 3. Object get(int index)----->Returns the object stored at the specified index within the invoking collection.
 4. int indexOf(Object obj)--->Returns the index of the first instance of obj in the invoking list. If obj is not an element of the list, .1 is returned.
 5. int lastIndexOf(Object obj)-->Returns the index of the last instance of obj in the invoking list. If obj is not an element of the list, .1 is returned.    
 6. ListIterator listIterator( )-->Returns an iterator to the start of the invoking list.  
 7. ListIterator listIterator(int index)-->Returns an iterator to the invoking list that begins at the specified index.   
 8. Object remove(int index)-->Removes the element at position index from the invoking list and returns the deleted element. 
                             The resulting list is compacted. That is, the indexes of subsequent elements are decremented by one.
 9. Object set(int index, Object obj)-->Assigns obj to the location specified by index within the invoking list.  
 10.List subList(int start, int end)-->Returns a list that includes elements from start to end.1 in the invoking list. 
                                       Elements in the returned list are also referenced by the invoking object.          */
public class CollectionsDemo {

	   public static void main(String[] args) {
	      List<String> a1 = new ArrayList<String>();
	      a1.add("Zara");
	      a1.add("Mahnaz");
	      a1.add("Ayan");
	      System.out.println(" ArrayList Elements");
	      System.out.print("\t" + a1);

	      List<String> l1 = new LinkedList<String>();
	      l1.add("Zara");
	      l1.add("Mahnaz");
	      l1.add("Ayan");
	      System.out.println();
	      System.out.println(" LinkedList Elements");
	      System.out.print("\t" + l1);
	      
	      
	      
	     ArrayList<String> al = new ArrayList<String>(); 
	    //add elements to the ArrayList
	        al.add("JAVA");
	        al.add("C++");
	        al.add("PERL");
	        al.add("PHP");
	        System.out.println(al);
	       
	   //get elements by index
	        System.out.println("Element at index 1: "+al.get(1));
	        System.out.println("Does list contains JAVA? "+al.contains("JAVA"));
	        
	 //add elements at a specific index
	        al.add(2,"PLAY");
	        System.out.println(al);
	        System.out.println("Is arraylist empty? "+al.isEmpty());
	        System.out.println("Index of PERL is "+al.indexOf("PERL"));
	        System.out.println("Size of the arraylist is: "+al.size());
	        
	//Iterator with List        
	        Iterator<String> values = al.iterator();
	        while(values.hasNext()){
	        	System.out.println(values.next());
	        }		 
	
	   }
	}
