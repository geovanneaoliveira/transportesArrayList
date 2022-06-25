import transportes.Aviao;
import transportes.Onibus;

public class Main {
    public static void main(String[] args) {
        Aviao aviao = new Aviao(5,5);
        Onibus onibus = new Onibus(8);
        aviao.mostrarAssentos();
    }
}
