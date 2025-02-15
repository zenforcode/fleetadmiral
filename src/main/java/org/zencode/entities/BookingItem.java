package org.zencode.entities;

import jakarta.persistence.*;
import java.math.BigDecimal;

/**
 * Entity representing a Reservation Item.
 */
@Entity
@Table(name = "booking_items")
public class BookingItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "code", nullable = false)
    private String code;

    @Enumerated(EnumType.STRING)
    @Column(name = "bill_to", nullable = false)
    private BillTo billTo;

    @Column(name = "number")
    private String number;

    @Column(name = "extra")
    private short extra;

    @Column(name = "min")
    private int min;

    @Column(name = "max")
    private int max;

    @Column(name = "days")
    private String days;

    @Column(name = "fare")
    private String fare;

    @Column(name = "type")
    private Byte type;

    @Column(name = "money")
    private String money;

    @Column(name = "vat")
    private BigDecimal vat;

    @Column(name = "booking_key", nullable = false)
    private long bookingKey;

    @Column(name = "machine")
    private String machine;

    @Column(name = "unit_cost")
    private BigDecimal unitCost;

    @Column(name = "cost")
    private BigDecimal cost;

    @Column(name = "total_price")
    private BigDecimal totalPrice;

    @Column(name = "subtotal_tt")
    private BigDecimal subtotalTt;

    @Column(name = "taxable_price")
    private BigDecimal taxablePrice;

    @Column(name = "taxable_subtotal")
    private BigDecimal taxableSubtotal;

    @Column(name = "multiple_quote")
    private Byte multipleQuote;

    @Column(name = "included")
    private boolean included;

    @Column(name = "group_name")
    private String group;

    @ManyToOne
    @JoinColumn(name = "concept_id", nullable = false)
    private Concept concept;

    @ManyToOne
    @JoinColumn(name = "unity_id", nullable = false)
    private Unity unity;

    @Column(name = "quantity")
    private BigDecimal quantity;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "discount")
    private BigDecimal discount;

    @Column(name = "subtotal")
    private BigDecimal subtotal;

    // Constructor
    public BookingItem() {
        this.unity = 0;
        this.subtotal = BigDecimal.ZERO;
        this.discount = BigDecimal.ZERO;
        this.quantity = BigDecimal.ZERO;
    }

    // Compute subtotal
    public void computeSubtotal() {
        BigDecimal total = quantity.multiply(price);
        BigDecimal discountAmount = total.multiply(discount).divide(BigDecimal.valueOf(100));
        this.subtotal = total.subtract(discountAmount);
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public BillTo getBillTo() {
        return billTo;
    }

    public void setBillTo(BillTo billTo) {
        this.billTo = billTo;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
        computeSubtotal();
    }
}

enum BillTo {
    CLIENT,
    DRIVER
}
