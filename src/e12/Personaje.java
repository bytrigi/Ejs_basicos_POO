package e12;

public class Personaje {
    private String nombre;
    private int vida; // 0 a 100
    private int ataque;

    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getNombre() { return nombre; }
    public void setVida(int vida) { this.vida = vida; }
    public int getVida() { return vida; }
    public void setAtaque(int ataque) { this.ataque = ataque; }

    public void recibirDano(int cantidad) {
        this.vida -= cantidad;
        if (this.vida < 0) this.vida = 0;
    }

    public void curar(int cantidad) {
        this.vida += cantidad;
        if (this.vida > 100) this.vida = 100;
    }

    public boolean estaVivo() {
        return this.vida > 0;
    }
}