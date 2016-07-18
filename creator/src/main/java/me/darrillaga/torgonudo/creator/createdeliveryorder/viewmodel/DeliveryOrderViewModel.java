package me.darrillaga.torgonudo.creator.createdeliveryorder.viewmodel;

import me.darrillaga.torgonudo.commons.model.DeliveryOrder;

public class DeliveryOrderViewModel {

    private DeliveryOrder mDeliveryOrder;

    public DeliveryOrderViewModel(DeliveryOrder deliveryOrder) {
        mDeliveryOrder = deliveryOrder;
    }

    public String getId() {
        return mDeliveryOrder.getId();
    }

    public String getUserName() {
        return "Dami";
    }

    public String getOrderText() {
        return mDeliveryOrder.getOrderText();
    }
}
