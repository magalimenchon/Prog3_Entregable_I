

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
			/*showList(lista1, "input 1");
			getSubsequence(umbralValor10, lista1);*/
		
	//CASE 2
		
		//entrada
			MySimpleLinkedList lista2 = new MySimpleLinkedList();
			lista2.insertLast(1);
			lista2.insertLast(2);
			lista2.insertLast(3);

		//salida
			/*showList(lista2, "input 2");
			getSubsequence(umbralValor10, lista2);*/
			
	//CASE 3
			
		//entrada
			MySimpleLinkedList lista3 = new MySimpleLinkedList();
			lista3.insertLast(1);
			lista3.insertLast(2);
			lista3.insertLast(3);
		//salida
			/*showList(lista3, "input 3");
			getSubsequence(umbralValor2, lista3);*/
			
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
			/*showList(lista4, "input 4");
			getSubsequence(umbralValor10, lista4);*/
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
			/*showList(lista5, "input 5");
			 getSubsequence(umbralValor15, lista5);*/
	
	//CASE EXTRA
	
	//entrada
		MySimpleLinkedList listaExtra = new MySimpleLinkedList();
		listaExtra.insertLast(19);
		listaExtra.insertLast(1);
		listaExtra.insertLast(2);
		listaExtra.insertLast(2);
		listaExtra.insertLast(1);
		listaExtra.insertLast(19);
		listaExtra.insertLast(2);
		listaExtra.insertLast(19);
		listaExtra.insertLast(3);	
	//salida
		showList(listaExtra, "input 6");
		getSubsequence(umbralExtraValor4, listaExtra);
}
	
	private static void showList(MySimpleLinkedList list, String typeList) {
		
		MyIterator iter = list.iterator();
		System.out.print(typeList + " list: ");
		for(Integer info : list)
			System.out.print("[" + info + "]");
		System.out.println("");
	}
	
	private static void getSubsequence(int umbral, MySimpleLinkedList list) {
		
		MyIterator iter = list.iterator();
		MySimpleLinkedList newList = new MySimpleLinkedList();
		
		Integer summation = 0;
		
		while(iter.hasNext()){
			Integer valor = iter.next();
			if(valor <= umbral){
				if((summation + valor) <= umbral){
					
					summation = summation + valor;
					
					if(!iter.hasNext()){
						newList.insertLast(summation);
					}
				}
				else{
					newList.insertLast(summation);
					summation = valor;
				}
			}
			else{
				if(summation != 0){
					newList.insertLast(summation);
					summation = 0;
				}
			}
		}
		System.out.println("Umbral: " + umbral);
		showList(newList, "output");
	}
}
