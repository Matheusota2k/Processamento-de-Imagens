import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class ImageManipula {
	
	// Carrega uma imagem a partir de um arquivo
	public static BufferedImage loadImage()
	{		
		try {
			File file = new File("ProcessamentoIMGs\\Imagens\\Nerd.png");
			BufferedImage image = ImageIO.read(file);
			return image;			
		}catch (IOException e){
			System.out.print("Error ao carregar a imagem");
			throw new RuntimeException(e);
		}
	}
	
	// Salva uma ou mais imagens em arquivos
	public static void saveImage(BufferedImage... images)
	{		
		try {
			int i = 0;
			for (BufferedImage img : images)
			{
				i++;
				File saveFile = new File("ProcessamentoIMGs\\Imagens\\Nerd - copia " + i + ".jpg");
				ImageIO.write(img, "png", saveFile);
			}

		}catch (IOException e){
			System.out.print("Error ao salva a imagem");
			throw new RuntimeException(e);
		}

	}
	
	// Exibe uma ou mais imagens em uma janela Swing
	public static void displayImage(BufferedImage... images)
	{
		JFrame window = new JFrame();
		window.setTitle("Image");
		window.getContentPane().setLayout(new FlowLayout());
				
		for (BufferedImage img : images)
		{
			window.getContentPane().add(new JLabel(new ImageIcon(img)));
		}
		window.pack();
		window.setVisible(true);
		window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	// Obtém a altura da imagem
	public static int getHeight(BufferedImage image)
	{
		return image.getHeight();
		
	}
	
	// Obtém a largura da imagem
	public static int getWidth(BufferedImage image)
	{
		return image.getWidth();
	}
	
	// Calcula o número total de pixels na imagem
	public static int totalPixel(BufferedImage image)
	{
		return getHeight(image) * getWidth(image);
	}
}
