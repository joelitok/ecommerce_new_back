package org.pro.ecommerce.dto;

import java.util.Set;

import org.pro.ecommerce.entity.Address;
import org.pro.ecommerce.entity.Customer;
import org.pro.ecommerce.entity.Order;
import org.pro.ecommerce.entity.OrderItem;

import lombok.Data;

@Data
public class Purchase {
    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;
}
