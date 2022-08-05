import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {        
        int opcao = 0;
        Scanner entrada = new Scanner(System.in);
        //Contato[] Vetor = new Contato[5];
        int contador = 0;
        List<Contato> lista = new ArrayList<>();

    do{
        contador = 0;
        System.out.println("---Menu---");
        System.out.println("1 - Adicionar contato");
        System.out.println("2 - Buscar contato");
        System.out.println("3 - Remover contato por numero");
        System.out.println("4 - Editar contato");
        System.out.println("5 - Listar agenda");
        System.out.println("0 = Sair");
        System.out.println("Escolha uma opçao");
        opcao = entrada.nextInt();
        int numero = 0;
        String nome = " ";
        String email = " ";
        String telefone = " ";

        switch (opcao) {
            case 0:
                System.out.println("Adeus!!");              
                break;       
            case 1:
            System.out.println("Digite um número: ");
            numero = entrada.nextInt();
            entrada.nextLine();
            System.out.println("Digite seu nome: ");
            nome = entrada.next();
            System.out.println("Digite um E-mail: ");
            email = entrada.next();
            System.out.println("Digite um telefone: ");
            telefone = entrada.next();
            Contato c = new Contato(numero, nome, email, telefone);
            lista.add(c);
            /*Vetor[contador] = c;
            contador++;*/

                break;
            case 2:
                System.out.println("Digite o nome do contato: ");
                nome = entrada.next();
                for (Contato contato: lista) {
                    if (nome.equals(contato.getNome())){
                        System.out.println(contato);
                        contador++;
                    }
                if(contador==0){
                    System.out.println("contato inexistente");
                }

                }
                break;
            case 3:
                System.out.println("Digite o nome do contato");
                nome = entrada.next();
                for (Contato contato : lista) {
                    if (nome.equals(contato.getNome())){
                        int posicaoLista = lista.indexOf(contato); //retorna a posição do contato
                        lista.remove(posicaoLista);
                        contador++;
                        System.out.println("Contato removido com sucesso");
                    }

                    if (lista.size() == 0){
                        break;
                    }

                }
                
                break;
            case 4:
                System.out.println("Digite o nome do contato");
                nome = entrada.next();
                for (Contato contato: lista) {
                    if (nome.equals(contato.getNome())){
                        int posicaoContato = lista.lastIndexOf(contato);
                        System.out.println("Digite um número: ");
                        numero = entrada.nextInt();
                        entrada.nextLine();
                        System.out.println("Digite seu nome: ");
                        nome = entrada.next();
                        System.out.println("Digite um E-mail: ");
                        email = entrada.next();
                        System.out.println("Digite um telefone: ");
                        telefone = entrada.next();
                        contato = new Contato(numero, nome, email, telefone);
                        lista.set(posicaoContato, contato);
                        contador++;
                        System.out.println("Contato atualizado com sucesso!");
                    }
                if(contador==0){
                    System.out.println("contato inexistente");
                }

                }

                break;

            case 5: 
                for (Contato contato : lista) {
                    System.out.println(contato);
                }
                break;
            default:
                System.out.println("Opção invalida, tente outra vez");
                break;
        }


    }while(opcao !=0);

    entrada.close();

   }
   
}