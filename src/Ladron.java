public class Ladron extends Personaje {
    public Ladron(int monedas, String[] idiomasHablados,
                  int fuerza, int destreza, int constitucion, int inteligencia,
                  int sabiduria, int carisma) {
        super(monedas, idiomasHablados,  fuerza, destreza,
                constitucion, inteligencia, sabiduria, carisma, "Ladrón", "Destreza");
        establecerHabilidades();
        setNivelMaximo(14);
        setDadosGolpe("1d4");
        establecerTiradasDeSalvacion();
    }

    @Override
    public void establecerTiradasDeSalvacion() {
        // Implementación específica para Ladrón
        tiradasSalvacion[0] = 13;
        tiradasSalvacion[1] = 14;
        tiradasSalvacion[2] = 13;
        tiradasSalvacion[3] = 16;
        tiradasSalvacion[4] = 15;
    }

    @Override
    public void establecerHabilidades() {
        // Implementación específica para Ladrón
        ataqueGaco0 = (super.getDestreza() - 10) / 2;
    }

    public void calcularPuntosDeGolpe() {
        // Suponiendo que el Guerrero usa un dado de golpe de 10 caras (d10)
        puntosDeGolpe = 10 + (super.getDestreza() - 10) / 2; // Ejemplo simple
    }
}
