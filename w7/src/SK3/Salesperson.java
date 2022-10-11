package SK3;

public class Salesperson implements Comparable {
	private String firstName, lastName;
	private int totalSales;
	
	public Salesperson(String first, String last, int sales) {
		// TODO Auto-generated method stub
		firstName = first;
		lastName = last;
		totalSales = sales;
	}
	public String toString(){
		return lastName + "," + firstName + ": \t" +totalSales;
	}
	public boolean equals(Object other) {
		return (lastName.equals(((Salesperson)other).getLastName()) && 
				firstName.equals(((Salesperson)other).getFirstName()));
	}
	public int compareTo(Object other) {
		int result = 0;
		return result;
	}
	public String getFirstName() {
		return firstName;
	}
//	public void setFirstName(String firstName) {
//		this.firstName = firstName;
//	}
	public String getLastName() {
		return lastName;
	}
//	public void setLastName(String lastName) {
//		this.lastName = lastName;
//	}
	public int getTotalSales() {
		return totalSales;
	}
//	public void setTotalSales(int totalSales) {
//		this.totalSales = totalSales;
//	}
	
}
