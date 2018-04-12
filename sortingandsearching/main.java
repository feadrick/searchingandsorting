/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingandsearching;

/**
 *
 * @author User
 */
public class main {
    public static void main(String []args){
    int ind;
    long start,end;
    sorting.printArray(sorting.getArray(100, true));
    start=System.currentTimeMillis();
    ind=sorting.linearSearch(sorting.getArray(100, true), 4);
    end=System.currentTimeMillis();
    if(ind!=-1){
    System.out.println("Found");
    }else{
    System.out.println("Not Found");
    }
    }
}
