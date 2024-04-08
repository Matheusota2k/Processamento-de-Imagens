import java.awt.Color;
import java.awt.image.BufferedImage;

public class RGBMetodos{

    // Obtém todos os pixels da imagem 
    public static void getAllPixel(BufferedImage image) {
        for (int w = 0; w < image.getWidth(); w++) {
            for (int h = 0; h < image.getHeight(); h++) {
                Color rgb = new Color(image.getRGB(w, h));
                System.out.println(rgb);
            }
        }
    }

    // Atualiza os pixels da imagem conforme especificado
    public static BufferedImage updatePixel(BufferedImage image) {
        BufferedImage newImage = new BufferedImage(image.getWidth(), image.getHeight(), image.getType());

        Color red = new Color(255, 0, 0);
        Color green = new Color(0, 255, 0);
        Color blue = new Color(0, 0, 255);

        for (int w = 0; w < image.getWidth(); w++) {
            for (int h = 0; h < image.getHeight(); h++) {
                Color rgb = new Color(image.getRGB(w, h));
                newImage.setRGB(w, h, rgb.getRGB());
            }
        }

        newImage.setRGB(0, 0, blue.getRGB());
        newImage.setRGB(image.getWidth() / 2, image.getHeight() / 2, green.getRGB());
        newImage.setRGB(image.getWidth() - 1, image.getHeight() - 1, red.getRGB());

        getAllPixel(newImage);

        return newImage;
    }

    // Escala os valores do componente vermelho dos pixels
    public static BufferedImage scaleR(BufferedImage image) {
        BufferedImage newImage = new BufferedImage(image.getWidth(), image.getHeight(), image.getType());

        for (int w = 0; w < image.getWidth(); w++) {
            for (int h = 0; h < image.getHeight(); h++) {
                Color rgb = new Color(image.getRGB(w, h));
                Color newRed = new Color(rgb.getRed(), 0, 0);
                newImage.setRGB(w, h, newRed.getRGB());
            }
        }

        return newImage;
    }

    // Escala os valores do componente verde dos pixels
    public static BufferedImage scaleG(BufferedImage image) {
        BufferedImage newImage = new BufferedImage(image.getWidth(), image.getHeight(), image.getType());

        for (int w = 0; w < image.getWidth(); w++) {
            for (int h = 0; h < image.getHeight(); h++) {
                Color rgb = new Color(image.getRGB(w, h));
                Color newGreen = new Color(0, rgb.getGreen(), 0);
                newImage.setRGB(w, h, newGreen.getRGB());
            }
        }

        return newImage;
    }

    // Escala os valores do componente azul dos pixels
    public static BufferedImage scaleB(BufferedImage image) {
        BufferedImage newImage = new BufferedImage(image.getWidth(), image.getHeight(), image.getType());

        for (int w = 0; w < image.getWidth(); w++) {
            for (int h = 0; h < image.getHeight(); h++) {
                Color rgb = new Color(image.getRGB(w, h));
                Color newBlue = new Color(0, 0, rgb.getBlue());
                newImage.setRGB(w, h, newBlue.getRGB());
            }
        }

        return newImage;
    }

    // Aplica um filtro negativo na imagem
    public static BufferedImage negativeFilter(BufferedImage image) {
        BufferedImage newImage = new BufferedImage(image.getWidth(), image.getHeight(), image.getType());

        for (int w = 0; w < image.getWidth(); w++) {
            for (int h = 0; h < image.getHeight(); h++) {
                Color rgb = new Color(image.getRGB(w, h));
                Color negativeColor = new Color(255 - rgb.getRed(), 255 - rgb.getGreen(), 255 - rgb.getBlue());
                newImage.setRGB(w, h, negativeColor.getRGB());
            }
        }

        return newImage;
    }

    // Converte a imagem para escala de cinza com base no componente vermelho
    public static BufferedImage grayScaleR(BufferedImage image) {
        BufferedImage newImage = new BufferedImage(image.getWidth(), image.getHeight(), image.getType());

        for (int w = 0; w < image.getWidth(); w++) {
            for (int h = 0; h < image.getHeight(); h++) {
                Color rgb = new Color(image.getRGB(w, h));
                Color grayRed = new Color(rgb.getRed(), rgb.getRed(), rgb.getRed());
                newImage.setRGB(w, h, grayRed.getRGB());
            }
        }

        return newImage;
    }

