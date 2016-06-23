/**
 * Created by vajrayogini on 2/1/16.
 */

//homework assignment to create 5 classes
public class Religion {
    public int age;
    public String name;
    public boolean isMonotheistic = true;
    public String leaderName;
    public String countryOfOrigin;

    public Religion (int age, String name, boolean isMonotheistic, String leaderName, String countryOfOrigin) {
        this.age = age;
        this.name = name;
        this.isMonotheistic = isMonotheistic;
        this.leaderName = leaderName;
        this.countryOfOrigin = countryOfOrigin;
    }

    public int getAge (){
        return age;
    }
    public String getName (){
        return name;
    }

    public void setMonotheistic(boolean monotheistic) {
        isMonotheistic = monotheistic;
    }

    public boolean getIsMonotheistic (){
        return isMonotheistic;
    }

    public boolean isMonotheistic() {
        return isMonotheistic;
    }

    public String getLeaderName (){
        return leaderName;
    }
    public String getCountryOfOrigin (){
        return countryOfOrigin;
    }
    public void setAge (int newAge){
        if (newAge >=2200) {
            this.age = newAge;
        }
    }

    public Religion() {
    }

    public void setName (String newName) {
        this.name = newName;

    }
    public void setIsMonotheistic (boolean newIsMonotheistic) {
        this.isMonotheistic = newIsMonotheistic;
    }
    public void setLeaderName (String newLeaderName){
            this.leaderName = newLeaderName;
    }
    public void setCountryOfOrigin (String newCountryOfOrigin) {
        this.countryOfOrigin = newCountryOfOrigin;
    }
}
//hw#2
