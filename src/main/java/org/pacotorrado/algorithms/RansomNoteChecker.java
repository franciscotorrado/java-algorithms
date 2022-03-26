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
}
