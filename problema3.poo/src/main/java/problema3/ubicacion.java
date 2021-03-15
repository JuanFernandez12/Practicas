/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package problema3;


public class ubicacion {
	public ubicacion(float longitud, float latitud, String periodo, float distancia) {
		super();
		this.longitud = longitud;
		this.latitud = latitud;
		this.periodo = periodo;
		this.distancia = distancia;
	}

	/**
	 * Description of the property longitud.
	 */
	public float longitud = 0F;

	/**
	 * Description of the property latitud.
	 */
	public float latitud = 0F;

	/**
	 * Description of the property periodo.
	 */
	public String periodo = "";

	/**
	 * Description of the property distancia.
	 */
	public float distancia = 0F;

	// Start of user code (user defined attributes for ubicacion)

	// End of user code

	/**
	 * The constructor.
	 */
	public ubicacion() {
		// Start of user code constructor for ubicacion)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for ubicacion)

	// End of user code
	/**
	 * Returns longitud.
	 * @return longitud 
	 */
	public float getLongitud() {
		return this.longitud;
	}

	/**
	 * Sets a value to attribute longitud. 
	 * @param newLongitud 
	 */
	public void setLongitud(float newLongitud) {
		this.longitud = newLongitud;
	}

	/**
	 * Returns latitud.
	 * @return latitud 
	 */
	public float getLatitud() {
		return this.latitud;
	}

	/**
	 * Sets a value to attribute latitud. 
	 * @param newLatitud 
	 */
	public void setLatitud(float newLatitud) {
		this.latitud = newLatitud;
	}

	/**
	 * Returns periodo.
	 * @return periodo 
	 */
	public String getPeriodo() {
		return this.periodo;
	}

	/**
	 * Sets a value to attribute periodo. 
	 * @param newPeriodo 
	 */
	public void setPeriodo(String newPeriodo) {
		this.periodo = newPeriodo;
	}

	/**
	 * Returns distancia.
	 * @return distancia 
	 */
	public float getDistancia() {
		return this.distancia;
	}

	/**
	 * Sets a value to attribute distancia. 
	 * @param newDistancia 
	 */
	public void setDistancia(float newDistancia) {
		this.distancia = newDistancia;
	}

	@Override
	public String toString() {
		return "ubicacion [longitud=" + longitud + ", latitud=" + latitud + ", periodo=" + periodo + ", distancia="
				+ distancia + "]";
	}

}
