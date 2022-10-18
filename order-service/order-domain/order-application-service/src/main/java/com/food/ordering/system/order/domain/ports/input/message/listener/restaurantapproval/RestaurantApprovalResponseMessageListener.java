package com.food.ordering.system.order.domain.ports.input.message.listener.restaurantapproval;

import com.food.ordering.system.order.domain.dto.message.RestaurantApprovalResponse;

public interface RestaurantApprovalResponseMessageListener {

    void orderApproved(RestaurantApprovalResponse restaurantApprovalResponse);
    void orderRejected(RestaurantApprovalResponse restaurantApprovalResponse);

}
