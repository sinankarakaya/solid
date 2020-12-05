package services;

import entity.BasketPojo;

public class WorkerBasketService implements IBasketService {

    @Override
    public double calculateDebt(BasketPojo basket) {
        int amount = basket.amount;
        double debt = basket.debt*amount;
        return debt*0.5;
    }
    
}
