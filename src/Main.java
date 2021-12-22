public class Main {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        Pessoa p2 = new Pessoa("Pedro","Loiro","Gordo",45);
        p.setNome("João");
        p.setCorDoCabelo("Castanho");
        p.setBiotipo("Magro");
        p.setIdade(25);

        System.out.println("-----PESSOA-----");
        System.out.println("Nome: " + p.getNome());
        System.out.println("Cor de cabelo: " + p.getCorDoCabelo());
        System.out.println("Biotipo: " + p.getBiotipo());
        System.out.println("Idade: " + p.getIdade());

        System.out.println("-----PESSOA2-----");
        System.out.println("Nome: " + p2.getNome());
        System.out.println("Cor de cabelo: " + p2.getCorDoCabelo());
        System.out.println("Biotipo: " + p2.getBiotipo());
        System.out.println("Idade: " + p2.getIdade());

    }
}