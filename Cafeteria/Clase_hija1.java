package Cafeteria;

class Cafe extends Producto {
	    public String tipo;

	    public Cafe(double precio, String envase, String tipo) {
	        super(precio, envase);
	        this.tipo = tipo;
	    }

	    public String getTipo() {
	        return tipo;
	    }

	    public void setTipo(String tipo) {
	        this.tipo = tipo;
	    }
	}

