package com.garret.reactiveex1.ex;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * fileName       : Ex4_17
 * author         : kimchj
 * date           : 2023-12-05
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-12-05        kimchj       최초 생성
 */
public class Ex4_17 {

    public static void main(String[] args) {
        String mnemonic = createMnemonic();
        System.out.println("mnemonic = " + mnemonic);
    }

    private static String createMnemonic() {
        return Stream
                .generate(() -> getMnemonic())
                .limit(7)
                .collect(Collectors.joining(" "));
    }

    private static String getMnemonic() {
        System.out.println("touch");
        List<String> mnemonic = Arrays.asList(
                "apple", "banana", "candy",
                "milk", "moc", "coffee"
                , "swiss", "strawberry", "pair",
                "mom", "father", "lulu",
                "cola", "bread", "bed");

        Collections.shuffle(mnemonic);
        return mnemonic.get(0);
    }
}
