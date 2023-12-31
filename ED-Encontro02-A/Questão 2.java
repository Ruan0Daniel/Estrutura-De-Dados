package matrizAdjacente;

/*2) Considere um grafo não-orientado G com n vértices e m arestas armazenado utilizando sua Matriz de Adjacência A. 
Crie uma função que receba por parâmetro a matriz A, bem como n e m, e imprima se G tem ou não laços.*/

public class principal {

	public static void main(String[] args) {
		
		int vertices = 5, arestas = 4; 
		
		int[][] matrizAdjacencia = 
		{
				{0, 1, 0, 0, 0},
	            {1, 0, 1, 0, 0},
	            {0, 1, 0, 1, 1},
	            {0, 0, 1, 0, 0},
	            {0, 0, 1, 0, 0}
	    };
		

		verificadorDeLacos(matrizAdjacencia, vertices, arestas);
		
		exibirMatrizAdjacencia(matrizAdjacencia, vertices);
			
	}
	
	public static void verificadorDeLacos(int matrizAdjacencia[][], int vertices, int arestas)
	{
		for (int i = 0; i < vertices; i++) 
		{
           		 if (matrizAdjacencia[i][i] == 1) 
            		{
                		System.out.println("O grafo possui laços. \n");
                
               			 return;
           		 }
        	}
		
        	System.out.println("O grafo não possui laços. \n");	
	}
	
	public static void exibirMatrizAdjacencia(int matrizAdjacencia[][], int vertices)
	{
		for(int i = 0; i < vertices; i++)
		{
			for(int j = 0; j < vertices; j++)
			{
				System.out.print("  " + matrizAdjacencia[i][j]);
			}
		
			System.out.print("\n");
		}		
	}	
}


