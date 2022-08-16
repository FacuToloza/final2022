import java.util.LinkedList;
import java.util.List;

public class Pack implements Item{

	double valorDelPack;
	List<Articulo> Lista = new LinkedList<Articulo>();
	
	
	private void agregarArticulo(Articulo articulo){
		Lista.add(articulo);
	}
}
