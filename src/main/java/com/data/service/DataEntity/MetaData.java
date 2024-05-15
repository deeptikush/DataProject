package com.data.service.DataEntity;

import lombok.Data;

@Data
public class MetaData {
	
	private int limit;
	private int offset;
	private int count;
	private int total;
	private Link links;

}
