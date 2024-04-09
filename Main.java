package sustentacion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ArrayList<Futbolista> futbolistas = new ArrayList<>();
        leer_archivo(futbolistas);
        Equipo equipo = new Equipo("Real Madrid", "Madrid", "1902", futbolistas);
    
        boolean salir = true;

        while (salir) {
        
        System.out.println("Bienvenido a la gestión de tu equipo ¿Qué deseas hacer?");
        System.out.println("1. Añadir futbolista");
        System.out.println("2. Eliminar futbolista");
        System.out.println("3. Buscar futbolista");
        System.out.println("4. Obtener futbolistas");
        System.out.println("5. Salir");

        int selector = Integer.parseInt(sc.nextLine());

        switch (selector) {
            case 1:
                System.out.println("Indica el nombre del futbolista");
                String name = sc.nextLine();
                System.out.println("Indica la posición del futbolista");
                String position = sc.nextLine();
                System.out.println("Indica la dorsal del futbolista");
                String dorsal = sc.nextLine();
                System.out.println("Indica la nacionalidad del futbolista");
                String nationality = sc.nextLine(); 

                equipo.añadirFutbolista(new Futbolista(name, position, dorsal, nationality));
                System.out.println("futbolista añadido correctamente!");
                break;
            
            case 2:
                System.out.println("Indica el nombre del futbolista que deseas eliminar");
                String name_erase = sc.nextLine();

                equipo.eliminarFutbolista(name_erase);

                break;

            case 3:
                System.out.println("Indica el nombre del futbolista que deseas buscar");
                String name_search = sc.nextLine();

                Futbolista futbolista_search = equipo.getFutbolista(name_search);

                System.out.println("El futbolista obtenido tiene los siguientes datos");
                System.out.println(futbolista_search.toString());
                
                break;

            case 4:
                System.out.println("Los futbolistas de tu equipo son los siguientes:");
                ArrayList<Futbolista> fut_eq = equipo.getFutbolistas();

                for (Futbolista futbolista : fut_eq) {
                    System.out.println(futbolista.getName());
                }

                break;

            case 5: 
                System.out.println("Has salido del programa!");
                salir = false;
                break;
            default:
                break;
        }
        }
        
    }

    private static void leer_archivo(ArrayList<Futbolista> arrayList){
        try {
     
            String linea = "";
            BufferedReader lector = new BufferedReader(new FileReader("C:\\Users\\lebop\\Documents\\UCaldas\\Programacion_2\\Actividad Calificable\\sustentacion\\archivo.txt"));
            while ((linea=lector.readLine())!=null) {
                String[] bloques = linea.split(",");
                if (bloques.length==4) {
                    String name = bloques[0];
                    String position = bloques[1];
                    String dorsal = bloques[2];
                    String nacionality = bloques[3];
                    arrayList.add(new Futbolista(name, position, dorsal, nacionality));
                }
            }
            lector.close();  
        } catch (Exception e) {
            System.out.println("Error al leer el archivo "+ e.getMessage());
        }
    }
}
