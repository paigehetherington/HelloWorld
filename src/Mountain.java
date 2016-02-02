/**
 * Created by vajrayogini on 2/1/16.
 */
public class Mountain {
    public String rangeName;
    public int elevation;
    public String climate;
    public boolean isInUs;
    public int yearFormed;
    public Person [] climbers;
    //this class is for serious mountaineers

    public Mountain (String rangeName, int elevation, String climate, boolean isInUs, int yearFormed) {
        this.rangeName = rangeName;
        this.elevation = elevation;
        this.climate = climate;
        this.isInUs = isInUs;
        this.yearFormed = yearFormed;
    }

    public int getElevation (){
        return elevation;
    }
    public String getClimate (){
        return climate;
    }
    public String getRangeName () {
        return rangeName;
    }
    public boolean getIsInUs () {
        return isInUs;
    }
    public int getYearFormed (){
        return yearFormed;
    }
    public void setElevation (int newElevation) {
        if (newElevation >= 10000) {
            this.elevation = newElevation;
        }
    }
    public void setRangeName (String newRangeName) {
        if (newRangeName.length() <=9) {
            rangeName = newRangeName;
        }
    }
    public void setClimate (String newClimate){
        this.climate = newClimate ;
    }
    public void setIsInUs (boolean newIsInUs) {
        this.isInUs = newIsInUs;
    }
    public void setYearFormed (int newYear){
        this.yearFormed = newYear;
    }

}
