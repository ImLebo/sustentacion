package sustentacion;

import java.lang.Character.UnicodeBlock;
import java.util.ArrayList;

public class Equipo {

    private String name_team; 
    private String city;
    private String foundation_year;
    private ArrayList<Futbolista> futbolistas; 



    public Equipo(String name_team, String city, String foundation_year, ArrayList<Futbolista> futbolistas) {
        this.name_team = name_team;
        this.city = city;
        this.foundation_year = foundation_year;
        this.futbolistas = futbolistas;
    }

    public void añadirFutbolista(Futbolista f){
        futbolistas.add(f);
    }

    public void eliminarFutbolista(String nombre){

        boolean encontrado = false;

        for (Futbolista futbolista : futbolistas) {
            if (futbolista.getName().equalsIgnoreCase(nombre)) {
                futbolistas.remove(futbolista);
                System.out.println("Futbolista eliminado correctamente!");
                encontrado = true;
                break;
            } 
        }

        if (encontrado==false) {
            System.out.println("No se ha podido encontrar ese futbolista");
        }
    }

    public Futbolista getFutbolista(String nombre){

        Futbolista futbolistaEncontrado = null;

        for (Futbolista futbolista : futbolistas) {
            if (futbolista.getName().equalsIgnoreCase(nombre)) {
                futbolistaEncontrado = futbolista;
            }
        }
        return futbolistaEncontrado;
    }

    public ArrayList<Futbolista> getFutbolistas(){
        return futbolistas;
    }

}
