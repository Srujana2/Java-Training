package com.nttdata.Nestedclass;

public class Product extends Object implements Cloneable{
	String productname;

	public Product(String productname) {
		super();
		this.productname = productname;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((productname == null) ? 0 : productname.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (productname == null) {
			if (other.productname != null)
				return false;
		} else if (!productname.equals(other.productname))
			return false;
		return true;
	}
	
	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}}
	