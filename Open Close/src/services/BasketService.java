package services;

import entity.BasketPojo;

public class BasketService implements IBasketService {
    
    @Override
    public double calculateDebt(BasketPojo basket){
        int amount = basket.amount;
        double debt = basket.debt*amount;
        return debt;
    }


}
