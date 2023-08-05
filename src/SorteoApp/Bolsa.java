package SorteoApp;

import java.util.ArrayList;

public class Bolsa {
    ArrayList<Talon> papelitos = 
            new ArrayList<>();
    public void addPapelito(Talon t){
        papelitos.add(t);
    }    
    public void mostrar(){
        for (Talon papelito : papelitos) {
            System.out.println(papelito);
        }
    }        
    public Talon sortear(){
        int ganador = (int)
           (Math.random() * papelitos.size());
        return papelitos.get(ganador);
    }
}
