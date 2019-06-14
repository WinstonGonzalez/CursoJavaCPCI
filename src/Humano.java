
public class Humano extends SerVivo implements IComportamientoSerVivo {

	@Override
	public int cumplirAnios() {
		edad = edad + 1;
		return edad;
	}
}
