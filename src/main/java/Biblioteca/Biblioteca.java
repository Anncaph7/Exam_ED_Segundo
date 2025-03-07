package Biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    public class Biblioteca {
        /**
         * Creamos un ArrayList donde agruparemos todos libros, lo hacemos privado
         */
        private final List<Libro> libros;

        /**
         * creamos la variable libro que es igual a la ArrayList
         * que se ha creado anteriormente
         */
        public Biblioteca() {
            libros = new ArrayList<>();

        }

        /**
         *
         * @param libros ingresar el titulo del libro
         */
// Test: NO HAY QUE TESTEAR ESTE METODO
        public Biblioteca(List<Libro> libros) {
            this.libros = libros;
        }


// Test: Comprobar si se ha agregado
        public boolean agregarLibro(Libro libro) {
            return libros.add(libro);
        }
        System.out.println(Libro);

        // TODO: Testear este metodo.
// Test: comprobar si se ha eliminado
        public boolean eliminarLibro(Libro libro) {
            return libros.remove(libro);
        }

        // TODO: Documentar este método
        public List<Libro> getLibros() {
            return libros;
        }

        // TODO: Documentar este método.
// Test 01: buscar libro existente y comprobar que lo localiza.
// Test 02: buscar libro NO existente y comprobar que no lo localiza.
        public Libro encuentraLibroPorTitulo(String titulo) {
            for (Libro libro : libros) {
                if (libro.getTitulo().equals(titulo)) {
                    return libro;
                }
            }
            return null;
        }

        // TODO: Documentar este metodo.
// No testearlo
// Este metodo está obsoleto. Hay que documentarlo como tal.
// Recuerda: las anotaciones @deprecated y @link a la nueva
// versión mejorada encuentraLibrosPorAutor(...)
// En esta ocasión, NO TESTEAREMOS este metodo
        public Libro encuentaLibroPorAutor(String autor) {
            for (Libro libro : libros) {
                if (libro.getAutor().equals(autor)) {
                    return libro;
                }
            }
            return null;
        }

        // TODO: Documentar este metodo
// Este metodo sustituye al metodo anterior. Está disponible desde la
// versión 2.0. Hay que documentarlo teniéndolo en cuenta.
// TODO: Testear este metodo.
// Test: Comprobar la lista de libros que devuelve para un autor existentes.
// Test: Comprobar la lista de libros que devuelve para un autor No existente
        public List<Libro> encuentraLibrosPorAutor(String autor) {
            List<Libro> listaLibros = null;
            for (Libro libro : libros) {
                if (libro.getAutor().equals(autor)) {
                    if (listaLibros == null) {
                        listaLibros = new ArrayList<>();
                    }
                    listaLibros.add(libro);
                }
            }
            return listaLibros;
        }
    }
