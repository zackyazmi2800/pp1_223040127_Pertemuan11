/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan11;

/**
 *
 * @author zack
 */
public class MyStack extends AbstractStack {
    public MyStack(int capacity) {
        super(capacity);
    }

    public void displayStack(String s) {
        System.out.println(s);
        System.out.println("stack (bottom-->):");
        for (int i = 0; i < size(); i++) {
            System.out.print(peekN(i));
            System.out.print(' ');
        }
        System.out.println("");
    }

    public int peekN(int n) {
        return arr[n];
    }
}