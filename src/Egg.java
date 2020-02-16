import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Egg {
    // oat milk op nubs when you were 3 you fell off a tree op stream the tree was
    // clean grandma was mean she eat beans while she wearing jeans she met a queen
    // she had before seen

    public static void main(String[] args) {
        EggTwo egg = new EggTwo("yellow", "white", "raw");
        EggTwo eggjr = new EggTwo("orange", "grey", "scrambled");

        System.out.println(eggjr.getYolkc());
        eggjr.setYolkc("green");
        System.out.println(eggjr.getYolkc());

        List<EggTwo> eggies = new ArrayList<>();
        eggies.add(egg);
        eggies.add(eggjr);

        Map<EggTwo, Yolkc> eggleMaps = new HashMap<>();
        eggleMaps.put(egg, egg.getYolkc());
        eggleMaps.put(eggjr, eggjr.getYolkc());

        System.out.println("egg yolk color: " + egg.getYolkc() + "egg white color: " + egg.getWhitec() + "egg type: "
                + egg.getType());
    }
}
