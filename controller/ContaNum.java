package controller;

public class ContaNum {

	public ContaNum() {
		super();
	}
	public int contagem(int num, int dig) {
		if (num<dig) {
			return 0;
		}
		if (num%10==dig) {
			return 1+contagem(num/10, dig);
		}
		return contagem(num/10, dig);
	}
}
