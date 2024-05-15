package com.data.service.response;

import java.util.List;

import com.data.service.DataEntity.Item;
import com.data.service.DataEntity.Link;
import com.data.service.DataEntity.MetaData;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties
@Getter
@Data
@Setter
public class ItemResponse {
	
	private List<Item> items;
	private MetaData metadata;
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	public MetaData getMetadata() {
		return metadata;
	}
	public void setMetadata(MetaData metadata) {
		this.metadata = metadata;
	}
	public Link getLinks() {
		return links;
	}
	public void setLinks(Link links) {
		this.links = links;
	}
	private Link links;
	

}
