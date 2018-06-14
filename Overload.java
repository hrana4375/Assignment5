
package assignment5;

public class Overload {
    void print() {
        System.out.println("In Function with null arguments");   
    }
    void print(float x) {
        System.out.println("In Function with float arguments");
    }
    void print(int x) {
        System.out.println("In Function with int arguments");
    }
    public static void main(String args[]) {
        Overload overload = new Overload();
        overload.print();
        overload.print(4);
        overload.print( 5.43f);
    }
    
}
