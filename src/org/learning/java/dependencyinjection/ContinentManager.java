package org.learning.java.dependencyinjection;

import java.util.List;

/*
 la classe ContinentManager per funzionare ha bisogno che le venga data una lista di continenti.
 Esistono due possibili fonti: la Classe ContinentMemoryRepository e la classe ContinentDataBaseRepository

 per poter cambiare da una fonte all'altra senza cambiare il codice di questa classe, devo:

  1 -  Assicurarmi che entrambe le fonti abbiano lo stesso metodo getContinents()
       Per farlo creo l'interfaccia ContinentRepositoryInterface

  2 -  Creo una classe ContinentRepositoryFactory, che ha un metodo statico getContinentRepository()
       Questo metodo mi restituisce dinamicamente una istanza fra le due classi fonte disponibili.

  3 -  Uso il metodo getContinents() sull'istanza che mi è stata restituita da
       ContinentRepositoryFactory.getContinentRepository()
 */
public class ContinentManager {

  private List<String> continents;
  private ContinentRepositoryInterface repo;

  public ContinentManager() {
    // ContinentMemoryRepository repo = new ContinentMemoryRepository();
    //ContinentDatabaseRepository repo = new ContinentDatabaseRepository();
    this.repo = ContinentRepositoryFactory.getContinentRepository();
    this.continents = repo.getContinents();
  }

  public void printContinents() {
    for (String continent : continents) {
      System.out.println("- " + continent);
    }
  }
}
