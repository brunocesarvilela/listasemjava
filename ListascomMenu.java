import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ListascomMenu {
    public static void main(String[] args) {
        //Definir as variáveis
        int opcao = 0;
        ArrayList<String> nomes = new ArrayList<>();
        //Execução
        while (opcao!=6) {
            //Definição do menu
            System.out.println("MENU DE OPÇÕES: ");
            System.out.println("1 - Adicionar item");
            System.out.println("2 - Remover item");
            System.out.println("3 - Alterar item");
            System.out.println("4 - Listar itens");
            System.out.println("5 - Limpar lista");
            System.out.println("6 - Finalizar");
            System.out.print("Digite a opção desejada: ");

            //Receber a opção
            Scanner digitaopcao = new Scanner(System.in);
            opcao = digitaopcao.nextInt();   
        
            //Fazer a verificação
            switch (opcao) {
                case 1:
                    System.out.println("Digite o item a ser adicionado: ");
                    Scanner novoitem = new Scanner(System.in);
                    nomes.add(novoitem.next());
                    System.out.println("Lista atualizada após adicionar o item: " + nomes);
                    break;
                case 2:
                    System.out.println("Digite o item a ser removido: ");
                    Scanner itemsaida = new Scanner(System.in);
                    nomes.remove(itemsaida.next());
                    System.out.println("Lista atualizada após remover o item: " + nomes);
                    break;
                case 3:
                    System.out.println("Digite o item a ser alterado: ");
                    Scanner itemalterar = new Scanner(System.in);
                    String verificar = itemalterar.next();
                    for (int i=0;i<nomes.size();i++) {
                        if (nomes.get(i).equals(verificar)) {
                            System.out.println("Digite a alteração que deseja fazer: ");
                            Scanner itemalterado = new Scanner(System.in);
                            String trocaitem = itemalterado.next();
                            nomes.set(i,trocaitem);
                            System.out.println("Após a alteração a lista ficou assim: " + nomes);
                            break;
                        } else {
                            System.out.println("Item não encontrado na lista");
                            break;
                        }
                    }
                    break;
                    case 4:
                        System.out.println("Esta é a lista: " + nomes);
                        break;
                    case 5:
                        nomes.clear();
                        System.out.println("A lista foi esvaziada: " + nomes);
                        break;
                    case 6:
                        break;
            }
        }
    }
}