    // Converte a imagem para escala de cinza com base no componente verde
    public static BufferedImage grayScaleG(BufferedImage image) {
        BufferedImage newImage = new BufferedImage(image.getWidth(), image.getHeight(), image.getType());

        for (int w = 0; w < image.getWidth(); w++) {
            for (int h = 0; h < image.getHeight(); h++) {
                Color rgb = new Color(image.getRGB(w, h));
                Color grayGreen = new Color(rgb.getGreen(), rgb.getGreen(), rgb.getGreen());
                newImage.setRGB(w, h, grayGreen.getRGB());
            }
        }

        return newImage;
    }

    // Converte a imagem para escala de cinza com base no componente azul
    public static BufferedImage grayScaleB(BufferedImage image) {
        BufferedImage newImage = new BufferedImage(image.getWidth(), image.getHeight(), image.getType());

        for (int w = 0; w < image.getWidth(); w++) {
            for (int h = 0; h < image.getHeight(); h++) {
                Color rgb = new Color(image.getRGB(w, h));
                Color grayBlue = new Color(rgb.getBlue(), rgb.getBlue(), rgb.getBlue());
                newImage.setRGB(w, h, grayBlue.getRGB());
            }
        }

        return newImage;
    }

    // Converte a imagem para escala cinza
    public static BufferedImage grayScaleFilter(BufferedImage image) {
        BufferedImage newImage = new BufferedImage(image.getWidth(), image.getHeight(), image.getType());

        for (int w = 0; w < image.getWidth(); w++) {
            for (int h = 0; h < image.getHeight(); h++) {
                Color rgb = new Color(image.getRGB(w, h));
                int grayAverage = (rgb.getRed() + rgb.getGreen() + rgb.getBlue()) / 3;
                Color grayScale = new Color(grayAverage, grayAverage, grayAverage);
                newImage.setRGB(w, h, grayScale.getRGB());
            }
        }

        return newImage;
    }

    // Aplica um filtro de binarização na imagem
    public static BufferedImage binarizationFilter(BufferedImage image, int thresholding) {
        BufferedImage newImage = new BufferedImage(image.getWidth(), image.getHeight(), image.getType());

        for (int w = 0; w < image.getWidth(); w++) {
            for (int h = 0; h < image.getHeight(); h++) {
                Color rgb = new Color(image.getRGB(w, h));
                int average = (rgb.getRed() + rgb.getGreen() + rgb.getBlue()) / 3;
                int color = average > thresholding ? 255 : 0;
                Color newColor = new Color(color, color, color);
                newImage.setRGB(w, h, newColor.getRGB());
            }
        }

        return newImage;
    }

    // Aumenta o tom de cor na imagem
    public static BufferedImage increaseTone(BufferedImage image, String tone, int addTone) {
        if (!tone.equalsIgnoreCase("Red") && !tone.equalsIgnoreCase("Green") && !tone.equalsIgnoreCase("Blue"))
            throw new IllegalArgumentException("Error!");

        BufferedImage newImage = new BufferedImage(image.getWidth(), image.getHeight(), image.getType());

        for (int w = 0; w < image.getWidth(); w++) {
            for (int h = 0; h < image.getHeight(); h++) {
                Color rgb = new Color(image.getRGB(w, h));
                Color toneAdd = rgb;

                if (tone.equalsIgnoreCase("Red"))
                    toneAdd = new Color(addColor(rgb.getRed(), addTone), rgb.getGreen(), rgb.getBlue());
                else if (tone.equalsIgnoreCase("Green"))
                    toneAdd = new Color(rgb.getRed(), addColor(rgb.getGreen(), addTone), rgb.getBlue());
                else
                    toneAdd = new Color(rgb.getRed(), rgb.getGreen(), addColor(rgb.getBlue(), addTone));

                newImage.setRGB(w, h, toneAdd.getRGB());
            }
        }

        return newImage;
    }

    // Adiciona um valor especificado ao brilho da imagem
    public static BufferedImage brightnessAdd(BufferedImage image, int brightness) {
        BufferedImage newImage = new BufferedImage(image.getWidth(), image.getHeight(), image.getType());

        for (int w = 0; w < image.getWidth(); w++) {
            for (int h = 0; h < image.getHeight(); h++) {
                Color rgb = new Color(image.getRGB(w, h));
                Color brightnessColor = new Color(addColor(rgb.getRed(), brightness), addColor(rgb.getGreen(), brightness), addColor(rgb.getBlue(), brightness));
                newImage.setRGB(w, h, brightnessColor.getRGB());
            }
        }

        return newImage;
    }

