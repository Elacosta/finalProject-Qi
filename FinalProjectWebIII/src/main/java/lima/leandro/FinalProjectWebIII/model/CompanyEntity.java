package lima.leandro.FinalProjectWebIII.model;

import lombok.*;
import org.hibernate.annotations.Tables;
import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * @author Leandro Lima
 * @since 14/12/2021 - 21:19
 * @version CLOUD 1.0.0
 * @category model
 */
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Component
@Entity
@Table(name = "company")
public class CompanyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "cnpj")
    private long CNPJ;

    @Column(name = "companyname")
    private String companyName;

    @Column(name = "capital")
    private double capital;

    @Column(name = "service")
    private String service;

    @Column(name = "servicevalue")
    private double serviceValue;

    @Column(name = "companytype")
    private String companyType;
}
