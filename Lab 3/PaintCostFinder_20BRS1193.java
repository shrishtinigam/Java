public class PaintCostFinder_20BRS1193{
    float length;
    float width;
    float height;
    PaintCostFinder_20BRS1193(float length, float width, float height){
        this.length = length;
        this.width = width;
        this.height = height;
    }
    public float wallArea(){
        float area = this.height * 2 * (this.length + this.width);
        return area;
    }

    public float gallonsOfPaintRequired(){
        float area = this.wallArea();
        float gallons = area / 300;
        return gallons;
    }

    public float paintPrice(){
        float gallons = this.gallonsOfPaintRequired();
        float price = gallons * 30;
        return price;
    }

    public static void main(String[] args){
        PaintCostFinder_20BRS1193 p1 = new PaintCostFinder_20BRS1193(35F, 85F, 72F);
        float price = p1.paintPrice();
        System.out.println("Final price: " + price);

        PaintCostFinder_20BRS1193 p2 = new PaintCostFinder_20BRS1193(39.34F, 74.57F, 55.12F);
        price = p2.paintPrice();
        System.out.println("Final price: " + price);
    }
}