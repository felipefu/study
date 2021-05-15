package com.study.pratices.codility;

public class anagram {

  public static boolean nestedAnagrams(String phraseInput, String phraseAnagram) {

    String[] inputWords = phraseInput.split(" ");
    String[] anagramWords = phraseAnagram.split(" ");

    for (String inputWord : inputWords) {
      boolean wordHasMatch = false;
      for (String anagramWord : anagramWords) {

        if (inputWord.length() == anagramWord.length()) {

          String inputWordAux = inputWord;

          for (char letter : anagramWord.toCharArray()) {

            if (inputWordAux.contains(String.valueOf(letter))) {
              inputWordAux = inputWordAux.replaceFirst(String.valueOf(letter), "");
            } else {
              break;
            }
          }
          if (inputWordAux.length() == 0) {
            wordHasMatch = true;
            break;
          }
        }
      }
      if (!wordHasMatch) {
        return false;
      }
    }
    return true;
  }
}
