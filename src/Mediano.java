public class Mediano extends Personaje {
    public Mediano(int monedas, String[] idiomasHablados,
                   int fuerza, int destreza, int constitucion, int inteligencia,
                   int sabiduria, int carisma) {
        super(monedas, idiomasHablados, fuerza, destreza,
                constitucion, inteligencia, sabiduria, carisma, "Mediano", "Destreza y Fuerza");
        establecerHabilidades();
        setNivelMaximo(8);
        setDadosGolpe("1d6");
        establecerTiradasDeSalvacion();
    }

    @Override
    public void establecerTiradasDeSalvacion() {
        // Implementación específica para Mediano
        tiradasSalvacion[0] = 8;
        tiradasSalvacion[1] = 9;
        tiradasSalvacion[2] = 10;
        tiradasSalvacion[3] = 13;
        tiradasSalvacion[4] = 12;
    }

    @Override
    public void establecerHabilidades() {
        // Implementación específica para Mediano
        ataqueGaco0 = (super.getFuerza() + super.getDestreza() - 10) / 4;
    }

    public void calcularPuntosDeGolpe() {
        // Suponiendo que el Guerrero usa un dado de golpe de 10 caras (d10)
        puntosDeGolpe = 10 + (super.getFuerza() + super.getDestreza() - 10) / 4; // Ejemplo simple
    }
}
