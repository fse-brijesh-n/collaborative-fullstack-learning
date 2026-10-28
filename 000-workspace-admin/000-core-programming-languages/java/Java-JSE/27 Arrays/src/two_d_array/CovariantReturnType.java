package two_d_array;
class WildAnimal{
}
class Tiger extends WildAnimal{
}
class Lion extends WildAnimal{
}

interface KK{
	WildAnimal createWildAnimal();
}
class JJ implements KK{
	public Tiger createWildAnimal() {
		return new Tiger();
	}
}
class PP implements KK{
	public Lion createWildAnimal() {
		return new Lion();
	}
}
class TT implements KK{
	public WildAnimal createWildAnimal() {
		return new WildAnimal();
	}
}
public class CovariantReturnType {
	public static void main(String[] args) {
		
	}
}
