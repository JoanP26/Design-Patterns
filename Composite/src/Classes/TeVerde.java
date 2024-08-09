package Classes;

import Interface.Component;

public class TeVerde implements Component {
    private int cantidadSobres = 24;


    @Override
    public int execute() {
        return cantidadSobres;
    }
}
