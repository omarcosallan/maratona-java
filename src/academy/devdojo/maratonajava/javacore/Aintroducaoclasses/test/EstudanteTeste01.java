package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.domain.Estudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
//      Estudante => classe => tipo estruturado que define estado e comportamentos
//      estudante => variável => objeto criado a partir da classe com seus próprios atributos
        Estudante estudante = new Estudante();
        estudante.nome = "Luffy";
        estudante.idade = 17;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println(estudante);
    }
}
