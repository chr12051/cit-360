//According to Java2Novice.com "You can iterate through any collection object by using Iterator object.
//It provides two methods to iterate. The hasNext() method returns true if the iteration has more elements.
//The next() method returns the next element in the iteration. Below example shows how to iterate through an ArrayList."
 
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
 
public class MyCollectionIterator {
 
    public static void main(String a[]){
         
        List<String> myList = new ArrayList<String>();
        myList.add("Basketball");
        myList.add("Baseball");
        myList.add("Football");
        myList.add("Soccer");
        myList.add("Tennis");
        Iterator<String> itr = myList.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}