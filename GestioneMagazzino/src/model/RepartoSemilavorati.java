package model;

import java.util.List;

public interface RepartoSemilavorati {
	
	/* Metodo che restituisce il nome del reparto */
	public String getNome();
	
	/* Metodo che restituisce la quantit� di scorte presenti nel reparto corrente */
	public int getQuantita();
	
	/* Metodo che restituisce la capacit� massima del reparto corrente */
	public int getCapacita();
	
	/* Metodo che serve per verificare la presenza di almeno una scorta nel reparto corrente.
	 * Restituisce false nel caso in cui il reparto corrente sia vuoto, true altrimenti */
	public boolean isPresente();
	
	/* Metodo che serve per verificare la saturit� del reparto corrente (se la capacit�
	 * massima � stata raggiunta).
	 * Restituisce true nel caso in cui il reparto corrente sia pieno, false atrimenti */
	public boolean isPieno();
	
	/* Metodo usato per depositare un numero n di scorte dal reparto corrente.
	 * Restituisce true nel caso in cui il deposito avvenga con successo, false altrimenti */
	public Giacenza depositaScorte();
	
	/* Metodo usato per prelevare una scorta dal reparto corrente.
	 * Restituisce true nel caso in cui il prelievo avvenga con successo, false altrimenti */
	public Giacenza prelevaScorte();
	
	/* metodo che ritorna la lista delle scorte attuali */
	public List<Giacenza> scorteAttuali();
	
	/* Metodo che restituisce il tipo di giacenza presente in quel reparto*/
	public Giacenza getGiacenzaReparto();
}
