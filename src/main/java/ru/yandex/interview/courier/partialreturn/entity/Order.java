package ru.yandex.interview.courier.partialreturn.entity;


import java.util.List;

public record Order(Long id,
                    List<Item> items) {


}
