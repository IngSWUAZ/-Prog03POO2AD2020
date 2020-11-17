package mx.edu.uaz.ingsoftware.poo2.clientecontrolconcursos.utils;

import java.io.IOException;

public class ServidorException extends IOException {
    public ServidorException(String mensaje,
                             Throwable causa) {
        super(mensaje,causa);
    }

    public ServidorException(int codigo) {
        super(String.valueOf(codigo));
    }
}
