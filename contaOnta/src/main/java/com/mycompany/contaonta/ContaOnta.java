/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.contaonta;
import java.util.Scanner;
/**
 *
 * @author mimi
 */
public class ContaOnta {
    Scanner recipiente=new Scanner(System.in);
    private String numero, cliente;
    private double saldo, limite;    
    public void setNumero(String numero)
    {
        this.numero=numero;
    }
    public void setCliente(String cliente)
    {
        this.cliente=cliente;
    }
    public void setSaldo(double saldo)
    {
        this.saldo=saldo;
    }
    public void setDepositar(double deposito)
    {
        saldo+=deposito;
    }
    public void setSacar(double retirada)
    {        
        if(retirada<saldo)
        {
            saldo-=retirada;
        }            
        else
        {
            System.out.println("Saque inválido. Você não tem todo esse montante.");
        }            
    }
    public void setLimite(double limite)
    {        
        this.limite=limite;
    }
    public String getNumero()
    {
        return numero;
    }
    public String getCliente()
    {
        return cliente;
    }
    public double getSaldo()
    {
        return saldo;
    }
    public double getLimite()
    {
        return limite;
    }
}

