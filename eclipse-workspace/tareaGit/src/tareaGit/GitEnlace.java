package tareaGit;

public class GitEnlace {
	int Radio;
	int Base;
	int Altura;
	
    public String Nom;

    public GitEnlace(String nom) {
        Nom = nom;
    }

    public int calculo(String nombre, int radio, int base, int altura) {
        int area; 
        int perimetro;

        switch (nombre) {
            case "circulo":
                area = (int) (radio * radio * Math.PI);
                return area;
            case "triangulo":                
            case "cuadrado":     
            	perimetro = (int) (base * 4);
            	return perimetro;
            default:
                return 0; 
        }
       }
    }