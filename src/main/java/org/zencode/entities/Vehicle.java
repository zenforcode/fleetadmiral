using System;
using System.Collections.Generic;

namespace KarveModel
{
    /// <summary>
    ///  Entity of the domain that models a vehicle.
    /// </summary>
    public class Vehicle
    {
        public Vehicle()
        {
            var assurance = new Assurance();
            Activity = new Activity();
            Address = new Address();
            Brand = new Brand();
            Company = new Company();
            Buyer = new Client();
            Color = new Color();
            Office = new Office();
            Model = new VehicleModel();
            Group = new Group();
            Photo = new Photo();
            Sketch = new Photo();
            PaymentMethod = new PaymentMethod();
            PurchaseInvoice = new Invoice();
            Model = new VehicleModel();
            Owner = new VehicleOwner();
            OwnerCompany = new Company();
            Office = new Office();
            Assurance = new List<Assurance>();
            CirculationTax = new CirculationTax();
            LeasingCompany = new Supplier();
            Supplier = new Supplier();
            Assurance.Add(assurance);
            Seller = new Salesman();

        }
        /// <summary>
        /// Get or set the activity
        /// </summary>
        public Activity Activity { get; set; }

        /// <summary>
        ///  Get or set the address.
        /// </summary>

        public Address Address { get; set; }


        public DateTime? AssuranceTermination { get; set; }
        public DateTime? DeliveryDate { get; set; }
        /// <summary>
        ///  Get or set the assurance company.
        /// </summary>

        /// <summary>
        ///  Get or set the brand
        /// </summary>
        public Brand Brand { get; set; }

        /// <summary>
        ///  Get or set the client of the vehicle.
        /// </summary>
        public Client Client { get; set; }

        /// <summary>
        ///  Get or set the code
        /// </summary>
        public string Code { get; set; }
        /// <summary>
        ///  Get or set the color of the vehicle
        /// </summary>
        public Color Color { set; get; }
        /// <summary>
        ///  Get or set the company of the vehicle
        /// </summary>
        public Company Company { get; set; }

        /// <summary>
        ///  Get or set the current user.
        /// </summary>

        public string CurrentUser { get; set; }

        /// <summary>
        ///  Get or set the damags / daños
        /// </summary>
        public string Damages { get; set; }


        /// <summary>
        ///  Get or set the extras / extras
        /// </summary>
        public string Extras { get; set; }

        /// <summary>
        ///  Get or set the office of the vehicle
        /// </summary>
        public Office Office { get; set; }
        /// <summary>
        /// Get or set the assurance.
        /// </summary>
        public List<Assurance> Assurance { get; set; }

        /// <summary>
        ///  Get or set the leasing company of the vehicle
        /// </summary>
        public Supplier LeasingCompany { get; set; }

        /// <summary>
        ///  Get or set the frame (bastidor)
        /// </summary>
        public string Frame { set; get; }
        /// <summary>
        ///  Get or set the cube meters of the vehicle
        /// </summary>
        public decimal? CubeMeters { set; get; }
        /// <summary>
        ///  Get or set the plate number
        /// </summary>
        public string PlateNumber { get; set; }
        /// <summary>
        ///  Get or set the assurance policy number.
        /// </summary>
        public string PolicyNumber { get; set; }
        /// <summary>
        ///  Starting date of availability (fecha de alta)
        /// </summary>
        public DateTime StartingDate { set; get; }
        /// <summary>
        ///  Ending date of availability (fecha de baja)
        /// </summary>
        public DateTime EndingDate { set; get; }

        public DateTime? ManufactoringDate { get; set; }

        /// <summary>
        ///  Get or set the model
        /// </summary>
        public VehicleModel Model { get; set; }
        /// <summary>
        /// Get or set the group of a vehicle.
        /// </summary>
        public Group Group { get; set; }
        /// <summary>
        ///  Get or set the places number
        /// </summary>
        public byte? Places { set; get; }

        /// <summary>
        ///  Get or set the observation
        /// </summary>
        public string Observation { get; set; }

        public string Phone { get; set; }


        /// <summary>
        /// Get or set the owner name
        /// </summary>
        public VehicleOwner Owner { set; get; }

        /// <summary>
        /// Get or set the gasoline level.
        /// </summary>
        public string GasolineLevel { get; set; }
        /// <summary>
        ///  Get or set the kilometers.
        /// </summary>
        public int? Kilometers { get; set; }

        /// <summary>
        ///  Get or set the vehicle supplier.
        /// </summary>
        public Supplier Supplier { get; set; }
        /// <summary>
        ///  Get or set the owner company
        /// </summary>
        public Company OwnerCompany { get; set; }

