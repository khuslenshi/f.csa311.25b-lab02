public class Rectangle implements Shape {

    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle " + width + "x" + height);
    }
}
// Гишүүн өгөгдлүүдийг private болгож
// гаднаас шууд хандах боломжийг хаасан
// ингэснээр мэдээлэл нууцлал сайжирсан
