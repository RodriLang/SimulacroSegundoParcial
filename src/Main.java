import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import models.Aeropuerto;
import models.Avion;
import services.AeropuertoService;

import java.io.DataInput;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Archivo archi = new Archivo();
        File file = new File("G6UyHYt7.json");
        List<Aeropuerto> aeropuertoList = new ArrayList<>();
        ObjectMapper objectMapper = new ObjectMapper();
        AeropuertoService aeropuertoService = new AeropuertoService();
       /* try {
            aeropuertoList = objectMapper.readValue(file, new TypeReference<>(){});
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //System.out.println(aeropuertoList);
        System.out.println(aeropuertoService.filtrarPorCapacidad(aeropuertoList, 25));
*/

        try {
            List<Map<String, Object>> aeropuertoDataList = objectMapper.readValue(file, List.class);

            for (Map<String, Object> aeropuertoData : aeropuertoDataList) {
                aeropuertoList.add(objectMapper.convertValue(aeropuertoData, Aeropuerto.class));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        for(Aeropuerto a : aeropuertoList){
            for(Avion av : a.getAviones()) {
                System.out.println("piloto: "+av.getPiloto()+" - capacidad: "+av.getCapacidad_pasajeros());
            }
        }
        for(Aeropuerto a : aeropuertoList){
            for(Avion av : a.getAviones()){
                if(av.getPiloto().equals("Adele Best")){
                    av.setCapacidad_pasajeros(22);
                }
            }
        }

        try {
            archi.sobreescribirArchivo("G6UyHYt7.json", objectMapper.writeValueAsString(aeropuertoList));
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        for(Aeropuerto a : aeropuertoList){
            for(Avion av : a.getAviones()) {
                System.out.println("piloto: "+av.getPiloto()+" - capacidad: "+av.getCapacidad_pasajeros());
            }
        }
    }


}