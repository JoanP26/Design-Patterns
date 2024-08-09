package Classes;

import Interface.Component;

public class TeBlanco implements Component {
    private int cantidadSobres = 60;


    @Override
    public int execute() {
        return cantidadSobres;
    }
}
