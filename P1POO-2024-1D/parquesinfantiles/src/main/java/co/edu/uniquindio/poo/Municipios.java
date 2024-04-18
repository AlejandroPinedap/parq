package co.edu.uniquindio.poo;

public enum Municipios {
    ARMENIA(0),
    CALARCA(10000),
    MONTENEGRO(20000),
    QUIMBAYA (30000),
    TEBAIDA (15000),
    CIRCASIA (18000),
    FILANDIA (22000),
    GÉNOVA (70000),
    SALENTO (50000),
    PIJAO (40000),
    CÓRDOBA (30000),
    BUENAVISTA(35000);
   

    public double sobrecosto;
    private Municipios(double sobrecosto){
        this.sobrecosto=sobrecosto;
    }

    public double getValorsobrecosto(){
        return sobrecosto;
    }
    
}
