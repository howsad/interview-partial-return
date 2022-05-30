package ru.yandex.interview.courier.partialreturn.entity;

import java.math.BigDecimal;

public record Item(Long id,
                   BigDecimal price,
                   ItemStatus status) {
}
