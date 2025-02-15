package java.org.zencode.entities;
import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "vehicles")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "activity_id")
    private Activity activity;

    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address address;

    private LocalDate assuranceTermination;
    private LocalDate deliveryDate;

    @ManyToOne
    @JoinColumn(name = "brand_id")
    private Brand brand;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    private String code;

    @ManyToOne
    @JoinColumn(name = "color_id")
    private Color color;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;

    private String currentUser;
    private String damages;
    private String extras;

    @ManyToOne
    @JoinColumn(name = "office_id")
    private Office office;

    @OneToMany(mappedBy = "vehicle", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Assurance> assurances;

    @ManyToOne
    @JoinColumn(name = "leasing_company_id")
    private Supplier leasingCompany;

    private String frame;
    private BigDecimal cubeMeters;
    private String plateNumber;
    private String policyNumber;
    private LocalDate startingDate;
    private LocalDate endingDate;
    private LocalDate manufactoringDate;

    @ManyToOne
    @JoinColumn(name = "model_id")
    private VehicleModel model;

    @ManyToOne
    @JoinColumn(name = "group_id")
    private Group group;

    private Byte places;
    private String observation;
    private String phone;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private VehicleOwner owner;

    private String gasolineLevel;
    private Integer kilometers;

    @ManyToOne
    @JoinColumn(name = "supplier_id")
    private Supplier supplier;

    @ManyToOne
    @JoinColumn(name = "owner_company_id")
    private Company ownerCompany;

    private Byte situation;
    private String motorNumber;
    private String previousRegistrationNumber;

    @ManyToOne
    @JoinColumn(name = "payment_method_id")
    private PaymentMethod paymentMethod;

    @ManyToOne
    @JoinColumn(name = "purchase_invoice_id")
    private Invoice purchaseInvoice;

    private String reference;
    private String keyCode;
    private LocalDate returnDate;
    private LocalDate startDateInFleet;
    private String storageKey;
    private String lastModification;
    private String location;
    private String octave;
    private LocalDate leaveDateInFleet;
    private LocalDate endingDateInFleet;
    private String warning;
    private LocalDate buyingDate;
    private BigDecimal registrationTaxes;
    private String buyingInvoiceNo;
    private BigDecimal buyingPrice;
    private LocalDate registrationDate;
    private String transportCard;
    private BigDecimal exWorksPrice;
    private BigDecimal sellingPrice;
    private String sellingInvoiceNo;

    @ManyToOne
    @JoinColumn(name = "circulation_tax_id")
    private CirculationTax circulationTax;

    private LocalDate trafficTermination;

    @ManyToOne
    @JoinColumn(name = "salesman_id")
    private Salesman seller;

    private LocalDate sellingInvoiceDate;
    private Double priceForSelling;
    private BigDecimal nextMaintenance;
    private BigDecimal leasingInstallment;
    private BigDecimal residualValues;
    private BigDecimal grantCommission;
    private BigDecimal financedImport;
    private BigDecimal defaultInterest;
    private BigDecimal exceedingKmQuota;
    private BigDecimal paymentDay;
    private String tools;
    private LocalDate startLeasingDate;
    private LocalDate endLeasingDate;
    private String leasingContractNumber;
    private BigDecimal leasingInterestPercentage;
    private String leasingNotes;
    private BigDecimal cancellationPenalty;

    @ManyToOne
    @JoinColumn(name = "buyer_id")
    private Client buyer;

    private BigDecimal buyingBonus;

    @ManyToOne
    @JoinColumn(name = "photo_id")
    private Photo photo;

    @ManyToOne
    @JoinColumn(name = "sketch_id")
    private Photo sketch;

    private String warranty;
    private LocalDate transferDate;
    private BigDecimal kmAtDelivery;
    private LocalDate buyingInvoiceDate;
}
