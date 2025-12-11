package Patrones;

import Dominio.Certificacion;
import Dominio.Curso;
import Dominio.Estudiante;

public interface visitor {
    void visit(Certificacion c);
    void visit(Curso c);
    void visit(Estudiante e);
}