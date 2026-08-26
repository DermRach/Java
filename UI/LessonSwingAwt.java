
import javax.swing.*;
import java.awt.*;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// 05:55 26/08/2026
// Sem IDE específica
// Aplicação de interface gráfica e evento usando Awt e Swing
// Versão 1.0
// Autor: DermRach (Rafael)
// Website: mundopauta.com.br

public class LessonSwingAwt
{
	public static JFrame janela = new JFrame("Pacotes Gráficos em Java");
	public static JLabel rotJanela = new JLabel("Campo 1");
	public static JButton btn1Show = new JButton("Exibir");
	public static JPanel panel = new JPanel();
	public static JTextArea ta = new JTextArea();

	public static void main (String[]Args)
	{
		janela.setSize(600, 250);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	janela.setLocationRelativeTo(null);
	janela.setIconImage(Toolkit.getDefaultToolkit().getImage("icon.png"));
	janela.setLayout(new BorderLayout());
	panel.setLayout(new BorderLayout());

	ta.setEditable(false);

	btn1Show.addActionListener(new ActionListener()
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			System.out.println("O botão foi pressionado");
			ta.setText("Botão pressionado");
			janela.setTitle("Aplicação Swing e Awt em Java");
			btn1Show.setText("Resetar");
		}
	});

	panel.add(rotJanela, BorderLayout.NORTH);
	panel.add(btn1Show, BorderLayout.SOUTH);
	panel.add(ta, BorderLayout.CENTER);
	janela.add(panel, BorderLayout.CENTER);
	janela.setVisible(true);

	
	}
}
