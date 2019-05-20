package Advanced_A3;

public class City {

    String name;
    int citizensNum;

    public City(String name, int citizensNum){
        this.name = name;
        this.citizensNum = citizensNum;
    }

    public String getName() {
        return this.name;
    }

    public int getCitizensNum() {
        return this.citizensNum;
    }
}
