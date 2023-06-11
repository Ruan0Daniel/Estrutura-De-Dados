package matrizDeIncidencia;

/* 3) Considere um grafo simples não-orientado G com n vértices e m arestas armazenado utilizando sua Matriz de Incidência M. 
      Crie uma função que receba por parâmetro a matriz M, bem como n e m, e imprima os graus de cada vértice de G. */


public class principal {
	
public static void main(String[] args) {
		
		int vertices = 4, arestas = 5; 
		
		int[][] matrizDeIncidenciaM = 
		{
				{1, 1, 0, 0, 0},
	            {1, 0, 1, 0, 1},
	            {0, 1, 1, 1, 0},
	            {0, 0, 0, 1, 1}
	    };
		

		imprimirGrauDosVertices(matrizDeIncidenciaM, vertices, arestas);
		
		exibirMatrizAdjacencia(matrizDeIncidenciaM, vertices);
			
	}
	
	public static void imprimirGrauDosVertices(int matrizDeIncidenciaM[][], int vertices, int arestas)
	{
		int contador;
		
		for (int i = 0; i < vertices; i++) 
		{
			contador = 0;
            
			for(int j = 0; j < arestas; j++)
			{
				if (matrizDeIncidenciaM[i][j] == 1) 
	            {
					contador++;
	            }	
			}	
			
			System.out.println("O vértice " + (i+1) + " tem grau " + contador + "\n");
        }
				
	}
	
	
	public static void exibirMatrizAdjacencia(int matrizDeIncidenciaM[][], int vertices)
	{
		for(int i = 0; i < vertices; i++)
		{
			for(int j = 0; j < vertices; j++)
			{
				System.out.print("  " + matrizDeIncidenciaM[i][j]);
		
			}
			
			System.out.print("\n");
		}		
	
	}
}
