package org.limepepper.chefclipse.knife.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DictionaryImpl implements Dictionary {

	private List<String> fWords = new ArrayList<String>(Arrays.asList("osgi", "eclipse", "equinox"));
	private String fLanguage = "en_US";

	public String getLanguage() {
		return fLanguage;
	}

	public boolean check(String word) {
		return fWords.contains(word);
	}

	public String toString() {
		return fLanguage;
	}

}
