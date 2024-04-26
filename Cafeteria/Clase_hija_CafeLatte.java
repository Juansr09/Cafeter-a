package Cafeteria;

class CafeLatte extends Cafe {
    private String leche;

    public CafeLatte(double precio, String envase, String tipo, String leche) {
        super(precio, envase, tipo);
      //ingrediente adicional
        this.leche = leche;
    }

    public String getLeche() {
        return leche;
    }

    public void setLeche(String leche) {
        this.leche = leche;
    }
}
