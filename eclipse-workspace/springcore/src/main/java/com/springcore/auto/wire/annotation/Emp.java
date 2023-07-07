package com.springcore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	@Autowired
	@Qualifier("address2")
         private Address address;

		@Override
		public String toString() {
			return "Emp [address=" + address + "]";
		}
		
		public Emp() {
			super();
			// TODO Auto-generated constructor stub
			System.out.println("const");
		}

		public Emp(Address address) {
			super();
			this.address = address;
			System.out.print("inside constructor");
		}

		public Address getAddress() {
			return address;
		}

		public void setAddress(Address address) {
			this.address = address;
			System.out.println("inside Setter");
		} 
}
