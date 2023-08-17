package view;
import controller.ContaNum;
import javax.swing.*;
public class Principal {

	public static void main(String[] args) {
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número maior que 10 e menor que 999999."));
		while (num<=0 && num>999999) {
			num = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor válido, deve ser um número maior que 10 e menor que 999999."));
		}
		int dig = Integer.parseInt(JOptionPane.showInputDialog("Qual digito gostaria de procurar no número "+num+"?"));
		controller.ContaNum cn = new controller.ContaNum();
		if(num<10) {
			System.out.println("O dígito "+dig+" aparece uma vez no número "+num);
		}
		int contador = cn.contagem(num, dig);
		System.out.println("o algarismo "+dig+" aparece um total de "+contador+" vezes dentro do número "+num);
	}

}
