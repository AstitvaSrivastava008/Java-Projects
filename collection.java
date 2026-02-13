/*import java.util.ArrayList;
public class collection {
    public static void main(String[]  args)
    {
        ArrayList<String> list=new ArrayList<String>();//Creating arraylist    
            list.add("A");//Adding object in arraylist    
            list.add("B");    
            list.add("C");    
            list.add("D");  
            list.add(1,"E"); 
            list.get(0);
            list.remove(2);
            //Traversing list through Iterator    
            Iterator itr=list.iterator();    
            while(itr.hasNext()) {    
            System.out.println(itr.next());
            } 
    }
    
}

import java.util.*;
public class collection {
    public static void main(String[] args) {
      LinkedList <String> list = new LinkedList<String>();
      list.add("A");        
        list.add("B");
        list.add("C");
        list.add("D");

         ArrayList <String> list1 = new ArrayList<String>();
      list1.add("Apple");        
        list1.add("Banana");
        list1.add("Cherry");
        list1.add("Date");
        list.addAll(list1);
     
        Iterator itr = list.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }   
        
    }
}
import java.util.*;
public class collection {
    public static void main(String[] args)
    {
        List<Integer> list=new LinkedList<Integer>();//Creating arraylist    
            list.add(10);//Adding object in arraylist    
            list.add(20);    
            list.add(30);    
            list.add(40);
           int b = list.get(0);  
            list.remove(2);
            list.add(1,50); 
            list.set(2, 100);
            int a=list.size();
            boolean c=list.contains(20);
            int d=list.indexOf(40);
            //Traversing list through Iterator    
            Iterator itr=list.iterator();    
            while(itr.hasNext()) {    
            System.out.println(itr.next());
            }
            System.out.println("Size of list: " + a);
            System.out.println(" element: " + b);
            System.out.println("Contains 20: " + c);
            System.out.println("Index of 40: " + d);
            //list.clear();
            System.out.println("List cleared. Size of list now: " + list.size());
            List<Integer> list1=new ArrayList<Integer>();
            list1.add(5);
            list1.add(15);
            list1.add(25);
            list1.add(35);
            list1.add(45);
            list1.addAll(list);
            System.out.println("List1 elements after adding all from list: ");
            Iterator itr1=list1.iterator();    
            while(itr1.hasNext()) {
            System.out.println(itr1.next());
            }
            list.addAll(list1);
            System.out.println("List elements after adding all from list1: ");
            Iterator itr2=list.iterator();    
            while(itr2.hasNext()) {
            System.out.println(itr2.next());
            } 
            list.retainAll(list1);
            System.out.println("List elements after retaining all from list1: ");
            Iterator itr3=list.iterator();    
            while(itr3.hasNext()) {
            System.out.println(itr3.next());
            }
            list.removeAll(list1);
            System.out.println("List elements after removing all from list1: ");
            Iterator itr4=list.iterator();    
            while(itr4.hasNext()) {
            System.out.println(itr4.next());
            }
            list1.clear();
            System.out.println("List1 cleared. Size of list1 now: " + list1.size());

    }
}*/
import java.util.*;
public class collection {
    public static void main(String[] args)
    {
        Set<String> set=new HashSet<String>();//Creating HashSet    
            set.add("A");//Adding object in HashSet    
            set.add("B");    
            set.add("C");    
            set.add("D");  
            set.add("A"); //duplicate value
            set.remove("C");
            boolean b=set.contains("B");
            int a=set.size();
            //Traversing HashSet through Iterator    
            Iterator itr=set.iterator();    
            while(itr.hasNext()) {    
            System.out.println(itr.next());
            } 
            System.out.println("Size of set: " + a);
            System.out.println("Contains B: " + b);
            set.clear();
            System.out.println("Set cleared. Size of set now: " + set.size());
    }
}