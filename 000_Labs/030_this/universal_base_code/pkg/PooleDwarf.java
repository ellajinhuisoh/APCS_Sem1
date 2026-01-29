/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class PooleDwarf {
    private String name;
    private int age;

    // Constructor using 'this'
    public PooleDwarf(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public boolean isSameName(String name) {
        return this.name.equalsIgnoreCase(name);
    }
}
