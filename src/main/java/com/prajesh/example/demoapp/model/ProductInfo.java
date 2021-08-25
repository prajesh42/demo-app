package com.prajesh.example.demoapp.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="product_info")
public class ProductInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotNull
	private int id;
	@NotNull
	private String productName;
	@NotNull
	private String productId;
	@NotNull
	private String quantity;
	@NotNull
	private String categoryId;
	@NotNull
	private String brand;
	@NotNull
	@Schema(example = "dd-mm-yyy")
	private Date date;
}
