import java.util.Scanner;
public class Main {
    static Scanner read = new Scanner(System.in);
    public static void main(String[] args) {
        Produto[][] criar = new Produto[10][3];

        int x = 0;
        int i = 0;
        String no = "";
        float pe = 0;
        float ta = 0;
        int id = 0;
        float pr = 0;
        do {
            System.out.println("\nEscolha uma opção:\n1-Criar um Produto\n2-Alterar dados de um Produto\n3-Excluir um Produto\n4-Listar Produtos\n5-Sair");
    
            x = read.nextInt();
            switch (x) {
                case 1:
                    while (i<10) {
                        System.out.println("\nDigite o Nome:");
                        no = read.next();
                        System.out.println("Digite o Peso:");
                        pe = read.nextFloat();

                        criar[i][0] = new Produto(no, pe);
                        
                        System.out.println("Digite o Tamanho(em m³):");
                        ta = read.nextFloat();

                        criar[i][1] = new Produto(ta);

                        System.out.println("Digite o Id:");
                        id = read.nextInt();
                        System.out.println("Digite o Preço:");
                        pr = read.nextFloat();

                        criar[i][2] = new Produto(id, pr);
                        i++;
                        break;
                    }
                    break;
                case 2:
                    int y = 0;
                    System.out.println("\nSelecione um produto:\n");
                    if (i==0) {
                        System.out.println("Ainda não há nenhum produto criado!\n\n\n");
                        break;
                    } 

                    while (y!=i) {
                        System.out.println((y + 1) + " - " + criar[y][0].getNome());
                        y++;
                    }


                    int produtoNum = read.nextInt() - 1;
                    if (produtoNum < 0 || produtoNum >= i) {
                        System.out.println("Produto inválido!");
                        break;
                    }

                        
                    System.out.println("\nSelecione um atributo do produto:\n1-Nome\n2-Peso\n3-Tamanho\n4-Id\n5-Preço");
                    int p = read.nextInt();
                    switch (p) {
                        case 1:
                            System.out.println("Digite o novo nome:");
                            criar[produtoNum][0].setNome(read.next());
                            break;

                        case 2:
                            System.out.println("Digite o novo peso:");
                            criar[produtoNum][0].setPeso(read.nextFloat());
                            break;

                        case 3:
                            System.out.println("Digite o novo tamanho (em m³):");
                            criar[produtoNum][1].setTamanho(read.nextFloat());
                            break;

                        case 4: 
                            System.out.println("Digite o novo id:");
                            criar[produtoNum][2].setId(read.nextInt());
                            break;

                        case 5:
                            System.out.println("Digite o novo preço:");
                            criar[produtoNum][2].setPreco(read.nextFloat());
                            break;
                        
                        default:
                            System.out.println("Opção inválida");
                            break;
                    }
                break;

                case 3:
                    y = 0;
                    System.out.println("\nSelecione um produto:\n");
                    if (i==0) {
                        System.out.println("Ainda não há nenhum produto criado!\n\n\n");
                        break;
                    } 

                    while (y!=i) {
                        System.out.println((y + 1) + " - " + criar[y][0].getNome());
                        y++;
                    }

                    produtoNum = read.nextInt() - 1;
                    if (produtoNum < 0 || produtoNum >= i) {
                        System.out.println("Produto inválido!");
                        break;
                    }

                    for (int j = produtoNum; j < i - 1; j++) {
                        criar[j][0] = criar[j + 1][0];
                        criar[j][1] = criar[j + 1][1];
                        criar[j][2] = criar[j + 1][2];
                    }
                    criar[i - 1][0] = null;
                    criar[i - 1][1] = null;
                    criar[i - 1][2] = null;
                
                    i--;
                
                    System.out.println("Produto excluído com sucesso!");
                    break;

                case 4:
                    int q;
                    for(q=0;q<i;q++) {
                        System.out.println("\n\n" + (q + 1) + " - " + criar[q][0].getNome() + ":");
                        System.out.println("+Peso: " + criar[q][0].getPeso() + "kg");
                        System.out.println("+Tamanho: " + criar[q][1].getTamanho() + "m³");
                        System.out.println("+Id: " + criar[q][2].getId());
                        System.out.println("+Preço: R$" + criar[q][2].getPreco() + "\n\n");
                    }
                    break;

                case 5:
                    System.out.println("Você Saiu!");
                    break;
            
                default:
                    System.out.println("\n\n\n\nOpção Inválida\n\n\n\n");
                    break;
            }
        }while(x!=5);
    }
}