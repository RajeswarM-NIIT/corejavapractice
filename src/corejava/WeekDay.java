package corejava;

public class WeekDay {
	int daysForMonth[] = {31,28,31,30,31,30,31,31,30,31,30,31};	
	public  String getWeekDay(int year, int month, int date){
		String weekday="";			
		if (validateDate(year, month, date)) {
			int jd = 0;
			String[] daynames = { "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" };
			for (int i = 0; i < month - 1; i++) { // to calculate JD
				jd += daysForMonth[i];
			}
			jd += date;			
			int sum = year + (year - 1) / 400 + (year - 1) / 4 + jd - (year - 1) / 100;
			int rem = sum % 7;
			weekday = daynames[rem];
		}			
		else{ // year is invalid
			weekday="Invalid Year / Invalid Month / Invalid Date";
		}	
		return weekday;
	}
	
	private boolean validateDate(int year, int month, int date){
		boolean result=false;
		if(year > 0){
			if(year%400==0  || (year%4==0 && year%100!=0)) // if year is a leap
				daysForMonth[1]=29;
			if(month>0 && month<=12){
				if(date>0 && date<=daysForMonth[month-1]){ 
					result=true;
				}
			}
		}		
		return result;
	}
}


/*
 	public  String getWeekDay(int year, int month, int date){
		String weekday="";			
		if(year > 0){ // if year is valid
			
			if(year%400==0  || (year%4==0 && year%100!=0)) // if year is a leap
				daysForMonth[1]=29;
			
			if(month>0 && month<=12){ // if month is valid
				
				if(date>0 && date<=daysForMonth[month-1]){ // if date is valid
					int jd=0;
					String[] daynames={"Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday"};
					for(int i=0;i<month-1;i++){ // to calculate JD
						jd+=daysForMonth[i];
					}
					jd+=date;
					//System.out.println("\nJD : " + jd);
					int sum = year + (year-1)/400 + (year-1)/4 + jd - (year-1)/100;
					int rem = sum%7;
					weekday=daynames[rem];				
				}
				else{ // date is invalid
					weekday="Invalid Date";
				}
			}
			else{ // month is invalid
				weekday="Invalid Month";		
			}			
			
		}
		else{ // year is invalid
			weekday="Invalid Year";
		}	
		return weekday;
	}
 */

