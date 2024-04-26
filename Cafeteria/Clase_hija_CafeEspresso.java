package Cafeteria;

class CafeEspresso extends Cafe {
    private String ingredientesExtra;

    public CafeEspresso(double precio, String envase, String tipo, String ingredientesExtra) {
        super(precio, envase, tipo);
        this.ingredientesExtra = ingredientesExtra;
    }

    public String getIngredientesExtra() {
        return ingredientesExtra;
    }

    public void setIngredientesExtra(String ingredientesExtra) {
        this.ingredientesExtra = ingredientesExtra;
    }
}