import Classes.Caja;
import Classes.TeBlanco;
import Classes.TeVerde;

public class Cliente {
    public static void main(String[] args) {
        System.out.println("Demo Empaquetador de Té...");

        TeBlanco cajaBlanco1 = new TeBlanco();
        TeBlanco cajaBlanco2 = new TeBlanco();
        TeVerde cajaVerde1 = new TeVerde();
        TeVerde cajaVerde2 = new TeVerde();
        TeVerde cajaVerde3 = new TeVerde();
        TeBlanco cajaBlanco3 = new TeBlanco();

        Caja paquete1 = new Caja();
        Caja paquete2 = new Caja();
        System.out.println("Añado una caja de Té Blanco");
        paquete1.add(cajaBlanco1);
        System.out.println("Añado una caja de Té Blanco");
        paquete1.add(cajaBlanco2);
        System.out.println("Añado una caja de Té Verde");
        paquete1.add(cajaVerde1);
        System.out.println("Añado una caja de Té Verde");
        paquete2.add(cajaVerde2);
        System.out.println("Añado una caja de Té Verde");
        paquete2.add(cajaVerde3);
        System.out.println("Añado una caja de Té Blanco");
        paquete2.add(cajaBlanco3);


        System.out.println("Añado una caja de Paquete de cajas");
        System.out.println("Añado una caja de Paquete de cajas");

        //paquete2.add(paquete1);

        Caja envioAsia = new Caja();
        envioAsia.add(paquete1);
        envioAsia.add(paquete2);
        System.out.println("El envío a Asia contiene "+envioAsia.execute()+ " sobres de té");
    }
}
