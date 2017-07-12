/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ecommain;
import java.util.*;
import java.io.*;
/**
 *
 * @author Pranit Raje
 */
class EComMain {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        DataInputStream in = new DataInputStream(System.in);
        Vector pro=new Vector();
        String name=new String();
        int ch;
        try {
        do {
        System.out.println("\n1.add\n2.find\n3.list\n0.Exit");
        ch = Integer.parseInt(in.readLine());
        switch(ch) {
            case 1: 
                 name = in.readLine();
                 name = name.toLowerCase();
                 if (pro.contains(name) || name.length()>30) {
                     break; //To check for the duplicate and length before adding the product 
                 }
                 pro.addElement(name);
                 break;
            case 2: 
                int count=0;
                String search = in.readLine();
                search = search.toLowerCase();
                for (int i=0; i< pro.size(); i++ ) {
                    if(pro.contains(search)) {
                    count++;
                    }
                }
                System.out.println(count);
                break;
            case 3:    
                Enumeration vEnum = pro.elements();
                while(vEnum.hasMoreElements())
                    System.out.println(vEnum.nextElement());
                break;
            case 0:
                break;
            default:
                System.out.println("Invalid Option!");
            }
        }while(ch!=0);
        }
        catch (IOException | NumberFormatException e) {
            System.out.println("Error!");
        }
    }  
}
