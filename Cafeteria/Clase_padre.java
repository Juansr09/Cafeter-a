package Cafeteria;

class Producto {

	//se crea variables precio y envase que seran atributos
	public double precio;
    public String envase;

    public Producto(double precio, String envase) {
        this.precio = precio;
        this.envase = envase;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getEnvase() {
        return envase;
    }

    public void setEnvase(String envase) {
        this.envase = envase;
    }
}

