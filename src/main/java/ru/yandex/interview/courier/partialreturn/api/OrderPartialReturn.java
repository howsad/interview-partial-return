package ru.yandex.interview.courier.partialreturn.api;

import java.util.List;

public record OrderPartialReturn(Long orderId,
                                 List<Long> returnItemIds,
                                 List<Long> purchasedItemIds) {
}
