package com.data.service.DataEntity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties
@ToString
@Data
public class Item {
	
	private long countItemsId;
	private long storeId   ;
	private String itemNumber ;
	private String itemDescription ;
	private String aisle ;
	private String departmentName ;
	private String inventoryAction ;
	private float qty;
	private int packSize ;
	private String createdBy ;
    private Date createdDateTime;
    private String approvedBy;
    private String approvalDateTime;
    private float stockOnHand;
    private String stockUom;
    private String stocklastUpdated;
    private String sumOfTransfer ;
	private Date updatedOn;
	private Date insertedOn;
	private String itemCategory;
	private String rmsAdjStatus;
	private String packNumber;
	private String productUom;
	private String itemCountType;
	

}
