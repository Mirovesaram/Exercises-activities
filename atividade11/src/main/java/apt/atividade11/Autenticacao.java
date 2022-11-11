/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apt.atividade11;
import java.util.Scanner;
/**
 *
 * @author aluno
 */
public class Autenticacao {
    private String id, senha;
    private Scanner recipient=new Scanner(System.in);
    public Autenticacao()
    {
        setId("12345");
        setSenha("j0@zInh0gam3p1@Ys");
    }
    public void setId(String id)
    {
        this.id=id;
    }
    public void setSenha(String senha)
    {
        this.senha=senha;
    }
    public String getId()
    {
        return id;
    }
    public String getSenha()
    {
        return senha;
    }
}
