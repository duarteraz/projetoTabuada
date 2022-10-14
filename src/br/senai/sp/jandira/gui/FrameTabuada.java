
package br.senai.sp.jandira.gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import br.senai.sp.jandira.AppCalculadora;
import br.senai.sp.jandira.model.Tabuada;

public class FrameTabuada {

	public String titulo;
	public int largura;
	public int altura;
	public Color corDeFundoDeTela;
	public Font fonteDoTitulo;
	public Color corDoTitulo;
	public Font fonteDaDescricao;
	public Color corDaDescricao;
	public Font fonteDosLabels;
	public Color corDaFonteLabels;
	public Color corDosTexts;
	public Color corDoFundoDosTexts;
	public Font fonteDosTexts;
	public Font fonteDosBotões;
	public Color corDoBotaoCalcular;
	public Color corDoTextoBotaoCalcular;
	public Color corDoBotaoLimpar;
	public Color corDoTextoBotaoLimpar;
	public Color corFundoDaTabuada;
	public Color corDoFundoDaTabuada;
	public Color corDeFundo;
	public Color corDaCaixa;
	public Color corDoButton2;
	public Font fontesDosLabels;
	public Font fonteTextField;
	public Font fontedacaixa;
	public Color corDoButton1;

	public void criarTela() {
		JFrame tela = new JFrame();

		tela.setTitle(titulo);
		tela.setSize(largura, altura);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);

		// container

		Container painel = tela.getContentPane();
		painel.setBackground(corDeFundoDeTela);

		// Labels

		JLabel labelNome = new JLabel();
		labelNome.setText("Tabuada 1.0");
		labelNome.setBounds(70, 10, 200, 50);
		labelNome.setFont(fonteDoTitulo);
		labelNome.setForeground(corDoTitulo);

		JLabel labelDescricao1 = new JLabel();
		labelDescricao1.setText("Com a tabuada 1.0 os seus problemas acabaram, ");
		labelDescricao1.setBounds(73, 30, 350, 50);
		labelDescricao1.setFont(fonteDaDescricao);
		labelDescricao1.setForeground(corDaDescricao);

		JLabel labelDescricao2 = new JLabel();
		labelDescricao2.setText("calcule a tabuada que desejar em segundos!");
		labelDescricao2.setBounds(73, 45, 350, 50);
		labelDescricao2.setFont(fonteDaDescricao);
		labelDescricao2.setForeground(corDaDescricao);

		JLabel labelMult = new JLabel();
		labelMult.setText("Multiplicando:");
		labelMult.setBounds(87, 100, 350, 50);
		labelMult.setFont(fonteDosLabels);
		labelMult.setForeground(corDaFonteLabels);

		JTextField textMultiplicando = new JTextField();
		textMultiplicando.setBounds(200, 105, 150, 40);
		textMultiplicando.setFont(fonteDosTexts);
		textMultiplicando.setForeground(corDosTexts);
		textMultiplicando.setBackground(corDoFundoDosTexts);

		JLabel labelMinMult = new JLabel();
		labelMinMult.setText("Minímo Multiplicador:");
		labelMinMult.setBounds(30, 150, 350, 50);
		labelMinMult.setFont(fonteDosLabels);
		labelMinMult.setForeground(corDaFonteLabels);

		JTextField textMinMultiplicador = new JTextField();
		textMinMultiplicador.setBounds(200, 155, 150, 40);
		textMinMultiplicador.setFont(fonteDosTexts);
		textMinMultiplicador.setForeground(corDosTexts);
		textMinMultiplicador.setBackground(corDoFundoDosTexts);

		JLabel labelMaxMult = new JLabel();
		labelMaxMult.setText("Máximo Multiplicador:");
		labelMaxMult.setBounds(27, 200, 350, 50);
		labelMaxMult.setFont(fonteDosLabels);
		labelMaxMult.setForeground(corDaFonteLabels);

		JTextField textMaxMultiplicador = new JTextField();
		textMaxMultiplicador.setBounds(200, 205, 150, 40);
		textMaxMultiplicador.setFont(fonteDosTexts);
		textMaxMultiplicador.setForeground(corDosTexts);
		textMaxMultiplicador.setBackground(corDoFundoDosTexts);

		// botões
		JButton buttonCalcular = new JButton();
		buttonCalcular.setText("CALCULAR");
		buttonCalcular.setBounds(30, 300, 200, 40);
		buttonCalcular.setFont(fonteDosBotões);
		buttonCalcular.setForeground(corDoTextoBotaoCalcular);
		buttonCalcular.setBackground(corDoBotaoCalcular);

