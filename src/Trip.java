/**
 * Created by vajrayogini on 2/1/16.
 */
public class Trip {
    public String country;
    public int numberOfDays;
    public boolean haveVisa = true;
    public boolean haveVaccination = true;
    //this class is for the travel junkies

    public Trip (String country, int numberOfDays, boolean haveVisa, boolean haveVaccination){
        this.country = country;
        this.numberOfDays = numberOfDays;
        this.haveVisa = haveVisa;
        this.haveVaccination = haveVaccination;
    }
    public String getCountry (){
        return country;
    }
    public int getNumberOfDays (){
        return numberOfDays;
    }
    public boolean getHaveVisa (){
        return haveVisa;
    }
    public boolean getHaveVaccination (){
        return haveVaccination;
    }

    public void setCountry (String newCountry){
        this.country = newCountry;
    }
    public void setNumberOfDays (int newNumberOfDays) {
        if(newNumberOfDays >=10) {
            this.numberOfDays = newNumberOfDays;
        }
    }
    public void setHaveVisa (boolean newHaveVisa) {
        this.haveVisa = newHaveVisa;
    }
    public void setHaveVaccination (boolean newHaveVaccination){
        this.haveVaccination = newHaveVaccination;
    }
}
