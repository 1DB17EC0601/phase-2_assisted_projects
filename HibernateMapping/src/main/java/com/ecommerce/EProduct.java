package com.ecommerce;

import org.hibernate.dialect.Database;
import org.hibernate.mapping.Collection;
import org.hibernate.mapping.List;
import org.hibernate.mapping.Set;
import org.hibernate.type.BigDecimalType;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.String;



public class EProduct {
	
	    private long ID;
	    private String name;
	    private BigDecimalType price;
	    private Database dateAdded;
	    private List<Color> colors;
	    private Collection<ScreenSizes> screensizes;
	    private Set<OS> os;
	    private Map finance;
	    
	   public EProduct()
	   {
		   
	   }

	public EProduct(long iD, String name, BigDecimal price, Date dateAdded, List<Color> colors,
			Collection<ScreenSizes> screensizes, Set<OS> os, Map finance) {
		
		ID = iD;
		this.name = name;
		this.price = price;
		this.dateAdded = dateAdded;
		this.colors = colors;
		this.screensizes = screensizes;
		this.os = os;
		this.finance = finance;
	}

	public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Date getDateAdded() {
		return dateAdded;
	}

	public void setDateAdded(Date dateAdded) {
		this.dateAdded = dateAdded;
	}

	public List<Color> getColors() {
		return colors;
	}

	public void setColors(List<Color> colors) {
		this.colors = colors;
	}

	public Collection<ScreenSizes> getScreensizes() {
		return screensizes;
	}

	public void setScreensizes(Collection<ScreenSizes> screensizes) {
		this.screensizes = screensizes;
	}

	public Set<OS> getOs() {
		return os;
	}

	public void setOs(Set<OS> os) {
		this.os = os;
	}

	public Map getFinance() {
		return finance;
	}

	public void setFinance(Map finance) {
		this.finance = finance;
	}
	   
	   

}
