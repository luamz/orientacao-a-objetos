package ex7;

/* @author Luam */
public class Pedido {
    Item itens[] = new Item[50];
    int numero;
    int qtdeItens;
    
    float total(){
        float total=0;
        for (int i=0; i < qtdeItens; i++){
            total += itens[i].subtotal();
        }
        return total;
    }
    
    void addItem(Produto prod, int qtde){   
        if (prod.qtdeEstoque> qtde){
            Item novo = new Item();
            novo.produto = prod;
            novo.quantidade = qtde;
            itens[qtdeItens] = novo;
            qtdeItens++;
        }
        else
            System.out.printf("Não temos %s! Sentimos muito!\n", prod.nome);
    }
        
    void imprimirItens(){
        for (int i=0; i < qtdeItens; i++){
           System.out.printf("%s - R$%.2f - %d \n", itens[i].produto.nome, itens[i].produto.preco, itens[i].quantidade);
        }
    }
    
}
