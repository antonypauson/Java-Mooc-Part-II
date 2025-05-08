import java.util.HashMap;

public class IOU {
    private HashMap<String, Double> iou;

    public IOU() {
        this.iou = new HashMap<>();
    }

    public void setSum(String name, double num) {
        iou.put(name, num);
    }

    public double howMuchDoIOweTo(String name) {
        return iou.getOrDefault(name,0.0);
    }
}
