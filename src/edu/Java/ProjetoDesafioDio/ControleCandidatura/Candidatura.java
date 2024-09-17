package ControleCandidatura;

import java.util.Random;
//import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class Candidatura{
    
    public static void main(String[] args) {

        System.out.println("processo de candidatura");
        System.out.println("Insira a pretenção salarial: ");
        analisarCandidatos(2000);
        
    }

static void selecaoCandidatos(){
    String [] candidatos={"FELIPE", "MARIA", "AUGUSTO", "CARLOS", "PEDRO", "LUIS", "CLEBER", "ARTHUR", "PABLO"};
    for(String candidato: candidatos){
        contatoCandidato(candidato);
    }
   
        
}


static void contatoCandidato(String candidato){
    int tentativa = 0;
    boolean novaTentativa = true;
    boolean atendeu = false;

    do {
        atendeu = atender();
        novaTentativa = !atendeu;
        if(novaTentativa)
            tentativa++;
        else
            System.out.println("contato realizado com sucesso!");
    } while (tentativa<3 && novaTentativa);
    if(atendeu)
        System.out.println("O candidato "+candidato+"atendeu em "+tentativa+"ligções");
    else
        System.out.println("Não foi possível entrar em contato com o candidato"+candidato);
        
}


static boolean atender(){
    return new Random().nextInt(3)==1;
}

static void listaSelecionados(){
    String [] candidatos = {"FELIPE", "MARIA", "AUGUSTO", "CARLOS", "PEDRO", "LUIS", "CLEBER", "ARTHUR", "PABLO"};
    for(String candidato: candidatos){
        System.out.println("O candidato selecionado foi: "+candidato);
    }
}

static double salarioPretendido(){
    return ThreadLocalRandom.current().nextDouble(1800, 2200);
}

static void analisarCandidatos(double SalarioPretendido){
    String [] candidatos = {"FELIPE", "MARIA", "AUGUSTO", "CARLOS", "PEDRO", "LUIS", "CLEBER", "ARTHUR", "PABLO"};
   double SalarioBase=2000.0;
   int candidatoSelecionados=0;
   int candidatoAtual=0;
   while(candidatoSelecionados<5 && candidatoAtual<candidatos.length){
       String candidato = candidatos[candidatoAtual];
       double valorPretendido = salarioPretendido();

       System.out.println("O candidato "+ candidato +" tem a pretenção salarial de: "+ valorPretendido + "R$");
       if(valorPretendido<=SalarioBase){
           candidatoSelecionados++;
       }
       candidatoAtual++;
    if (SalarioBase < SalarioPretendido){
        System.out.println("ligar para candidato");
    }else if(SalarioBase==SalarioPretendido){
        System.out.println("ligar com contraproposta");
    }else{
        System.out.println("aguardando demais candidatos");
    }
}
}
}