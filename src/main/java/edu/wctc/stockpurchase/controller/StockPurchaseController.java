package edu.wctc.stockpurchase.controller;

import edu.wctc.stockpurchase.entity.StockPurchase;
import edu.wctc.stockpurchase.service.StockPurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/stockpurchases")
public class StockPurchaseController {
    private final StockPurchaseService stockPurchaseService;
    @Autowired
    public StockPurchaseController(StockPurchaseService stockPurchaseService) {
        this.stockPurchaseService = stockPurchaseService;
    }
    @GetMapping
    public List<StockPurchase> getAllStockPurchases() {
        return stockPurchaseService.getAllStockPurchases();
    }
    @GetMapping("/{id}")
    public StockPurchase getStockPurchaseById(@PathVariable int id) {
        return stockPurchaseService.getStockPurchaseById();
    }
    @PostMapping
    public StockPurchase createStockPurchase(@RequestBody StockPurchase stockPurchase) {
        return stockPurchaseService.createStockPurchase();
    }
    @PutMapping("/{id}")
    public StockPurchase updateStockPurchase(@PathVariable int id, @RequestBody StockPurchase updatedStockPurchase) {
        return stockPurchaseService.updateStockPurchase(id, updatedStockPurchase);
    }
    @PatchMapping("/{id}")
    public StockPurchase partialUpdateStockPurchase(@PathVariable int id, @RequestBody StockPurchase updatedStockPurchase) {
        return stockPurchaseService.partialUpdateStockPurchase();
    }
    @DeleteMapping("/{id}")
    public void deleteStockPurchase(@PathVariable int id) {
        stockPurchaseService.deleteStockPurchase(id);
    }
}




