package trabajo.practico.uno.unlam;

public class CirculosRadios {
	
	public static void main(String args[]){
		
		Circulo circulo1 = new Circulo();
		circulo1.radio = 2;
		circulo1.diametro = circulo1.radio+circulo1.radio;
		circulo1.PI = 3.1416;
		circulo1.perimetroReal = circulo1.diametro * circulo1.PI;
		
		/*
		System.out.println("El radio de circulo1 es:" + circulo1.radio);
		System.out.println("El diametro del circulo es:" + circulo1.diametro);
		System.out.println("El perimetro del circulo es:" + circulo1.perimetro);
		*/
	
		Circulo circulo2 = new Circulo();
		circulo2.radio = 3.7;

		Circulo circulo3 = new Circulo();
		circulo3.radio = 5;
		
		Circulo circulo4 = new Circulo();
		circulo4.radio = 10.9;
		
		System.out.println("Se crearon los siguientes circulos:");
		System.out.println("Circulo 1 con un radio de: " + circulo1.radio);
		System.out.println("Circulo 2 con un radio de: " + circulo2.radio);
		System.out.println("Circulo 3 con un radio de: " + circulo3.radio);
		System.out.println("Circulo 4 con un radio de: " + circulo4.radio);
	}

}
