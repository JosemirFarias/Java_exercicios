package classe;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		
		Produto p1 = new Produto();
		
		p1.nome = "Computador";
		p1.preco = 4500.59;
		p1.desconto = 0.15;
		
		var p2 = new Produto();
		
		p2.nome = "Caneta";
		p2.preco = 12.56;
		p2.desconto = 0.29;
		
		double precoFinal1 = p1.preco * (1 - p1.desconto);
		double precoFinal2 = p2.preco * (1 - p2.desconto);
		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
		
		System.out.printf("A média do carrinho é = R$%.2f.", mediaCarrinho);
	}

}