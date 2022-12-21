// Importa a classe Graphics do pacote java.awt
import java.awt.Graphics;

// Importa a classe JFrame do pacote javax.swing
import javax.swing.JFrame;

public class DesenhaCoração extends JFrame {
  public DesenhaCoração() {
    // Define o título da janela
    super("Desenhando um coração");

    // Define a largura e altura da janela
    setSize(400, 400);

    // Exibe a janela
    setVisible(true);
  }

  // Sobrescreve o método paint() da classe JFrame
  public void paint(Graphics g) {
    // Desenha um círculo usando a classe Graphics
    g.drawOval(100, 50, 200, 200);

    // Desenha outro círculo usando a classe Graphics
    g.drawOval(150, 100, 100, 100);
  }

  public static void main(String[] args) {
    // Cria uma instância da classe DesenhaCoração
    DesenhaCoração app = new DesenhaCoração();

    // Finaliza o programa quando a janela for fechada
    app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
