package week21;

import java.util.ArrayList;



class Main {

    //your main method here
    public static void main(String[] args) {
    
    ArrayList<Boolean> bools = new ArrayList<>();
    bools.add(true);
    bools.add(false);
    bools.add(false);
    repeatAL(bools);
    System.out.println(bools);
        
        
 
    }
    
    //create your method below
    public static void repeatAL(ArrayList<Boolean> bools) {
        
        ArrayList<Boolean> repeatedAL = new ArrayList<>();
        repeatedAL.addAll(bools);
        repeatedAL.addAll(bools);
        repeatedAL.addAll(bools);
        bools = repeatedAL;
        
 
 
    }
}