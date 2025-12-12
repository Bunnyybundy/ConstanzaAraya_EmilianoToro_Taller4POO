package Patrones;

import Dominio.Certificacion;
import Dominio.Curso;
import Dominio.Estudiante;
import Dominio.Nota;
import Logica.Sistema;


public class Validar_CertiVisitor implements visitor {
    private Estudiante estudiante;
    private Certificacion certificacion;

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

    public boolean cumpleRequisitos() {
        int creditosAprobados = 0;
        for (Nota n : Sistema.getNotasPorRut(estudiante.getRut())) {
            if (n.getEstado().equalsIgnoreCase("Aprobada")) {
                Curso c = Sistema.buscarCursoPorNRC(n.getCodigoAsignatura());
                if (c != null) {
                    creditosAprobados += c.getCreditos();
                }
            }
        }
        if (creditosAprobados < certificacion.getRequisitosCreditos()) {
            return false;
        }
        for (Curso c : Sistema.getCursosRequeridos(certificacion.getId())) {
            boolean aprobado = false;
            for (Nota n : Sistema.getNotasPorRut(estudiante.getRut())) {
                if (n.getCodigoAsignatura().equals(c.getNrc()) &&
                    n.getEstado().equalsIgnoreCase("Aprobada")) {
                    aprobado = true;
                    break;
                }
            }
            if (!aprobado) {
                return false;
            }
        }
        return true; 
    }

}