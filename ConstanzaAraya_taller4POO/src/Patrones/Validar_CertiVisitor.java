package Patrones;

import Dominio.Certificacion;
import Dominio.Curso;
import Dominio.Estudiante;


public class Validar_CertiVisitor implements visitor {
    private Estudiante estudiante;

    public Validar_CertiVisitor(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    @Override
    public void visit(Certificacion c) {
        if (c.getDescripcion().contains(estudiante.getCarrera())) {
            System.out.println("✔ El estudiante " + estudiante.getNombre() +
                               " puede optar a la certificación " + c.getNombre());
        } else {
            System.out.println("✘ El estudiante " + estudiante.getNombre() +
                               " no cumple el área para " + c.getNombre());
        }
    }

    @Override
    public void visit(Curso c) {
        System.out.println("Visitando curso: " + c.getNombre());
    }

    @Override
    public void visit(Estudiante e) {
        System.out.println("Visitando estudiante: " + e.getNombre() +
                           " (" + e.getCarrera() + ")");
    }
}