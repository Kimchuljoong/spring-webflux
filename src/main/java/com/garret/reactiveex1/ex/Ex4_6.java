package com.garret.reactiveex1.ex;

import io.micrometer.common.util.StringUtils;
import io.netty.util.internal.StringUtil;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/**
 * fileName       : Ex4_6
 * author         : kimchj
 * date           : 2023-12-05
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-12-05        kimchj       최초 생성
 */
public class Ex4_6 {

    public static void main(String[] args) {

        List<String> data = Arrays.asList("test1", "test2", "test3", "test4", "test5");

        data.stream()
                .map(n -> n+"_")
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
