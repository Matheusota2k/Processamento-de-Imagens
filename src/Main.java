import java.awt.image.BufferedImage;

public class Main {
    public static void main(String[] args) {
        
        // Carrega a imagem base
        BufferedImage baseImage = ImageManipula.loadImage();

    
        // Lista de manipulações de imagem a serem aplicadas
        BufferedImage[] images = {
            baseImage, 
            RGBMetodos.updatePixel(baseImage), 
            RGBMetodos.scaleR(baseImage), 
            RGBMetodos.scaleG(baseImage), 
            RGBMetodos.scaleB(baseImage), 
            RGBMetodos.negativeFilter(baseImage),  
            RGBMetodos.grayScaleR(baseImage), 
            RGBMetodos.grayScaleG(baseImage),  
            RGBMetodos.grayScaleB(baseImage), 
            RGBMetodos.grayScaleFilter(baseImage), 
            RGBMetodos.binarizationFilter(baseImage, 117), 
            RGBMetodos.increaseTone(baseImage, "red", 50), 
            RGBMetodos.increaseTone(baseImage, "green", 50), 
            RGBMetodos.increaseTone(baseImage, "blue", 50), 
            RGBMetodos.brightnessAdd(baseImage, 50), 
            RGBMetodos.brightnessMtt(baseImage, 0.5f), 
            RGBMetodos.yiq2rgb(RGBMetodos.rgb2yiq(baseImage)), 
            RGBMetodos.brightnessAddY(RGBMetodos.rgb2yiq(baseImage), 50), 
            RGBMetodos.brightnessMttY(RGBMetodos.rgb2yiq(baseImage), 0.5f), 
            RGBMetodos.negativeFilterY(RGBMetodos.rgb2yiq(baseImage))
    };

        // Exibe informações sobre a imagem base
        System.out.println("Altura: " + ImageManipula.getHeight(baseImage));
        System.out.println("Largura: " + ImageManipula.getWidth(baseImage));
        System.out.println("Total de Pixels: " + ImageManipula.totalPixel(baseImage));
                
        // Exibe as imagens manipuladas
        ImageManipula.displayImage(images);
        
        // Salva as imagens manipuladas
        ImageManipula.saveImage(images);
    }
}
