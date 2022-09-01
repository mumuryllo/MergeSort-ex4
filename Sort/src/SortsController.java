public class SortsController {
	
	public int[] mergeSort(int[] vetor, int inicio, int fim) {
       System.out.println("Vetor da posição"+ inicio+"até" + fim);
       
       if(inicio<fim) {
    	   int meio = (inicio+fim)/2;
    	   mergeSort(vetor, inicio, meio);//Esquerda
    	   mergeSort(vetor, meio +1, fim);//Direita
    	   intercala(vetor, inicio, meio,fim);
       }
       return vetor;
	}

	private void intercala(int[] vetor, int inicio, int meio, int fim) {
         int novoVetor[] = new int[vetor.length];
         for(int i=inicio; i<=fim; i++) {
        	 novoVetor[i] = vetor[i];
         }
         int esquerda = inicio;
         int direita= meio+1;
        for(int cont=inicio; cont<=fim; cont++) {
        	if (esquerda>meio) {
        		vetor[cont]=novoVetor[direita];
        		direita++;
        	}
        	else if (direita>fim) {
        		vetor[cont] = novoVetor[esquerda];
        		esquerda++;  
        		}
        	  else if(novoVetor[esquerda] < novoVetor[direita]) {
              	vetor[cont] = novoVetor[esquerda];
              	esquerda++;
              }  
        	  else {
        		  vetor[cont]=novoVetor[direita];
        		  direita++;
        	  }
        }   
        
	}

	
}