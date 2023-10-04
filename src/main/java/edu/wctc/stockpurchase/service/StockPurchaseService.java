package edu.wctc.stockpurchase.service;

import edu.wctc.stockpurchase.entity.StockPurchase;
import edu.wctc.stockpurchase.repo.StockPurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockPurchaseService {
    private final StockPurchaseRepository stockPurchaseRepository;

    @Autowired
    public StockPurchaseService(StockPurchaseRepository stockPurchaseRepository) {
        this.stockPurchaseRepository = stockPurchaseRepository;
    }

    public List<StockPurchase> getAllStockPurchases() {
        return getAllStockPurchases();
    }

    public StockPurchase getStockPurchaseById() {
        return getStockPurchaseById();
    }

    public StockPurchase createStockPurchase() {
        return createStockPurchase();
    }

    public StockPurchase updateStockPurchase(int id, StockPurchase updatedStockPurchase) {
        return updatedStockPurchase;
    }

    public StockPurchase partialUpdateStockPurchase() {
        return partialUpdateStockPurchase();
    }

    public void deleteStockPurchase(int id) {
    stockPurchaseRepository.deleteById(id);
    }
}
