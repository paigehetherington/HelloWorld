/**
 * Created by vajrayogini on 2/1/16.
 */
public class Pet {
    public String breed;
    public int age;
    public boolean isFixed;
    public boolean isMale = true;
    public String color;
//this class is for pet lovers

    public Pet (String breed, int age, boolean isFixed, boolean isMale, String color) {
        this.breed = breed;
        this.age = age;
        this.isFixed = isFixed;
        this.isMale = isMale;
        this.color = color;
    }
    public boolean getIsFixed () {
        return isFixed;
    }
    public String getBreed (){
        return breed;
    }
    public int getAge (){
        return age;
    }
    public boolean getIsMale (){
        return isMale;
    }
    public String getColor (){
        return color;
    }
    public void setColor(String newColor){
        this.color = newColor;
    }
    public void setIsFixed (boolean newIsFixed){
        if (newIsFixed) {
            this.isFixed = newIsFixed;
        }
    }
    public void setBreed (String newBreed) {
        this.breed = newBreed;
    }
    public void setAge (int newAge) {
        this.age = newAge;
    }
    public void setIsMale (boolean newIsMale) {
        this.isMale = newIsMale;
    }
}
