public class Clerigo extends Personaje {
    public Clerigo(int monedas, String[] idiomasHablados,
                   int fuerza, int destreza, int constitucion, int inteligencia,
                   int sabiduria, int carisma) {
        super(monedas, idiomasHablados,  fuerza, destreza,
                constitucion, inteligencia, sabiduria, carisma, "Clérigo", "Sabiduría");
        establecerHabilidades();
        setNivelMaximo(14);
        setDadosGolpe("1d6");
        establecerTiradasDeSalvacion();
    }

    @Override
    public void establecerTiradasDeSalvacion() {
        // Implementación específica para Clérigo

        tiradasSalvacion[0] = 11;
        tiradasSalvacion[1] = 12;
        tiradasSalvacion[2] = 14;
        tiradasSalvacion[3] = 16;
        tiradasSalvacion[4] = 15;
    }

    @Override
    public void establecerHabilidades() {
        // Implementación específica para Clérigo
        ataqueGaco0 = (super.getSabiduria() - 10) / 2;
    }

    public void calcularPuntosDeGolpe() {
        // Suponiendo que el Guerrero usa un dado de golpe de 10 caras (d10)
        puntosDeGolpe = 10 + (super.getSabiduria() - 10) / 2; // Ejemplo simple
    }
}
