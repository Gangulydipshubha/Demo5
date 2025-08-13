package in.shubha.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@Entity
@Table(name="Prodtab")
public class Product {
	public Product(int i, String string, double d) {
		
	}
	@Id
	@Column(name="pid")
	private Integer ProId;
	@Column(name="pname")
	private String ProName;
	@Column(name="pcost")
	private Double ProdCost;
}
