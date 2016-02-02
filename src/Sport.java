/**
 * Created by vajrayogini on 2/1/16.
 */
public class Sport {
    public String name;
    public String season;
    public int pointsPerScore;
    public boolean requiresEquipment = true;
    public int[] scores;
    //this class is for sports enthusiasts


    public Sport(String name, String season, int pointsPerScore, boolean requiresEquipment, int[] scores) {
        this.name = name;
        this.season = season;
        this.pointsPerScore = pointsPerScore;
        this.requiresEquipment = requiresEquipment;
        this.scores = scores;

    }
    public String getName () {
        return name;
    }
    public String getSeason (){
        return season;
    }
    public int getPointsPerScore (){
        return pointsPerScore;
    }
    public boolean getRequiresEquipment (){
        return requiresEquipment;
    }
    public int [] getScores (){
        return scores;
    }
    public void setScores(int [] newScores) {
            this.scores = newScores;
    }
    public void setName (String newName) {
        this.name = newName;
    }
    public void setSeason (String newSeason) {
        if (newSeason.length() == 4) {
            this.season = newSeason;
        }
    }
    public void setPointsPerScore (int newPointsPerScore) {
        this.pointsPerScore = newPointsPerScore;
    }
    public void setRequiresEquipment (boolean newRequiresEquipment){
        this.requiresEquipment = newRequiresEquipment;
    }
}
hw#2
