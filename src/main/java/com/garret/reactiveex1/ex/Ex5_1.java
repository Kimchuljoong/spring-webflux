package com.garret.reactiveex1.ex;

import reactor.core.publisher.Flux;

/**
 * fileName       : Ex5_1
 * author         : 221840
 * date           : 2023-12-05
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-12-05        221840       최초 생성
 */
public class Ex5_1 {

    public static void main(String[] args) {
        Flux<String> sequence = Flux.just("Hello", "Reactor");
        sequence.map(d -> d.toLowerCase())
                .subscribe(d -> System.out.println(d));
    }
}
