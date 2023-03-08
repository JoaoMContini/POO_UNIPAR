package com.mycompany.aula2;
public class testeClasseCachorro {
    public static void main(String[] args) {
        Cachorro safira = new Cachorro();
        safira.cor = "cinza e preto";
        safira.peso = 30;
        safira.porte = "grande";
        safira.raca = "Dog Alemão";
        safira.sexo = 'F';
        
        Cachorro tulipa = new Cachorro();
        tulipa.cor = "preto";
        tulipa.peso = 20;
        tulipa.porte = "medio";
        tulipa.raca = "vira lata";
        tulipa.sexo = 'F';
        
        Cachorro laica = new Cachorro();
        laica.cor = "branca";
        laica.peso = 15;
        laica.porte = "pequeno";
        laica.raca = "vira lata";
        laica.sexo = 'F';
        
        Cachorro fred = new Cachorro();
        fred.cor = "caramelo";
        fred.peso = 12;
        fred.porte = "pequeno";
        fred.raca = "Shitzu";
        fred.sexo = 'M';
        
        Cachorro thor = new Cachorro();
        thor.cor = "cinza e preto";
        thor.peso = 30;
        thor.porte = "grande";
        thor.raca = "Dog Alemão";
        thor.sexo = 'F';
        System.out.println("\n" + safira + "\n" + tulipa + "\n" +  laica + "\n" + fred + "\n" + thor);
    }
    
   
}
