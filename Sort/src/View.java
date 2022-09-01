public class View {

	public static void main(String[] args) {
    
     int [] vetor3 = {69, 68, 32, 36, 91, 19, 28, 44, 88, 73, 37, 99, 1};
     SortsController control = new SortsController();
      vetor3 = control.mergeSort(vetor3, 0, vetor3.length-1);
     
     
     System.out.println("");
     System.out.println("=========================");
     for (int valor :vetor3) {
	     System.out.print(valor+" ");
		}
     System.out.println("");
     System.out.println("=========================");

	}

}
