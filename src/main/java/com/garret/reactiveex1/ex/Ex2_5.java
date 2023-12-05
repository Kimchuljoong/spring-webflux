package com.garret.reactiveex1.ex;

import reactor.core.publisher.Flux;

/**
 * fileName       : Ex2_5
 * author         : kimchj
 * date           : 2023-12-05
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-12-05        kimchj       최초 생성
 */
public class Ex2_5 {

    public static void main(String[] args) {
        Flux
                .just(1, 2, 3, 4, 5, 6)
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .subscribe(System.out::println);
    }
}
