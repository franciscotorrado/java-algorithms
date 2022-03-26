package org.pacotorrado.algorithms;

import java.util.ArrayList;
import java.util.List;

public class RansomNoteChecker {
    boolean canConstruct(final String ransomNote,
                         final String magazine) {
        final List<String> ransomNoteList = List.of(ransomNote.split(""));
        final List<String> magazineList = new ArrayList<>(List.of(magazine.split("")));

        for (String letter : ransomNoteList) {
            if (!magazineList.remove(letter)) {
                return false;
            }
        }

        return true;
    }
}