    // Multiplica o brilho da imagem pelo fator especifico
    public static BufferedImage brightnessMtt(BufferedImage image, float brightness) {
        BufferedImage newImage = new BufferedImage(image.getWidth(), image.getHeight(), image.getType());

        for (int w = 0; w < image.getWidth(); w++) {
            for (int h = 0; h < image.getHeight(); h++) {
                Color rgb = new Color(image.getRGB(w, h));
                int red = addColor(rgb.getRed(), brightness);
                int green = addColor(rgb.getGreen(), brightness);
                int blue = addColor(rgb.getBlue(), brightness);
                Color brightnessColor = new Color(red, green, blue);
                newImage.setRGB(w, h, brightnessColor.getRGB());
            }
        }

        return newImage;
    }

    // Garante que o valor da cor está no intervalo válido (0-255)
    private static int addColor(int color, int add) {
        color += add;

        if (color > 255)
            color = 255;
        else if (color < 0)
            color = 0;

        return color;
    }
    private static int addColor(int color, float add) {
        color *= add;

        if (color > 255)
            color = 255;
        else if (color < 0)
            color = 0;

        return color;
    }
    private static int limitColor(float color) {
        if (color > 255)
            color = 255;
        else if (color < 0)
            color = 0;

        return (int) color;
    }

	
    // Converte a imagem do espaço de cores RGB para YIQ
    public static float[][][] rgb2yiq(BufferedImage image) {
        float[][][] yiq = new float[image.getWidth()][image.getHeight()][3];

        for (int w = 0; w < image.getWidth(); w++) {
            for (int h = 0; h < image.getHeight(); h++) {
                Color rgb = new Color(image.getRGB(w, h));
                int red = rgb.getRed();
                int green = rgb.getGreen();
                int blue = rgb.getBlue();
                yiq[w][h][0] = (0.299f * red) + (0.587f * green) + (0.114f * blue);
                yiq[w][h][1] = (0.596f * red) - (0.274f * green) - (0.322f * blue);
                yiq[w][h][2] = (0.211f * red) - (0.523f * green) + (0.312f * blue);
            }
        }

        return yiq;
    }

    // Converte a imagem do espaço de cores YIQ para RGB
    public static BufferedImage yiq2rgb(float[][][] yiq) {
        BufferedImage newImage = new BufferedImage(yiq.length, yiq[0].length, BufferedImage.TYPE_INT_RGB);

        for (int w = 0; w < yiq.length; w++) {
            for (int h = 0; h < yiq[0].length; h++) {
                int red = limitColor((1.000f * yiq[w][h][0]) + (0.956f * yiq[w][h][1]) + (0.621f * yiq[w][h][2]));
                int green = limitColor((1.000f * yiq[w][h][0]) - (0.272f * yiq[w][h][1]) - (0.647f * yiq[w][h][2]));
                int blue = limitColor((1.000f * yiq[w][h][0]) - (1.106f * yiq[w][h][1]) + (1.703f * yiq[w][h][2]));
                Color color = new Color(red, green, blue);
                newImage.setRGB(w, h, color.getRGB());
            }
        }

        return newImage;
    }

    // Adiciona o valor especificado ao componente Y (luminância) na imagem YIQ
    public static BufferedImage brightnessAddY(float[][][] yiq, int brightness) {
        for (int w = 0; w < yiq.length; w++) {
            for (int h = 0; h < yiq[0].length; h++) {
                yiq[w][h][0] += brightness;
            }
        }

        return yiq2rgb(yiq);
    }

    // Multiplica o componente Y (luminância) na imagem YIQ pelo fator especificado
    public static BufferedImage brightnessMttY(float[][][] yiq, float brightness) {
        for (int w = 0; w < yiq.length; w++) {
            for (int h = 0; h < yiq[0].length; h++) {
                yiq[w][h][0] *= brightness;
            }
        }

        return yiq2rgb(yiq);
    }

    // Aplica um filtro negativo na componente Y (luminância) da imagem YIQ
    public static BufferedImage negativeFilterY(float[][][] yiq) {
        for (int w = 0; w < yiq.length; w++) {
            for (int h = 0; h < yiq[0].length; h++) {
                yiq[w][h][0] = 255 - yiq[w][h][0];
            }
        }

        return yiq2rgb(yiq);
    }
}
