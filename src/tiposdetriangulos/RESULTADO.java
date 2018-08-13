/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposdetriangulos;

import java.util.Scanner;

/**
 *
 * @author franky
 */
public class RESULTADO 
{
    int l1,l2,l3;
    Scanner leer=new Scanner(System.in);
    public void eiesc()
{
    System.out.println("DAME UN LADO");
    l1=leer.nextInt();
    System.out.println("DAME EL SEGUNDO LADO");
    l2=leer.nextInt();
    System.out.println("DAME EL TERCER LADO");
    l3=leer.nextInt();

    if ((l1==l2)&&(l2==l3)&&(l3==l1))
        {
            System.out.println("equilàtero");
        }
    if ((l1==l2)&&(l3!=l1)&&(l3!=l2))
        {
            System.out.println("equilatero");
        }
    if((l1!=l2)&&(l2!=l3)&&(l3!=l1))
    {
        System.out.println("isòsceles");
    }
}
}
