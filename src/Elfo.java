public class Elfo extends Personaje {
    public Elfo(int monedas, String[] idiomasHablados,
                int fuerza, int destreza, int constitucion, int inteligencia,
                int sabiduria, int carisma) {
        super(monedas, idiomasHablados,  fuerza, destreza,
                constitucion, inteligencia, sabiduria, carisma, "Elfo", "Inteligencia y fuerza");
        establecerHabilidades();
        setNivelMaximo(10);
        setDadosGolpe("1d6");
        establecerTiradasDeSalvacion();
    }

    @Override
    public void establecerTiradasDeSalvacion() {
        // Implementación específica para Elfo
        tiradasSalvacion[0] = 12;
        tiradasSalvacion[1] = 13;
        tiradasSalvacion[2] = 13;
        tiradasSalvacion[3] = 15;
        tiradasSalvacion[4] = 15;
    }

    @Override
    public void establecerHabilidades() {
        // Implementación específica para Elfo
        ataqueGaco0 = (super.getFuerza() + super.getInteligencia() - 10) / 4;
    }

    public void calcularPuntosDeGolpe() {
        // Suponiendo que el Guerrero usa un dado de golpe de 10 caras (d10)
        puntosDeGolpe = 10 + (super.getFuerza() + super.getInteligencia() - 10) / 4; // Ejemplo simple
    }
}
