package edu.wctc.stockpurchase.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@NoArgsConstructor
@Entity
@Table(name="stock_purchase")
public class StockPurchase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="purchase_id")
    private int id;

    @Column(name = "stock_symbol")
    private String stockSymbol;

    @Column(name = "purchase_date")
    private Date purchaseDate;

    @Column(name = "purchase_price")
    private double purchasePrice ;

    @Column(name = "shares_purchased")
    private int sharesPurchased;

    //The getters and setters

}
