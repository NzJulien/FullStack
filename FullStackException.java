/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package generics;

/**
 *
 * @author dzeuf
 */
public class FullStackException extends RuntimeException {

   public FullStackException() {
        this("Stack is full");
    }
    public FullStackException(String exception) {
        super(exception);
    }
}

