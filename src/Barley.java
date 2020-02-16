
public class Barley extends EggTwo {
    private int trophies;
    private int rank;
    private String skin;

    public Barley(String yolkc, String whitec, String type) {
        super(yolkc, whitec, type);
    }

    public Barley(String yolkc, String whitec, String type, int trophies, int rank, String skin) {
        super(yolkc, whitec, type);
        this.rank = rank;
        this.skin = skin;
        this.trophies = trophies;
    }

//                     _______
//              _     /       \
//             \ \   /    0   0 \
//              \_\ /           \___         kirb op
//                  \  -------- /___)
//                ___\         /__
//                \___\_______/__/

}
