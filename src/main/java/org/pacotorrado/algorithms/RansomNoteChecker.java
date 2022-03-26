package org.pacotorrado.algorithms;

import java.util.ArrayList;
import java.util.List;

public class RansomNoteChecker {
    boolean canConstruct(final String ransomNote,
                         final String magazine) {
        final List<Character> magazineList = new ArrayList<>();

        for (int i = 0; i < magazine.length(); i++) {
            magazineList.add(magazine.charAt(i));
        }

        for (Character letter : ransomNote.toCharArray()) {
            if (!magazineList.remove(letter)) {
                return false;
            }
        }

        return true;
    }

    boolean canConstructByFrequency(final String ransomNote,
                                    final String magazine) {
        if (magazine == null) { return false; }
        if (magazine.length() < ransomNote.length()) { return false; }
        int[] freq = new int[26];

        for (int i = 0; i < ransomNote.length(); i++) {
            freq[ransomNote.charAt(i) - 'a']++;
        }
        for (int i = 0; i < magazine.length(); i++) {
            final int letterFrequency = magazine.charAt(i) - 'a';
            if (freq[letterFrequency] != 0) {
                freq[letterFrequency]--;
            }
        }
        for (final int j : freq) {
            if (j != 0) return false;
        }

        return true;
    }
}
