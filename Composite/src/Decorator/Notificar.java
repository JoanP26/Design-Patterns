package Decorator;

import Interface.Component;

public abstract class Notificar implements Component{
    protected Component componente;

    public Notificar(Component componente) {
        this.componente = componente;
    }

    @Override
    public int execute() {
        return componente.execute();
    }

    public abstract void notificarCliente();
}
