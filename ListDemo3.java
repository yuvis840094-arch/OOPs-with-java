//student unique ID using hashset

import java.util.*;
public class ListDemo3 {

    public static boolean registerStudent(Set<Integer> ids, int id){
        if(ids.add(id)){  //add method returns true if the element is added successfully, false if the element is already present in the set.
            return true;
        }
        return false; 
    }
    public static boolean isRegistered(Set<Integer> ids, int id){
        if(ids.contains(id)){  //contains method returns true if the element is present in the set, false if the element is not present in the set.
            return true;
        }
        return false;  
    }
    
    public static int totalStudents(Set<Integer> ids){
        if(ids.size() > 0){  //size method returns the number of elements in the set.
            return ids.size();
        }
        return 0;
    }

    public static void main(String[] args) {
        Set<Integer> ids = new HashSet<>();

        System.out.println(registerStudent(ids, 101));
        System.out.println(registerStudent(ids, 102));
        System.out.println(registerStudent(ids, 103));
        System.out.println(registerStudent(ids, 101));

        System.out.println("Registered: " + isRegistered(ids, 102));
        System.out.println("Total Students: " + totalStudents(ids));
    }
    
}


//remove dublicate from a list

// Set<String> Result = new hashset<>();
// Result.addAll(names);