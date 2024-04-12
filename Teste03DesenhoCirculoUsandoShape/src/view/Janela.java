package view;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Shape;
import java.awt.geom.Point2D;

import javax.swing.JFrame;
import javax.swing.event.ChangeListener;

public class Janela extends JFrame {
	
	Tela tela;
	Botoes botoes = new Botoes();
	
	public Janela(Shape desenho) {
		super("janela da primeira aula");
		
		tela = new Tela(desenho);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		tela.setPreferredSize(new Dimension(620, 620));
		
		add(tela, BorderLayout.CENTER);
		add(botoes, BorderLayout.LINE_END);
		
		setVisible(true);
		pack();
		
	}
	
	public void adicionaListenerSlide(ChangeListener cl) {
		botoes.adicionaListenerSlide(cl);
	}
	
	public void atualiza(Shape desenho) {
		tela.atualiza(desenho);
	}
	
	public Point2D.Double getValorSlideT() {
		return new Point2D.Double(
				botoes.getValorSlideTX(), 
				botoes.getValorSlideTY());
	}
	
	public int getValorSlideQtd() {
		return botoes.getValorSlideQtd();
	}

	public double getValorSlideR() {
		return botoes.getValorSlideR();
	}

	
}
