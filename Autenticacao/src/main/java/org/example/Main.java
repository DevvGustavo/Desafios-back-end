package org.example;

import org.example.LogicaDoSistema.Menu;
import org.example.LogicaDoSistema.Sistema;

public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu();
        Sistema sistema = new Sistema();

        menu.menuDeLogin();
        sistema.caminhoDoSistema();
    }
}