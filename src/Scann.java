import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Scann {

    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Digite seu nome");
        JOptionPane.showMessageDialog(null, "Olá :" + nome);

//        JOptionPane.showIn





//        int i = 0;

//        Scanner sc = new Scanner(System.in);
//        int i = sc.nextInt();
//        double x = sc.nextDouble();
//        String y = sc.next();
//        System.out.println("Valor digitado foi i : " + i);
//        System.out.println("Valor digitado foi x : " + x);
//        System.out.println("Valor digitado foi y: " + y);
//        sc.close();

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Digite um texto:");
//        System.out.println("texto digitado: "+sc.next());
//        sc.close();






//        while(sc.hasNext()){
//            i++;
//            System.out.println("Token: "+sc.next());
//        }
//
//
//        Scanner sc = new Scanner(System.in);
//        Pessoa pessoa;
//        List<Pessoa> listaPessoas = new ArrayList<Pessoa>();
//        int opcao = 0;
//
//        listaPessoas.
//
//        do {
//            System.out.println("## Escolha uma das opções abaixo ##");
//            System.out.println("Opção 1 - Cadastra pessoas");
//            System.out.println("Opção 2 - Imprime pessoas cadastradas");
//            System.out.println("Opção 0 - Sair do programa");
//            System.out.println("_______________________");
//
//            System.out.print("Digite aqui sua opção: ");
//            opcao = Integer.parseInt(sc.nextLine());
//
//
//
//            if(opcao == 1){
//                //Cria um novo objeto
//                pessoa = new Pessoa();
//
//                System.out.print("Digite o nome: ");
//                pessoa.setNome(sc.nextLine());
//
//                System.out.print("Digite a idade: ");
//                pessoa.setIdade(Integer.parseInt(sc.nextLine()));
//
//                System.out.println();
//
//                //Guarda o objeto pessoa em uma lista.
//                listaPessoas.add(pessoa);
//            }else if(opcao == 2){
//                if(listaPessoas.isEmpty()){
//                    System.out.println("Não existem pessoas cadastradas, pressione uma tecla para continuar!");
//                    sc.nextLine();
//                }else{
//                    System.out.println(listaPessoas.toString());
//
//                    System.out.println("Pressione um tecla para continuar.");
//                    sc.nextLine();
//                }         }
//        } while (opcao != 0);
//
//        sc.close();
    }
}
