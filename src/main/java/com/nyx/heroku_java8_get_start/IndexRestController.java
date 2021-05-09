package com.nyx.heroku_java8_get_start;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Index Rest Controller
 */
@RestController
public class IndexRestController {

    /**
     * 最初のメッセージを返却する
     *
     * @return {@code "Hello World!"}
     */
    @GetMapping(path = "/", produces = MediaType.TEXT_PLAIN_VALUE)
    public String firstMessage() {
        return "Hello World!";
    }

}
