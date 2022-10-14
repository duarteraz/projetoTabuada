
package br.senai.sp.jandira;

import java.awt.Color;
import java.awt.Font;

import br.senai.sp.jandira.model.Tabuada;
import br.senai.sp.jandira.gui.FrameTabuada;

public class AppCalculadora {

			public static void main(String[] args) {
				
				
				FrameTabuada tela = new FrameTabuada();
				tela.titulo = "Tabuada";
				tela.largura = 500;
				tela.altura = 710;
				tela.corDeFundo = new Color(250, 250, 250);
				tela.fontesDosLabels = new Font("Comic Sans MS", Font.BOLD, 20);
				tela.fonteTextField = new Font("BankGothic Md BT", Font.BOLD, 0);
				tela.fontedacaixa = new Font("Arial", 0, 30);
				tela.corDoButton1 = new Color(0, 200, 0);
				tela.corDoButton2 = new Color(255, 200, 0);
				tela.corDaCaixa = new Color(250, 250, 250);
				
				tela.criarTela();
				
				
				
				
				
				
				
				
				
				

				

		
}

}
