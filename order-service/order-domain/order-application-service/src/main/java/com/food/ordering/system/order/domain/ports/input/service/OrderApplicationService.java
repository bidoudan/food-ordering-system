package com.food.ordering.system.order.domain.ports.input.service;

import com.food.ordering.system.order.domain.dto.create.CreateOrderResponse;
import com.food.ordering.system.order.domain.dto.track.TrackOrderQuery;
import com.food.ordering.system.order.domain.dto.track.TrackOrderResponse;
import com.food.ordering.system.order.domain.dto.create.CreateOrderCommand;

import javax.validation.Valid;

public interface OrderApplicationService {

    CreateOrderResponse createOrder(@Valid CreateOrderCommand createOrderCommand);
    TrackOrderResponse trackOrder(@Valid TrackOrderQuery trackOrderQuery);
}
