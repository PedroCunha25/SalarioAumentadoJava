
package trabalhopratico1;

import java.util.Scanner;

@SuppressWarnings("empty-statement")
public class TrabalhoPratico1 {

String opcao;
        double ordenado = 0.0;
        boolean valor = false;

        Scanner leia = new Scanner(System.in);

        do{
            System.out.println("\n\n ## ## ## ## ##");
            System.out.println("(I) Inserir o valor do salário actual");
            System.out.println("(A) Novo salário da categoria A");
            System.out.println("(B) Novo salário da categoria B");
            System.out.println("(C) Novo salário da categoria C");
            System.out.println("(D) Novo salário da categoria D");
            System.out.println("(E) Novo salário da categoria E");
            System.out.println("(S) Sair");


        // É o utilizador que escolhe a categoria no menu.
        // O programa calcula o novo salário nessa categoria



            opcao = leia.nextLine();

            switch (opcao) {

                case "i":
                case "I":
                    do {
                        System.out.print("Inserira o valor do salário actual");
                        ordenado = leia.nextInt();
                        if (ordenado < 0) {
                           System.out.println("salario: valor invalido introduzido");
                        }
                        else
                              System.out.println("Salário guardado");


                    } while (ordenado >= 0);
                    valor = true;
                    break;



                case "a":
                case "A":
                    if (valor = true)
                        ordenado = ordenado  + ( ordenado * 0.01);
                    else
                        System.out.println("Tem de inserir um salário antes de escolher uma categoria");
                    break;


                case "b":
                case "B":
                    if (valor = true)
                        ordenado = ordenado  + ( ordenado * 0.015);
                    else
                        System.out.println("Tem de inserir um salário antes de escolher uma categoria");
                    break;


                case "c":
                case "C":
                    if (valor = true)
                        ordenado = ordenado  + ( ordenado * 0.017);
                    else
                        System.out.println("Tem de inserir um salário antes de escolher uma categoria");
                    break;


                case "d":
                case "D":
                    if (valor = true)
                        ordenado = ordenado  + ( ordenado * 0.02);
                    else
                        System.out.println("Tem de inserir um salário antes de escolher uma categoria");
                    break;

                case "e":
                case "E":
                    if (valor = true)
                       ordenado = ordenado  + ( ordenado * 0.0225);
                    else
                        System.out.println("Tem de inserir um salário antes de escolher uma categoria");
                    break;

                
                    
                default:
                    System.out.println("Salário inválido ");
                    break;
               }while(!"S".equals(opcao));
            }

        
    

   