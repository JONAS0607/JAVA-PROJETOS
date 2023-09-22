package empresa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Iterator;

public class Repeticoes {

	public static void main(String[] args) {
		
			ArrayList<Integer> lista = new ArrayList<Integer>();
			HashSet<Integer> conjunto= new HashSet<Integer>();
			Map<String,Integer> mapa = new HashMap<>();
			lista.add(10);
			lista.add(20);
			lista.add(30);
			lista.add(40);
			
			conjunto.add(1);
			conjunto.add(2);
			conjunto.add(3);
			
			mapa.put("um", 100);
			mapa.put("dois", 100);
			mapa.put("três", 100);
			
			//forma tradicional
			int soma;
			soma=0;
			for(int i=0;i<lista.size();i++) {
				soma += lista.get(i);
			}

			// para cada item da lista somamos , puxa os items enquanto existir itens
			soma=0;
			for (Integer item : lista) {
				soma += item;
			}
			
			
			//Com iteradores (repetidores)
			soma=0;
			
			
			Iterator<Map.Entry<String,Integer>> it = mapa.entrySet().iterator();
			//java.util.Iterator<Integer> it = conjunto.iterator(); // não guarda a ordem
			//java.util.Iterator<Integer> it = lista.iterator(); // lista guarda a ordem
			
			
			while(it.hasNext()) {
				Map.Entry<String, Integer> interando = it.next();
				String chave = interando.getKey();
				Integer valor = interando.getValue();
				valor += valor;
				System.out.println("Chave : "+chave+" ->Valor : "+ valor);
			}
			
			/*
			while(it.hasNext()) {
				soma+=(int) it.next();
				System.out.println(soma+"\n");
			}
			*/
			
			
		}
	}

