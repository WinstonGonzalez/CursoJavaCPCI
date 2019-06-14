
public class Perro extends SerVivo implements IComportamientoSerVivo {

	@Override
	public int cumplirAnios() {
		edad = edad + 7;
		return edad;
	}
}
