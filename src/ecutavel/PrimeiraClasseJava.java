package ecutavel;

public class PrimeiraClasseJava {
	//Variavel Global é acessivel a todos os seus valores, é compartilhado
	static int maiorIdadeGlobal = 30;

	//Main é um metodo auto executavel em Java*
	public static void main(String[] args) {
	
    //Variavel local porque pertencnce somente a esse metodo e o valor fica dentro do metodo.
		int maiorIdade = 18;
		System.out.println("Valor variabel local = " + maiorIdade);

		metodo2();
	}
						
		public static void metodo2 () {
			System.out.println("maiorIdadeGlobal");
		}
	}


