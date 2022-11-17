package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Date {

	public int month;
	public int day;
	public int year;
	public boolean holiday;
	
	
    /**
	 * @param month
	 * @param day
	 * @param year
	 * @param holiday
	 */
	public Date(int month, int day, int year, boolean holiday) {
		super();
		this.month = month;
		this.day = day;
		this.year = year;
		this.holiday = holiday;
	}



	@Override
	public String toString() {
		return "Date [month=" + month + ", day=" + day + ", year=" + year + ", holiday=" + holiday + "]";
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(day, holiday, month, year);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && holiday == other.holiday && month == other.month && year == other.year;
	}


	

	public static void main(String[] args) {

	Date d1 = new Date(12, 31, 1, true);
	Date d2 = new Date(12, 31, 1, true);
	System.out.println(d1.equals(d2));
	System.out.println(d1 == d2);
	
	LinkedList<Date> list = new LinkedList<Date>();
	list.add(d1);
	list.add(d2);
	list.add(d1);
	System.out.println(list);
	
	HashSet<Date> set = new HashSet<Date>();
	set.add(d1);
	set.add(d2);
	set.add(d1);
	System.out.println(set);
    }
	
	

}
