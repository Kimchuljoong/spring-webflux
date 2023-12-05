package com.garret.reactiveex1;

import java.util.Arrays;
import java.util.List;

/**
 * fileName       : StreamPractice
 * author         : kimchj
 * date           : 2023-12-05
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-12-05        kimchj       최초 생성
 */
public class StreamPractice {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        int summary = list.stream()
                .filter(e -> e % 2 == 0)
                .mapToInt(e -> e)
                .sum();

        System.out.println("summary = " + summary);

    }
}
