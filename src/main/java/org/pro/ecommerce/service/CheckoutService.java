package org.pro.ecommerce.service;

import org.pro.ecommerce.dto.Purchase;
import org.pro.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {
    PurchaseResponse placeOrder(Purchase purchase);
}