		JButton buttonLimpar = new JButton();
		buttonLimpar.setText("LIMPAR");
		buttonLimpar.setBounds(250, 300, 100, 40);
		buttonLimpar.setFont(fonteDosBotões);
		buttonLimpar.setForeground(corDoTextoBotaoLimpar);
		buttonLimpar.setBackground(corDoBotaoLimpar);

		JLabel labelResultado = new JLabel();
		labelResultado.setText("RESULTADO:");
		labelResultado.setBounds(10, 280, 365, 200);
		labelResultado.setFont(fonteDosLabels);
		labelResultado.setForeground(corDaFonteLabels);

		JLabel labelCopyright = new JLabel();
		labelCopyright.setText("Copyright by: Bianca Duarte | 2022");
		labelCopyright.setBounds(90, 640, 360, 40);
		labelCopyright.setFont(fonteDosTexts);
		labelCopyright.setForeground(corDaFonteLabels);

		// scroll

		JList<String> lista = new JList<String>();
		JScrollPane scroll = new JScrollPane(lista);

		scroll.setBounds(10, 400, 365, 250);
		lista.setBackground(corFundoDaTabuada);
		lista.setForeground(corDoFundoDaTabuada);

		// adicionando imagem/icone
		
		ImageIcon imagem = new ImageIcon(getClass().getResource("calculadora_icon_2.png"));
		JLabel labelImagem = new JLabel();
		labelImagem.setIcon(imagem);

		labelImagem.setBounds(10, 30, 50, 50);

		// eventos



		buttonLimpar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				//lista.setForeground(corFundoDaTabuada);
				
				String[] limpar = {""};
				lista.setListData(limpar);
				
				textMultiplicando.setText("");
				textMaxMultiplicador.setText("");
				textMinMultiplicador.setText("");
				
				textMultiplicando.requestFocus();

			}
		});

		// CLICK MULTIPLICADOR
		textMultiplicando.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyReleased(KeyEvent e) {
				textMultiplicando.setText(textMultiplicando.getText().replaceAll("[^0-9]", ""));

			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub

			}

		});

		textMinMultiplicador.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyReleased(KeyEvent e) {
				textMinMultiplicador.setText(textMinMultiplicador.getText().replaceAll("[^0-9]", ""));

			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub

			}
		});

		textMaxMultiplicador.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				;

			}

			@Override
			public void keyReleased(KeyEvent e) {
				textMaxMultiplicador.setText(textMaxMultiplicador.getText().replaceAll("[^0-9]", ""));

			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub

			}
		});

		// click botao

		buttonLimpar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				textMultiplicando.setText("");
				textMaxMultiplicador.setText("");
				textMinMultiplicador.setText("");
				scroll.setVisible(false);

			}
		});

		buttonCalcular.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Tabuada tabuada = new Tabuada();
				if (textMaxMultiplicador.getText().isEmpty() || textMinMultiplicador.getText().isEmpty()
						|| textMultiplicando.getText().isEmpty()) {

					JOptionPane.showMessageDialog(null, "Faltam valores", "ERRO", JOptionPane.ERROR_MESSAGE);

				} else {
					tabuada.multiplicado = Integer.parseInt(textMultiplicando.getText());
					tabuada.maxMultiplicador = Integer.parseInt(textMaxMultiplicador.getText());
					tabuada.minMultiplicador = Integer.parseInt(textMinMultiplicador.getText());
				}
				if (tabuada.maxMultiplicador < tabuada.minMultiplicador) {

					JOptionPane.showMessageDialog(null, "minimo multiplicador maior que  o maximo multiplicador",
							"ERRO", JOptionPane.ERROR_MESSAGE);

				} else {

					String[] resultados = tabuada.getTabuada();
					lista.setListData(resultados);
					scroll.setVisible(true);

				}

			}

		});

		// adicionando ao painel
		painel.add(labelNome);
		painel.add(labelDescricao1);
		painel.add(labelDescricao2);
		painel.add(labelImagem);
		painel.add(labelMult);
		painel.add(textMultiplicando);
		painel.add(labelMinMult);
		painel.add(textMinMultiplicador);
		painel.add(labelMaxMult);
		painel.add(textMaxMultiplicador);
		painel.add(buttonCalcular);
		painel.add(buttonLimpar);
		painel.add(labelResultado);
		painel.add(scroll);
		painel.add(labelImagem);
		painel.add(labelCopyright);

		tela.setVisible(true);

	}

}
