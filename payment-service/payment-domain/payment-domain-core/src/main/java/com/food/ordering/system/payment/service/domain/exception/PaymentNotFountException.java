package com.food.ordering.system.payment.service.domain.exception;

import com.food.ordering.system.domain.exception.DomainException;

public class PaymentNotFountException extends DomainException {

    public PaymentNotFountException(String message) {
        super(message);
    }

    public PaymentNotFountException(String message, Throwable cause) {
        super(message, cause);
    }
}
