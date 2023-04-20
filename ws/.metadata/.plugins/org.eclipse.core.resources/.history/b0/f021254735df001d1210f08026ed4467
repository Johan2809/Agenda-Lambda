package model;

public class Grupo {
    private String nombre;
    private Categoria categoria;
    private Contacto[] listaContactos;

    public Grupo(String nombre, Categoria categoria) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.listaContactos = new Contacto[10];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Contacto[] getListaContactos() {
        return listaContactos;
    }

    public void setListaContactos(Contacto[] listaContactos) {
        this.listaContactos = listaContactos;
    }

    public boolean agregarContacto(Contacto contacto) {
        for (int i = 0; i < listaContactos.length; i++) {
            if (listaContactos[i] == null) {
                listaContactos[i] = contacto;
                return true;
            }
        }
        return false;
    }

    public boolean eliminarContacto(Contacto contacto) {
        for (int i = 0; i < listaContactos.length; i++) {
            if (listaContactos[i] != null && listaContactos[i].equals(contacto)) {
                listaContactos[i] = null;
                return true;
            }
        }
        return false;
    }

}
