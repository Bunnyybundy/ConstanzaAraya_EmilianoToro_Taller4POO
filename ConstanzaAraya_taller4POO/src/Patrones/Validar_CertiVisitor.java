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
        int creditos = estudiante.getSemestre() * 5; // ejemplo: 5 créditos por semestre
        if (creditos >= c.getRequisitosCreditos()) {
            System.out.println("El estudiante " + estudiante.getNombre() +
                               " cumple con la certificación " + c.getNombre());
        } else {
            System.out.println("El estudiante " + estudiante.getNombre() +
                               " NO cumple con la certificación " + c.getNombre());
        }
    }

    @Override
    public void visit(Curso c) {
        System.out.println("Curso visitado: " + c.getNombre());
    }

    @Override
    public void visit(Estudiante e) {
        System.out.println("Visitando estudiante: " + e.getNombre());
    }
}