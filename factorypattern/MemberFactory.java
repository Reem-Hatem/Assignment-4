package factorypattern;

public class MemberFactory {
    public Staff getmember(String choice, double s, double y){
        String c=choice.toLowerCase();
        switch(c){
            case "teaching assistant":
                return new TeachingAssistant(s, y);
            case "doctor":
                return new Doctor(s, y);
            default:
                return null;
        }
    }
}
