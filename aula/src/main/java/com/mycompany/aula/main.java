/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula;
import java.util.*;
public class main {
    public static void main(String[] args) {
        Aluno i = new Aluno("João Marcos", "123.456.789-10", new Date());
        System.out.println("Veja os atributos que foram preenchidos\nNome: " + i.nome);
        System.out.println("\nCpf: " + i.cpf);
        System.out.println("\nData de Nascimento: " + i.data_nascimento);
        
        Funcionario a = new Funcionario("Marcos", "109.765.432-1", new Date());
        System.out.println("Veja os atributos que foram preenchidos\nNome: " + a.nome);
        System.out.println("\nCpf: " + a.cpf);
        System.out.println("\nData de Nascimento: " + a.data_nascimento);
        
    }
}
