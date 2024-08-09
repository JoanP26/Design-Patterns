package Classes;

import Interface.Component;
import java.util.ArrayList;
import java.util.List;

public class Caja implements Component{
    private List<Component> cajas = new ArrayList<>();

    @Override
    public int execute() {
        int totalCaja = 0;
        for (Component caja : cajas) {
            totalCaja += caja.execute();
        }
        System.out.println("Esta caja tiene " + totalCaja + " sobres");
        return totalCaja;
    }

    public void add(Component caja) {
        cajas.add(caja);
    }

    public void remove(Component caja) {
        cajas.remove(caja);
    }

    public List<Component> getChildren(){
        return cajas;
    }
}
