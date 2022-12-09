/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao8;

/**
 *
 * @author mimi
 */
abstract class Empregado {
    private String name;
    public Empregado(String name)
    {
        this.name=name;
    }
    public void printPay()
    {
        System.out.println(getPay());
    }
    public abstract double getPay();
}
