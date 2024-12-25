package org.example.LogicaDoSistema;

import java.util.Scanner;

public class Menu {

    Scanner sc = new Scanner(System.in);

    protected void linha(){
        System.out.println("---------------------------------------------------------");
    }

    protected int userResponse(){

        int respota;
        respota = sc.nextInt();
        sc.nextLine();

        return respota;
    }

    public void menuDeLogin() {

        linha();
        System.out.println("Quem está querendo fazer loguin?\n" +
                "1- Administrador\n" +
                "2- Vendedor");
        linha();
    }
}
