package ru.yandex.interview.courier.partialreturn.api;

import java.util.List;

public record RegisterPartialReturnRequest(List<OrderPartialReturn> orderPartialReturnList) {
}
