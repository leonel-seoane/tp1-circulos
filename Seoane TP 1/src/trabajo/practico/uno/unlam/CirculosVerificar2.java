package trabajo.practico.uno.unlam;

public class CirculosVerificar2 {

		public static void main(String arg[]){
			
			double PI = 3.14148;
			double perimetroEsperado = 865.67;
			double perimetro1;
			
			
			Circulo circuloV1 = new Circulo();
			circuloV1.radio = 16.6;
			circuloV1.diametro = circuloV1.radio * 2;
			circuloV1.perimetroReal = PI * circuloV1.diametro;
			
			perimetro1 = circuloV1.perimetroReal * 100;
			perimetro1 = (int) perimetro1;
			perimetro1 = perimetro1 / 100;
			
			
			
			
			System.out.println("PRUEBA " + perimetro1);
			System.out.println("PRUEBA " + perimetroEsperado);
			
			if (perimetro1 == perimetroEsperado){
				
				System.out.println("SON IGUALES");
				
			}
			
			else {
				
				System.out.println("SON DISTINTOS");
				
			}
			
			}
			
		}