package Cafeteria;

class CafeMocha extends Cafe {
    private String chocolate;

    public CafeMocha(double precio, String envase, String tipo, String chocolate) {
        super(precio, envase, tipo);
        //ingrediente adicional
        this.chocolate = chocolate;
    }

    public String getChocolate() {
        return chocolate;
    }

    public void setChocolate(String chocolate) {
        this.chocolate = chocolate;
    }
}