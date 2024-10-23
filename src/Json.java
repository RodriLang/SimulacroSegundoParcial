


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Json {
        String json = "[ { \"_id\": \"62a9c6ee6f3ddd737768a0f4\", \"activo\": false, \"balance\": \"$3,586.69\", \"imagen\": \"http://placehold.it/32x32\", \"capacidad\": 40, \"nombre\": \"JIMBIES\", \"email\": \"emmalowery@jimbies.com\", \"phone\": \"+1 (995) 481-3639\", \"direccion\": \"390 Troutman Street, Wilsonia, Massachusetts, 4973\", \"acerca\": \"Nulla commodo... etc } ]";
public void metodo(){
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            // Convierte el JSON en una lista de mapas
            List<Map<String, Object>> data = objectMapper.readValue(json, new TypeReference<List<Map<String, Object>>>() {});

            // Accede a los elementos del mapa
            for (Map<String, Object> entry : data) {
                System.out.println(entry);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}