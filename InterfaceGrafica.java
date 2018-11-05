import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

public class InterfaceGrafica extends Frame implements ActionListener {

	//private Conexao con;
	
	private Label lb_pesquisa;
	private Label lb_nome;
	private Label lb_salario;
	private Label lb_cargo;
	
	private TextField tx_pesquisa;
	private TextField tx_nome;
	private TextField tx_salario;
	private TextField tx_cargo;
	
	private Button bt_pesquisar;
	private Button bt_anterior;
	private Button bt_proximo;
	
	private Panel painel_pesquisa;
	private Panel painel_labeltext;
	private Panel painel_botoes;
	
	public InterfaceGrafica(String titulo, int largura, int altura) {
		//caracteristicas do form
		setTitle(titulo);
		setSize(largura, altura);
		setLayout(new BorderLayout(10, 10));
		setVisible(true);
		
		//instanciar os bangs
		//Label's
		lb_pesquisa = new Label("Nome: ");
		lb_nome = new Label ("Nome: ");
		lb_salario = new Label ("Salario: ");
		lb_cargo = new Label ("Cargo: ");
		//Caixas de Texto
		tx_pesquisa = new TextField ();
		tx_nome = new TextField ();
		tx_salario = new TextField ();
		tx_cargo = new TextField ();
		//Botões
		bt_pesquisar = new Button ("Pesquisar");
		bt_anterior = new Button ("Anterior");
		bt_proximo = new Button ("Proximo");
		
		painel_pesquisa = new Panel();
		painel_labeltext = new Panel();
		painel_botoes = new Panel();
		
		//Paineis
		painel_pesquisa.setLayout(new GridLayout(4,4));
		painel_labeltext.setLayout(new GridLayout(4,4));
		painel_botoes.setLayout(new GridLayout(3,2));
		
		//adicionar os itens aos paineis
		
		painel_pesquisa.add(lb_pesquisa);
		painel_pesquisa.add(tx_pesquisa);
		painel_pesquisa.add(bt_pesquisar);
		
		painel_labeltext.add(lb_nome);
		painel_labeltext.add(tx_nome);
		painel_labeltext.add(lb_salario);
		painel_labeltext.add(tx_salario);
		painel_labeltext.add(lb_cargo);
		painel_labeltext.add(tx_cargo);
		
		
		painel_botoes.add(bt_proximo);
		painel_botoes.add(bt_anterior);
		
		add(painel_pesquisa, BorderLayout.NORTH);
		add(painel_labeltext, BorderLayout.CENTER);
		add(painel_botoes, BorderLayout.SOUTH);
	
		
		addWindowListener(new FecharJanela());
		
		
		tx_pesquisa.addActionListener(this);
		tx_nome.addActionListener(this);
		tx_salario.addActionListener(this);
		tx_cargo.addActionListener(this);
		
		bt_pesquisar.addActionListener(this);
		bt_anterior.addActionListener(this);
		bt_proximo.addActionListener(this);
		
		//con = new Conexao();
	}
	
	
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == bt_pesquisar)
		{
			JOptionPane.showMessageDialog(null, "Gloria a deux", "Messagem feliz", JOptionPane.INFORMATION_MESSAGE);
			tx_pesquisa.setText("Mudou");
			tx_nome.setText("Mudou");
			tx_salario.setText("Mudou");
			tx_cargo.setText("Mudou");
			
		}
		if(e.getSource() == bt_proximo)
		{
			JOptionPane.showMessageDialog(null, "Gloria a deux", "Messagem feliz", JOptionPane.INFORMATION_MESSAGE);
			tx_pesquisa.setText("Mudou ali");
			tx_nome.setText("Mudou ali");
			tx_salario.setText("Mudou ali");
			tx_cargo.setText("Mudou ali");
			
		}
		if(e.getSource() == bt_anterior)
		{
			JOptionPane.showMessageDialog(null, "Gloria a deux", "Messagem feliz", JOptionPane.INFORMATION_MESSAGE);
			tx_pesquisa.setText("Mudou aqui");
			tx_nome.setText("Mudou aqui");
			tx_salario.setText("Mudou aqui");
			tx_cargo.setText("Mudou aqui");
			
		}
		
	}
	
}
