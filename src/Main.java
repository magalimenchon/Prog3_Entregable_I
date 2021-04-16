public class Main {

	public static void main(String[] args) {
		
		
	//UMBRALES
		int umbralValor10 = 10;
		int umbralValor2 = 2;
		int umbralValor15 = 15;
		int umbralExtraValor4 = 4;
	//CASE 1
		
		//entrada
			MySimpleLinkedList lista1 = new MySimpleLinkedList();
		
		//salida
			MySimpleLinkedList seq1 = getSubsequence(umbralValor10, lista1);
			showResults(lista1, umbralValor10, seq1);
	//CASE 2
		
		//entrada
			MySimpleLinkedList lista2 = new MySimpleLinkedList();
			lista2.insertLast(1);	//O(1)
			lista2.insertLast(2);
			lista2.insertLast(3);

		//salida
			MySimpleLinkedList seq2 = getSubsequence(umbralValor10, lista2);//O(n)
			showResults(lista2, umbralValor10, seq2);	//O(n)
			
	//CASE 3
			
		//entrada
			MySimpleLinkedList lista3 = new MySimpleLinkedList();
			lista3.insertLast(1);
			lista3.insertLast(2);
			lista3.insertLast(3);
		//salida
			MySimpleLinkedList seq3 = getSubsequence(umbralValor2, lista3);
			showResults(lista3, umbralValor2, seq3);
			
	//CASE 4
			
		//entrada
			MySimpleLinkedList lista4 = new MySimpleLinkedList();
			lista4.insertLast(3);
			lista4.insertLast(5);
			lista4.insertLast(2);
			lista4.insertLast(7);
			lista4.insertLast(19);
			lista4.insertLast(14);
			lista4.insertLast(24);
		//salida
			
			MySimpleLinkedList seq4 = getSubsequence(umbralValor10, lista4);
			showResults(lista4, umbralValor10, seq4);
	//CASE 5
			
		//entrada
			MySimpleLinkedList lista5 = new MySimpleLinkedList();
			lista5.insertLast(3);
			lista5.insertLast(5);
			lista5.insertLast(4);
			lista5.insertLast(2);
			lista5.insertLast(7);
			lista5.insertLast(15);
			lista5.insertLast(14);
			lista5.insertLast(28);
		//salida
			MySimpleLinkedList seq5 = getSubsequence(umbralValor15, lista5);
			showResults(lista5, umbralValor15, seq5);
	
	//CASE EXTRA
	
	//entrada
		MySimpleLinkedList listaExtra = new MySimpleLinkedList();
		listaExtra.insertLast(19);	//O(1)
		listaExtra.insertLast(1);
		listaExtra.insertLast(2);
		listaExtra.insertLast(2);
		listaExtra.insertLast(1);
		listaExtra.insertLast(19);
		listaExtra.insertLast(2);
		listaExtra.insertLast(19);
		listaExtra.insertLast(3);	
	//salida
		MySimpleLinkedList seqExtra = getSubsequence(umbralExtraValor4, listaExtra);//O(n)
		showResults(listaExtra, umbralExtraValor4, seqExtra);//O(n)
	
}
	public static MySimpleLinkedList getSubsequence(int umbral, MySimpleLinkedList list) {	
	//O(n): n is the list.size
		
		MyIterator iter = list.iterator();	//O(1)
		MySimpleLinkedList newList = new MySimpleLinkedList();
		
		Integer summation = 0;
		
		while(iter.hasNext()){	//O(n): n is list.size
			Integer valor = iter.next();
			if(valor <= umbral){	
				if((summation + valor) <= umbral){
					
					summation = summation + valor;
					
					if(!iter.hasNext()){
						newList.insertLast(summation);	//O(1)
					}
				}
				else{
					newList.insertLast(summation);	//O(1)
					summation = valor;
				}
			}
			else{
				if(summation != 0){
					newList.insertLast(summation);	//O(1)
					summation = 0;
				}
			}
		}
		return newList;
	}
	
	public static void showList(MySimpleLinkedList list, String typeList) {	
	//O(n): n is the list.size
		
		MyIterator iter = list.iterator();	//O(1)
		System.out.print(typeList);
		while(iter.hasNext())	//O(n): n is the list.size
			System.out.print("[" + iter.next() + "]");
	}
	
	public static void showResults(MySimpleLinkedList inputList, int umbral, MySimpleLinkedList outputList) {	
	//O(n+n)= O(2n) => O(n) : n is the list.size
		showList(inputList, "Lista Entrada: ");		//O(n): n is list.size
		System.out.println("  Umbral: " + umbral);
		showList(outputList, "Lista Salida : ");	//O(n): n is list.size
		System.out.println("");
		System.out.println("---------------------------------------------------------------------"); //O(1)
	}
	
}
