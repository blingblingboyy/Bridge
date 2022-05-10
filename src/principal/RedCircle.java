package principal;

public class RedCircle implements DrawAPI {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Desenhando circulo [Cor: Vermelho, Raio:" + radius
                + ", x:" + x 
                + ", y:" + y + "]");
    }

}
