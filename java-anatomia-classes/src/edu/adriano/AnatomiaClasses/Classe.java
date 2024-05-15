package edu.adriano.AnatomiaClasses;
public class Classe {
   // Classe sempre maiusculo 
public static void  main(String [] args) { // Metodo principal
    int ano = 2021; // Variavel sempre "camelCase"

    final String BR = "Brasil"; // Valor fixo, nunca vai ser alterado.

    BR = "Brazil"; // Está errado, por se tratar de uma palavra reservada.



    =====================================================================


   String meuNome = "Adriano"; //TIPO nomebemdefinido = Atribuição

   int anoNascimento = 2000;

   boolean verdadeira = false;
  
   =====================================================================

   String primeiroNome = "Adriano";
   String segundoNome = "Ribeiro";

   String nomeCompleto = nomeCompleto (primeiroNome,segundoNome);
   System.out.println(nomeCompleto);
   
}
  
public static String nomeCompleto (String primeiroNome, String segundoNome) { // Segundo Metodo
     return primeiroNome.concat(" ").concat(segundoNome); // Duas formas para concatenar usando concat ou "+"
     return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }

}
