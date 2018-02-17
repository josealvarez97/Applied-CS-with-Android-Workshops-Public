/* Copyright 2016 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.engedu.anagrams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class AnagramDictionary {

    private static final int MIN_NUM_ANAGRAMS = 5;
    private static final int DEFAULT_WORD_LENGTH = 3;
    private static final int MAX_WORD_LENGTH = 7;
    private Random random = new Random();
    // MILESTONE 1: Declare WORD LIST (wordList) here. Just a list with all the words in the file.
    ArrayList<String> wordList = new ArrayList<>();
    // MILESTONE 1: Declare WORD SET (wordSet) here. It will allow us to rapidly verify whether a word is a valid dictionary word.

    // MILESTONE 1: Declare LETTERS TO WORD (lettersToWord) here. It will allow us to group anagrams together.

    // MILESTONE 3: Declare SIZE TO WORDS (sizeToWords) here. It will allow us to map words to their lengths.

    // MILESTONE 3: Declare wordLength as explained in the official workshop guide.

    // MILESTONE 1:
    public AnagramDictionary(Reader reader) throws IOException {
        BufferedReader in = new BufferedReader(reader);
        String line;
        while((line = in.readLine()) != null) {
            String word = line.trim();
            wordList.add(word);


        }
    }


    // MILESTONE 2:
    // Here you will verify that a word is a valid dictionary word (i.e., in wordSet)
    // And that a word does not contain the base word as a substring.
    // Check official workshop guide for more details and examples.
    public boolean isGoodWord(String word, String base) {

        if (word.contains(base)) {
            return false;
        }
        return true;
    }

    public String sortLetters(String aWord ){
        char[] charsArray = aWord.toCharArray();
        Arrays.sort(charsArray);
        String sorted = new String(charsArray);
        return sorted;

    }
    public List<String> getAnagrams(String targetWord) {
        // You need an array list for storing the anagrams of the target word.
        ArrayList<String> result = new ArrayList<String>();
        String originalSortedVersion = sortLetters(targetWord);
        for (int i = 0; i < wordList.size(); i++) {
            String wordToCheck = wordList.get(i);

            if (originalSortedVersion.equals(sortLetters(wordToCheck))){
                result.add(wordToCheck);
            }
        }

        return result;
        // MILESTONE 1:
        // Try iterating through the list (wordList, checking one by one each element)
        // and finding all matching anagrams. (Don't forget to add them to
        // the array list where you actually plan to store the anagrams!).
        // Read the official workshop guide for more details.

    }

    // MILESTONE 2:
    // Takes a string and finds all anagrams that can be formed by adding one letter to that word.
    // Try doing it on your own, but if get stuck check the experimental code section for a couple of ideas on how to do this!
    // Also, read the official workshop guide for more details.

    public List<String> getAnagramsWithOneMoreLetter(String word) {
        ArrayList<String> result = new ArrayList<String>();
        return result; // DO NOT FORGET TO UPDATE defaultAction in AnagramActivity to
        // invoke getAnagramsWithOneMore instead of getAnagrams
    }

    // MILESTONE 2:
    // To make the tame more interesting, pick a random starting point in wordList array
    // and check each word in the array until you find one that has at least MIN_NUM_ANAGRAMS.
    // Read the official workshop guide for more details.
    public String pickGoodStarterWord() {
        Integer randomWordIndex = random.nextInt(wordList.size());
        String randomWord = wordList.get(randomWordIndex)
        return randomWord;

    }
}
