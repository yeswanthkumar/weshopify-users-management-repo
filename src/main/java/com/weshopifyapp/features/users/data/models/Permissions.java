package com.weshopifyapp.features.users.data.models;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Permissions implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1408267264391538921L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int permissionId;
	
	private String name;
	

}
