package com.food.ordering.system.order.domain.ports.input.message.listener.payment;

import com.food.ordering.system.order.domain.dto.message.PaymentResponse;

public interface PaymentResponseMessageListener {

    void paymentCompleted(PaymentResponse paymentResponse);

    void paymentCancelled(PaymentResponse paymentResponse);

}
