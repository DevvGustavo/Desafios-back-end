package org.example;

import java.util.Scanner;

public class Menu {

    Scanner sc = new Scanner(System.in);

    private void linha(){
        System.out.println("---------------------------------------------------------");
    }

    private int UserResponse(){

        int respota = sc.nextInt();
        return respota;

    }

    public void menuDeLogin() {

        linha();
        System.out.println("Quem está querendo fazer loguin?\n" +
                "1- Administrador\n" +
                "2- Vendedor");

        UserResponse();
    }
}
