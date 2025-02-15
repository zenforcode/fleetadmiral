package org.zencode.entities;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "bookings")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "booking_id", unique = true, nullable = false)
    private String bookingId;

    @Column(name = "model", nullable = false)
    private String model;

    @Column(name = "start_time", nullable = false)
    private LocalDateTime startTime;

    @Column(name = "end_time", nullable = false)
    private LocalDateTime endTime;

    @Column(name = "price", nullable = false)
    private BigDecimal price;

    @Column(name = "sub_total")
    private BigDecimal subTotal;

    @Column(name = "quantity")
    private BigDecimal quantity;

    @Column(name = "vat")
    private BigDecimal vat;

    @OneToMany(mappedBy = "booking", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<BookingItem> bookingItems;

    // Constructor
    public Booking() {
        this.subTotal = BigDecimal.ZERO;
        this.quantity = BigDecimal.ZERO;
        this.vat = BigDecimal.valueOf(20);
    }

    public Booking(String bookingId, String model, LocalDateTime startTime, LocalDateTime endTime, BigDecimal price) {
        this.bookingId = bookingId;
        this.model = model;
        this.startTime = startTime;
        this.endTime = endTime;
        this.price = price;
        this.subTotal = BigDecimal.ZERO;
        this.quantity = BigDecimal.ZERO;
        this.vat = BigDecimal.valueOf(20);
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(BigDecimal subTotal) {
        this.subTotal = subTotal;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getVat() {
        return vat;
    }

    public void setVat(BigDecimal vat) {
        this.vat = vat;
    }

    public List<BookingItem> getBookingItems() {
        return bookingItems;
    }

    public void setBookingItems(List<BookingItem> bookingItems) {
        this.bookingItems = bookingItems;
    }
}
