package principal;

public class GreenCircle implements DrawAPI {
    
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Desenhando circulo [Cor: Verde, Raio:" + radius
                + ", x:" + x 
                + ", y:" + y + "]");
    }

}
