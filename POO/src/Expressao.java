import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.regex.*;

/*
Faça  uma  classe  Java  que  tenha  como  atributo  uma  String para  conter  uma  expressão  aritmética. 
Esta classe deve chamar-se Expressao e possuir métodos para:
	•instanciar  o  objeto,  recebendo  a  expressão  como  parâmetro  de  inicialização: 
	Expressao(String exp)
	•verificar se  a  expressão  aritmética  está  correta  sintaticamente  em  relação  ao  número  de 
	parênteses  utilizados–todos  que  estão  abrindo  estão  fechando  e  vice-versa,  sem  fechar  
	antes de abrir: 
	public boolean estaCorretaSintaticamente()
	•retornar a quantidade de operadores de divisão utilizados: 
	public int getQtdeDivisores()
	•retornar a  posição  do  primeiro  operador  aritmético  da  expressão(+, -,  *,  /): 
	public  int getPosicaoOperador()
	
Exemplo: (a+10)/(23*(10.5-b)-2.59/(b*a))
Expressao exp = new Expressao(“(a+10)/(23*(10.5-b)-2.59/(b*a))”);
exp.estaCorretaSintaticamente();  →retorna true
exp.getQtdeDivisores() → retorna 2
exp.getPosicaoOperador() → retorna 2 */

public class Expressao {

	JFrame frame;
	JLabel lblExp;
	JTextField txtExp;
	JLabel lblResultado;
	JTextField txtResultado;
	JButton btnQtdDivisores;
	JButton btnEstaCorreta;
	JButton btnPrimeiroOperador;

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new Expressao();
			}
		});
	}

	public Expressao() {
		initialize();
	}

	public void initialize() {

		frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(400, 400);
		frame.getContentPane().setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		lblExp = new JLabel("Expressão");
		lblExp.setBounds(50, 43, 61, 14);
		frame.getContentPane().add(lblExp);

		txtExp = new JTextField();
		txtExp.setBounds(121, 40, 200, 20);
		txtExp.setColumns(10);
		frame.getContentPane().add(txtExp);

		lblResultado = new JLabel("Resultado");
		lblResultado.setBounds(50, 104, 61, 14);
		frame.getContentPane().add(lblResultado);

		txtResultado = new JTextField();
		txtResultado.setBounds(121, 101, 200, 20);
		txtResultado.setColumns(10);
		txtResultado.setEditable(false);
		frame.getContentPane().add(txtResultado);

		btnQtdDivisores = new JButton("DIVISORES");
		btnQtdDivisores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = getQtdeDivisores();
				txtResultado.setText(String.valueOf(result));
			}
		});
		btnQtdDivisores.setBounds(10, 229, 110, 23);
		frame.getContentPane().add(btnQtdDivisores);

		btnEstaCorreta = new JButton("CORREÇÃO");
		btnEstaCorreta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean result = estaCorretaSintaticamente();
				txtResultado.setText(result == true ? "Está correta" : "Não está correta");
			}
		});
		btnEstaCorreta.setBounds(136, 229, 110, 23);
		frame.getContentPane().add(btnEstaCorreta);

		btnPrimeiroOperador = new JButton("OPERADOR");
		btnPrimeiroOperador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = getPosicaoOperador();
				txtResultado.setText(String.valueOf(result));
			}
		});
		btnPrimeiroOperador.setBounds(264, 229, 110, 23);
		frame.getContentPane().add(btnPrimeiroOperador);

	}

	public boolean estaCorretaSintaticamente() {
		String s = txtExp.getText();
		Pattern p = Pattern.compile("^[0-9+*-/()., ]+$");
		Matcher m = p.matcher(s);
		boolean b = m.matches();
		char[] exp = txtExp.getText().toCharArray();
		int countOpenP = 0;
		int countCloseP = 0;

		if (txtExp.getText().startsWith(")")) {
			return false;
		}
		if (txtExp.getText().endsWith("(")) {
			return false;
		}

		for (int i = 0; i < exp.length; i++) {
			if (exp[i] == '(')
				countOpenP++;
			if (exp[i] == ')')
				countCloseP++;
		}

		if (countOpenP == countCloseP) {
		   if(b == true) {
			   return b;
		   }else {
			   return false;
		   }
		}
		else
			return false;
	}

	public int getQtdeDivisores() {
		int count = 0;

		for (char c : txtExp.getText().toCharArray()) {
			if (c == '/')
				count++;
		}

		return count;
	}

	public int getPosicaoOperador() {
		char[] operadores = { '+', '-', '*', '/', '%' };
		char[] exp = txtExp.getText().toCharArray();
		int posicao = -1;

		loop: for (int i = 0; i < exp.length; i++) {
			for (int j = 0; j < operadores.length; j++) {
				if (exp[i] == operadores[j]) {
					posicao = i;
					break loop;
				}
			}
		}
		return posicao;
	}
	
}