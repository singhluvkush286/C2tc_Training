package com.tns.scanner.copy;

public class Calculations {
  public void cls(Person p)
  {
	  if(p.getIncome()<=16000) {
		  p.setTax(0);
	  }
	  else if(p.getIncome()>16000 && p.getIncome()<=50000) {
		  p.setTax(5);
	  }
	  else
	  {
		  p.setTax(10);
	  }
  }
}
