package aula07.exercicio2.test;
import aula07.exercicio2.*;
public class Test {
	
	public static void main(String[] args) {
		
		
		Bitmap image = new Bitmap("Figura.bmp");
		System.out.println(image);
		
		// Copia a imagem
		image.saveAsCopy("Figura_copy");
		
		// Salva a imagem
		image.saveAsRawType("Figura");
		
		// Reduz a dimensão da imagem para 1/4
		image.saveResize("Figura_resized");
		
		// Roda a imagem horizontalmente
		image.saveFlipHorizontal("Figura_Hflip");
		
		// Roda a imagem verticalmente
		image.saveFlipVertical("Figura_Vflip");
		
	}
}