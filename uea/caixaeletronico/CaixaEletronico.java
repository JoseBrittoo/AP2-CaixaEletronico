package br.edu.uea.caixaeletronico;
import javax.swing.JOptionPane;
import br.edu.uea.cliente.Cliente;
import br.edu.uea.contacorrente.ContaCorrente;


public class CaixaEletronico {

	public static void main(String [] args) {
		 Cliente cliente = new Cliente();
		 JOptionPane.showMessageDialog(null, " BEM VINDO AO BANCO \n JOKAALÊ "); 
		 
		  cliente.setNome(JOptionPane.showInputDialog("Nome: "));
		  cliente.setRg(JOptionPane.showInputDialog("RG: "));
		  cliente.setEndereco(JOptionPane.showInputDialog("Endereço: "));
		  String contaa = JOptionPane.showInputDialog("Digite Numero da conta:");
		  String agencia = JOptionPane.showInputDialog("Digite Numero da Agencia:");
		  int ic = Integer.parseInt(contaa);
		  int ia =Integer.parseInt(agencia);
		 
		  ContaCorrente conta1 = new ContaCorrente (ia,ic);
		  String d = JOptionPane.showInputDialog("Digite valor para depositar:");
		  int di = Integer.parseInt(d);
		  conta1.depositar(di);	
		  String s = JOptionPane.showInputDialog("Digite valor para sacar:");
		  int si = Integer.parseInt(s);		  
		  conta1.sacar(si);
		  JOptionPane.showInternalMessageDialog(null, "Nome: "+cliente.getNome()+"\n" + "RG: "+cliente.getRg()+"\n" + "Endereço: "+cliente.getEndereco()+"\n"
		  			+"Numero da Conta: "+conta1.getNumeroConta()+"\n"+
					"Numero da Agencia: "+conta1.getNumeroAgencia()+"\n"+"Saldo: "+ conta1.getSaldo()+"\n");
		  JOptionPane.showMessageDialog(null, conta1.obterExtrato());
		  JOptionPane.showMessageDialog(null, " Obrigado por usar nosso banco! "); 

	  }				
    }
	 