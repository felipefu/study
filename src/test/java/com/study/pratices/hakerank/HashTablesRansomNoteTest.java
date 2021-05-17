package com.study.pratices.hakerank;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class HashTablesRansomNoteTest {

  @Test
  public void testChallenge() {

    assertTrue(
        HashTablesRansomNote.checkMagazine(
            new ArrayList<>(
                List.of(
                    "apgo", "clm", "w", "lxkvg", "mwz", "elo", "bg", "elo", "lxkvg", "elo", "apgo",
                    "apgo", "w", "elo", "bg")),
            new ArrayList<>(List.of("elo", "lxkvg", "bg", "mwz", "clm", "w"))));

    assertTrue(
        HashTablesRansomNote.checkMagazineOld(
            new ArrayList<>(
                List.of(
                    "apgo", "clm", "w", "lxkvg", "mwz", "elo", "bg", "elo", "lxkvg", "elo", "apgo",
                    "apgo", "w", "elo", "bg")),
            new ArrayList<>(List.of("elo", "lxkvg", "bg", "mwz", "clm", "w"))));

    assertTrue(
        HashTablesRansomNote.checkMagazine(
            new ArrayList<>(List.of("give", "me", "one", "grand", "today", "night")),
            new ArrayList<>(List.of("give", "one", "grand", "today"))));

    assertFalse(
        HashTablesRansomNote.checkMagazine(
            new ArrayList<>(List.of("two", "times", "three", "is", "not", "four")),
            new ArrayList<>(List.of("two", "times", "two", "is", "four"))));

    assertFalse(
        HashTablesRansomNote.checkMagazine(
            new ArrayList<>(List.of("ive", "got", "a", "lovely", "bunch", "of", "coconuts")),
            new ArrayList<>(List.of("ive", "got", "some", "coconuts"))));
  }
}
