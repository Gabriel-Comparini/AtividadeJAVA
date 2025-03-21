O Projeto foi feito totalmente com a lógica de programação já conhecida e com a sintaxe básica de JAVA aprendida inteiramente em sala de aula.



Explicação do código:
1-Tudo começa com a implementação dos 3 construtores e seus 5 atributos no programa Produto.java.

2-Após a declaração de funções como getNome(); ou setNome(); é declarado as variaveis iniciais no começo do arquivo Main.java, isso em conjunto da biblioteca java.util.Scanner; para importar um "Scan".

3-O coração do programa é a matriz Produto[][] criar = new Produto[10][3]; que, em suma serve para distribuir os contrutores e atributos para o código.

4-Case 1 é onde ocorre a definição dos atributos com auxilio da variável "i" (uma das principais variaveis do código, que serve para contar quantos produtos foram criados).

5-Case 2 é onde ocorre o selecionamento do produto para ser alterado (int produtoNum = read.nextInt() - 1;), após isso é iniciado outro switch dentro do Case 2 para escolher um atributo do produto a ser modificado (por meio da variável p).

6-No Case 3 ocorre a exclusão de um produto criado, usando novamente produtoNum = read.nextInt() - 1; para definir o produto. Após isso o "for (int j = produtoNum; j < i - 1; j++)" faz com que os produtos se realoquem em suas ordens, após o realocamento, o produto selecionado é excluido (null).

7-No Case 4 o "for(q=0;q<i;q++)" realiza o trabalho de printar todos os produtos e seus atributos.

8-No case 5 o programa é encerrado, visto que todo código esta dentro de um "do{}while(x!=5)" sendo "x" a variável do switch principal.




Conclusões pós trabalho feito:
+Após a ultima aula do dia 18/03/25 pude concluir que meu código ficou muito mais complexo do que deveria, visto que eu poderia ter usado o array Produto[] ao invés da matriz.
+Eu também aprendi que existem maneiras mais simples de se realizar o Case 3, que também se impactam pelo fato do uso da matriz ao invés do array.
