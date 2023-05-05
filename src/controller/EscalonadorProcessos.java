package controller;

import model.Fila;
import model.Processo;

public class EscalonadorProcessos {

	public void escalonador(Fila fila) {
		while(!fila.isEmpty()) {
			try {
				Processo p = (Processo) fila.remove();
				if(p.QtdRetornos > 1) {
					p.QtdRetornos--;
					fila.insert(p);
					System.out.println(p.nome+" | "+"Retornos restantes: "+p.QtdRetornos);
				}else {
					System.out.println(p.nome+" finalizado");
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}	
	}
}
