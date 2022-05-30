package ru.yandex.interview.courier.partialreturn.external;

import ru.yandex.interview.courier.partialreturn.api.RegisterPartialReturnRequest;

public interface AntifraudClient {

    boolean validate(RegisterPartialReturnRequest validateRequest);

}
