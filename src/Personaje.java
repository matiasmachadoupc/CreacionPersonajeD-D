// Clase abstracta Personaje
public abstract class Personaje {
    // Atributos comunes
    private int monedas;
    private String[] idiomasHablados;
    private int nivelMaximo;
    private String dadosGolpe; // Número de dados de golpe
    private int fuerza; // Fuerza (STR)
    private int destreza; // Destreza (DEX)
    private int constitucion; // Constitución (CON)
    private int inteligencia; // Inteligencia (INT)
    private int sabiduria; // Sabiduría (WIS)
    private int carisma; // Carisma (CHA)
    private String tipoClase; // Tipo de clase
    private String requisitosPrincipales; // Requisitos principales para la clase
    protected int ataqueGaco0; // Nuevo atributo para el Ataque Gaco0
    protected int puntosDeGolpe; // Puntos de golpe
    protected String alineamiento; // Nuevo atributo para el alineamiento
    protected int[] tiradasSalvacion; // M-V-P-A-H

    // Constructor
    public Personaje(int monedas, String[] idiomasHablados,
                     int fuerza, int destreza, int constitucion, int inteligencia,
                     int sabiduria, int carisma, String tipoClase, String requisitosPrincipales) {
        this.monedas = monedas;
        this.idiomasHablados = idiomasHablados;
        this.fuerza = fuerza;
        this.destreza = destreza;
        this.constitucion = constitucion;
        this.inteligencia = inteligencia;
        this.sabiduria = sabiduria;
        this.carisma = carisma;
        this.tipoClase = tipoClase;
        this.requisitosPrincipales = requisitosPrincipales;
        this.tiradasSalvacion = new int[5];
        calcularPuntosDeGolpe();
    }

    // Métodos abstractos
    public abstract void establecerTiradasDeSalvacion(); // Método para establecer las tiradas de salvación
    public abstract void establecerHabilidades(); // Método para establecer habilidades
    public abstract void calcularPuntosDeGolpe();

    public int getPuntosDeGolpe() {
        return puntosDeGolpe;
    }

    public int calcularAtaqueGaco0() {
        return ataqueGaco0;
    }
    public void setAlineamiento(String alineamiento) {
        this.alineamiento = alineamiento;
    }
    public String getAlineamiento() {
        return alineamiento;
    }

    // Métodos para mostrar detalles del personaje (puedes ajustarlos según sea necesario)
    public void mostrarDetalles() {
        System.out.println("Clase: " + tipoClase);
        System.out.println("Monedas: " + monedas);
        System.out.println("Idiomas Hablados: " + String.join(", ", idiomasHablados));
        System.out.println("Nivel Máximo: " + nivelMaximo);
        System.out.println("Dados de Golpe: " + dadosGolpe);
        System.out.println("Fuerza: " + fuerza);
        System.out.println("Destreza: " + destreza);
        System.out.println("Constitución: " + constitucion);
        System.out.println("Inteligencia: " + inteligencia);
        System.out.println("Sabiduría: " + sabiduria);
        System.out.println("Carisma: " + carisma);
        System.out.println("Requisitos Principales: " + requisitosPrincipales);
        System.out.println("Ataque Gaco0: " + ataqueGaco0);
        System.out.println("Puntos Golpe: " + puntosDeGolpe);
        System.out.println("Alineamiento: " + alineamiento);
        System.out.println("Tiradas de salvacion (M-V-P-A-H): " + tiradasSalvacion[0] + ", " + tiradasSalvacion[1] + ", " + tiradasSalvacion[2] + ", " + tiradasSalvacion[3] + ", " + tiradasSalvacion[4] );
    }

    // Getters y Setters (si es necesario)
    public int getMonedas() { return monedas; }
    public void setMonedas(int monedas) { this.monedas = monedas; }

    public String[] getIdiomasHablados() { return idiomasHablados; }
    public void setIdiomasHablados(String[] idiomasHablados) { this.idiomasHablados = idiomasHablados; }

    public int getNivelMaximo() { return nivelMaximo; }
    public void setNivelMaximo(int nivelMaximo) { this.nivelMaximo = nivelMaximo; }

    public String getDadosGolpe() { return dadosGolpe; }
    public void setDadosGolpe(String dadosGolpe) { this.dadosGolpe = dadosGolpe; }

    public int getFuerza() { return fuerza; }
    public void setFuerza(int fuerza) { this.fuerza = fuerza; }

    public int getDestreza() { return destreza; }
    public void setDestreza(int destreza) { this.destreza = destreza; }

    public int getConstitucion() { return constitucion; }
    public void setConstitucion(int constitucion) { this.constitucion = constitucion; }

    public int getInteligencia() { return inteligencia; }
    public void setInteligencia(int inteligencia) { this.inteligencia = inteligencia; }

    public int getSabiduria() { return sabiduria; }
    public void setSabiduria(int sabiduria) { this.sabiduria = sabiduria; }

    public int getCarisma() { return carisma; }
    public void setCarisma(int carisma) { this.carisma = carisma; }

    public String getTipoClase() { return tipoClase; }
    public void setTipoClase(String tipoClase) { this.tipoClase = tipoClase; }

    public String getRequisitosPrincipales() { return requisitosPrincipales; }
    public void setRequisitosPrincipales(String requisitosPrincipales) { this.requisitosPrincipales = requisitosPrincipales; }
}
