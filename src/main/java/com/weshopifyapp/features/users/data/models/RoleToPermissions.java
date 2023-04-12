package com.weshopifyapp.features.users.data.models;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
@Builder
public class RoleToPermissions implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -982663118230374641L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@ManyToOne
	private Roles roles;
	
	@ManyToOne
	private Permissions permissions;
}