        /// <summary>
        ///  Get or set the situation.
        /// </summary>
        public byte? Situation { get; set; }
        /// <summary>
        ///  Get or set the  vehicle motor number
        /// </summary>
        public string MotorNumber { get; set; }

        public string PreviousRegistrationNumber { get; set; }

        /// <summary>
        ///  Get or set the payment method.
        /// </summary>
        public PaymentMethod PaymentMethod { get; set; }

        /// <summary>
        ///  Get or set the purchase invoice of the vehicle.
        /// </summary>
        public Invoice PurchaseInvoice { get; set; }
        /// <summary>
        ///  Get or set the reference 
        /// </summary>
        public string Reference { get; set; }
        /// <summary>
        ///  Get or set the codigo llave de el vehicle.
        /// </summary>
        public string KeyCode { get; set; }
        /// <summary>
        ///  Get or set the return date
        /// </summary>
        public DateTime? ReturnDate { get; set; }
        /// <summary>
        ///  Get or set start date.
        /// </summary>
        public DateTime? StartDateInFleet { get; set; }
        /// <summary>
        ///  Get or set the storage key
        /// </summary>
        public string StorageKey { get; set; }
        /// <summary>
        ///  Get or set the last modification
        /// </summary>
        public string LastModification { get; set; }
        /// <summary>
        /// The location
        /// </summary>
        public string Location { get; set; }
        /// <summary>
        ///  Get or set the octave liters.
        /// </summary>
        public string Octave { get; set; }
        /// <summary>
        ///  Get or set the leave date in fleet.
        /// </summary>
        public DateTime? LeaveDateInFleet { get; set; }
        /// <summary>
        ///  Get or set ending date in fleet.
        /// </summary>
        public DateTime? EndingDateInFleet { get; set; }
        /// <summary>
        ///  Get or set the warning
        /// </summary>
        public string Warning { get; set; }
        /// <summary>
        ///  Get or set the buying date
        /// </summary>
        public DateTime? BuyingDate { get; set; }
        /// <summary>
        ///  Get or set the registration taxes
        /// </summary>
        public decimal? RegistrationTaxes { get; set; }
        /// <summary>
        ///  Get or set the buying invoice number
        /// </summary>
        public string BuyingInvoiceNo { get; set; }
        /// <summary>
        ///  Get or set buying price
        /// </summary>
        public decimal? BuyingPrice { get; set; }
        /// <summary>
        ///  Get or set the registration date
        /// </summary>
        public DateTime? RegistrationDate { get; set; }
        /// <summary>
        ///  Get or set the transport card
        /// </summary>
        public string TransportCard { get; set; }
        /// <summary>
        ///  Get or set ex work price
        /// </summary>
        public decimal? ExWorksPrice { get; set; }
        /// <summary>
        ///  Get or set selling price
        /// </summary>
        public decimal? SellingPrice { get; set; }
        /// <summary>
        ///  Get or set the selling invoce number
        /// </summary>
        public string SellingInvoiceNo { get; set; }
        /// <summary>
        ///  Get or set the circulation taxes
        /// </summary>
        public CirculationTax CirculationTax { get; set; }


        public DateTime? TrafficTermination { get; set; }


        public Salesman Seller { get; set; }

        /// <summary>
        ///  Get or set the selling invoice date/
        /// </summary>
        public DateTime? SellingInvoiceDate { get; set; }
        /// <summary>
        ///  Get or se the price for selling.
        /// </summary>
        public double? PriceForSelling { get; set; }
        public decimal? NextMaintanance { get; set; }
        public decimal? LeasingInstallement { get; set; }
        public decimal? ResidualValues { get; set; }
        public decimal? GrantCommission { get; set; }
        public decimal? FinancedImport { get; set; }

        public decimal? DefaultInterest { get; set; }

        public decimal? ExceedingKmQuota { get; set; }
        public decimal? PaymentDay { get; set; }
        public string Tools { get; set; }
        public DateTime? StartLeasingDate { get; set; }
        public DateTime? EndLeasingDate { get; set; }
        public string LeasingContractNumber { get; set; }
        public decimal? LeasingInterestPercentuage { get; set; }
        public string LeasingNotes { get; set; }
        public decimal? CancellationPenalty { get; set; }

        public Client Buyer { get; set; }
        public decimal? BuyingBonus { get; set; }

        public Photo Photo { get; set; }

        public Photo Sketch { get; set; }
        public string Warranty { get; set; }
        public DateTime? TransferDate { get; set; }
        public decimal? KmAtDelivery { get; set; }
        public DateTime? BuyingInvoiceDate { get; set; }
        public bool IsOwned { get; set; }

        public bool IsInternational { get; set; }
        public bool IsAllRisk { get; set; }
    }
}