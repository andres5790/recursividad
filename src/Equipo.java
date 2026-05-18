import java.util.ArrayList;

public class Equipo {
    private ArrayList<Jugador> equipo;

    public Equipo(){
        equipo=new ArrayList<>();

    }

    public void predefinir(){
        equipo.add(new Jugador("Messi","Delantero",35,8f,35000000));
        equipo.add(new Jugador("Valencia","Delantero",38,7f,30000000));
        equipo.add(new Jugador("Dibu","Portero",36,9f,36000000));
        equipo.add(new Jugador("Plata","Mediocampista",29,6f,27000000));
    }



    public Jugador getJugador(int indice){
        if (indice>=0 && indice<equipo.size()){
            return equipo.get(indice);
        }
        throw new IllegalArgumentException("Indice fuera de rango");
    }

    public int size(){
        return equipo.size();
    }

    public float valorTotal(){
        //primera invocacion
        if (equipo.isEmpty())
            return 0;
        return valorTotal(0);//indice inicial
    }

    private float valorTotal(int indice){
        if (indice== equipo.size()){//estamos fuera de los indices
            //caso base
            return 0;
        }else{
            return equipo.get(indice).getPrecioMercado()+valorTotal(indice+1);
        }

    }
}
