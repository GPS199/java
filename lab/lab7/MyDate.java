public class MyDate {

	int year;
	int month;
	int day;
	int[] max_days= {31,28,31,30,31,30,31,31,30,31,30,31};

	public MyDate(int day, int month, int year) {
		this.day=day;
		this.month=month-1;
		this.year=year;
	}
	

	public void incrementDay() {
		day++;
		if (day>max_days[month]) {
			if (month==1 && inLeapYear()) {
				day=29;
			}
			else {
				day=1;
				incrementMonth();
			}		
						
		}
		
	}

	public void incrementYear(int i) {
		this.year+=i;
		
	}

	public void decrementYear() {
		
		
	}
	public void decrementDay() {
		day--;
		if (day==0) {
			decrementMonth();
			if (month==1 && inLeapYear()) {
				day=29;
			}
			else {
				day=max_days[month];
			}
		}
		
		
	}
	private boolean inLeapYear() {
		
		return year%4==0;
	}


	public void decrementMonth() {
		decrementMonth(1);
	}
	public void decrementMonth(int i) {
		incrementMonth(-i);
	}

	public void incrementYear() {
		this.year++;
		
	}

	

	public void incrementMonth() {
		incrementMonth(1);
		
	}

	public void incrementMonth(int i) {
		int newMonth=(month+i)%12;
		int yearDiff=0;
		if (newMonth<0) {
			newMonth+=12;
			yearDiff=-1;
		}
		
		
		yearDiff= (month+i)/12;
		
		this.month=newMonth;
		year+=yearDiff;
		
		
		
	}

	public void incrementDay(int i) {
		// TODO Auto-generated method stub
		
	}

	public boolean isAfter(MyDate anotherDate) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isBefore(MyDate anotherDate) {
		// TODO Auto-generated method stub
		return false;
	}

	public int dayDifference(MyDate anotherDate) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void decrementYear(int i) {
		// TODO Auto-generated method stub
		
	}
	
	public String toString() {
		return year+"-"+(month+1>9? "":"0")+(month+1)+"-"+(day>9?"":"0")+day;
	}


	public void decrementDay(int i) {
		// TODO Auto-generated method stub
		
	}

	
	
	
	


}