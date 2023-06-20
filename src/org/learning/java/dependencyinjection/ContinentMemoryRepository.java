package org.learning.java.dependencyinjection;

import java.util.ArrayList;
import java.util.List;

public class ContinentMemoryRepository implements ContinentRepositoryInterface {

  @Override
  public List<String> getContinents() {
    List<String> continentList = new ArrayList<>();
    continentList.add("Europe");
    continentList.add("North America");
    continentList.add("Central America");
    continentList.add("South America");
    continentList.add("Africa");
    continentList.add("Asia");
    continentList.add("Oceania");
    return continentList;
  }
}
