package ru.yandex.interview.courier.partialreturn.api;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PartialReturnController {

    @PostMapping("orders/partial-return")
    public void registerPartialReturn(@RequestBody RegisterPartialReturnRequest request) {

    }

}
