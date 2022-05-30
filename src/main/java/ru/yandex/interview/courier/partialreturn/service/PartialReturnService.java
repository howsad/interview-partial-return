package ru.yandex.interview.courier.partialreturn.service;

import org.springframework.stereotype.Service;

import ru.yandex.interview.courier.partialreturn.api.RegisterPartialReturnRequest;
import ru.yandex.interview.courier.partialreturn.repository.OrderRepository;

@Service
public class PartialReturnService {

    private final OrderRepository orderRepository;

    public PartialReturnService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public void registerPartialReturn(RegisterPartialReturnRequest registerPartialReturnRequest) {
        registerPartialReturnRequest.
    }

}
