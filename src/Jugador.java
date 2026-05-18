public class Jugador {
    private String nombre;
    private String posicion;
    private int edad;
    private float rendimiento;
    private float precioMercado;

    public Jugador() {
    }

    public Jugador(String nombre, String posicion, int edad, float rendimiento, float precioMercado) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.edad = edad;
        this.rendimiento = rendimiento;
        this.precioMercado = precioMercado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getRendimiento() {
        return rendimiento;
    }

    public void setRendimiento(float rendimiento) {
        this.rendimiento = rendimiento;
    }

    public float getPrecioMercado() {
        return precioMercado;
    }

    public void setPrecioMercado(float precioMercado) {
        this.precioMercado = precioMercado;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", posicion='" + posicion + '\'' +
                ", edad=" + edad +
                ", rendimiento=" + rendimiento +
                ", precioMercado=" + precioMercado +
                '}';
    }
}
