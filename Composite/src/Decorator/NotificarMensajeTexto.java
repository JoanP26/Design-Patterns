package Decorator;

import Interface.Component;

public class NotificarMensajeTexto extends Notificar{
    public NotificarMensajeTexto(Component componente) {
        super(componente);
    }

    @Override
    public void notificarCliente() {
        // Lógica para notificar al cliente por mensaje de texto con el número de unidades
        System.out.println("Enviando notificación por mensaje de texto sobre " + execute() + " unidades enviadas.");
    }
}
