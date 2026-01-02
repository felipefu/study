package com.study.pratices.hakerank;

import static com.study.pratices.hakerank.NoPrefixSet.noPrefix;

import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class NoPrefixSetTest {

    @Test
    public void testChallenge00() {

    Assert.assertEquals(List.of(1, 3), NoPrefixSet.oddNumbers(0, 4));

    }

    @Test
    public void testChallenge01() {

//      NoPrefixSet2 noPrefixSet2 = new NoPrefixSet2();
//
//    noPrefixSet2.solution(new ArrayList<>(List.of("abc", "a")));
//    noPrefixSet2.solution(new ArrayList<>(List.of("hgiiccfchbeadgebc","biiga","edchgb","ccfdbeajaeid","ijgbeecjbj","bcfbbacfbfcfbhcbfjafibfhffac","ebechbfhfcijcjbcehbgbdgbh","ijbfifdbfifaidje","acgffegiihcddcdfjhhgadfjb","ggbdfdhaffhghbdh","dcjaichjejgheiaie","d","jeedfch","ahabicdffbedcbdeceed","fehgdfhdiffhegafaaaiijceijdgbb","beieebbjdgdhfjhj","ehg","fdhiibhcbecddgijdb","jgcgafgjjbg","c","fiedahb","bhfhjgcdbjdcjjhaebejaecdheh","gbfbbhdaecdjaebadcggbhbchfjg","jdjejjg","dbeedfdjaghbhgdhcedcj","decjacchhaciafafdgha","a","hcfibighgfggefghjh","ccgcgjgaghj","bfhjgehecgjchcgj","bjbhcjcbbhf","daheaggjgfdcjehidfaedjfccdafg","efejicdecgfieef","ciidfbibegfca","jfhcdhbagchjdadcfahdii","i","abjfjgaghbc","bddeejeeedjdcfcjcieceieaei","cijdgbddbceheaeececeeiebafgi","haejgebjfcfgjfifhihdbddbacefd","bhhjbhchdiffb","jbbdhcbgdefifhafhf","ajhdeahcjjfie","idjajdjaebfhhaacecb","bhiehhcggjai","bjjfjhiice","aif","gbbfjedbhhhjfegeeieig","fefdhdaiadefifjhedaieaefc","hgaejbhdebaacbgbgfbbcad","heghcb","eggadagajjgjgaihjdigihfhfbijbh","jadeehcciedcbjhdeca","ghgbhhjjgghgie","ibhihfaeeihdffjgddcj","hiedaegjcdai","bjcdcafgfjdejgiafdhfed","fgdgjaihdjaeefejbbijdbfabeie","aeefgiehgjbfgidcedjhfdaaeigj","bhbiaeihhdafgaciecb","igicjdajjdegbceibgebedghihihh","baeeeehcbffd","ajfbfhhecgaghgfdadbfbb","ahgaccehbgajcdfjihicihhc","bbjhih","a","cdfcdejacaicgibghgddd","afeffehfcfiefhcagg","ajhebffeh","e","hhahehjfgcj","ageaccdcbbcfidjfc","gfcjahbbhcbggadcaebae","gi","edheggceegiedghhdfgabgcd","hejdjjbfacggdccgahiai","ffgeiadgjfgecdbaebagij","dgaiahge","hdbaifh","gbhccajcdebcig","ejdcbbeiiebjcagfhjfdahbif","g","ededbjaaigdhb","ahhhcibdjhidbgefggdjebfcf","bdigjaehfchebiedajcjdh","fjehjgbdbaiifi","fbgigbdcbcgffdicfcidfdafghajc","ccajeeijhhb","gaaagfacgiddfahejhbgdfcfbfeedh","gdajaigfbjcdegeidgaccjfi","fghechfchjbaebcghfcfbdicgaic","cfhigaciaehacdjhfcgajgbhhgj","edhjdbdjccbfihiaddij","cbbhagjbcadegicgifgghai","hgdcdhieji","fbifgbhdhagch","cbgcdjea","dggjafcajhbbbaja","bejihed","eeahhcggaaidifdigcfjbficcfhjj")));

    }

    @Test
    public void testChallenge02() {
        Assert.assertEquals(
            List.of("BAD SET", "abcde"),
            noPrefix(new ArrayList<>(List.of("abcd", "bcd", "abcde", "bcde"))));
    }

    @Test
    public void testChallenge03() {
        Assert.assertEquals(List.of("GOOD SET"), noPrefix(new ArrayList<>(List.of("ab", "bc", "cd"))));
    }

    @Test
    public void testChallenge04() {

        Assert.assertEquals(
            List.of("BAD SET", "aabcde"),
            noPrefix(
                new ArrayList<>(
                    List.of("aab", "defgab", "abcde", "aabcde", "bbbbbbbbbb", "jabjjjad"))));
    }

    @Test
    public void testChallenge05() {
        Assert.assertEquals(
            List.of("BAD SET", "aacghgh"),
            noPrefix(new ArrayList<>(List.of("aab", "aac", "aacghgh", "aabghgh"))));
    }

    @Test
    public void testChallenge06() {
        Assert.assertEquals(
            List.of("BAD SET", "d"),
            noPrefix(new ArrayList<>(
                List.of("hgiiccfchbeadgebc", "biiga", "edchgb", "ccfdbeajaeid", "ijgbeecjbj", "bcfbbacfbfcfbhcbfjafibfhffac",
                    "ebechbfhfcijcjbcehbgbdgbh", "ijbfifdbfifaidje", "acgffegiihcddcdfjhhgadfjb", "ggbdfdhaffhghbdh", "dcjaichjejgheiaie",
                    "d", "jeedfch", "ahabicdffbedcbdeceed", "fehgdfhdiffhegafaaaiijceijdgbb", "beieebbjdgdhfjhj", "ehg",
                    "fdhiibhcbecddgijdb", "jgcgafgjjbg", "c", "fiedahb", "bhfhjgcdbjdcjjhaebejaecdheh", "gbfbbhdaecdjaebadcggbhbchfjg",
                    "jdjejjg", "dbeedfdjaghbhgdhcedcj", "decjacchhaciafafdgha", "a", "hcfibighgfggefghjh", "ccgcgjgaghj",
                    "bfhjgehecgjchcgj", "bjbhcjcbbhf", "daheaggjgfdcjehidfaedjfccdafg", "efejicdecgfieef", "ciidfbibegfca",
                    "jfhcdhbagchjdadcfahdii", "i", "abjfjgaghbc", "bddeejeeedjdcfcjcieceieaei", "cijdgbddbceheaeececeeiebafgi",
                    "haejgebjfcfgjfifhihdbddbacefd", "bhhjbhchdiffb", "jbbdhcbgdefifhafhf", "ajhdeahcjjfie", "idjajdjaebfhhaacecb",
                    "bhiehhcggjai", "bjjfjhiice", "aif", "gbbfjedbhhhjfegeeieig", "fefdhdaiadefifjhedaieaefc", "hgaejbhdebaacbgbgfbbcad",
                    "heghcb", "eggadagajjgjgaihjdigihfhfbijbh", "jadeehcciedcbjhdeca", "ghgbhhjjgghgie", "ibhihfaeeihdffjgddcj",
                    "hiedaegjcdai", "bjcdcafgfjdejgiafdhfed", "fgdgjaihdjaeefejbbijdbfabeie", "aeefgiehgjbfgidcedjhfdaaeigj",
                    "bhbiaeihhdafgaciecb", "igicjdajjdegbceibgebedghihihh", "baeeeehcbffd", "ajfbfhhecgaghgfdadbfbb",
                    "ahgaccehbgajcdfjihicihhc", "bbjhih", "a", "cdfcdejacaicgibghgddd", "afeffehfcfiefhcagg", "ajhebffeh", "e",
                    "hhahehjfgcj", "ageaccdcbbcfidjfc", "gfcjahbbhcbggadcaebae", "gi", "edheggceegiedghhdfgabgcd", "hejdjjbfacggdccgahiai",
                    "ffgeiadgjfgecdbaebagij", "dgaiahge", "hdbaifh", "gbhccajcdebcig", "ejdcbbeiiebjcagfhjfdahbif", "g", "ededbjaaigdhb",
                    "ahhhcibdjhidbgefggdjebfcf", "bdigjaehfchebiedajcjdh", "fjehjgbdbaiifi", "fbgigbdcbcgffdicfcidfdafghajc", "ccajeeijhhb",
                    "gaaagfacgiddfahejhbgdfcfbfeedh", "gdajaigfbjcdegeidgaccjfi", "fghechfchjbaebcghfcfbdicgaic",
                    "cfhigaciaehacdjhfcgajgbhhgj", "edhjdbdjccbfihiaddij", "cbbhagjbcadegicgifgghai", "hgdcdhieji", "fbifgbhdhagch",
                    "cbgcdjea", "dggjafcajhbbbaja", "bejihed", "eeahhcggaaidifdigcfjbficcfhjj"))));
    }

    @Test
    public void testChallenge07() {
        Assert.assertEquals(
            List.of("BAD SET", "aa"),
            noPrefix(new ArrayList<>(List.of("b", "aa", "aa"))));
    }

    @Test
    public void testChallenge08() {
        Assert.assertEquals(
            List.of("BAD SET", "a"),
            noPrefix(new ArrayList<>(List.of("abc", "a"))));
    }
}
