public class Guerrero extends Personaje {
    public Guerrero(int monedas, String[] idiomasHablados,
                    int fuerza, int destreza, int constitucion, int inteligencia,
                    int sabiduria, int carisma) {
        super(monedas, idiomasHablados,  fuerza, destreza,
                constitucion, inteligencia, sabiduria, carisma, "Guerrero", "Fuerza");
        establecerHabilidades();
        setNivelMaximo(14);
        setDadosGolpe("1d8");
        establecerTiradasDeSalvacion();
    }

    @Override
    public void establecerTiradasDeSalvacion() {
        // Implementación específica para Guerrero
        tiradasSalvacion[0] = 12;
        tiradasSalvacion[1] = 13;
        tiradasSalvacion[2] = 14;
        tiradasSalvacion[3] = 15;
        tiradasSalvacion[4] = 16;
    }

    @Override
    public void establecerHabilidades() {
        // Implementación específica para Guerrero
        ataqueGaco0 = (super.getFuerza() - 10) / 2;
    }

    public void calcularPuntosDeGolpe() {
        // Suponiendo que el Guerrero usa un dado de golpe de 10 caras (d10)
        puntosDeGolpe = 10 + (super.getFuerza() - 10) / 2; // Ejemplo simple
    }
}
