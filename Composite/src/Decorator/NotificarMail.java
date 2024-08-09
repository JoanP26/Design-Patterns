package Decorator;

import Interface.Component;

public class NotificarMail extends Notificar{
    public NotificarMail(Component componente) {
        super(componente);
    }

    @Override
    public void notificarCliente() {
        System.out.println("Enviando notificación por correo electrónico sobre " + execute() + " unidades enviadas.");
    }
}
