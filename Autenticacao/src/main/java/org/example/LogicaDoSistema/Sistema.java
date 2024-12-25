package org.example.LogicaDoSistema;

import java.util.Scanner;

public class Sistema {

    Menu menu = new Menu();

    public final void caminhoDoSistema(){

        menu.userResponse();

        if(menu.userResponse() == 1){

            sistemaDoAdm();
        }
        else if (menu.userResponse() == 2) {

            sistemaDoVendedor();
        }
        else{
            System.out.println("Digite uma opção válida...");
            caminhoDoSistema();
        }
    }

    private void sistemaDoAdm() {

        System.out.println("Entrei no ADM");
    }

    private void sistemaDoVendedor() {

        System.out.println("Entrei no vendedor");
    }
}
