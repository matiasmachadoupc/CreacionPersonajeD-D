public class Enano extends Personaje {
    public Enano(int monedas, String[] idiomasHablados,
                 int fuerza, int destreza, int constitucion, int inteligencia,
                 int sabiduria, int carisma) {
        super(monedas, idiomasHablados,  fuerza, destreza,
                constitucion, inteligencia, sabiduria, carisma, "Enano", "Fuerza");
        establecerHabilidades();
        setNivelMaximo(12);
        setDadosGolpe("1d8");
        establecerTiradasDeSalvacion();
    }

    @Override
    public void establecerTiradasDeSalvacion() {
        // Implementación específica para Enano
        tiradasSalvacion[0] = 8;
        tiradasSalvacion[1] = 9;
        tiradasSalvacion[2] = 10;
        tiradasSalvacion[3] = 13;
        tiradasSalvacion[4] = 12;
    }

    @Override
    public void establecerHabilidades() {
        // Implementación específica para Enano
        ataqueGaco0 = (super.getFuerza() - 10) / 2;
    }

    public void calcularPuntosDeGolpe() {
        // Suponiendo que el Guerrero usa un dado de golpe de 10 caras (d10)
        puntosDeGolpe = 10 + (super.getFuerza() - 10) / 2; // Ejemplo simple
    }
}
