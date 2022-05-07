package com.olympic.cis143.m04.student.tacotruck.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.olympic.cis143.m04.student.tacotruck.Orders;
import com.olympic.cis143.m04.student.tacotruck.TacoImpl;

public class OrdersSetImpl  implements Orders {
	private Set<TacoImpl> order = new HashSet<>();
    @Override
    public void addOrder(TacoImpl tacoOrder) {
    	this.order.add(tacoOrder);
    }

    @Override
    public boolean hasNext() {
        return !this.order.isEmpty();
    }

    @Override
    public TacoImpl closeNextOrder() {	
       Iterator<TacoImpl> itr = order.iterator();
       TacoImpl a =itr.next();
      order.remove(a);
       return a;
    }

    @Override
    public int howManyOrders() {
        return order.size();
    }
}
