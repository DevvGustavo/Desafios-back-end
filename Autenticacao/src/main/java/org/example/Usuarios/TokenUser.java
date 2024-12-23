package org.example.Usuarios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class TokenUser {
/*Gerar de forma automatica um token para confirmar que o usuario
* foi autenticado no sistema*/

    private Random numeroAleatorio;
    private int token;
    private String sequencia;
    private List<Character> listaDeNumeros;

    protected void funcionalidadesDoToken(){
        numeroAleatorio = new Random();
        token = numeroAleatorio.nextInt(301);

        /*Convertendo o número que o token recebe em String*/
        sequencia = String.valueOf(token);
        listaDeNumeros = new ArrayList<>();

        for (char c : sequencia.toCharArray()) {
            listaDeNumeros.add(c);
        }

        //Embaralha os números
        Collections.shuffle(listaDeNumeros);

        // Converter a lista embaralhada de volta para uma String
        StringBuilder tokenConvertido = new StringBuilder();

        for (char c : listaDeNumeros) {

            tokenConvertido.append(c);
        }
    }


}
