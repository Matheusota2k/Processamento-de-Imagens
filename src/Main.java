import java.awt.image.BufferedImage;

public class Main {
    public static void main(String[] args) {
        
        // Carrega a imagem base
        BufferedImage imageBase = ImagemManipula.loadImage();

    
        // Lista de manipulações de imagem a serem aplicadas
        BufferedImage[] imagens = {
            imageBase, 
            RGBMetodos.updatePixel(imageBase), 
            RGBMetodos.scaleR(imageBase), 
            RGBMetodos.scaleG(imageBase), 
            RGBMetodos.scaleB(imageBase), 
            RGBMetodos.negativeFilter(imageBase),  
            RGBMetodos.grayScaleR(imageBase), 
            RGBMetodos.grayScaleG(imageBase),  
            RGBMetodos.grayScaleB(imageBase), 
            RGBMetodos.grayScaleFilter(imageBase), 
            RGBMetodos.binarizationFilter(imageBase, 117), 
            RGBMetodos.increaseTone(imageBase, "red", 50), 
            RGBMetodos.increaseTone(imageBase, "green", 50), 
            RGBMetodos.increaseTone(imageBase, "blue", 50), 
            RGBMetodos.brightnessAdd(imageBase, 50), 
            RGBMetodos.brightnessMtt(imageBase, 0.5f), 
            RGBMetodos.yiq2rgb(RGBMetodos.rgb2yiq(imageBase)), 
            RGBMetodos.brightnessAddY(RGBMetodos.rgb2yiq(imageBase), 50), 
            RGBMetodos.brightnessMttY(RGBMetodos.rgb2yiq(imageBase), 0.5f), 
            RGBMetodos.negativeFilterY(RGBMetodos.rgb2yiq(imageBase))
    };

        // Exibe informações sobre a imagem base
        System.out.println("Altura: " + ImagemManipula.getHeight(imageBase));
        System.out.println("Largura: " + ImagemManipula.getWidth(imageBase));
        System.out.println("Total de Pixels: " + ImagemManipula.totalPixel(imageBase));
                
        // Exibe as imagens manipuladas
        ImagemManipula.displayImage(imagens);
        
        // Salva as imagens manipuladas
        ImagemManipula.saveImage(imagens);
    }
}
