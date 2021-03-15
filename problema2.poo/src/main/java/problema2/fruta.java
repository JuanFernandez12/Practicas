/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package problema2;

// Start of user code (user defined imports)

// End of user code
public class fruta {
	public fruta(String nombre, float extencion, String tiempoCosecha, float cantCosechaxTiempo, float costoPromedio,
			float precioVentaProm) {
		super();
		this.nombre = nombre;
		this.extencion = extencion;
		this.tiempoCosecha = tiempoCosecha;
		this.cantCosechaxTiempo = cantCosechaxTiempo;
		this.costoPromedio = costoPromedio;
		this.precioVentaProm = precioVentaProm;
	}

	/**
	 * Description of the property nombre.
	 */
	public String nombre = "";

	/**
	 * Description of the property extencion.
	 */
	public float extencion = 0F;

	/**
	 * Description of the property tiempoCosecha.
	 */
	public String tiempoCosecha = "";

	/**
	 * Description of the property cantCosechaxTiempo.
	 */
	public float cantCosechaxTiempo = 0F;

	/**
	 * Description of the property costoPromedio.
	 */
	public float costoPromedio = 0F;

	/**
	 * Description of the property precioVentaProm.
	 */
	public float precioVentaProm = 0F;

	// Start of user code (user defined attributes for fruta)

	// End of user code

	/**
	 * The constructor.
	 */
	public fruta() {
		// Start of user code constructor for fruta)
		super();
		// End of user code
	}

	/**
	 * Description of the method AgregarPromedio.
	 * @param promedio 
	 * @param cantEstimada 
	 */
	public void AgregarPromedio(String promedio, float cantEstimada) {
		// Start of user code for method AgregarPromedio
		// End of user code
	}

	/**
	 * Description of the method eliminarPeriodo.
	 * @param i 
	 */
	public void eliminarPeriodo(int i) {
		// Start of user code for method eliminarPeriodo
		// End of user code
	}

	/**
	 * Description of the method costoPeriodo.
	 * @param i 
	 */
	public void costoPeriodo(int i) {
		// Start of user code for method costoPeriodo
		// End of user code
	}

	/**
	 * Description of the method ganancia.
	 * @param i 
	 */
	public void ganancia(int i) {
		// Start of user code for method ganancia
		// End of user code
	}

	// Start of user code (user defined methods for fruta)

	// End of user code
	/**
	 * Returns nombre.
	 * @return nombre 
	 */
	public String getNombre() {
		return this.nombre;
	}

	/**
	 * Sets a value to attribute nombre. 
	 * @param newNombre 
	 */
	public void setNombre(String newNombre) {
		this.nombre = newNombre;
	}

	/**
	 * Returns extencion.
	 * @return extencion 
	 */
	public float getExtencion() {
		return this.extencion;
	}

	/**
	 * Sets a value to attribute extencion. 
	 * @param newExtencion 
	 */
	public void setExtencion(float newExtencion) {
		this.extencion = newExtencion;
	}

	/**
	 * Returns tiempoCosecha.
	 * @return tiempoCosecha 
	 */
	public String getTiempoCosecha() {
		return this.tiempoCosecha;
	}

	/**
	 * Sets a value to attribute tiempoCosecha. 
	 * @param newTiempoCosecha 
	 */
	public void setTiempoCosecha(String newTiempoCosecha) {
		this.tiempoCosecha = newTiempoCosecha;
	}

	/**
	 * Returns cantCosechaxTiempo.
	 * @return cantCosechaxTiempo 
	 */
	public float getCantCosechaxTiempo() {
		return this.cantCosechaxTiempo;
	}

	/**
	 * Sets a value to attribute cantCosechaxTiempo. 
	 * @param newCantCosechaxTiempo 
	 */
	public void setCantCosechaxTiempo(float newCantCosechaxTiempo) {
		this.cantCosechaxTiempo = newCantCosechaxTiempo;
	}

	/**
	 * Returns costoPromedio.
	 * @return costoPromedio 
	 */
	public float getCostoPromedio() {
		return this.costoPromedio;
	}

	/**
	 * Sets a value to attribute costoPromedio. 
	 * @param newCostoPromedio 
	 */
	public void setCostoPromedio(float newCostoPromedio) {
		this.costoPromedio = newCostoPromedio;
	}

	/**
	 * Returns precioVentaProm.
	 * @return precioVentaProm 
	 */
	public float getPrecioVentaProm() {
		return this.precioVentaProm;
	}

	/**
	 * Sets a value to attribute precioVentaProm. 
	 * @param newPrecioVentaProm 
	 */
	public void setPrecioVentaProm(float newPrecioVentaProm) {
		this.precioVentaProm = newPrecioVentaProm;
	}

	@Override
	public String toString() {
		return "fruta [nombre=" + nombre + ", extencion=" + extencion + ", tiempoCosecha=" + tiempoCosecha
				+ ", cantCosechaxTiempo=" + cantCosechaxTiempo + ", costoPromedio=" + costoPromedio
				+ ", precioVentaProm=" + precioVentaProm + "]";
	}

}
