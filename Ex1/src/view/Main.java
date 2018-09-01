package view;

import javax.swing.JOptionPane;

import controller.RedesController;

public class Main {

	public static void main(String[] args) {
		String so = System.getProperty("os.name");
		String site = "";
		int Menu = 0;
		RedesController Control = new RedesController();
		do {
			Menu = Integer.parseInt(JOptionPane.showInputDialog("1 - " + " Exibir Adaptadores IP que possuem IPv4"
					+ "\n2 - Exibir ping de um site\n0 - Encerrar"));
			switch (Menu) {
			case 1:
				Control.ip(so);
				break;
			case 2:
				site = JOptionPane.showInputDialog("Insira o site desejado (será escolhido o site do Google"
						+ " caso deixado em branco)");
				if (site.equals(null) || site.equals("")){
					site = "www.google.com.br";
				}
				Control.ping(so, site);
				break;
			case 0:
				JOptionPane.showMessageDialog(null, "Encerrando...");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida");
				break;
			}
		} while (Menu != 0);
	}

}
