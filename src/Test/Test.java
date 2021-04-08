package Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;

public class Test extends Thread {
    public static void main(String[] args) throws MyShopException {

        List<Device> listShop = deSerialization();

        while (true) {

            infoMenu();

            try {
                Scanner scanner = new Scanner(System.in);

                if (scanner.hasNextInt()) {
                    Integer optional = Optional.of(scanner.nextInt())
                            .stream()
                            .filter(integer -> integer <= 6)
                            .findAny()
                            .orElseThrow(() -> new MyShopException("Недоступний діапазон чисел"));

                    Thread.sleep(1000);

                    System.out.println("----------------------------------------------");

                    switch (optional) {
                        case 1: {
                            System.out.println("Асортимент Магазину");
                            listPrint(listShop);
                            break;
                        }
                        case 2: {
                            Scanner scanner1 = new Scanner(System.in);
                            System.out.print("Введіть серійний номер: ");
                            String str = scanner1.nextLine();

                            Device device = listShop.stream()
                                    .filter(elem -> elem.getSerialNumber().toString().equals(str))
                                    .findAny()
                                    .orElseThrow(() -> new MyShopException("Неіснуючий серійний номер"));
                            System.out.println(device);
                            break;
                        }
                        case 3: {
                            System.out.println("Список посортовано за назвою бренду");
                            List<Device> listSort = listShop.stream()
                                    .sorted(comparing(Device::getBrand))
                                    .collect(Collectors.toList());
                            listPrint(listSort);
                            break;
                        }
                        case 4: {
                            System.out.println("Ціна 400++");
                            List<Device> list = listShop.stream()
                                    .filter(device -> device.getPrice() > 400)
                                    .collect(Collectors.toList());
                            listPrint(list);
                            break;
                        }
                        case 5: {
                            System.out.println("Вивести лише ті Device у яких в серійному номері є (0) і ціна менша за 800");
                            List<Device> list = listShop.stream()
                                    .filter(device -> device.getSerialNumber().toString().contains("0"))
                                    .filter(device -> device.getPrice() < 800)
                                    .collect(Collectors.toList());
                            listPrint(list);
                            break;
                        }
                        case 6: {
                            System.out.println("Найдорожчий товар");
                            Optional<Device> device = listShop.stream()
                                    .max(comparing(Device::getPrice));
                            device.ifPresent(value -> printDevice(value));
                            break;
                        }
                    }

                    System.out.println("----------------------------------------------");
                } else throw new MyShopException("Введіть число");

            } catch (MyShopException noElem) {
                System.out.println(noElem.getMessage());
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void infoMenu() {
        System.out.println();
        System.out.println("Меню");
        System.out.println(" 1: Вивести весь список на екран ");
        System.out.println(" 2: Шукати Device за серійним номером");
        System.out.println(" 3: Вивести посортований список за назвою бренду");
        System.out.println(" 4: Вивести лише ті Device у яких ціна більша ніж 400");
        System.out.println(" 5: Вивести лише ті Device у яких в серійному номері є (0) і ціна менша за 800");
        System.out.println(" 6: Вивести найдорожчий товар");
        System.out.println("----------------------------------------------");
        System.out.print("Введіть дію: ");
    }

    public static void listPrint(List<Device> listShop) {
        System.out.println(listShop.toString()
                .replaceAll("[\\[\\]]", "")
                .replaceAll(", ", "\n"));
    }

    public static void printDevice(Device device) {
        System.out.println(device
                .toString()
                .replaceAll("[\\[\\]]", ""));
    }

    public static List<Device> deSerialization() {

        List<Device> listShop = new ArrayList<>();

        try (Stream<String> shop = Files.lines(Paths.get("/Users/andrijdutko/Desktop/GitJava/src/Test/Obj.txt"))) {

            String[] infoTxt = shop.toArray(String[]::new);

            for (String s : infoTxt) {
                String[] deviceInfo = s.split(", ");
                Device device = new Device(
                        Long.parseLong(deviceInfo[0]),
                        deviceInfo[1],
                        deviceInfo[2],
                        Integer.parseInt(deviceInfo[3])
                );
                listShop.add(device);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return listShop;
    }
}
