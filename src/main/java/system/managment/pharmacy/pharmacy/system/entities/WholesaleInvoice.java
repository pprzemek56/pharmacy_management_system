package system.managment.pharmacy.pharmacy.system.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
public class WholesaleInvoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String invoiceNumber;
    @ManyToOne
    private WholesaleCompany wholesaleCompany;
    private LocalDate invoiceDate;
    private LocalDate paymentDate;
    private String paymentMethod;
    @OneToMany
    private List<WholesaleDrugItem> wholesaleDrugItems;
    private double price;
}
