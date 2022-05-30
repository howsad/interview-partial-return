package ru.yandex.interview.courier.partialreturn.repository;

import java.util.Collection;
import java.util.Optional;

import ru.yandex.interview.courier.partialreturn.entity.Item;
import ru.yandex.interview.courier.partialreturn.entity.Order;

public interface OrderRepository {

    Optional<Order> getById(Long id);

}
