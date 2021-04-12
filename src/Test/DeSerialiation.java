package Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DeSerialiation {
    public static List<Device> deSerialization() {

        List<Device> listShop = new ArrayList<>();

        try (Stream<String> shop = Files.lines(Paths.get("/Users/andrijdutko/Desktop/GitJava/src/Test/Obj.txt"))) {

            // Створення обєкту через масив
            // String[] infoTxt = shop.toArray(String[]::new);
            //
            // for (String s : infoTxt) {
            //     String[] deviceInfo = s.trim() .split(", ");
            //     Device device = new Device(
            //             Long.parseLong(deviceInfo[0]),
            //             deviceInfo[1],
            //             deviceInfo[2],
            //             Integer.parseInt(deviceInfo[3])
            //     );
            //     listShop.add(device);
            // }

            listShop = (shop.map(s -> s.split(", "))
                    .map(p -> new Device(Long.parseLong(p[0]), p[1], p[2], Integer.parseInt(p[3])))
                    .collect(Collectors.toList()));


        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return listShop;
    }
}
