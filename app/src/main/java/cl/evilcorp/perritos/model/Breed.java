package cl.evilcorp.perritos.model;

import java.util.List;
import java.util.Map;

public class Breed {
   private Map<String, List<String>> message;
   private String estado;

    public Map<String, List<String>> getMessage() {
        return message;
    }

    public void setMessage(Map<String, List<String>> message) {
        this.message = message;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Breed{" +
                "message=" + message +
                ", estado='" + estado + '\'' +
                '}';
    }
}
