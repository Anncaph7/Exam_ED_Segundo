package Biblioteca;

public class Libro {
/**
 * Representa una biblioteca en donde puedas hacer busqueda
 * de un libro por su titulo, autor y año de publicacion,
 * dentro de una Arraylist
 *
 *<p>Ejemplo de uso</p>
 * <pre>Libro libro1 = new ArrayList<Libro>;
 * titulo.titulo(Romeo y julieta);
 * autor.autor(Shakspear);
 *system.out.println("Estos son los datos de este libro : " + Libro)
 *</pre>
 *
 * @autor Angela Patricia Capella Hernández
 * @version 1.1
 *
 *
 */
    private String titulo;
    private String autor;
    private int anioPublicacion;

    /**
     *  Ingresar busqueda por titulo, autor o año
     * @param titulo el titulo que se ingresa debe ser string
     * @param autor el autor tambien debe de ser string
     * @param anioPublicacion el año, debe debe de llevar numeros enteros,
     *                        no se aceptan reales.
     */

    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     *
     * @return El titulo de la entidad
     */
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     *
     * @return El nombre del Autor
     */
    public int getAnioPublicacion() {
        return anioPublicacion;
    }
    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
}

