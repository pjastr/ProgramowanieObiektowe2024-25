import java.util.ArrayList;

public class TestWorkTool {

    public static void main(String[] args) {
        ArrayList<WorkTool> w1 = new ArrayList<>();
        w1.add(new Hammer());
        w1.add(new Screwdriver());
        w1.add(new Hammer());
        for(var elem: w1){
            elem.use();
        }
    }
}
