package org.pacotorrado.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RansomNoteTest {
    RansomNoteChecker ransomNoteChecker = new RansomNoteChecker();

    @Test
    void checkThat_a_cannotBeConstructedFrom_b() {
        String ransomNote = "a";
        String magazine = "b";
        assertFalse(ransomNoteChecker.canConstruct(ransomNote, magazine));
    }

    @Test
    void checkThat_aa_cannotBeConstructedFrom_ab() {
        String ransomNote = "aa";
        String magazine = "ab";
        assertFalse(ransomNoteChecker.canConstruct(ransomNote, magazine));
    }

    @Test
    void checkThat_aa_canBeConstructedFrom_aab() {
        String ransomNote = "aa";
        String magazine = "aab";
        assertTrue(ransomNoteChecker.canConstruct(ransomNote, magazine));
    }

    @Test
    void checkThat_aa_canBeConstructedFrom_aba() {
        String ransomNote = "aa";
        String magazine = "aba";
        assertTrue(ransomNoteChecker.canConstruct(ransomNote, magazine));
    }

    @Test
    void checkThat_au_canBeConstructedFrom_abu() {
        String ransomNote = "au";
        String magazine = "abu";
        assertTrue(ransomNoteChecker.canConstruct(ransomNote, magazine));
    }
}
